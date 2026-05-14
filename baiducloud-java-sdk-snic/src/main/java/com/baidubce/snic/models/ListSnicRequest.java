package com.baidubce.snic.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSnicRequest extends BaseBceRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * ipAddress
    */
    @JsonIgnore
    private String ipAddress;

    /**
    * status
    */
    @JsonIgnore
    private String status;

    /**
    * subnetId
    */
    @JsonIgnore
    private String subnetId;

    /**
    * service
    */
    @JsonIgnore
    private String service;

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

    public ListSnicRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListSnicRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public ListSnicRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListSnicRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public ListSnicRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getService() {
        return service;
    }

    public ListSnicRequest setService(String service) {
        this.service = service;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListSnicRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListSnicRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
