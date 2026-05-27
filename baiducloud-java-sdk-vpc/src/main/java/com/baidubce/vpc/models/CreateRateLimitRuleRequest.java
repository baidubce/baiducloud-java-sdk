package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRateLimitRuleRequest extends BaseBceRequest {

    /**
    * gatewayId
    */
    @JsonIgnore
    private String gatewayId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * Ipv6的地址
    */
    private String ipv6Address;

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

    public CreateRateLimitRuleRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateRateLimitRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpv6Address() {
        return ipv6Address;
    }

    public CreateRateLimitRuleRequest setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    public Integer getIngressBandwidthInMbps() {
        return ingressBandwidthInMbps;
    }

    public CreateRateLimitRuleRequest setIngressBandwidthInMbps(Integer ingressBandwidthInMbps) {
        this.ingressBandwidthInMbps = ingressBandwidthInMbps;
        return this;
    }

    public Integer getEgressBandwidthInMbps() {
        return egressBandwidthInMbps;
    }

    public CreateRateLimitRuleRequest setEgressBandwidthInMbps(Integer egressBandwidthInMbps) {
        this.egressBandwidthInMbps = egressBandwidthInMbps;
        return this;
    }

}
