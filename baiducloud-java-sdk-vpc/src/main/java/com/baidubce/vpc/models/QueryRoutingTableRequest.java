package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRoutingTableRequest extends BaseBceRequest {

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

    public String getRouteTableId() {
        return routeTableId;
    }

    public QueryRoutingTableRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryRoutingTableRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

}
