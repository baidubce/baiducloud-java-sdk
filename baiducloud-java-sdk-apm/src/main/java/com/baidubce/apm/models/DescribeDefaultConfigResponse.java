package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDefaultConfigResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * storageConfig
    */
    private StorageConfig storageConfig;

    /**
    * requestConfig
    */
    private RequestConfig requestConfig;

    /**
    * topoConfig
    */
    private TopoConfig topoConfig;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeDefaultConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeDefaultConfigResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeDefaultConfigResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public StorageConfig getStorageConfig() {
        return storageConfig;
    }

    public DescribeDefaultConfigResponse setStorageConfig(StorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }

    public RequestConfig getRequestConfig() {
        return requestConfig;
    }

    public DescribeDefaultConfigResponse setRequestConfig(RequestConfig requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }

    public TopoConfig getTopoConfig() {
        return topoConfig;
    }

    public DescribeDefaultConfigResponse setTopoConfig(TopoConfig topoConfig) {
        this.topoConfig = topoConfig;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeDefaultConfigResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "storageConfig=" + storageConfig + "\n"
                + "requestConfig=" + requestConfig + "\n" + "topoConfig=" + topoConfig + "\n" + "}";
    }

}
