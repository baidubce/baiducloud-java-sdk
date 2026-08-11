/*
 * Copyright 2014 Baidu, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce;

import com.baidubce.auth.BceV1Signer;
import com.baidubce.http.BceHttpClient;
import com.baidubce.http.Headers;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.internal.InternalRequest;
import com.baidubce.model.AbstractBceResponse;
import com.baidubce.util.DateUtils;
import com.baidubce.util.HttpUtils;
import org.apache.http.annotation.ThreadSafe;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Abstract base class for BCE service clients.
 * <p>
 * Responsible for basic client capabilities that are the same across all BCE SDK Java clients
 * (ex: setting the client endpoint).
 * <p>
 * Subclass names should be in the form of "com.baidubce.services.xxx.XxxClient", while "xxx" is the service ID and
 * "Xxx" is the capitalized service ID.
 */
@ThreadSafe
public abstract class AbstractBceClient {
    /**
     * The default service domain for BCE.
     */
    public static final String DEFAULT_SERVICE_DOMAIN = "qasandbox.baidu-int.com";

    /**
     * The common URL prefix for all BCE service APIs.
     */
    public static final String URL_PREFIX = "v1";

    /**
     * The default string encoding for all BCE service APIs.
     */
    public static final String DEFAULT_ENCODING = "UTF-8";

    /**
     * The default http request content type for all BCE service APIs.
     */
    public static final String DEFAULT_CONTENT_TYPE = "application/json; charset=utf-8";

    /**
     * The target service ID.
     */
    private String serviceId;

    /**
     * The endpoint URI for the service.
     */
    private URI endpoint;

    /**
     * The bucket virtual hosting(bucket.<region>.bcebos.com) endpoint URI for the service.
     */
    private ConcurrentHashMap<String, URI> bktVirEndpoint = new ConcurrentHashMap<String, URI>();

    /**
     * Responsible for sending HTTP requests to services.
     */
    private BceHttpClient client;

    /**
     * The client configuration for this client.
     */
    protected BceClientConfiguration config;

    /**
     * A list of handlers for processing HTTP responses from services.
     *
     * @see BceHttpClient#execute(InternalRequest, Class, HttpResponseHandler[])
     */
    private HttpResponseHandler[] responseHandlers;

    /**
     * Constructs a new AbstractBceClient with the specified client configuration and handlers.
     * <p>
     * The constructor will extract serviceId from the class name automatically.
     * And if there is no endpoint specified in the client configuration, the constructor will create a default one.
     *
     * @param config                the client configuration. The constructor makes a copy of this parameter so that it is
     *                              safe to change the configuration after then.
     * @param responseHandlers      a list of handlers for processing HTTP responses from services. See
     *                              {@link BceHttpClient#execute(InternalRequest, Class, HttpResponseHandler[])}
     * @param isHttpAsyncPutEnabled whether or not PUT method use Async manner.
     * @throws IllegalStateException    if the class name does not follow the naming convention for BCE clients.
     * @throws IllegalArgumentException if the endpoint specified in the client configuration is not a valid URI.
     */
    public AbstractBceClient(BceClientConfiguration config, HttpResponseHandler[] responseHandlers,
                             boolean isHttpAsyncPutEnabled) {
        this.serviceId = this.computeServiceId();
        this.config = config;
        this.endpoint = this.computeEndpoint();
        this.client = new BceHttpClient(config, new BceV1Signer(), isHttpAsyncPutEnabled);
        this.responseHandlers = responseHandlers;
    }

    /**
     * Equivalent to AbstractBceClient(config, responseHandlers, false)
     *
     * @param config           the client configuration. The constructor makes a copy of this parameter so that it is
     *                         safe to change the configuration after then.
     * @param responseHandlers a list of handlers for processing HTTP responses from services. See
     *                         {@link BceHttpClient#execute(InternalRequest, Class, HttpResponseHandler[])}
     * @throws IllegalStateException    if the class name does not follow the naming convention for BCE clients.
     * @throws IllegalArgumentException if the endpoint specified in the client configuration is not a valid URI.
     */
    public AbstractBceClient(BceClientConfiguration config, HttpResponseHandler[] responseHandlers) {
        this(config, responseHandlers, false);
    }

    /**
     * Returns true if the target service supports regions.
     * <p>
     * The result will impact the construction of default service endpoint.
     *
     * @return true if the target service supports regions.
     */
    public boolean isRegionSupported() {
        return true;
    }

    /**
     * Returns the service endpoint to which this client will send requests.
     *
     * @return the service endpoint to which this client will send requests.
     */
    public URI getEndpoint() {
        return this.endpoint;
    }

    /**
     * Returns the target service ID.
     *
     * @return the target service ID.
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public BceHttpClient getClient() {
        return client;
    }

    public void setClient(BceHttpClient client) {
        this.client = client;
    }

    /**
     * Shuts down the client and releases all underlying resources.
     * <p>
     * Invoking this method is NOT a must. Once it is called, no subsequent requests should be made.
     */
    public void shutdown() {
        this.client.shutdown();
    }

    /**
     * Subclasses should invoke this method for sending request to the target service.
     * <p>
     * This method will add "Content-Type" and "Date" to headers with default values if not present.
     *
     * @param request       the request to build up the HTTP request.
     * @param responseClass the response class.
     * @param <T>           the type of response
     * @return the final response object.
     */
    protected <T extends AbstractBceResponse> T invokeHttpClient(InternalRequest request, Class<T> responseClass) {
        if (!request.getHeaders().containsKey(Headers.CONTENT_TYPE)) {
            request.addHeader(Headers.CONTENT_TYPE, DEFAULT_CONTENT_TYPE);
        }

        if (!request.getHeaders().containsKey(Headers.DATE)) {
            request.addHeader(Headers.DATE, DateUtils.formatRfc822Date(new Date()));
        }

        return this.client.execute(request, responseClass, this.responseHandlers);
    }

    /**
     * Subclasses should invoke this method for sending request to the target service with custom handlers.
     * <p>
     * This method will add "Content-Type" and "Date" to headers with default values if not present.
     *
     * @param request          the request to build up the HTTP request.
     * @param responseClass    the response class.
     * @param customHandlers   custom response handlers to use instead of the default ones.
     * @param <T>              the type of response
     * @return the final response object.
     */
    protected <T extends AbstractBceResponse> T invokeHttpClient(
            InternalRequest request, Class<T> responseClass, HttpResponseHandler[] customHandlers) {
        if (!request.getHeaders().containsKey(Headers.CONTENT_TYPE)) {
            request.addHeader(Headers.CONTENT_TYPE, DEFAULT_CONTENT_TYPE);
        }

        if (!request.getHeaders().containsKey(Headers.DATE)) {
            request.addHeader(Headers.DATE, DateUtils.formatRfc822Date(new Date()));
        }

        return this.client.execute(request, responseClass, customHandlers);
    }

    /**
     * Returns the service ID based on the actual class name.
     * <p>
     * The class name should be in the form of "com.baidubce.services.xxx.XxxClient",
     * while "xxx" is the service ID and
     * "Xxx" is the capitalized service ID.
     *
     * @return the computed service ID.
     * @throws IllegalStateException if the class name does not follow the naming convention for BCE clients.
     */
    public String computeServiceId() {
        String packageName = this.getClass().getPackage().getName();
        String prefix = AbstractBceClient.class.getPackage().getName() + ".";
        if (!packageName.startsWith(prefix)) {
            throw new IllegalStateException("Unrecognized prefix for the client package : " + packageName + ", "
                    + "'" + prefix + "' expected");
        }
        String serviceId = packageName.substring(prefix.length());
        // Compatible with v2 version sdk.
        if (serviceId.endsWith(".v2")) {
            serviceId = serviceId.substring(0, serviceId.length() - 3);
        }
        if (serviceId.indexOf('.') != -1) {
            throw new IllegalStateException("The client class should be put in package like " + prefix + "XXX");
        }
        String className = this.getClass().getName();
        String expectedClassName =
                packageName + '.' + Character.toUpperCase(serviceId.charAt(0)) + serviceId.substring(1) + "Client";
        /**
         * Comment out this verification for media services, since media service is a suit of
         * services, the media package contains multiple Client classes.
         *
         */
//        if (!className.equals(expectedClassName)) {
//            throw new IllegalStateException("Invalid class name "
//                    + className + ", " + expectedClassName + " expected");
//        }
        return serviceId;
    }

    /**
     * Returns the default target service endpoint.
     * <p>
     * The endpoint will be in the form of "http(s)://<Service ID>[.<Region>].baidubce.com".
     *
     * @return the computed service endpoint
     * @throws IllegalArgumentException if the endpoint specified in the client configuration is not a valid URI.
     */
    private URI computeEndpoint() {
        String endpoint = this.config.getEndpoint();
        try {
            if (endpoint == null) {
                if (this.isRegionSupported()) {
                    endpoint = String.format("%s://%s.%s.%s", this.config.getProtocol(), this.serviceId,
                            this.config.getRegion(), AbstractBceClient.DEFAULT_SERVICE_DOMAIN);
                } else {
                    endpoint = String.format("%s://%s.%s", this.config.getProtocol(), this.serviceId,
                            AbstractBceClient.DEFAULT_SERVICE_DOMAIN);
                }
            }
            return new URI(endpoint);
        } catch (URISyntaxException e) {
            // only if the endpoint specified in the client configuration is not a valid URI, which is not expected.
            throw new IllegalArgumentException("Invalid endpoint." + endpoint, e);
        }
    }

    /**
     * Returns the service endpoint(bucket virtual hosting) to which this client will send requests.
     *
     * @return the service endpoint(bucket virtual hosting) to which this client will send requests.
     */
    public URI getBktVirEndpoint(String bucketName) {
        if (!bktVirEndpoint.isEmpty() && bktVirEndpoint.containsKey(bucketName)) {
            return bktVirEndpoint.get(bucketName);
        }
        return null;
    }

    /**
     * BOS
     * <p>
     * Returns the bucket virtual hosting service endpoint.
     * <p>
     * The endpoint will be in the form of "http(s)://<bucket>[.<Region>].bcebos.com".
     *
     * @return the computed service endpoint
     * @throws IllegalArgumentException if the endpoint specified in the client configuration is not a valid URI.
     */
    public void computeBktVirEndpoint(String bucketName) {
        if (bucketName == null || bucketName.isEmpty()) {
            return;
        }
        String host = this.endpoint.getHost();
        String protocol = this.endpoint.getScheme();

        String uri = null;
        if (!host.contains("bcebos.com") && !host.contains("baidu-int.com")) {
            // this means host is diy, and should not compute virtual host
            return;
        }
        if (host.startsWith(bucketName) && host.split("\\.").length >= 4) {
            uri = protocol + "://" + host;
        } else {
            uri = protocol + "://" + bucketName + '.' + host;
        }
        try {
            if (uri != null) {
                this.bktVirEndpoint.put(bucketName, new URI(uri));
            }
        } catch (URISyntaxException e) {
            // only if the endpoint specified in the client configuration is not a valid URI, which is not expected.
            throw new IllegalArgumentException("Invalid endpoint." + endpoint, e);
        }
    }

    /**
     * 从请求对象中提取 @Host 注解字段的值
     * 
     * <p>此方法通过反射扫描请求对象的所有字段，查找标记了 {@link com.baidubce.annotation.Host} 注解的字段，
     * 并返回该字段的值。该值将被用作主机名前缀拼接到 endpoint 中。
     * 
     * <h3>使用场景：</h3>
     * <ul>
     *   <li>BOS：bucket name 作为子域名</li>
     *   <li>VPC：bucket name 作为子域名</li>
     * </ul>
     * 
     * @param bceRequest 原始请求对象
     * @return @Host 注解字段的值，如果不存在则返回 null
     */
    protected String extractHostAnnotationValue(com.baidubce.model.AbstractBceRequest bceRequest) {
        if (bceRequest == null) {
            return null;
        }
        
        try {
            Class<?> clazz = bceRequest.getClass();
            
            // 遍历所有字段（包括父类字段）
            for (java.lang.reflect.Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(com.baidubce.annotation.Host.class)) {
                    field.setAccessible(true);
                    Object value = field.get(bceRequest);
                    
                    if (value instanceof String) {
                        return (String) value;
                    }
                }
            }
        } catch (IllegalAccessException e) {
            // 如果反射失败，记录日志但不抛异常，返回 null 使用原始 endpoint
            // This should not happen in normal circumstances
        }
        
        return null;
    }
    
    /**
     * 根据 hostPrefix 构建新的 endpoint
     * 
     * <p>将 hostPrefix 作为子域名拼接到原始 endpoint 的主机名前面。
     * 
     * <h3>示例：</h3>
     * <ul>
     *   <li>原始 endpoint: {@code http://bj.bcebos.com}</li>
     *   <li>hostPrefix: {@code mybucket}</li>
     *   <li>结果: {@code http://mybucket.bj.bcebos.com}</li>
     * </ul>
     * 
     * @param originalEndpoint 原始 endpoint
     * @param hostPrefix       主机名前缀
     * @return 修改后的 endpoint，如果构建失败则返回原始 endpoint
     */
    protected URI buildHostEndpoint(URI originalEndpoint, String hostPrefix) {
        if (originalEndpoint == null || hostPrefix == null || hostPrefix.isEmpty()) {
            return originalEndpoint;
        }
        
        try {
            String newHost = hostPrefix + "." + originalEndpoint.getHost();
            return new URI(
                originalEndpoint.getScheme(),
                null,  // userInfo
                newHost,
                originalEndpoint.getPort(),
                originalEndpoint.getPath(),
                originalEndpoint.getQuery(),
                originalEndpoint.getFragment()
            );
        } catch (URISyntaxException e) {
            // 如果构建失败，返回原始 endpoint
            // This should not happen if the original endpoint is valid
            return originalEndpoint;
        }
    }
    
    /**
     * 创建内部请求对象，自动处理 @Host 注解
     * 
     * <p>此方法是子类创建请求的统一入口，提供以下功能：
     * <ul>
     *   <li>自动提取 @Host 注解字段并修改 endpoint</li>
     *   <li>构建完整的 URI（包含路径变量）</li>
     *   <li>设置凭证信息</li>
     * </ul>
     * 
     * <h3>使用示例：</h3>
     * <pre>
     * // 在子类 Client 中
     * InternalRequest internalRequest = this.createRequest(
     *     request, 
     *     HttpMethodName.PUT,
     *     request.getObjectName()
     * );
     * </pre>
     * 
     * @param bceRequest    原始 BCE 请求对象
     * @param httpMethod    HTTP 方法
     * @param pathVariables 路径变量
     * @return 处理后的内部请求对象
     */
    protected com.baidubce.internal.InternalRequest createRequest(
            com.baidubce.model.AbstractBceRequest bceRequest, 
            com.baidubce.http.HttpMethodName httpMethod, 
            String... pathVariables) {
        return createRequest(bceRequest, httpMethod, null, pathVariables);
    }
    
    /**
     * 创建内部请求对象，自动处理 @Host 注解，并支持自定义签名选项
     * 
     * <p>此方法是 {@link #createRequest(com.baidubce.model.AbstractBceRequest, com.baidubce.http.HttpMethodName, String...)} 
     * 的重载版本，支持传入自定义的签名选项。
     * 
     * @param bceRequest    原始 BCE 请求对象
     * @param httpMethod    HTTP 方法
     * @param signOptions   签名选项（可选，为 null 则不设置）
     * @param pathVariables 路径变量
     * @return 处理后的内部请求对象
     */
    protected com.baidubce.internal.InternalRequest createRequest(
            com.baidubce.model.AbstractBceRequest bceRequest,
            com.baidubce.http.HttpMethodName httpMethod,
            com.baidubce.auth.SignOptions signOptions,
            String... pathVariables) {
        java.util.List<String> path = new java.util.ArrayList<String>();
        if (pathVariables != null) {
            for (String pathVariable : pathVariables) {
                path.add(pathVariable);
            }
        }
        String hostPrefix = extractHostAnnotationValue(bceRequest);
        // 3. 修改 endpoint（如果有 @Host 注解）
        URI endpoint = this.getEndpoint();
        if (hostPrefix != null && !hostPrefix.isEmpty()) {
            endpoint = buildHostEndpoint(endpoint, hostPrefix);
        }
        URI uri = HttpUtils.appendUri(endpoint, path.toArray(new String[path.size()]));
        com.baidubce.internal.InternalRequest request = new com.baidubce.internal.InternalRequest(httpMethod, uri);
        if (signOptions != null) {
            request.setSignOptions(signOptions);
        }
        request.setCredentials(bceRequest.getRequestCredentials());
        return request;
    }
}
