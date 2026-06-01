package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeServicesNamesResponse extends BaseBceResponse {

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
    * 应用列表
    */
    private List<ServiceName> services;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeServicesNamesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeServicesNamesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeServicesNamesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<ServiceName> getServices() {
        return services;
    }

    public DescribeServicesNamesResponse setServices(List<ServiceName> services) {
        this.services = services;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeServicesNamesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "services=" + services + "\n" + "}";
    }

}
