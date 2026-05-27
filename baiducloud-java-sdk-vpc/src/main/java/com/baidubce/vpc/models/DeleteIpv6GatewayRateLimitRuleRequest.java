package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteIpv6GatewayRateLimitRuleRequest extends BaseBceRequest {

    /**
    * gatewayId
    */
    @JsonIgnore
    private String gatewayId;

    /**
    * rateLimitRuleId
    */
    @JsonIgnore
    private String rateLimitRuleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getGatewayId() {
        return gatewayId;
    }

    public DeleteIpv6GatewayRateLimitRuleRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public String getRateLimitRuleId() {
        return rateLimitRuleId;
    }

    public DeleteIpv6GatewayRateLimitRuleRequest setRateLimitRuleId(String rateLimitRuleId) {
        this.rateLimitRuleId = rateLimitRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteIpv6GatewayRateLimitRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
