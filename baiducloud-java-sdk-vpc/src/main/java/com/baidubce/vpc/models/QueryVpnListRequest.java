package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryVpnListRequest {

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

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * eip
    */
    @JsonIgnore
    private String eip;

    /**
    * type
    */
    @JsonIgnore
    private String type;

    public String getMarker() {
        return marker;
    }

    public QueryVpnListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryVpnListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryVpnListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getEip() {
        return eip;
    }

    public QueryVpnListRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getType() {
        return type;
    }

    public QueryVpnListRequest setType(String type) {
        this.type = type;
        return this;
    }

}
