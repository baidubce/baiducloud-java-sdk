package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * LoadBalancer的名称，方便记忆。长度1~65个字节，字母开头，可包含字母数字-\_/.字符。若不传该参数，会自动生成
    */
    private String name;

    /**
    * LoaBalancer的类型，此处取值"application"(默认)
    */
    private String type;

    /**
    * LoadBalancer实例的描述，便于用户添加更详细的描述信息。长度0~450个字节，支持中文。默认为空
    */
    private String desc;

    /**
    * LoadBalancer实例所属子网
    */
    private String subnetId;

    /**
    * LoadBalancer实例vip所属VPC的vpcShortId
    */
    private String vpcId;

    /**
    * 指定负载均衡实例的私网IP地址，该地址必须包含在子网网段下。
    */
    private String address;

    /**
    * 绑定已有的eip。取值为eip的IP地址
    */
    private String eip;

    /**
    * 待创建的标签键值对列表
    */
    private List<TagModel> tags;

    /**
    * billing
    */
    private BillingForCreate billing;

    /**
    * 性能规格参数，默认为共享型。取值如下："small1"标准型1，"small2"标准型2，"medium1"增强型1，"medium2"增强型1，"large1"超大型1，"large2"超大型2，"large3"超大型3，如果是后付费按使用量计费的时候还可以传"unlimited"不限速
    */
    private String performanceLevel;

    /**
    * 支持创建预付费BLB同时开通自动续费，根据autoRenewTimeUnit的取值有不同的范围，month 为1到9，year 为1到3
    */
    private Integer autoRenewLength;

    /**
    * 支持创建BLB同时开通自动续费，取值为 month 获 year （默认 month）
    */
    private String autoRenewTimeUnit;

    /**
    * 支持创建BLB同时绑定资源分组id
    */
    private String resourceGroupId;

    /**
    * 是否允许删除。缺省值为true，代表允许删除
    */
    private Boolean allowDelete;

    /**
    * 默认fasle,表示关闭修改保护，允许通过控制台对实例进行变更。true 表示开启修改保护，禁止通过控制台对实例进行变更（注意:OpenAPI调用不受限制）
    */
    private Boolean allowModify;

    /**
    * 不允许修改的原因,最多支持128个字符
    */
    private String modificationProtectionReason;

    /**
    * 是否分配ipv6地址。true代表分配ipv6地址，false代表不分配ipv6地址
    */
    private Boolean allocateIpv6;

    public String getClientToken() {
        return clientToken;
    }

    public CreateAppBlbRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAppBlbRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateAppBlbRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateAppBlbRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateAppBlbRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateAppBlbRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CreateAppBlbRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEip() {
        return eip;
    }

    public CreateAppBlbRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateAppBlbRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public BillingForCreate getBilling() {
        return billing;
    }

    public CreateAppBlbRequest setBilling(BillingForCreate billing) {
        this.billing = billing;
        return this;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }

    public CreateAppBlbRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }

    public Integer getAutoRenewLength() {
        return autoRenewLength;
    }

    public CreateAppBlbRequest setAutoRenewLength(Integer autoRenewLength) {
        this.autoRenewLength = autoRenewLength;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public CreateAppBlbRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateAppBlbRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public Boolean getAllowDelete() {
        return allowDelete;
    }

    public CreateAppBlbRequest setAllowDelete(Boolean allowDelete) {
        this.allowDelete = allowDelete;
        return this;
    }

    public Boolean getAllowModify() {
        return allowModify;
    }

    public CreateAppBlbRequest setAllowModify(Boolean allowModify) {
        this.allowModify = allowModify;
        return this;
    }

    public String getModificationProtectionReason() {
        return modificationProtectionReason;
    }

    public CreateAppBlbRequest setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }

    public Boolean getAllocateIpv6() {
        return allocateIpv6;
    }

    public CreateAppBlbRequest setAllocateIpv6(Boolean allocateIpv6) {
        this.allocateIpv6 = allocateIpv6;
        return this;
    }

}
