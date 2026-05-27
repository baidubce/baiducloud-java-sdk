package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSecurityGroupRulesRequest extends BaseBceRequest {

    /**
    * securityGroupRuleId
    */
    @JsonIgnore
    private String securityGroupRuleId;

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

    public String getSecurityGroupRuleId() {
        return securityGroupRuleId;
    }

    public DeleteSecurityGroupRulesRequest setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteSecurityGroupRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Long getSgVersion() {
        return sgVersion;
    }

    public DeleteSecurityGroupRulesRequest setSgVersion(Long sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

}
