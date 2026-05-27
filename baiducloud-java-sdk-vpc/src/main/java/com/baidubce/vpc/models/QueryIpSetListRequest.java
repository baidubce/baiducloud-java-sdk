package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryIpSetListRequest extends BaseBceRequest {

    /**
    * ipVersion
    */
    @JsonIgnore
    private String ipVersion;

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

    public QueryIpSetListRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryIpSetListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryIpSetListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
