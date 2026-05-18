package com.baidubce.eip.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipGroupModel {
    /**
     * 共享带宽名称
     */
    private String name;

    /**
     * 共享带宽状态
     */
    private String status;

    /**
     * 共享带宽ID
     */
    private String id;

    /**
     * 共享带宽带宽值，单位为Mbps
     */
    private Integer bandwidthInMbps;

    /**
     * 默认跨境加速带宽，仅香港区域有该属性，单位为Mbps
     */
    private Integer defaultDomesticBandwidth;

    /**
     * 带宽包ID
     */
    private String bwShortId;

    /**
     * 带宽包带宽，单位为Mbps
     */
    private Integer bwBandwidthInMbps;

    /**
     * 跨境加速包ID
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
     * 计费方式，按带宽（ByBandwidth），95峰值计费（ByPeak95)，按主流量计费(ByNetrafficMax)
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

    /**
     * 共享带宽中的IPv4 EIP信息
     */
    private List<EipModel> eips;

    /**
     * 共享带宽中的IPv6 EIP信息
     */
    private List<EipModel> eipv6s;

    public EipGroupModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EipGroupModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public EipGroupModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public EipGroupModel setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public EipGroupModel setDefaultDomesticBandwidth(Integer defaultDomesticBandwidth) {
        this.defaultDomesticBandwidth = defaultDomesticBandwidth;
        return this;
    }

    public Integer getDefaultDomesticBandwidth() {
        return this.defaultDomesticBandwidth;
    }

    public EipGroupModel setBwShortId(String bwShortId) {
        this.bwShortId = bwShortId;
        return this;
    }

    public String getBwShortId() {
        return this.bwShortId;
    }

    public EipGroupModel setBwBandwidthInMbps(Integer bwBandwidthInMbps) {
        this.bwBandwidthInMbps = bwBandwidthInMbps;
        return this;
    }

    public Integer getBwBandwidthInMbps() {
        return this.bwBandwidthInMbps;
    }

    public EipGroupModel setDomesticBwShortId(String domesticBwShortId) {
        this.domesticBwShortId = domesticBwShortId;
        return this;
    }

    public String getDomesticBwShortId() {
        return this.domesticBwShortId;
    }

    public EipGroupModel setDomesticBwBandwidthInMbps(Integer domesticBwBandwidthInMbps) {
        this.domesticBwBandwidthInMbps = domesticBwBandwidthInMbps;
        return this;
    }

    public Integer getDomesticBwBandwidthInMbps() {
        return this.domesticBwBandwidthInMbps;
    }

    public EipGroupModel setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public EipGroupModel setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getBillingMethod() {
        return this.billingMethod;
    }

    public EipGroupModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public EipGroupModel setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public EipGroupModel setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public EipGroupModel setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public String getRouteType() {
        return this.routeType;
    }

    public EipGroupModel setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    public EipGroupModel setEips(List<EipModel> eips) {
        this.eips = eips;
        return this;
    }

    public List<EipModel> getEips() {
        return this.eips;
    }

    public EipGroupModel setEipv6s(List<EipModel> eipv6s) {
        this.eipv6s = eipv6s;
        return this;
    }

    public List<EipModel> getEipv6s() {
        return this.eipv6s;
    }

    @Override
    public String toString() {
        return "EipGroupModel{" + "name=" + name + "\n" + "status=" + status + "\n" + "id=" + id + "\n" + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "defaultDomesticBandwidth="
                + defaultDomesticBandwidth + "\n" + "bwShortId=" + bwShortId + "\n" + "bwBandwidthInMbps=" + bwBandwidthInMbps + "\n" + "domesticBwShortId=" + domesticBwShortId
                + "\n" + "domesticBwBandwidthInMbps=" + domesticBwBandwidthInMbps + "\n" + "paymentTiming=" + paymentTiming + "\n" + "billingMethod=" + billingMethod + "\n"
                + "createTime=" + createTime + "\n" + "expireTime=" + expireTime + "\n" + "region=" + region + "\n" + "routeType=" + routeType + "\n" + "tags=" + tags + "\n"
                + "eips=" + eips + "\n" + "eipv6s=" + eipv6s + "\n" + "}";
    }

}