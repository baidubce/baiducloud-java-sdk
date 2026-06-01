package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryDedicatedChannelRouteRulesRequest extends BaseBceRequest {

    /**
    * etId
    */
    @JsonIgnore
    private String etId;

    /**
    * etChannelId
    */
    @JsonIgnore
    private String etChannelId;

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
    * destAddress
    */
    @JsonIgnore
    private String destAddress;

    public String getEtId() {
        return etId;
    }

    public QueryDedicatedChannelRouteRulesRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public QueryDedicatedChannelRouteRulesRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryDedicatedChannelRouteRulesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryDedicatedChannelRouteRulesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getDestAddress() {
        return destAddress;
    }

    public QueryDedicatedChannelRouteRulesRequest setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

}
