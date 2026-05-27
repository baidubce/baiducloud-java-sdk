package com.baidubce.csn.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CsnBpLimit {
    /**
     * 带宽包的ID
     */
    private String csnBpId;

    /**
     * 云智能网的ID
     */
    private String csnId;

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

    public CsnBpLimit setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getCsnBpId() {
        return this.csnBpId;
    }

    public CsnBpLimit setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getCsnId() {
        return this.csnId;
    }

    public CsnBpLimit setLocalRegion(String localRegion) {
        this.localRegion = localRegion;
        return this;
    }

    public String getLocalRegion() {
        return this.localRegion;
    }

    public CsnBpLimit setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    public String getPeerRegion() {
        return this.peerRegion;
    }

    public CsnBpLimit setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    @Override
    public String toString() {
        return "CsnBpLimit{" + "csnBpId=" + csnBpId + "\n" + "csnId=" + csnId + "\n" + "localRegion=" + localRegion + "\n" + "peerRegion=" + peerRegion + "\n" + "bandwidth="
                + bandwidth + "\n" + "}";
    }

}