
package com.baidubce.eip.models;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipModel  {
    /**
     * EIP的名字
     */
    private String name;

    /**
     * EIP地址，点分十进制表示
     */
    private String eip;

    /**
     * EIP ID
     */
    private String eipId;

    /**
     * EIP状态
     */
    private String status;

    /**
     * EIP实例类型
     */
    private String eipInstanceType;

    /**
     * 绑定实例类型，若EIP处于未绑定状态，此项值为空
     */
    private String instanceType;

    /**
     * 实例ID，若EIP处于未绑定状态，此项值为空
     */
    private String instanceId;

    /**
     * 共享带宽组ID，若为普通EIP，此项值为空
     */
    private String shareGroupId;

    /**
     * 默认跨境加速带宽，仅香港区域有该属性，单位为Mbps
     */
    private Integer defaultDomesticBandwidth;

    /**
     * 公网带宽，单位为Mbps
     */
    private Integer bandwidthInMbps;

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
     * 计费方式，按流量（ByTraffic）和按带宽（ByBandwidth，只有后付费产品此参数才有值
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
     * 当前EIP所属区域
     */
    private String region;

    /**
     * EIP线路类型
     */
    private String routeType;

    /**
     * 绑定的标签集合
     */
    private List<TagModel> tags;

    /**
     * 是否开启释放保护
     */
    private Boolean deleteProtect;

    /**
     * 标记EIP是否为原生EIP，true：原生EIP，false：非原生EIP。（只有查询共享带宽详情接口该字段才存在。）
     */
    private Boolean nativeGroup;

    /**
     * eip原始带宽（移入group前的带宽），如果是原生EIP，（只有查询共享带宽详情接口该字段才存在。）
     */
    private Integer originalBandwidth;

    /**
     * group 内 EIP 原始计费类型，如果是原生EIP，值为空，（只有查询共享带宽详情接口该字段才存在。）
     */
    private String originProductType;

    /**
     * group 内 EIP 原始计费子类型，如果是原生EIP，值为空。（只有查询共享带宽详情接口该字段才存在。）
     */
    private String originSubProductType;

    public EipModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EipModel setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    public EipModel setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    public String getEipId() {
        return this.eipId;
    }

    public EipModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public EipModel setEipInstanceType(String eipInstanceType) {
        this.eipInstanceType = eipInstanceType;
        return this;
    }

    public String getEipInstanceType() {
        return this.eipInstanceType;
    }

    public EipModel setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public EipModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public EipModel setShareGroupId(String shareGroupId) {
        this.shareGroupId = shareGroupId;
        return this;
    }

    public String getShareGroupId() {
        return this.shareGroupId;
    }

    public EipModel setDefaultDomesticBandwidth(Integer defaultDomesticBandwidth) {
        this.defaultDomesticBandwidth = defaultDomesticBandwidth;
        return this;
    }

    public Integer getDefaultDomesticBandwidth() {
        return this.defaultDomesticBandwidth;
    }

    public EipModel setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public EipModel setBwShortId(String bwShortId) {
        this.bwShortId = bwShortId;
        return this;
    }

    public String getBwShortId() {
        return this.bwShortId;
    }

    public EipModel setBwBandwidthInMbps(Integer bwBandwidthInMbps) {
        this.bwBandwidthInMbps = bwBandwidthInMbps;
        return this;
    }

    public Integer getBwBandwidthInMbps() {
        return this.bwBandwidthInMbps;
    }

    public EipModel setDomesticBwShortId(String domesticBwShortId) {
        this.domesticBwShortId = domesticBwShortId;
        return this;
    }

    public String getDomesticBwShortId() {
        return this.domesticBwShortId;
    }

    public EipModel setDomesticBwBandwidthInMbps(Integer domesticBwBandwidthInMbps) {
        this.domesticBwBandwidthInMbps = domesticBwBandwidthInMbps;
        return this;
    }

    public Integer getDomesticBwBandwidthInMbps() {
        return this.domesticBwBandwidthInMbps;
    }

    public EipModel setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public EipModel setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getBillingMethod() {
        return this.billingMethod;
    }

    public EipModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public EipModel setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public EipModel setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public EipModel setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public String getRouteType() {
        return this.routeType;
    }

    public EipModel setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    public EipModel setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

    public Boolean getDeleteProtect() {
        return this.deleteProtect;
    }

    public EipModel setNativeGroup(Boolean nativeGroup) {
        this.nativeGroup = nativeGroup;
        return this;
    }

    public Boolean getNativeGroup() {
        return this.nativeGroup;
    }

    public EipModel setOriginalBandwidth(Integer originalBandwidth) {
        this.originalBandwidth = originalBandwidth;
        return this;
    }

    public Integer getOriginalBandwidth() {
        return this.originalBandwidth;
    }

    public EipModel setOriginProductType(String originProductType) {
        this.originProductType = originProductType;
        return this;
    }

    public String getOriginProductType() {
        return this.originProductType;
    }

    public EipModel setOriginSubProductType(String originSubProductType) {
        this.originSubProductType = originSubProductType;
        return this;
    }

    public String getOriginSubProductType() {
        return this.originSubProductType;
    }

    @Override
    public String toString() {
        return "EipModel{"
                + "name=" + name + "\n"
                + "eip=" + eip + "\n"
                + "eipId=" + eipId + "\n"
                + "status=" + status + "\n"
                + "eipInstanceType=" + eipInstanceType + "\n"
                + "instanceType=" + instanceType + "\n"
                + "instanceId=" + instanceId + "\n"
                + "shareGroupId=" + shareGroupId + "\n"
                + "defaultDomesticBandwidth=" + defaultDomesticBandwidth + "\n"
                + "bandwidthInMbps=" + bandwidthInMbps + "\n"
                + "bwShortId=" + bwShortId + "\n"
                + "bwBandwidthInMbps=" + bwBandwidthInMbps + "\n"
                + "domesticBwShortId=" + domesticBwShortId + "\n"
                + "domesticBwBandwidthInMbps=" + domesticBwBandwidthInMbps + "\n"
                + "paymentTiming=" + paymentTiming + "\n"
                + "billingMethod=" + billingMethod + "\n"
                + "createTime=" + createTime + "\n"
                + "expireTime=" + expireTime + "\n"
                + "region=" + region + "\n"
                + "routeType=" + routeType + "\n"
                + "tags=" + tags + "\n"
                + "deleteProtect=" + deleteProtect + "\n"
                + "nativeGroup=" + nativeGroup + "\n"
                + "originalBandwidth=" + originalBandwidth + "\n"
                + "originProductType=" + originProductType + "\n"
                + "originSubProductType=" + originSubProductType + "\n"
                + "}";
    }




}