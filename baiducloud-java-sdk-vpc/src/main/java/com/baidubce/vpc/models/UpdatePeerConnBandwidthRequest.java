package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePeerConnBandwidthRequest extends BaseBceRequest {

    /**
    * peerConnId
    */
    @JsonIgnore
    private String peerConnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 升降级的带宽
    */
    private Integer newBandwidthInMbps;

    public String getPeerConnId() {
        return peerConnId;
    }

    public UpdatePeerConnBandwidthRequest setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdatePeerConnBandwidthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getNewBandwidthInMbps() {
        return newBandwidthInMbps;
    }

    public UpdatePeerConnBandwidthRequest setNewBandwidthInMbps(Integer newBandwidthInMbps) {
        this.newBandwidthInMbps = newBandwidthInMbps;
        return this;
    }

}
