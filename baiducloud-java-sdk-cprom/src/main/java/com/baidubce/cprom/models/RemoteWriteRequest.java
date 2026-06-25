package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.InputStream;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteWriteRequest extends BaseBceRequest {

    /**
    * remoteWriteUrl
    */
    @JsonIgnore
    private String remoteWriteUrl;

    /**
    * contentType
    */
    @JsonIgnore
    private String contentType;

    /**
    * contentEncoding
    */
    @JsonIgnore
    private String contentEncoding;

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * authorization
    */
    @JsonIgnore
    private String authorization;

    /**
    * Prometheus Remote Write 的 protobuf 二进制数据，需使用 `snappy` 压缩，具体格式参考： [远程写数据格式](https://github.com/prometheus/prometheus/tree/release-2.36/documentation/examples/remote_storage)
    */
    @JsonIgnore
    private InputStream body;

    public String getRemoteWriteUrl() {
        return remoteWriteUrl;
    }

    public RemoteWriteRequest setRemoteWriteUrl(String remoteWriteUrl) {
        this.remoteWriteUrl = remoteWriteUrl;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public RemoteWriteRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public RemoteWriteRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public RemoteWriteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAuthorization() {
        return authorization;
    }

    public RemoteWriteRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    public InputStream getBody() {
        return body;
    }

    public RemoteWriteRequest setBody(InputStream body) {
        this.body = body;
        return this;
    }

}
