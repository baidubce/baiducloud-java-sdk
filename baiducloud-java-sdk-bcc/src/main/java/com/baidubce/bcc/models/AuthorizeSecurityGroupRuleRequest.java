package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorizeSecurityGroupRuleRequest extends BaseBceRequest {

    /**
    * securityGroupId
    */
    @JsonIgnore
    private String securityGroupId;

    /**
    * sgVersion
    */
    @JsonIgnore
    private Integer sgVersion;

    /**
    * rule
    */
    private SecurityGroupRuleModel rule;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public AuthorizeSecurityGroupRuleRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public Integer getSgVersion() {
        return sgVersion;
    }

    public AuthorizeSecurityGroupRuleRequest setSgVersion(Integer sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public SecurityGroupRuleModel getRule() {
        return rule;
    }

    public AuthorizeSecurityGroupRuleRequest setRule(SecurityGroupRuleModel rule) {
        this.rule = rule;
        return this;
    }

}
