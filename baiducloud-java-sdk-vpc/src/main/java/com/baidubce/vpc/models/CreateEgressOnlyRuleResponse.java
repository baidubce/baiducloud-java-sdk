package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEgressOnlyRuleResponse extends BaseBceResponse {

    /**
    * IPv6网关的只出不进的规则Id
    */
    private String egressOnlyRuleId;

    public String getEgressOnlyRuleId() {
        return egressOnlyRuleId;
    }

    public CreateEgressOnlyRuleResponse setEgressOnlyRuleId(String egressOnlyRuleId) {
        this.egressOnlyRuleId = egressOnlyRuleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateEgressOnlyRuleResponse{" + "egressOnlyRuleId=" + egressOnlyRuleId + "\n" + "}";
    }

}
