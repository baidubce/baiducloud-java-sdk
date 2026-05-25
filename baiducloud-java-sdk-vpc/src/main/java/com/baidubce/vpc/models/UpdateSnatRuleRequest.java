package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSnatRuleRequest extends BaseBceRequest {

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

    /**
    * ruleId
    */
    @JsonIgnore
    private String ruleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * SNAT规则名字
    */
    private String ruleName;

    /**
    * 内网IP/网段
    */
    private String sourceCIDR;

    /**
    * 公网IPs
    */
    private List<String> publicIpsAddress;

    public String getNatId() {
        return natId;
    }

    public UpdateSnatRuleRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getRuleId() {
        return ruleId;
    }

    public UpdateSnatRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateSnatRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRuleName() {
        return ruleName;
    }

    public UpdateSnatRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getSourceCIDR() {
        return sourceCIDR;
    }

    public UpdateSnatRuleRequest setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }

    public List<String> getPublicIpsAddress() {
        return publicIpsAddress;
    }

    public UpdateSnatRuleRequest setPublicIpsAddress(List<String> publicIpsAddress) {
        this.publicIpsAddress = publicIpsAddress;
        return this;
    }

}
