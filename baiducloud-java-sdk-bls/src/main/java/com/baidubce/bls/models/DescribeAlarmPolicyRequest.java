package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmPolicyRequest extends BaseBceRequest {

    /**
    * policyName
    */
    @JsonIgnore
    private String policyName;

    public String getPolicyName() {
        return policyName;
    }

    public DescribeAlarmPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

}
