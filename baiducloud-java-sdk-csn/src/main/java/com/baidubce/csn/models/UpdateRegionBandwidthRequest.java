package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRegionBandwidthRequest extends BaseBceRequest {

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
    * 地域带宽的本端region，该值不能改变
    */
    private String localRegion;

    /**
    * 地域带宽的对端region，该值不能改变
    */
    private String peerRegion;

    /**
    * 更新的地域带宽的带宽值
    */
    private Integer bandwidth;

    public String getCsnBpId() {
        return csnBpId;
    }

    public UpdateRegionBandwidthRequest setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateRegionBandwidthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getLocalRegion() {
        return localRegion;
    }

    public UpdateRegionBandwidthRequest setLocalRegion(String localRegion) {
        this.localRegion = localRegion;
        return this;
    }

    public String getPeerRegion() {
        return peerRegion;
    }

    public UpdateRegionBandwidthRequest setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public UpdateRegionBandwidthRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

}
