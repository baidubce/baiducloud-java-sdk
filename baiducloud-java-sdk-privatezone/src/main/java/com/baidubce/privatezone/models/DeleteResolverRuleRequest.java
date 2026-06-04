package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteResolverRuleRequest extends BaseBceRequest {

    /**
    * ruleId
    */
    @JsonIgnore
    private String ruleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getRuleId() {
        return ruleId;
    }

    public DeleteResolverRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteResolverRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
