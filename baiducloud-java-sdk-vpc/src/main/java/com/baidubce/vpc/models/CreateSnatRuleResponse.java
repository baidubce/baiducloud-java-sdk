package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSnatRuleResponse extends BaseBceResponse {

    /**
    * 创建的SNAT规则的ID
    */
    private String ruleId;

    public String getRuleId() {
        return ruleId;
    }

    public CreateSnatRuleResponse setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateSnatRuleResponse{" + "ruleId=" + ruleId + "\n" + "}";
    }

}
