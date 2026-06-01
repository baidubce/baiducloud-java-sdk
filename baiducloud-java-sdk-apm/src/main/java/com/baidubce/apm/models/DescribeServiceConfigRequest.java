package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeServiceConfigRequest extends BaseBceRequest {

    /**
    * 应用名
    */
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public DescribeServiceConfigRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

}
