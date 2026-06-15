package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceNoChargeListRequest extends BaseBceRequest {

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
    * internalIp
    */
    @JsonIgnore
    private String internalIp;

    /**
    * keypairId
    */
    @JsonIgnore
    private String keypairId;

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * instanceIds
    */
    @JsonIgnore
    private String instanceIds;

    public String getMarker() {
        return marker;
    }

    public GetInstanceNoChargeListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public GetInstanceNoChargeListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getInternalIp() {
        return internalIp;
    }

    public GetInstanceNoChargeListRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    public String getKeypairId() {
        return keypairId;
    }

    public GetInstanceNoChargeListRequest setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public GetInstanceNoChargeListRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getInstanceIds() {
        return instanceIds;
    }

    public GetInstanceNoChargeListRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
