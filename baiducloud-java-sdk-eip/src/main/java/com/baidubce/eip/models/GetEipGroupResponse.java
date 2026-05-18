package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetEipGroupResponse extends BaseBceResponse {

    /**
    * 共享带宽的ID
    */
    private String id;

    /**
    * 共享带宽的名字
    */
    private String name;

    /**
    * IPv4 EIP实例列表
    */
    private List<EipModel> eips;

    /**
    * IPv6 EIP实例列表
    */
    private List<EipModel> eipv6s;

    /**
    * 共享带宽状态
    */
    private String status;

    /**
    * 公网带宽，单位为Mbps
    */
    private Integer bandwidthInMbps;

    /**
    * 默认跨境加速带宽，单位为Mbps
    */
    private Integer defaultDomesticBandwidth;

    /**
    * 带宽包id
    */
    private String bwShortId;

    /**
    * 带宽包带宽，单位为Mbps
    */
    private Integer bwBandwidthInMbps;

    /**
    * 跨境加速包id
    */
    private String domesticBwShortId;

    /**
    * 跨境加速包带宽，单位为Mbps
    */
    private Integer domesticBwBandwidthInMbps;

    /**
    * 付款时间，预支付（Prepaid）和后支付（Postpaid）
    */
    private String paymentTiming;

    /**
    * 计费方式，按带宽（ByBandwidth），95峰值计费（ByPeak95）
    */
    private String billingMethod;

    /**
    * 创建时间
    */
    private String createTime;

    /**
    * 过期时间，只有预付费产品此参数才有值
    */
    private String expireTime;

    /**
    * 共享带宽所属区域
    */
    private String region;

    /**
    * 共享带宽线路类型
    */
    private String routeType;

    /**
    * 绑定的标签集合
    */
    private List<TagModel> tags;

    public String getId() {
        return id;
    }

    public GetEipGroupResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetEipGroupResponse setName(String name) {
        this.name = name;
        return this;
    }

    public List<EipModel> getEips() {
        return eips;
    }

    public GetEipGroupResponse setEips(List<EipModel> eips) {
        this.eips = eips;
        return this;
    }

    public List<EipModel> getEipv6s() {
        return eipv6s;
    }

    public GetEipGroupResponse setEipv6s(List<EipModel> eipv6s) {
        this.eipv6s = eipv6s;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetEipGroupResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public GetEipGroupResponse setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getDefaultDomesticBandwidth() {
        return defaultDomesticBandwidth;
    }

    public GetEipGroupResponse setDefaultDomesticBandwidth(Integer defaultDomesticBandwidth) {
        this.defaultDomesticBandwidth = defaultDomesticBandwidth;
        return this;
    }

    public String getBwShortId() {
        return bwShortId;
    }

    public GetEipGroupResponse setBwShortId(String bwShortId) {
        this.bwShortId = bwShortId;
        return this;
    }

    public Integer getBwBandwidthInMbps() {
        return bwBandwidthInMbps;
    }

    public GetEipGroupResponse setBwBandwidthInMbps(Integer bwBandwidthInMbps) {
        this.bwBandwidthInMbps = bwBandwidthInMbps;
        return this;
    }

    public String getDomesticBwShortId() {
        return domesticBwShortId;
    }

    public GetEipGroupResponse setDomesticBwShortId(String domesticBwShortId) {
        this.domesticBwShortId = domesticBwShortId;
        return this;
    }

    public Integer getDomesticBwBandwidthInMbps() {
        return domesticBwBandwidthInMbps;
    }

    public GetEipGroupResponse setDomesticBwBandwidthInMbps(Integer domesticBwBandwidthInMbps) {
        this.domesticBwBandwidthInMbps = domesticBwBandwidthInMbps;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public GetEipGroupResponse setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getBillingMethod() {
        return billingMethod;
    }

    public GetEipGroupResponse setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetEipGroupResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public GetEipGroupResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public GetEipGroupResponse setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRouteType() {
        return routeType;
    }

    public GetEipGroupResponse setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public GetEipGroupResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "GetEipGroupResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "eips=" + eips + "\n" + "eipv6s=" + eipv6s + "\n" + "status=" + status + "\n"
                + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "defaultDomesticBandwidth=" + defaultDomesticBandwidth + "\n" + "bwShortId=" + bwShortId + "\n"
                + "bwBandwidthInMbps=" + bwBandwidthInMbps + "\n" + "domesticBwShortId=" + domesticBwShortId + "\n" + "domesticBwBandwidthInMbps=" + domesticBwBandwidthInMbps
                + "\n" + "paymentTiming=" + paymentTiming + "\n" + "billingMethod=" + billingMethod + "\n" + "createTime=" + createTime + "\n" + "expireTime=" + expireTime + "\n"
                + "region=" + region + "\n" + "routeType=" + routeType + "\n" + "tags=" + tags + "\n" + "}";
    }

}
