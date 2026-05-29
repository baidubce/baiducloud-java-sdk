package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryMountedClientRequest extends BaseBceRequest {

    /**
    * fsId
    */
    @JsonIgnore
    private String fsId;

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

    public String getFsId() {
        return fsId;
    }

    public QueryMountedClientRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryMountedClientRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryMountedClientRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
