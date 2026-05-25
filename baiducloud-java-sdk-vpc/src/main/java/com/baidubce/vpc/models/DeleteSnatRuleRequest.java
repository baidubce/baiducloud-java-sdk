package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSnatRuleRequest extends BaseBceRequest {

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

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

    public String getNatId() {
        return natId;
    }

    public DeleteSnatRuleRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getRuleId() {
        return ruleId;
    }

    public DeleteSnatRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteSnatRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
