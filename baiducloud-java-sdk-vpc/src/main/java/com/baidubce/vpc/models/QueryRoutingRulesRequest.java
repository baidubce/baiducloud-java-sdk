package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRoutingRulesRequest extends BaseBceRequest {

    /**
    * routeTableId
    */
    @JsonIgnore
    private String routeTableId;

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    public String getRouteTableId() {
        return routeTableId;
    }

    public QueryRoutingRulesRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryRoutingRulesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryRoutingRulesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryRoutingRulesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
