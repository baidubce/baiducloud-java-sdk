package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryVpcListRequest {

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
    * isDefault
    */
    @JsonIgnore
    private Boolean isDefault;

    /**
    * vpcIds
    */
    @JsonIgnore
    private String vpcIds;


    public String getMarker() {
        return marker;
    }

    public QueryVpcListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryVpcListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public QueryVpcListRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public String getVpcIds() {
        return vpcIds;
    }

    public QueryVpcListRequest setVpcIds(String vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }


}
