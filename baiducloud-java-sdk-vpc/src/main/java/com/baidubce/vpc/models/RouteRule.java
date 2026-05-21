package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteRule {
    /**
     * 路由规则ID
     */
    private String routeRuleId;

    /**
     * 路由表ID
     */
    private String routeTableId;

    /**
     * 源网段
     */
    private String sourceAddress;

    /**
     * 目标网段
     */
    private String destinationAddress;

    /**
     * 下一跳ID，当nexthopType是本地网关类型时，该字段可以为空
     */
    private String nexthopId;

    /**
     * 
     */
    private String nexthopType;

    /**
     * 单线或多线路由。单线为"normal"，多线取值为ecmp或ha:active或ha:standby
     */
    private String pathType;

    /**
     * 描述
     */
    private String description;

    public RouteRule setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }

    public String getRouteRuleId() {
        return this.routeRuleId;
    }

    public RouteRule setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public String getRouteTableId() {
        return this.routeTableId;
    }

    public RouteRule setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    public String getSourceAddress() {
        return this.sourceAddress;
    }

    public RouteRule setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
        return this;
    }

    public String getDestinationAddress() {
        return this.destinationAddress;
    }

    public RouteRule setNexthopId(String nexthopId) {
        this.nexthopId = nexthopId;
        return this;
    }

    public String getNexthopId() {
        return this.nexthopId;
    }

    public RouteRule setNexthopType(String nexthopType) {
        this.nexthopType = nexthopType;
        return this;
    }

    public String getNexthopType() {
        return this.nexthopType;
    }

    public RouteRule setPathType(String pathType) {
        this.pathType = pathType;
        return this;
    }

    public String getPathType() {
        return this.pathType;
    }

    public RouteRule setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "RouteRule{" + "routeRuleId=" + routeRuleId + "\n" + "routeTableId=" + routeTableId + "\n" + "sourceAddress=" + sourceAddress + "\n" + "destinationAddress="
                + destinationAddress + "\n" + "nexthopId=" + nexthopId + "\n" + "nexthopType=" + nexthopType + "\n" + "pathType=" + pathType + "\n" + "description=" + description
                + "\n" + "}";
    }

}