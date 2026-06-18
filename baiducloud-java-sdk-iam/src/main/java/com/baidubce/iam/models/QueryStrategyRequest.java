package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryStrategyRequest extends BaseBceRequest {

    /**
    * policyName
    */
    @JsonIgnore
    private String policyName;

    /**
    * policyType
    */
    @JsonIgnore
    private String policyType;

    public String getPolicyName() {
        return policyName;
    }

    public QueryStrategyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getPolicyType() {
        return policyType;
    }

    public QueryStrategyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

}
