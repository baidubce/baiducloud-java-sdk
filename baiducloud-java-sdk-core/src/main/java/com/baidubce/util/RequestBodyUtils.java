/*
 * Copyright 2024 Baidu, Inc.
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
package com.baidubce.util;

import com.baidubce.BceClientException;
import com.baidubce.http.BodyType;
import com.baidubce.http.Headers;
import com.baidubce.http.HttpMethodName;
import com.baidubce.internal.InternalRequest;
import com.baidubce.internal.RestartableInputStream;
import com.baidubce.model.AbstractBceRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * 请求体编码工具类，支持多种 BodyType 格式
 * @author SDK Team
 * @since 2024-04-26
 */
public class RequestBodyUtils {
    
    /**
     * 默认字符编码
     */
    private static final String DEFAULT_ENCODING = "UTF-8";
    
    /**
     * JSON Content-Type
     */
    public static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    
    /**
     * Form Content-Type
     */
    public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded; charset=utf-8";
    
    /**
     * Octet Stream Content-Type
     */
    public static final String CONTENT_TYPE_OCTET_STREAM = "application/octet-stream";
    
    /**
     * Multipart Form Data Content-Type
     */
    public static final String CONTENT_TYPE_MULTIPART = "multipart/form-data";
    
    /**
     * 使用指定的 BodyType 填充请求体
     * 
     * @param internalRequest 内部请求对象
     * @param bceRequest 原始请求对象
     * @param bodyType Body类型（JSON/FORM/BINARY/XML/NONE）
     */
    public static void fillPayload(InternalRequest internalRequest, AbstractBceRequest bceRequest, BodyType bodyType) {
        fillPayload(internalRequest, bceRequest, bodyType, null);
    }
    
    /**
     * 使用指定的 BodyType 填充请求体，支持自定义 contentType
     * 
     * @param internalRequest 内部请求对象
     * @param bceRequest 原始请求对象
     * @param bodyType Body类型（JSON/FORM/BINARY/XML/NONE）
     * @param customContentType 自定义 Content-Type（如果为 null，使用 bodyType 的默认值）
     */
    public static void fillPayload(InternalRequest internalRequest, AbstractBceRequest bceRequest, BodyType bodyType, String customContentType) {
        if (!isPostOrPut(internalRequest)) {
            return;
        }
        
        if (bodyType == BodyType.NONE || !bodyType.hasContentType()) {
            return;
        }
        
        // 如果用户指定了自定义 contentType，使用自定义值；否则使用 bodyType 的默认值
        String finalContentType = (customContentType != null && !customContentType.isEmpty()) 
                                  ? customContentType 
                                  : bodyType.getContentType();
        
        try {
            byte[] bodyBytes = encodeRequestBody(bceRequest, bodyType);
            setRequestBody(internalRequest, bodyBytes, finalContentType);
        } catch (Exception e) {
            throw new BceClientException("Failed to encode request body with BodyType: " + bodyType, e);
        }
    }
    
    /**
     * 使用 JSON 格式填充请求体（向后兼容的便捷方法）
     * 
     * @param internalRequest 内部请求对象
     * @param bceRequest 原始请求对象
     */
    public static void fillPayloadAsJson(InternalRequest internalRequest, AbstractBceRequest bceRequest) {
        fillPayload(internalRequest, bceRequest, BodyType.JSON);
    }
    
    /**
     * 使用 JSON 格式填充请求体（自定义 Content-Type）
     * 
     * @param internalRequest 内部请求对象
     * @param bceRequest 原始请求对象
     * @param contentType 自定义 Content-Type（如 "application/json; charset=gbk"）
     */
    public static void fillPayloadAsJson(InternalRequest internalRequest, AbstractBceRequest bceRequest, String contentType) {
        fillPayload(internalRequest, bceRequest, BodyType.JSON, contentType);
    }
    
    /**
     * 使用表单格式填充请求体（向后兼容的便捷方法）
     * 
     * @param internalRequest 内部请求对象
     * @param bceRequest 原始请求对象
     */
    public static void fillPayloadAsForm(InternalRequest internalRequest, AbstractBceRequest bceRequest) {
        fillPayload(internalRequest, bceRequest, BodyType.FORM);
    }
    
    /**
     * 使用表单格式填充请求体（自定义 Content-Type）
     * 
     * @param internalRequest 内部请求对象
     * @param bceRequest 原始请求对象
     * @param contentType 自定义 Content-Type
     */
    public static void fillPayloadAsForm(InternalRequest internalRequest, AbstractBceRequest bceRequest, String contentType) {
        fillPayload(internalRequest, bceRequest, BodyType.FORM, contentType);
    }
    
    /**
     * 使用二进制流格式填充请求体（使用默认 BodyType.BINARY）
     * 
     * <p>自动计算 contentLength：</p>
     * <ul>
     *   <li>ByteArrayInputStream - 直接获取 available()（最高效）</li>
     *   <li>FileInputStream - 从文件 channel 获取大小（高效，不读取文件内容）</li>
     *   <li>其他类型的流 - 使用 Chunked Transfer Encoding（流式传输，完全避免 OOM）</li>
     * </ul>
     * 
     * @param internalRequest 内部请求对象
     * @param inputStream 输入流
     */
    public static void fillPayloadAsStream(InternalRequest internalRequest, InputStream inputStream) {
        fillPayloadAsStream(internalRequest, inputStream, null, BodyType.BINARY, null);
    }
    
    /**
     * 使用二进制流格式填充请求体（指定 BodyType）
     * 
     * @param internalRequest 内部请求对象
     * @param inputStream 输入流
     * @param bodyType Body类型（通常使用 BodyType.BINARY）
     */
    public static void fillPayloadAsStream(InternalRequest internalRequest, InputStream inputStream, BodyType bodyType) {
        fillPayloadAsStream(internalRequest, inputStream, null, bodyType, null);
    }
    
    /**
     * 使用二进制流格式填充请求体（自定义 Content-Type）
     * 
     * @param internalRequest 内部请求对象
     * @param inputStream 输入流
     * @param contentType 自定义 Content-Type（如 "image/jpeg", "video/mp4"）
     */
    public static void fillPayloadAsStream(InternalRequest internalRequest, InputStream inputStream, String contentType) {
        fillPayloadAsStream(internalRequest, inputStream, null, BodyType.BINARY, contentType);
    }
    
    /**
     * 使用二进制流格式填充请求体（显式传递 contentLength，指定 BodyType）
     * 
     * @param internalRequest 内部请求对象
     * @param inputStream 输入流
     * @param contentLength 内容长度（如果为 null，则自动计算）
     * @param bodyType Body类型（通常使用 BodyType.BINARY）
     */
    public static void fillPayloadAsStream(InternalRequest internalRequest, InputStream inputStream, Long contentLength, BodyType bodyType) {
        fillPayloadAsStream(internalRequest, inputStream, contentLength, bodyType, null);
    }
    
    /**
     * 使用二进制流格式填充请求体（完整参数版本，支持自定义 contentType）
     * 
     * @param internalRequest 内部请求对象
     * @param inputStream 输入流
     * @param contentLength 内容长度（如果为 null，则自动计算）
     * @param bodyType Body类型（通常使用 BodyType.BINARY）
     * @param customContentType 自定义 Content-Type（如果为 null，使用 bodyType 的默认值）
     */
    public static void fillPayloadAsStream(InternalRequest internalRequest, InputStream inputStream, Long contentLength, BodyType bodyType, String customContentType) {
        if (!isPostOrPut(internalRequest)) {
            return;
        }
        if (bodyType == null) {
            bodyType = BodyType.BINARY;
        }
        String finalContentType = (customContentType != null && !customContentType.isEmpty()) 
                                  ? customContentType 
                                  : bodyType.getContentType();
        if (contentLength == null) {
            contentLength = calculateContentLength(inputStream);
        }
        setStreamRequestBody(internalRequest, inputStream, contentLength, finalContentType);
    }
    
    /**
     * 使用字节数组填充请求体（自动计算 contentLength）
     * 
     * @param internalRequest 内部请求对象
     * @param data 字节数组
     * @param bodyType Body类型（通常使用 BodyType.BINARY）
     */
    public static void fillPayloadAsByteArray(InternalRequest internalRequest, byte[] data, BodyType bodyType) {
        fillPayloadAsByteArray(internalRequest, data, bodyType, null);
    }
    
    /**
     * 使用字节数组填充请求体（支持自定义 contentType）
     * 
     * @param internalRequest 内部请求对象
     * @param data 字节数组
     * @param bodyType Body类型（通常使用 BodyType.BINARY）
     * @param customContentType 自定义 Content-Type（如果为 null，使用 bodyType 的默认值）
     */
    public static void fillPayloadAsByteArray(InternalRequest internalRequest, byte[] data, BodyType bodyType, String customContentType) {
        if (data == null) {
            throw new BceClientException("Data cannot be null");
        }
        fillPayloadAsStream(internalRequest, new java.io.ByteArrayInputStream(data), (long) data.length, bodyType, customContentType);
    }
    
    /**
     * 使用字节数组填充请求体（自定义 Content-Type字符串）
     * 
     * @param internalRequest 内部请求对象
     * @param data 字节数组
     * @param contentType 自定义 Content-Type
     */
    public static void fillPayloadAsByteArray(InternalRequest internalRequest, byte[] data, String contentType) {
        fillPayloadAsByteArray(internalRequest, data, BodyType.BINARY, contentType);
    }
    
    /**
     * 根据 BodyType 编码请求体
     * 
     * @param bceRequest 原始请求对象
     * @param bodyType Body类型
     * @return 编码后的字节数组
     */
    private static byte[] encodeRequestBody(AbstractBceRequest bceRequest, BodyType bodyType) 
            throws UnsupportedEncodingException, IOException {
        
        switch (bodyType) {
            case JSON:
                return encodeAsJson(bceRequest);
            case FORM:
                return encodeAsForm(bceRequest);
            case XML:
                // XML 格式暂未实现，可以在这里添加 XML 序列化逻辑
                throw new BceClientException("XML body type is not yet implemented");
            default:
                throw new BceClientException("Unsupported BodyType: " + bodyType);
        }
    }
    
    /**
     * 将请求对象编码为 JSON 格式
     * 
     * @param bceRequest 请求对象
     * @return JSON 字节数组
     */
    private static byte[] encodeAsJson(AbstractBceRequest bceRequest) throws UnsupportedEncodingException {
        String strJson = JsonUtils.toJsonString(bceRequest);
        return strJson.getBytes(DEFAULT_ENCODING);
    }
    
    /**
     * 将请求对象编码为表单格式
     * 
     * @param bceRequest 请求对象
     * @return 表单编码字节数组
     */
    private static byte[] encodeAsForm(AbstractBceRequest bceRequest) throws IOException {
        // 1. 将对象转换为 JSON，然后解析为 Map
        String strJson = JsonUtils.toJsonString(bceRequest);
        ObjectMapper mapper = new ObjectMapper();
        @SuppressWarnings("unchecked")
        Map<String, Object> fieldMap = mapper.readValue(strJson, Map.class);
        
        // 2. 构建表单格式字符串: key1=value1&key2=value2
        StringBuilder formData = new StringBuilder();
        boolean first = true;
        
        for (Map.Entry<String, Object> entry : fieldMap.entrySet()) {
            Object value = entry.getValue();
            // 跳过 null 值和空字符串
            if (value == null || "".equals(value)) {
                continue;
            }
            
            if (!first) {
                formData.append("&");
            }
            first = false;
            
            // URL 编码 key 和 value
            String encodedKey = URLEncoder.encode(entry.getKey(), DEFAULT_ENCODING);
            String encodedValue = URLEncoder.encode(String.valueOf(value), DEFAULT_ENCODING);
            formData.append(encodedKey).append("=").append(encodedValue);
        }
        
        return formData.toString().getBytes(DEFAULT_ENCODING);
    }
    
    /**
     * 设置请求体内容
     * 
     * @param internalRequest 内部请求对象
     * @param bodyBytes 请求体字节数组
     * @param contentType Content-Type
     */
    private static void setRequestBody(InternalRequest internalRequest, byte[] bodyBytes, String contentType) {
        internalRequest.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bodyBytes.length));
        internalRequest.addHeader(Headers.CONTENT_TYPE, contentType);
        internalRequest.setContent(RestartableInputStream.wrap(bodyBytes));
    }
    
    /**
     * 检查是否为 POST 或 PUT 方法
     * 
     * @param internalRequest 内部请求对象
     * @return 是否为 POST 或 PUT
     */
    private static boolean isPostOrPut(InternalRequest internalRequest) {
        HttpMethodName method = internalRequest.getHttpMethod();
        return method == HttpMethodName.POST || method == HttpMethodName.PUT;
    }
    
    /**
     * 获取默认值（如果为空）
     *
     * @param value 原始值
     * @param defaultValue 默认值
     * @return 如果原始值为 null 或空，返回默认值，否则返回原始值
     */
    private static String getDefaultIfEmpty(String value, String defaultValue) {
        return (value == null || value.isEmpty()) ? defaultValue : value;
    }

    /**
     * 自动计算 contentLength
     * 
     * @param inputStream 输入流
     * @return contentLength（-1 表示使用 chunked encoding）
     */
    private static long calculateContentLength(InputStream inputStream) {
        try {
            // 1. ByteArrayInputStream - 直接获取 available()（最高效）
            if (inputStream instanceof java.io.ByteArrayInputStream) {
                return (long) inputStream.available();
            } 
            // 2. FileInputStream - 从文件 channel 获取大小（高效，不读取文件内容）
            else if (inputStream instanceof java.io.FileInputStream) {
                return ((java.io.FileInputStream) inputStream).getChannel().size();
            } 
            // 3. 其他类型的流 - 使用 Chunked Transfer Encoding（无需读入内存，无 OOM 风险）
            else {
                // 使用 Chunked Transfer Encoding：Apache HttpClient 会在 contentLength = -1 时自动使用
                // 优点：
                // - 完全避免 OOM，不需要读入内存
                // - 流式传输，边读边发
                // - BCE 服务端支持 chunked encoding（参考 BceJsonResponseHandler）
                return -1L;
            }
        } catch (Exception e) {
            throw new BceClientException("Failed to calculate content length from InputStream. " +
                    "For large files, please explicitly set contentLength parameter " +
                    "or use FileInputStream which allows automatic size detection.", e);
        }
    }
    
    /**
     * 设置流式请求体
     * 
     * @param internalRequest 内部请求对象
     * @param inputStream 输入流
     * @param contentLength 内容长度（-1 表示使用 chunked encoding）
     * @param contentType Content-Type
     */
    private static void setStreamRequestBody(InternalRequest internalRequest, InputStream inputStream, 
                                            long contentLength, String contentType) {
        try {
            if (contentLength > 0 && !inputStream.markSupported()) {
                inputStream = new java.io.BufferedInputStream(inputStream);
            }
            if (contentLength > 0) {
                inputStream.mark(Integer.MAX_VALUE);
            }
            if (contentLength >= 0) {
                internalRequest.addHeader(Headers.CONTENT_LENGTH, String.valueOf(contentLength));
            }
            internalRequest.addHeader(Headers.CONTENT_TYPE, contentType);
            internalRequest.setContent(new com.baidubce.internal.RestartableResettableInputStream(inputStream));
        } catch (Exception e) {
            throw new BceClientException("Failed to fill payload as stream.", e);
        }
    }
    
    /**
     * 私有构造函数，防止实例化
     */
    private RequestBodyUtils() {
        throw new AssertionError("No RequestBodyUtils instances for you!");
    }
}
