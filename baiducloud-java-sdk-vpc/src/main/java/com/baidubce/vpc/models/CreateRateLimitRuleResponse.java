package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRateLimitRuleResponse extends BaseBceResponse {

    /**
    * 限速规则的Id
    */
    private String rateLimitRuleId;

    public String getRateLimitRuleId() {
        return rateLimitRuleId;
    }

    public CreateRateLimitRuleResponse setRateLimitRuleId(String rateLimitRuleId) {
        this.rateLimitRuleId = rateLimitRuleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateRateLimitRuleResponse{" + "rateLimitRuleId=" + rateLimitRuleId + "\n" + "}";
    }

}
