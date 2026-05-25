package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDnatRuleResponse extends BaseBceResponse {

    /**
    * 创建的DNAT规则的ID
    */
    private String ruleId;

    public String getRuleId() {
        return ruleId;
    }

    public CreateDnatRuleResponse setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDnatRuleResponse{" + "ruleId=" + ruleId + "\n" + "}";
    }

}
