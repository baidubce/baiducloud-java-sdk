package com.baidubce.vpc;

import com.baidubce.AbstractBceClient;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.http.handler.BceErrorResponseHandler;
import com.baidubce.http.handler.BceJsonResponseHandler;
import com.baidubce.http.handler.BceMetadataResponseHandler;
import com.baidubce.BceClientConfiguration;
import com.baidubce.internal.InternalRequest;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.util.HttpUtils;
import java.net.URI;
import com.baidubce.util.JsonUtils;
import java.io.UnsupportedEncodingException;
import com.baidubce.BceClientException;
import com.baidubce.auth.SignOptions;
import com.baidubce.http.Headers;
import com.baidubce.internal.RestartableInputStream;
import com.baidubce.common.BaseBceRequest;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.vpc.models.CreateGatewayLimitRulesRequest;
import com.baidubce.vpc.models.CreateGatewayLimitRulesResponse;
import com.baidubce.vpc.models.DeleteGatewayLimitRuleRequest;
import com.baidubce.vpc.models.ModifyGatewayLimitRulesRequest;
import com.baidubce.vpc.models.ViewGatewayLimitRulesRequest;
import com.baidubce.vpc.models.ViewGatewayLimitRulesResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

public class VpcClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";

    private static final String CONSTANT_GATEWAY = "gateway";

    private static final String CONSTANT_LIMITRULE = "limitrule";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public VpcClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public VpcClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * createGatewayLimitRules
     * 
     * @param request 入参结构体
     * @return CreateGatewayLimitRulesResponse
     */
    public CreateGatewayLimitRulesResponse createGatewayLimitRules(CreateGatewayLimitRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_GATEWAY, CONSTANT_LIMITRULE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateGatewayLimitRulesResponse.class);
    }

    /**
     * deleteGatewayLimitRule
     * 
     * @param request 入参结构体
     */
    public void deleteGatewayLimitRule(DeleteGatewayLimitRuleRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_GATEWAY, CONSTANT_LIMITRULE, request.getGlrId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyGatewayLimitRules
     * 
     * @param request 入参结构体
     */
    public void modifyGatewayLimitRules(ModifyGatewayLimitRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_GATEWAY, CONSTANT_LIMITRULE, request.getGlrId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * viewGatewayLimitRules
     * 
     * @param request 入参结构体
     * @return ViewGatewayLimitRulesResponse
     */
    public ViewGatewayLimitRulesResponse viewGatewayLimitRules(ViewGatewayLimitRulesRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_GATEWAY, CONSTANT_LIMITRULE);
        if (request.getServiceType() != null) {
            internalRequest.addParameter("serviceType", request.getServiceType());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getGlrId() != null) {
            internalRequest.addParameter("glrId", request.getGlrId());
        }
        if (request.getResourceId() != null) {
            internalRequest.addParameter("resourceId", request.getResourceId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", request.getMaxKeys());
        }
        return invokeHttpClient(internalRequest, ViewGatewayLimitRulesResponse.class);
    }

    /**
    * Creates and initializes a new request object for the specified resource.
    *
    * @param bceRequest The original BCE request created by the user.
    * @param httpMethod The HTTP method to use when sending the request.
    * @param pathVariables The optional variables used in the URI path.
    * @return A new request object populated with endpoint, resource path and specific
    *         parameters to send.
    */
    private InternalRequest createRequest(AbstractBceRequest bceRequest, HttpMethodName httpMethod, String... pathVariables) {
        List<String> path = new ArrayList<String>();
        if (pathVariables != null) {
            for (String pathVariable : pathVariables) {
                path.add(pathVariable);
            }
        }
        URI uri = HttpUtils.appendUri(this.getEndpoint(), path.toArray(new String[path.size()]));
        InternalRequest request = new InternalRequest(httpMethod, uri);
        SignOptions signOptions = new SignOptions();
        signOptions.setHeadersToSign(new HashSet<String>(Arrays.asList(HEADERS_TO_SIGN)));
        request.setSignOptions(signOptions);
        request.setCredentials(bceRequest.getRequestCredentials());
        return request;
    }

    /**
    * the method to fill the internalRequest's content field with bceRequest
    * only support HttpMethodName.POST or HttpMethodName.PUT
    *
    * @param internalRequest A request object, populated with endpoint, resource path, ready for callers to populate
    * any additional headers or parameters, and execute.
    * @param bceRequest The original request, as created by the user.
    */
    protected void fillPayload(InternalRequest internalRequest, AbstractBceRequest bceRequest) {
        if (internalRequest.getHttpMethod() == HttpMethodName.POST || internalRequest.getHttpMethod() == HttpMethodName.PUT) {
            String strJson = JsonUtils.toJsonString(bceRequest);
            byte[] requestJson = null;
            try {
                requestJson = strJson.getBytes(DEFAULT_ENCODING);
            } catch (UnsupportedEncodingException e) {
                throw new BceClientException("Unsupported encode.", e);
            }
            internalRequest.addHeader(Headers.CONTENT_LENGTH, String.valueOf(requestJson.length));
            internalRequest.addHeader(Headers.CONTENT_TYPE, DEFAULT_CONTENT_TYPE);
            internalRequest.setContent(RestartableInputStream.wrap(requestJson));
        }
    }
}
