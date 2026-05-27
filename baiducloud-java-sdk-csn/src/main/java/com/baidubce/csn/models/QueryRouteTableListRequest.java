package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRouteTableListRequest extends BaseBceRequest {

    /**
    * csnId
    */
    @JsonIgnore
    private String csnId;

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

    public String getCsnId() {
        return csnId;
    }

    public QueryRouteTableListRequest setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryRouteTableListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryRouteTableListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
