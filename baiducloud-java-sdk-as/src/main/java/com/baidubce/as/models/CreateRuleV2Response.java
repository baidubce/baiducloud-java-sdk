package com.baidubce.as.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRuleV2Response extends BaseBceResponse {

    /**
    * 规则ID
    */
    private String ruleId;

    public String getRuleId() {
        return ruleId;
    }

    public CreateRuleV2Response setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateRuleV2Response{" + "ruleId=" + ruleId + "\n" + "}";
    }

}
