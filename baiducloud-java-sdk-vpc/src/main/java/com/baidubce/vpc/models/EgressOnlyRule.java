package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EgressOnlyRule {
    /**
     * 只出不进策略的ID
     */
    private String egressOnlyRuleId;

    /**
     * 只出不进策略的cidr
     */
    private String cidr;

    public EgressOnlyRule setEgressOnlyRuleId(String egressOnlyRuleId) {
        this.egressOnlyRuleId = egressOnlyRuleId;
        return this;
    }

    public String getEgressOnlyRuleId() {
        return this.egressOnlyRuleId;
    }

    public EgressOnlyRule setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    @Override
    public String toString() {
        return "EgressOnlyRule{" + "egressOnlyRuleId=" + egressOnlyRuleId + "\n" + "cidr=" + cidr + "\n" + "}";
    }

}