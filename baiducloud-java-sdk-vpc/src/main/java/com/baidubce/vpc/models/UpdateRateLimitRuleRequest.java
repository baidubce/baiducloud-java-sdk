package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRateLimitRuleRequest extends BaseBceRequest {

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

    /**
    * 限速策略的入向带宽
    */
    private Integer ingressBandwidthInMbps;

    /**
    * 限速策略的出向带宽
    */
    private Integer egressBandwidthInMbps;

    public String getGatewayId() {
        return gatewayId;
    }

    public UpdateRateLimitRuleRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public String getRateLimitRuleId() {
        return rateLimitRuleId;
    }

    public UpdateRateLimitRuleRequest setRateLimitRuleId(String rateLimitRuleId) {
        this.rateLimitRuleId = rateLimitRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateRateLimitRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getIngressBandwidthInMbps() {
        return ingressBandwidthInMbps;
    }

    public UpdateRateLimitRuleRequest setIngressBandwidthInMbps(Integer ingressBandwidthInMbps) {
        this.ingressBandwidthInMbps = ingressBandwidthInMbps;
        return this;
    }

    public Integer getEgressBandwidthInMbps() {
        return egressBandwidthInMbps;
    }

    public UpdateRateLimitRuleRequest setEgressBandwidthInMbps(Integer egressBandwidthInMbps) {
        this.egressBandwidthInMbps = egressBandwidthInMbps;
        return this;
    }

}
