package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeServicesMetricsResponse extends BaseBceResponse {

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
    * 应用指标列表
    */
    private List<ServiceMetric> services;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeServicesMetricsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeServicesMetricsResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeServicesMetricsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<ServiceMetric> getServices() {
        return services;
    }

    public DescribeServicesMetricsResponse setServices(List<ServiceMetric> services) {
        this.services = services;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeServicesMetricsResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "services=" + services + "\n" + "}";
    }

}
