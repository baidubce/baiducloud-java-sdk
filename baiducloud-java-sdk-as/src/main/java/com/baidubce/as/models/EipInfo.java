package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipInfo {
    /**
     * 是否绑定EIP
     */
    private Boolean ifBindEip;

    /**
     * EIP带宽
     */
    private Integer bandwidthInMbps;

    /**
     * EIP公网带宽计费类型，按带宽计费：bandwidth，按流量计费：netraffic
     */
    private String eipProductType;

    /**
     * 购买线路类型，标准型：BGP，增强型：BGP_S
     */
    private String purchaseType;

    public EipInfo setIfBindEip(Boolean ifBindEip) {
        this.ifBindEip = ifBindEip;
        return this;
    }

    public Boolean getIfBindEip() {
        return this.ifBindEip;
    }

    public EipInfo setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public EipInfo setEipProductType(String eipProductType) {
        this.eipProductType = eipProductType;
        return this;
    }

    public String getEipProductType() {
        return this.eipProductType;
    }

    public EipInfo setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
        return this;
    }

    public String getPurchaseType() {
        return this.purchaseType;
    }

    @Override
    public String toString() {
        return "EipInfo{" + "ifBindEip=" + ifBindEip + "\n" + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "eipProductType=" + eipProductType + "\n" + "purchaseType="
                + purchaseType + "\n" + "}";
    }

}