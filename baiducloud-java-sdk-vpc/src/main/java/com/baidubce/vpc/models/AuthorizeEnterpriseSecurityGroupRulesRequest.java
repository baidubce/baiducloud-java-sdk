package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorizeEnterpriseSecurityGroupRulesRequest extends BaseBceRequest {

    /**
    * enterpriseSecurityGroupId
    */
    @JsonIgnore
    private String enterpriseSecurityGroupId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 待授权企业安全组规则
    */
    private List<EnterpriseSecurityGroupRuleModel> rules;

    public String getEnterpriseSecurityGroupId() {
        return enterpriseSecurityGroupId;
    }

    public AuthorizeEnterpriseSecurityGroupRulesRequest setEnterpriseSecurityGroupId(String enterpriseSecurityGroupId) {
        this.enterpriseSecurityGroupId = enterpriseSecurityGroupId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AuthorizeEnterpriseSecurityGroupRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<EnterpriseSecurityGroupRuleModel> getRules() {
        return rules;
    }

    public AuthorizeEnterpriseSecurityGroupRulesRequest setRules(List<EnterpriseSecurityGroupRuleModel> rules) {
        this.rules = rules;
        return this;
    }

}
