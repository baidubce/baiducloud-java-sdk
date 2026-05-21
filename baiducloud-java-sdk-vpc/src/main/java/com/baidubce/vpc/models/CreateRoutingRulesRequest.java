package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRoutingRulesRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 路由表ID
    */
    private String routeTableId;

    /**
    * 源网段，可填全部网段0.0.0.0/0、VPC内已有子网网段或子网范围内网段
    */
    private String sourceAddress;

    /**
    * 目标网段
    */
    private String destinationAddress;

    /**
    * 下一跳ID，创建单线路由时该字段必填
    */
    private String nexthopId;

    /**
    * 路由类型，创建单线路由时该字段必填；Bcc类型是"custom"；VPN类型是"vpn"；NAT类型是"nat"；专线网关类型是"dcGateway";对等连接类型是"peerConn"(注意：对等连接类型nexthopId传递本端接口id,非对等连接id,如：qpif-abuf50qxxxxx)
    */
    private String nexthopType;

    /**
    * 多线路由下一跳信息，创建多线路由时该字段必填
    */
    private List<NextHop> nextHopList;

    /**
    * 路由表规则描述，不超过200字符
    */
    private String description;

    public String getClientToken() {
        return clientToken;
    }

    public CreateRoutingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRouteTableId() {
        return routeTableId;
    }

    public CreateRoutingRulesRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public CreateRoutingRulesRequest setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public CreateRoutingRulesRequest setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
        return this;
    }

    public String getNexthopId() {
        return nexthopId;
    }

    public CreateRoutingRulesRequest setNexthopId(String nexthopId) {
        this.nexthopId = nexthopId;
        return this;
    }

    public String getNexthopType() {
        return nexthopType;
    }

    public CreateRoutingRulesRequest setNexthopType(String nexthopType) {
        this.nexthopType = nexthopType;
        return this;
    }

    public List<NextHop> getNextHopList() {
        return nextHopList;
    }

    public CreateRoutingRulesRequest setNextHopList(List<NextHop> nextHopList) {
        this.nextHopList = nextHopList;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateRoutingRulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
