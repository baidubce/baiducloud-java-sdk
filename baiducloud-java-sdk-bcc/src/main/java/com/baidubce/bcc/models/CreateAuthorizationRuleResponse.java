package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAuthorizationRuleResponse extends BaseBceResponse {

    /**
    * 请求Id
    */
    private String requestId;

    /**
    * 规则ID
    */
    private String ruleId;

    public String getRequestId() {
        return requestId;
    }

    public CreateAuthorizationRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRuleId() {
        return ruleId;
    }

    public CreateAuthorizationRuleResponse setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAuthorizationRuleResponse{" + "requestId=" + requestId + "\n" + "ruleId=" + ruleId + "\n" + "}";
    }

}
