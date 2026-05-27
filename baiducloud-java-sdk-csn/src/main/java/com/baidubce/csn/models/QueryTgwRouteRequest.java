package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTgwRouteRequest extends BaseBceRequest {

    /**
    * csnId
    */
    @JsonIgnore
    private String csnId;

    /**
    * tgwId
    */
    @JsonIgnore
    private String tgwId;

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

    public QueryTgwRouteRequest setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getTgwId() {
        return tgwId;
    }

    public QueryTgwRouteRequest setTgwId(String tgwId) {
        this.tgwId = tgwId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryTgwRouteRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTgwRouteRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
