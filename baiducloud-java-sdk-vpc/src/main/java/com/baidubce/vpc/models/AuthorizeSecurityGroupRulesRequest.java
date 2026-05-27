package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorizeSecurityGroupRulesRequest extends BaseBceRequest {

    /**
    * securityGroupId
    */
    @JsonIgnore
    private String securityGroupId;

    /**
    * sgVersion
    */
    @JsonIgnore
    private Long sgVersion;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * rule
    */
    private SecurityGroupRuleModel rule;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public AuthorizeSecurityGroupRulesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public Long getSgVersion() {
        return sgVersion;
    }

    public AuthorizeSecurityGroupRulesRequest setSgVersion(Long sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AuthorizeSecurityGroupRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public SecurityGroupRuleModel getRule() {
        return rule;
    }

    public AuthorizeSecurityGroupRulesRequest setRule(SecurityGroupRuleModel rule) {
        this.rule = rule;
        return this;
    }

}
