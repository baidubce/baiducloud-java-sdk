package com.baidubce.csn.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryCsnBpDetailResponse extends BaseBceResponse {

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
    * 带宽包互通类型，取值 [ center \\| center-edge \\| edge-edge ]，分别表示云间互通、云边互通、边边互通
    */
    private String interworkType;

    /**
    * 带宽包互通地域，取值 [ chinesemainland \\| asiapacific \\| crossregional ]，分别表示中国大陆、亚太区域、跨区域互通
    */
    private String interworkRegion;

    /**
    * 带宽包的状态
    */
    private String status;

    /**
    * 带宽包的付费方式，取值 [ PrePaid \\| PostPaid ]，分别表示预付费、后付费
    */
    private String paymentTiming;

    /**
    * 带宽包预付费的到期时间
    */
    private String expireTime;

    /**
    * 带宽包的创建时间
    */
    private String createdTime;

    /**
    * 绑定的标签信息
    */
    private List<TagModel> tags;

    public String getCsnBpId() {
        return csnBpId;
    }

    public QueryCsnBpDetailResponse setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryCsnBpDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public QueryCsnBpDetailResponse setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public String getUsedBandwidth() {
        return usedBandwidth;
    }

    public QueryCsnBpDetailResponse setUsedBandwidth(String usedBandwidth) {
        this.usedBandwidth = usedBandwidth;
        return this;
    }

    public String getCsnId() {
        return csnId;
    }

    public QueryCsnBpDetailResponse setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getInterworkType() {
        return interworkType;
    }

    public QueryCsnBpDetailResponse setInterworkType(String interworkType) {
        this.interworkType = interworkType;
        return this;
    }

    public String getInterworkRegion() {
        return interworkRegion;
    }

    public QueryCsnBpDetailResponse setInterworkRegion(String interworkRegion) {
        this.interworkRegion = interworkRegion;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryCsnBpDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public QueryCsnBpDetailResponse setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public QueryCsnBpDetailResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public QueryCsnBpDetailResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public QueryCsnBpDetailResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "QueryCsnBpDetailResponse{" + "csnBpId=" + csnBpId + "\n" + "name=" + name + "\n" + "bandwidth=" + bandwidth + "\n" + "usedBandwidth=" + usedBandwidth + "\n"
                + "csnId=" + csnId + "\n" + "interworkType=" + interworkType + "\n" + "interworkRegion=" + interworkRegion + "\n" + "status=" + status + "\n" + "paymentTiming="
                + paymentTiming + "\n" + "expireTime=" + expireTime + "\n" + "createdTime=" + createdTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}
