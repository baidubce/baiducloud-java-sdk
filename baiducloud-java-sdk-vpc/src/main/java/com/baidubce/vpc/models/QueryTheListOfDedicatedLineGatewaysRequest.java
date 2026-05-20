package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfDedicatedLineGatewaysRequest extends BaseBceRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * etGatewayId
    */
    @JsonIgnore
    private String etGatewayId;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * status
    */
    @JsonIgnore
    private String status;

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

    public String getVpcId() {
        return vpcId;
    }

    public QueryTheListOfDedicatedLineGatewaysRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getEtGatewayId() {
        return etGatewayId;
    }

    public QueryTheListOfDedicatedLineGatewaysRequest setEtGatewayId(String etGatewayId) {
        this.etGatewayId = etGatewayId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryTheListOfDedicatedLineGatewaysRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryTheListOfDedicatedLineGatewaysRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryTheListOfDedicatedLineGatewaysRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTheListOfDedicatedLineGatewaysRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
