package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceListRequest extends BaseBceRequest {

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private String maxKeys;

    /**
    * instanceIds
    */
    @JsonIgnore
    private String instanceIds;

    /**
    * vnetIp
    */
    @JsonIgnore
    private String vnetIp;

    public String getMarker() {
        return marker;
    }

    public GetInstanceListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMaxKeys() {
        return maxKeys;
    }

    public GetInstanceListRequest setMaxKeys(String maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getInstanceIds() {
        return instanceIds;
    }

    public GetInstanceListRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public String getVnetIp() {
        return vnetIp;
    }

    public GetInstanceListRequest setVnetIp(String vnetIp) {
        this.vnetIp = vnetIp;
        return this;
    }

}
