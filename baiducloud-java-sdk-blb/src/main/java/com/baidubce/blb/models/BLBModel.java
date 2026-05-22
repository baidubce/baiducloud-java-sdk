package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BLBModel {
    /**
     * LoadBalancer的标识符
     */
    private String blbId;

    /**
     * LoadBalancer的名称
     */
    private String name;

    /**
     * LoadBalancer的描述
     */
    private String desc;

    /**
     * 分配的内网服务地址IP，通过这个IP即能通过内网访问该实例
     */
    private String address;

    /**
     * BLB状态
     */
    private String status;

    /**
     * vpc 的ID
     */
    private String vpcId;

    /**
     * subnet 的ID
     */
    private String subnetId;

    /**
     * 如果LoadBalancer绑定过EIP，则显示该项，否则不显示
     */
    private String publicIp;

    /**
     * 标签键值对列表
     */
    private List<TagModel> tags;

    /**
     * 是否允许删除
     */
    private Boolean allowDelete;

    /**
     * 是否允许修改
     */
    private Boolean allowModify;

    /**
     * 开启修改保护原因
     */
    private String modificationProtectionReason;

    /**
     * EIP线路类型
     */
    private String eipRouteType;

    /**
     * 如果LoadBalancer绑定过EIPv6，则显示该项，否则不显示
     */
    private String publicIpv6;

    /**
     * EIPV6线路类型
     */
    private String eipV6RouteType;

    /**
     * 计费方式 取值："Postpaid" 后付费 "Prepaid" 预付费
     */
    private String paymentTiming;

    /**
     * 计费方式 取值："ByCapacityUnit" 按使用量 "BySpec" 按固定规格
     */
    private String billingMethod;

    public BLBModel setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getBlbId() {
        return this.blbId;
    }

    public BLBModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public BLBModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public BLBModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public BLBModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public BLBModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public BLBModel setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public BLBModel setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public String getPublicIp() {
        return this.publicIp;
    }

    public BLBModel setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    public BLBModel setAllowDelete(Boolean allowDelete) {
        this.allowDelete = allowDelete;
        return this;
    }

    public Boolean getAllowDelete() {
        return this.allowDelete;
    }

    public BLBModel setAllowModify(Boolean allowModify) {
        this.allowModify = allowModify;
        return this;
    }

    public Boolean getAllowModify() {
        return this.allowModify;
    }

    public BLBModel setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }

    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    public BLBModel setEipRouteType(String eipRouteType) {
        this.eipRouteType = eipRouteType;
        return this;
    }

    public String getEipRouteType() {
        return this.eipRouteType;
    }

    public BLBModel setPublicIpv6(String publicIpv6) {
        this.publicIpv6 = publicIpv6;
        return this;
    }

    public String getPublicIpv6() {
        return this.publicIpv6;
    }

    public BLBModel setEipV6RouteType(String eipV6RouteType) {
        this.eipV6RouteType = eipV6RouteType;
        return this;
    }

    public String getEipV6RouteType() {
        return this.eipV6RouteType;
    }

    public BLBModel setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public BLBModel setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getBillingMethod() {
        return this.billingMethod;
    }

    @Override
    public String toString() {
        return "BLBModel{" + "blbId=" + blbId + "\n" + "name=" + name + "\n" + "desc=" + desc + "\n" + "address=" + address + "\n" + "status=" + status + "\n" + "vpcId=" + vpcId
                + "\n" + "subnetId=" + subnetId + "\n" + "publicIp=" + publicIp + "\n" + "tags=" + tags + "\n" + "allowDelete=" + allowDelete + "\n" + "allowModify=" + allowModify
                + "\n" + "modificationProtectionReason=" + modificationProtectionReason + "\n" + "eipRouteType=" + eipRouteType + "\n" + "publicIpv6=" + publicIpv6 + "\n"
                + "eipV6RouteType=" + eipV6RouteType + "\n" + "paymentTiming=" + paymentTiming + "\n" + "billingMethod=" + billingMethod + "\n" + "}";
    }

}