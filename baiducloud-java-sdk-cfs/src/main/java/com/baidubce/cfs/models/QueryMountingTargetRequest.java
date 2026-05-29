package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryMountingTargetRequest extends BaseBceRequest {

    /**
    * fId
    */
    @JsonIgnore
    private String fId;

    /**
    * mountId
    */
    @JsonIgnore
    private String mountId;

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

    public String getFId() {
        return fId;
    }

    public QueryMountingTargetRequest setFId(String fId) {
        this.fId = fId;
        return this;
    }

    public String getMountId() {
        return mountId;
    }

    public QueryMountingTargetRequest setMountId(String mountId) {
        this.mountId = mountId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryMountingTargetRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryMountingTargetRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
