package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchAddDnatRulesRequest extends BaseBceRequest {

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * dnat规则集合
    */
    private List<DnatRuleRequest> rules;

    public String getNatId() {
        return natId;
    }

    public BatchAddDnatRulesRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BatchAddDnatRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<DnatRuleRequest> getRules() {
        return rules;
    }

    public BatchAddDnatRulesRequest setRules(List<DnatRuleRequest> rules) {
        this.rules = rules;
        return this;
    }

}
