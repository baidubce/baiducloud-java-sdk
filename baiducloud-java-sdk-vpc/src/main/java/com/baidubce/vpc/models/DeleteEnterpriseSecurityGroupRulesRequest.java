package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteEnterpriseSecurityGroupRulesRequest extends BaseBceRequest {

    /**
    * enterpriseSecurityGroupRuleId
    */
    @JsonIgnore
    private String enterpriseSecurityGroupRuleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getEnterpriseSecurityGroupRuleId() {
        return enterpriseSecurityGroupRuleId;
    }

    public DeleteEnterpriseSecurityGroupRulesRequest setEnterpriseSecurityGroupRuleId(String enterpriseSecurityGroupRuleId) {
        this.enterpriseSecurityGroupRuleId = enterpriseSecurityGroupRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteEnterpriseSecurityGroupRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
