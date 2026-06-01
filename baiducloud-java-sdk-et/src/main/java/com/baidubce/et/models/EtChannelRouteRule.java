package com.baidubce.et.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtChannelRouteRule {
    /**
     * 专线通道路由规则ID
     */
    private String routeRuleId;

    /**
     * IP协议类型，取值[4 \| 6]
     */
    private Integer ipVersion;

    /**
     * 目标网段
     */
    private String destAddress;

    /**
     * 下一跳类型，取值["etGateway" \| "etChannel"]，分别表示专线网关、专线通道
     */
    private String nexthopType;

    /**
     * 下一跳实例ID
     */
    private String nexthopId;

    /**
     * 描述
     */
    private String description;

    public EtChannelRouteRule setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }

    public String getRouteRuleId() {
        return this.routeRuleId;
    }

    public EtChannelRouteRule setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public Integer getIpVersion() {
        return this.ipVersion;
    }

    public EtChannelRouteRule setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    public String getDestAddress() {
        return this.destAddress;
    }

    public EtChannelRouteRule setNexthopType(String nexthopType) {
        this.nexthopType = nexthopType;
        return this;
    }

    public String getNexthopType() {
        return this.nexthopType;
    }

    public EtChannelRouteRule setNexthopId(String nexthopId) {
        this.nexthopId = nexthopId;
        return this;
    }

    public String getNexthopId() {
        return this.nexthopId;
    }

    public EtChannelRouteRule setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "EtChannelRouteRule{" + "routeRuleId=" + routeRuleId + "\n" + "ipVersion=" + ipVersion + "\n" + "destAddress=" + destAddress + "\n" + "nexthopType=" + nexthopType
                + "\n" + "nexthopId=" + nexthopId + "\n" + "description=" + description + "\n" + "}";
    }

}