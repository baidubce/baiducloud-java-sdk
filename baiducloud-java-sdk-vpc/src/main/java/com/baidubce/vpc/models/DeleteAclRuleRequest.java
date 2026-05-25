package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAclRuleRequest extends BaseBceRequest {

    /**
    * aclRuleId
    */
    @JsonIgnore
    private String aclRuleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getAclRuleId() {
        return aclRuleId;
    }

    public DeleteAclRuleRequest setAclRuleId(String aclRuleId) {
        this.aclRuleId = aclRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteAclRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
