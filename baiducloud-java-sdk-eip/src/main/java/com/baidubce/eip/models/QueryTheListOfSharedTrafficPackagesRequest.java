package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfSharedTrafficPackagesRequest extends BaseBceRequest {

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
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * status
    */
    @JsonIgnore
    private String status;

    /**
    * deductPolicy
    */
    @JsonIgnore
    private String deductPolicy;

    public String getMarker() {
        return marker;
    }

    public QueryTheListOfSharedTrafficPackagesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTheListOfSharedTrafficPackagesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getId() {
        return id;
    }

    public QueryTheListOfSharedTrafficPackagesRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryTheListOfSharedTrafficPackagesRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDeductPolicy() {
        return deductPolicy;
    }

    public QueryTheListOfSharedTrafficPackagesRequest setDeductPolicy(String deductPolicy) {
        this.deductPolicy = deductPolicy;
        return this;
    }

}
