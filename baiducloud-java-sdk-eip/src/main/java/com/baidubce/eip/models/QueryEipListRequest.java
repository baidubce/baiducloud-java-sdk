package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryEipListRequest {

    /**
    * ipVersion
    */
    @JsonIgnore
    private String ipVersion;

    /**
    * eip
    */
    @JsonIgnore
    private String eip;

    /**
    * instanceType
    */
    @JsonIgnore
    private String instanceType;

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

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
    * eipIds
    */
    @JsonIgnore
    private List eipIds;

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

    public String getIpVersion() {
        return ipVersion;
    }

    public QueryEipListRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getEip() {
        return eip;
    }

    public QueryEipListRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public QueryEipListRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public QueryEipListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryEipListRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryEipListRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public List getEipIds() {
        return eipIds;
    }

    public QueryEipListRequest setEipIds(List eipIds) {
        this.eipIds = eipIds;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryEipListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryEipListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
