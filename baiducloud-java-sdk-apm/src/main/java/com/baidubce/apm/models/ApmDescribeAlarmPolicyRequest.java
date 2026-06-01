package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmDescribeAlarmPolicyRequest extends BaseBceRequest {

    /**
    * 策略ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public ApmDescribeAlarmPolicyRequest setId(String id) {
        this.id = id;
        return this;
    }

}
