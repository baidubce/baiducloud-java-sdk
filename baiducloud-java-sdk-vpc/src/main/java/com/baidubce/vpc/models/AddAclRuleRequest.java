package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddAclRuleRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * ACL规则集合
    */
    private List<AclRuleRequest> aclRules;

    public String getClientToken() {
        return clientToken;
    }

    public AddAclRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<AclRuleRequest> getAclRules() {
        return aclRules;
    }

    public AddAclRuleRequest setAclRules(List<AclRuleRequest> aclRules) {
        this.aclRules = aclRules;
        return this;
    }

}
