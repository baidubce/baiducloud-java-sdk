package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorizeRegularSecurityGroupRulesV2Request extends BaseBceRequest {

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

    public AuthorizeRegularSecurityGroupRulesV2Request setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public Long getSgVersion() {
        return sgVersion;
    }

    public AuthorizeRegularSecurityGroupRulesV2Request setSgVersion(Long sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AuthorizeRegularSecurityGroupRulesV2Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public SecurityGroupRuleModel getRule() {
        return rule;
    }

    public AuthorizeRegularSecurityGroupRulesV2Request setRule(SecurityGroupRuleModel rule) {
        this.rule = rule;
        return this;
    }

}
