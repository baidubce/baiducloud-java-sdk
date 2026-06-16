package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSecurityGroupRuleRequest extends BaseBceRequest {

    /**
    * securityGroupRuleId
    */
    @JsonIgnore
    private String securityGroupRuleId;

    /**
    * sgVersion
    */
    @JsonIgnore
    private Integer sgVersion;

    public String getSecurityGroupRuleId() {
        return securityGroupRuleId;
    }

    public DeleteSecurityGroupRuleRequest setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }

    public Integer getSgVersion() {
        return sgVersion;
    }

    public DeleteSecurityGroupRuleRequest setSgVersion(Integer sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

}
