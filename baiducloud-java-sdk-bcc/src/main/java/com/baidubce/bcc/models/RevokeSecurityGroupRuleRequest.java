package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RevokeSecurityGroupRuleRequest extends BaseBceRequest {

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

    public RevokeSecurityGroupRuleRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public Integer getSgVersion() {
        return sgVersion;
    }

    public RevokeSecurityGroupRuleRequest setSgVersion(Integer sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public SecurityGroupRuleModel getRule() {
        return rule;
    }

    public RevokeSecurityGroupRuleRequest setRule(SecurityGroupRuleModel rule) {
        this.rule = rule;
        return this;
    }

}
