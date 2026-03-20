package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListIpReserveRequest {

    /**
    * subnetId
    */
    @JsonIgnore
    private String subnetId;

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

    public String getSubnetId() {
        return subnetId;
    }

    public ListIpReserveRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListIpReserveRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListIpReserveRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
