package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRegionBandwidthRequest extends BaseBceRequest {

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
    * 地域带宽的本端region
    */
    private String localRegion;

    /**
    * 地域带宽的对端region
    */
    private String peerRegion;

    public String getCsnBpId() {
        return csnBpId;
    }

    public DeleteRegionBandwidthRequest setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteRegionBandwidthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getLocalRegion() {
        return localRegion;
    }

    public DeleteRegionBandwidthRequest setLocalRegion(String localRegion) {
        this.localRegion = localRegion;
        return this;
    }

    public String getPeerRegion() {
        return peerRegion;
    }

    public DeleteRegionBandwidthRequest setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

}
