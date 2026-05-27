package com.baidubce.csn.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CsnBp {
    /**
     * 带宽包的ID
     */
    private String csnBpId;

    /**
     * 带宽包的名称
     */
    private String name;

    /**
     * 带宽包的总带宽
     */
    private String bandwidth;

    /**
     * 带宽包的已分配带宽
     */
    private String usedBandwidth;

    /**
     * 绑定云智能网实例
     */
    private String csnId;

    /**
     * 带宽包互通类型，取值[ center \| center-edge \| edge-edge ]，分别表示云间互通、云边互通、边边互通
     */
    private String interworkType;

    /**
     * 带宽包互通地域，取值[ chinesemainland \| asiapacific \| crossregional ]，分别表示中国大陆、亚太区域、跨区域互通
     */
    private String interworkRegion;

    /**
     * 带宽包状态，取值[ available \| stopped ]，分别表示可用、已到期
     */
    private String status;

    /**
     * 带宽包的付费方式，取值[ PrePaid \| PostPaid ]，分别表示预付费、后付费
     */
    private String paymentTiming;

    /**
     * 到期时间，标准UTC格式
     */
    private String expireTime;

    /**
     * 购买时间，标准UTC格式
     */
    private String createdTime;

    /**
     * vpc绑定的标签集合
     */
    private List<TagModel> tags;

    public CsnBp setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getCsnBpId() {
        return this.csnBpId;
    }

    public CsnBp setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CsnBp setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public String getBandwidth() {
        return this.bandwidth;
    }

    public CsnBp setUsedBandwidth(String usedBandwidth) {
        this.usedBandwidth = usedBandwidth;
        return this;
    }

    public String getUsedBandwidth() {
        return this.usedBandwidth;
    }

    public CsnBp setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getCsnId() {
        return this.csnId;
    }

    public CsnBp setInterworkType(String interworkType) {
        this.interworkType = interworkType;
        return this;
    }

    public String getInterworkType() {
        return this.interworkType;
    }

    public CsnBp setInterworkRegion(String interworkRegion) {
        this.interworkRegion = interworkRegion;
        return this;
    }

    public String getInterworkRegion() {
        return this.interworkRegion;
    }

    public CsnBp setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public CsnBp setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public CsnBp setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public CsnBp setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public CsnBp setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "CsnBp{" + "csnBpId=" + csnBpId + "\n" + "name=" + name + "\n" + "bandwidth=" + bandwidth + "\n" + "usedBandwidth=" + usedBandwidth + "\n" + "csnId=" + csnId + "\n"
                + "interworkType=" + interworkType + "\n" + "interworkRegion=" + interworkRegion + "\n" + "status=" + status + "\n" + "paymentTiming=" + paymentTiming + "\n"
                + "expireTime=" + expireTime + "\n" + "createdTime=" + createdTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}