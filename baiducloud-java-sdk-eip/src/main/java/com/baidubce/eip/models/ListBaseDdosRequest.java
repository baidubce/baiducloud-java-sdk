package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListBaseDdosRequest extends BaseBceRequest {

    /**
    * ips
    */
    @JsonIgnore
    private String ips;

    /**
    * type
    */
    @JsonIgnore
    private String type;

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

    public String getIps() {
        return ips;
    }

    public ListBaseDdosRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }

    public String getType() {
        return type;
    }

    public ListBaseDdosRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListBaseDdosRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListBaseDdosRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
