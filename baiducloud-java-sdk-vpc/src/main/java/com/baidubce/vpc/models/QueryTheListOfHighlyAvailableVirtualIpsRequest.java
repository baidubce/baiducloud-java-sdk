package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfHighlyAvailableVirtualIpsRequest extends BaseBceRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

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

    public QueryTheListOfHighlyAvailableVirtualIpsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryTheListOfHighlyAvailableVirtualIpsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTheListOfHighlyAvailableVirtualIpsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
