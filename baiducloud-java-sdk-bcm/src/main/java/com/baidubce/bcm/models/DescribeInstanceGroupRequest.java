package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeInstanceGroupRequest extends BaseBceRequest {

    /**
    * 实例组ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public DescribeInstanceGroupRequest setId(String id) {
        this.id = id;
        return this;
    }

}
