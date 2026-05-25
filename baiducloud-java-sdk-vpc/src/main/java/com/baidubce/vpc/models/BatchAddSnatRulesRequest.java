package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchAddSnatRulesRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * NAT网关的ID
    */
    private String natId;

    /**
    * 内网IP/网段
    */
    private List<SnatRuleRequest> snatRules;

    public String getClientToken() {
        return clientToken;
    }

    public BatchAddSnatRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getNatId() {
        return natId;
    }

    public BatchAddSnatRulesRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public List<SnatRuleRequest> getSnatRules() {
        return snatRules;
    }

    public BatchAddSnatRulesRequest setSnatRules(List<SnatRuleRequest> snatRules) {
        this.snatRules = snatRules;
        return this;
    }

}
