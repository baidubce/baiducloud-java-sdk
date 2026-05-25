package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateLimitRule {
    /**
     * IPv6限速策略的ID
     */
    private String rateLimitRuleId;

    /**
     * 限速的IPv6地址
     */
    private String ipv6Address;

    /**
     * 入口带宽
     */
    private Integer ingressBandwidthInMbps;

    /**
     * 出口带宽
     */
    private Integer egressBandwidthInMbps;

    public RateLimitRule setRateLimitRuleId(String rateLimitRuleId) {
        this.rateLimitRuleId = rateLimitRuleId;
        return this;
    }

    public String getRateLimitRuleId() {
        return this.rateLimitRuleId;
    }

    public RateLimitRule setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public RateLimitRule setIngressBandwidthInMbps(Integer ingressBandwidthInMbps) {
        this.ingressBandwidthInMbps = ingressBandwidthInMbps;
        return this;
    }

    public Integer getIngressBandwidthInMbps() {
        return this.ingressBandwidthInMbps;
    }

    public RateLimitRule setEgressBandwidthInMbps(Integer egressBandwidthInMbps) {
        this.egressBandwidthInMbps = egressBandwidthInMbps;
        return this;
    }

    public Integer getEgressBandwidthInMbps() {
        return this.egressBandwidthInMbps;
    }

    @Override
    public String toString() {
        return "RateLimitRule{" + "rateLimitRuleId=" + rateLimitRuleId + "\n" + "ipv6Address=" + ipv6Address + "\n" + "ingressBandwidthInMbps=" + ingressBandwidthInMbps + "\n"
                + "egressBandwidthInMbps=" + egressBandwidthInMbps + "\n" + "}";
    }

}