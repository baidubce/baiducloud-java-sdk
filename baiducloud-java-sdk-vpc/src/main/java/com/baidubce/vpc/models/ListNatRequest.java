package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListNatRequest extends BaseBceRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * ip
    */
    @JsonIgnore
    private String ip;

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

    public ListNatRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getNatId() {
        return natId;
    }

    public ListNatRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListNatRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public ListNatRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListNatRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListNatRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
