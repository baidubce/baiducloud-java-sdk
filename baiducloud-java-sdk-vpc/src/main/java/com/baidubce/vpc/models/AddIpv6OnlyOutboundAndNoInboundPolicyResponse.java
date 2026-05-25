package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddIpv6OnlyOutboundAndNoInboundPolicyResponse extends BaseBceResponse {

    /**
    * IPv6网关的只出不进的规则Id
    */
    private String egressOnlyRuleId;

    public String getEgressOnlyRuleId() {
        return egressOnlyRuleId;
    }

    public AddIpv6OnlyOutboundAndNoInboundPolicyResponse setEgressOnlyRuleId(String egressOnlyRuleId) {
        this.egressOnlyRuleId = egressOnlyRuleId;
        return this;
    }

    @Override
    public String toString() {
        return "AddIpv6OnlyOutboundAndNoInboundPolicyResponse{" + "egressOnlyRuleId=" + egressOnlyRuleId + "\n" + "}";
    }

}
