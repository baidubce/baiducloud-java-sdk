package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRegionBandwidthRequest extends BaseBceRequest {

    /**
    * csnBpId
    */
    @JsonIgnore
    private String csnBpId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 地域带宽的本端region，云边互通场景中表示云端region
    */
    private String localRegion;

    /**
    * 地域带宽的对端region，云边互通场景中表示边缘region
    */
    private String peerRegion;

    /**
    * 地域带宽的带宽值
    */
    private Integer bandwidth;

    public String getCsnBpId() {
        return csnBpId;
    }

    public CreateRegionBandwidthRequest setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateRegionBandwidthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getLocalRegion() {
        return localRegion;
    }

    public CreateRegionBandwidthRequest setLocalRegion(String localRegion) {
        this.localRegion = localRegion;
        return this;
    }

    public String getPeerRegion() {
        return peerRegion;
    }

    public CreateRegionBandwidthRequest setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public CreateRegionBandwidthRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

}
