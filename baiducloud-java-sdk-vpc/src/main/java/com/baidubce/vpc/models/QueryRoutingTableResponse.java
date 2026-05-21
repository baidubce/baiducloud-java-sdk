package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRoutingTableResponse extends BaseBceResponse {

    /**
    * 路由表名称
    */
    private String name;

    /**
    * 路由表ID
    */
    private String routeTableId;

    /**
    * VPC的ID
    */
    private String vpcId;

    /**
    * 路由规则列表
    */
    private List<RouteRule> routeRules;

    public String getName() {
        return name;
    }

    public QueryRoutingTableResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getRouteTableId() {
        return routeTableId;
    }

    public QueryRoutingTableResponse setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryRoutingTableResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public List<RouteRule> getRouteRules() {
        return routeRules;
    }

    public QueryRoutingTableResponse setRouteRules(List<RouteRule> routeRules) {
        this.routeRules = routeRules;
        return this;
    }

    @Override
    public String toString() {
        return "QueryRoutingTableResponse{" + "name=" + name + "\n" + "routeTableId=" + routeTableId + "\n" + "vpcId=" + vpcId + "\n" + "routeRules=" + routeRules + "\n" + "}";
    }

}
