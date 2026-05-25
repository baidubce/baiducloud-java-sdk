package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIpv6GatewaySpeedLimitPolicyResponse extends BaseBceResponse {

    /**
    * 限速规则的Id
    */
    private String rateLimitRuleId;

    public String getRateLimitRuleId() {
        return rateLimitRuleId;
    }

    public CreateIpv6GatewaySpeedLimitPolicyResponse setRateLimitRuleId(String rateLimitRuleId) {
        this.rateLimitRuleId = rateLimitRuleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateIpv6GatewaySpeedLimitPolicyResponse{" + "rateLimitRuleId=" + rateLimitRuleId + "\n" + "}";
    }

}
