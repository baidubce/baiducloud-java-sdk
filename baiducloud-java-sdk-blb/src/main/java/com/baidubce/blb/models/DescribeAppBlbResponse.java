package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbResponse extends BaseBceResponse {

    /**
    * LoadBalancer的标识符
    */
    private String blbId;

    /**
    * BLB状态
    */
    private String status;

    /**
    * LoadBalancer的描述
    */
    private String desc;

    /**
    * LoadBalancer的内网地址
    */
    private String address;

    /**
    * LoadBalancer的公网地址
    */
    private String publicIp;

    /**
    * LoadBalancer所在网络cidr
    */
    private String cidr;

    /**
    * LoadBalancer所属vpc名称
    */
    private String vpcName;

    /**
    * LoadBalancer所属子网cidr
    */
    private String subnetCider;

    /**
    * LoadBalancer所属子网名称
    */
    private String subnetName;

    /**
    * LoadBalancer创建时间
    */
    private String createTime;

    /**
    * LoadBalancer自动释放时间
    */
    private String releaseTime;

    /**
    * LoadBalancer下挂载监听器列表
    */
    private List<ListenerModel> listener;

    /**
    * 标签键值对列表
    */
    private List<TagModel> tags;

    /**
    * 是否允许删除
    */
    private Boolean allowDelete;

    /**
    * 是否允许控制台进行修改
    */
    private Boolean allowModify;

    /**
    * 开启修改保护原因
    */
    private String modificationProtectionReason;

    /**
    * 付款时间，预支付（Prepaid）或后支付（Postpaid）
    */
    private String paymentTiming;

    /**
    * 计费方式，\"ByCapacityUnit\" 按使用量 \"BySpec\" 按固定规格
    */
    private String billingMethod;

    /**
    * 性能规格。\"small1\"标准型1，\"small2\"标准型2，\"medium1\"增强型1，\"medium2\"增强型1，\"large1\"超大型1，\"large2\"超大型2，\"large3\"超大型3
    */
    private String performanceLevel;

    /**
    * 预付费实例的过期时间
    */
    private String expireTime;

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

    public String getBlbId() {
        return blbId;
    }

    public DescribeAppBlbResponse setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DescribeAppBlbResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public DescribeAppBlbResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public DescribeAppBlbResponse setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public DescribeAppBlbResponse setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public String getCidr() {
        return cidr;
    }

    public DescribeAppBlbResponse setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getVpcName() {
        return vpcName;
    }

    public DescribeAppBlbResponse setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getSubnetCider() {
        return subnetCider;
    }

    public DescribeAppBlbResponse setSubnetCider(String subnetCider) {
        this.subnetCider = subnetCider;
        return this;
    }

    public String getSubnetName() {
        return subnetName;
    }

    public DescribeAppBlbResponse setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DescribeAppBlbResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public DescribeAppBlbResponse setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

    public List<ListenerModel> getListener() {
        return listener;
    }

    public DescribeAppBlbResponse setListener(List<ListenerModel> listener) {
        this.listener = listener;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public DescribeAppBlbResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public Boolean getAllowDelete() {
        return allowDelete;
    }

    public DescribeAppBlbResponse setAllowDelete(Boolean allowDelete) {
        this.allowDelete = allowDelete;
        return this;
    }

    public Boolean getAllowModify() {
        return allowModify;
    }

    public DescribeAppBlbResponse setAllowModify(Boolean allowModify) {
        this.allowModify = allowModify;
        return this;
    }

    public String getModificationProtectionReason() {
        return modificationProtectionReason;
    }

    public DescribeAppBlbResponse setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public DescribeAppBlbResponse setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getBillingMethod() {
        return billingMethod;
    }

    public DescribeAppBlbResponse setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
        return this;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }

    public DescribeAppBlbResponse setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public DescribeAppBlbResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getEipRouteType() {
        return eipRouteType;
    }

    public DescribeAppBlbResponse setEipRouteType(String eipRouteType) {
        this.eipRouteType = eipRouteType;
        return this;
    }

    public String getPublicIpv6() {
        return publicIpv6;
    }

    public DescribeAppBlbResponse setPublicIpv6(String publicIpv6) {
        this.publicIpv6 = publicIpv6;
        return this;
    }

    public String getEipV6RouteType() {
        return eipV6RouteType;
    }

    public DescribeAppBlbResponse setEipV6RouteType(String eipV6RouteType) {
        this.eipV6RouteType = eipV6RouteType;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAppBlbResponse{" + "blbId=" + blbId + "\n" + "status=" + status + "\n" + "desc=" + desc + "\n" + "address=" + address + "\n" + "publicIp=" + publicIp
                + "\n" + "cidr=" + cidr + "\n" + "vpcName=" + vpcName + "\n" + "subnetCider=" + subnetCider + "\n" + "subnetName=" + subnetName + "\n" + "createTime=" + createTime
                + "\n" + "releaseTime=" + releaseTime + "\n" + "listener=" + listener + "\n" + "tags=" + tags + "\n" + "allowDelete=" + allowDelete + "\n" + "allowModify="
                + allowModify + "\n" + "modificationProtectionReason=" + modificationProtectionReason + "\n" + "paymentTiming=" + paymentTiming + "\n" + "billingMethod="
                + billingMethod + "\n" + "performanceLevel=" + performanceLevel + "\n" + "expireTime=" + expireTime + "\n" + "eipRouteType=" + eipRouteType + "\n" + "publicIpv6="
                + publicIpv6 + "\n" + "eipV6RouteType=" + eipV6RouteType + "\n" + "}";
    }

}
