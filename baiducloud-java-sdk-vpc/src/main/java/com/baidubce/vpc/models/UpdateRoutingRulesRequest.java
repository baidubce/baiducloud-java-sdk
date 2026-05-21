package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRoutingRulesRequest extends BaseBceRequest {

    /**
    * routeRuleId
    */
    @JsonIgnore
    private String routeRuleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 源网段，CIDR格式，可填全部网段0.0.0.0/0、VPC内已有子网网段或子网范围内网段
    */
    private String sourceAddress;

    /**
    * 目标网段，CIDR格式，可以是0.0.0.0/0，否则目的地址不能与本VPC cidr重叠（目的网段或本VPC cidr为0.0.0.0/0时例外）
    */
    private String destinationAddress;

    /**
    * 下一跳ID
    */
    private String nexthopId;

    /**
    * 描述，不超过200字符
    */
    private String description;

    public String getRouteRuleId() {
        return routeRuleId;
    }

    public UpdateRoutingRulesRequest setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateRoutingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public UpdateRoutingRulesRequest setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public UpdateRoutingRulesRequest setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
        return this;
    }

    public String getNexthopId() {
        return nexthopId;
    }

    public UpdateRoutingRulesRequest setNexthopId(String nexthopId) {
        this.nexthopId = nexthopId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateRoutingRulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
