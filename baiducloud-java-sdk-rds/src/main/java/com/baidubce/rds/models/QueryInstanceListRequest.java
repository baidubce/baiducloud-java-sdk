package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryInstanceListRequest extends BaseBceRequest {

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
    * vnetIp
    */
    @JsonIgnore
    private String vnetIp;

    public String getMarker() {
        return marker;
    }

    public QueryInstanceListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryInstanceListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getVnetIp() {
        return vnetIp;
    }

    public QueryInstanceListRequest setVnetIp(String vnetIp) {
        this.vnetIp = vnetIp;
        return this;
    }

}
