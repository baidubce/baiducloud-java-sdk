package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipMoveOutModel {
    /**
     * 待移出的EIP IP地址
     */
    private String eip;

    /**
     * 移出后的EIP带宽值，单位为Mbps（只有移出共享带宽原生的EIP需要此参数）
     */
    private Integer bandwidthInMbps;

    /**
     * billing
     */
    private Billing billing;

    public EipMoveOutModel setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    public EipMoveOutModel setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public EipMoveOutModel setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public Billing getBilling() {
        return this.billing;
    }

    @Override
    public String toString() {
        return "EipMoveOutModel{" + "eip=" + eip + "\n" + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "billing=" + billing + "\n" + "}";
    }

}