package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RevokeRegularSecurityGroupRulesV2Request extends BaseBceRequest {

    /**
    * securityGroupId
    */
    @JsonIgnore
    private String securityGroupId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * sgVersion
    */
    @JsonIgnore
    private Long sgVersion;

    /**
    * rule
    */
    private SecurityGroupRuleModel rule;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public RevokeRegularSecurityGroupRulesV2Request setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public RevokeRegularSecurityGroupRulesV2Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Long getSgVersion() {
        return sgVersion;
    }

    public RevokeRegularSecurityGroupRulesV2Request setSgVersion(Long sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public SecurityGroupRuleModel getRule() {
        return rule;
    }

    public RevokeRegularSecurityGroupRulesV2Request setRule(SecurityGroupRuleModel rule) {
        this.rule = rule;
        return this;
    }

}
