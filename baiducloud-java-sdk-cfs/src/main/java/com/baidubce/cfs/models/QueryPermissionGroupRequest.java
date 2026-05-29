package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryPermissionGroupRequest extends BaseBceRequest {

    /**
    * agName
    */
    @JsonIgnore
    private String agName;

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

    public String getAgName() {
        return agName;
    }

    public QueryPermissionGroupRequest setAgName(String agName) {
        this.agName = agName;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryPermissionGroupRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryPermissionGroupRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
