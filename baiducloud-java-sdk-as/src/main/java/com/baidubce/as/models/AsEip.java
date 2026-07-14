package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsEip {
    /**
     * 最大带宽
     */
    private Integer bandwidthInMbps;

    /**
     * 公网IP
     */
    private String address;

    /**
     * EIP的ID
     */
    private String eipId;

    /**
     * EIP状态
     */
    private String eipStatus;

    /**
     * 弹性公网IP-实例ID
     */
    private String eipAllocationId;

    public AsEip setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public AsEip setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public AsEip setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    public String getEipId() {
        return this.eipId;
    }

    public AsEip setEipStatus(String eipStatus) {
        this.eipStatus = eipStatus;
        return this;
    }

    public String getEipStatus() {
        return this.eipStatus;
    }

    public AsEip setEipAllocationId(String eipAllocationId) {
        this.eipAllocationId = eipAllocationId;
        return this;
    }

    public String getEipAllocationId() {
        return this.eipAllocationId;
    }

    @Override
    public String toString() {
        return "AsEip{" + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "address=" + address + "\n" + "eipId=" + eipId + "\n" + "eipStatus=" + eipStatus + "\n"
                + "eipAllocationId=" + eipAllocationId + "\n" + "}";
    }

}