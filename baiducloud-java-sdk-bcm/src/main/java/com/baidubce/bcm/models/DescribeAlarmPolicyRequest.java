package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmPolicyRequest extends BaseBceRequest {

    /**
    * 策略ID
    */
    private String id;

    /**
    * 是否返回SubResourceType，默认值：false
    */
    private Boolean requireSubResourceType;

    public String getId() {
        return id;
    }

    public DescribeAlarmPolicyRequest setId(String id) {
        this.id = id;
        return this;
    }

    public Boolean getRequireSubResourceType() {
        return requireSubResourceType;
    }

    public DescribeAlarmPolicyRequest setRequireSubResourceType(Boolean requireSubResourceType) {
        this.requireSubResourceType = requireSubResourceType;
        return this;
    }

}
