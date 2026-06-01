package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeServiceRequest extends BaseBceRequest {

    /**
    * service
    */
    @JsonIgnore
    private String service;

    public String getService() {
        return service;
    }

    public DescribeServiceRequest setService(String service) {
        this.service = service;
        return this;
    }

}
