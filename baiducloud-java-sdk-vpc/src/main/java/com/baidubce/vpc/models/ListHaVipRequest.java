package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListHaVipRequest extends BaseBceRequest {

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

    public ListHaVipRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListHaVipRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListHaVipRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
