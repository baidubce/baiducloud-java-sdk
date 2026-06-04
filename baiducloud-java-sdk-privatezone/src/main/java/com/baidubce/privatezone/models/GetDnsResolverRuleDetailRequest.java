package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDnsResolverRuleDetailRequest extends BaseBceRequest {

    /**
    * ruleId
    */
    @JsonIgnore
    private String ruleId;

    public String getRuleId() {
        return ruleId;
    }

    public GetDnsResolverRuleDetailRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

}
