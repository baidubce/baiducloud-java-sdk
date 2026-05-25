package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ipv6GatewayBandwidthUpgradeAndDowngradeRequest extends BaseBceRequest {

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
    * 更新后的IPv6网关的带宽
    */
    private Integer bandwidthInMbps;

    public String getGatewayId() {
        return gatewayId;
    }

    public Ipv6GatewayBandwidthUpgradeAndDowngradeRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public Ipv6GatewayBandwidthUpgradeAndDowngradeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public Ipv6GatewayBandwidthUpgradeAndDowngradeRequest setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

}
