package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListProtectInstancesRequest extends BaseBceRequest {

    /**
    * instanceType
    */
    @JsonIgnore
    private String instanceType;

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
    * status
    */
    @JsonIgnore
    private String status;

    /**
    * region
    */
    @JsonIgnore
    private String region;

    public String getInstanceType() {
        return instanceType;
    }

    public ListProtectInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListProtectInstancesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListProtectInstancesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListProtectInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public ListProtectInstancesRequest setRegion(String region) {
        this.region = region;
        return this;
    }

}
