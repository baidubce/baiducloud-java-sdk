package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateReadOnlyInstanceRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 主实例ID
    */
    private String sourceInstanceId;

    /**
    * 用户自定义实例名，要求： 1）允许小写字母、数字； 2）长度限制为1~64； 默认{engine} + {engineVersion}
    */
    private String instanceName;

    /**
    * CPU核数。[取值参考](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E5%8F%AF%E9%80%89%E5%A5%97%E9%A4%90)
    */
    private Integer cpuCount;

    /**
    * 套餐内存大小，单位GB。[取值参考](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E5%8F%AF%E9%80%89%E5%A5%97%E9%A4%90)
    */
    private Integer memoryCapacity;

    /**
    * 套餐磁盘大小，单位GB，每5GB递增。不能小于主实例磁盘。[范围参考](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E5%8F%AF%E9%80%89%E5%A5%97%E9%A4%90)
    */
    private Integer volumeCapacity;

    /**
    * 磁盘类型。  normal\_io : 本地盘ssd磁盘。 cloud\_high : 高性能云磁盘。  cloud\_nor : 通用型SSD。   cloud\_enha: 增强型SSD
    */
    private String diskIoType;

    /**
    * 指定zone信息，默认为空，由系统自动选择，可通过调用[查询可用区列表](/doc/RDS/s/zka65zqz2)接口查询可用区列表。zoneName命名规范是小写的“国家-region-可用区序列"，例如北京可用区A为"cn-bj-a"。 只读实例只能在单可用区中，故此处只能填写一个可用区。
    */
    private List<String> zoneNames;

    /**
    * 与主实例 vpcId 相同
    */
    private String vpcId;

    /**
    * bcm 实例组名称
    */
    private String bcmGroupName;

    /**
    * 是否进行直接支付，默认false，设置为直接支付的变配订单会直接扣款，不需要在走支付逻辑
    */
    private Boolean isDirectPay;

    /**
    * 特定vpc内，可用区的 subnetId；如果指定的 vpcId为自定义vpc，则必须指定 subnetId。可通过调用[查询子网列表](/doc/RDS/s/Wka66184u)接口查询子网列表。 只读实例只能在单可用区中，故此处只能填写一个 SubnetMap
    */
    private List<SubnetMap> subnets;

    /**
    * RDS实例访问入口BLB的ovip，传该参数且值非空，会根据该值为blb的ovip去申请blb，否则申请blb随机分配ip
    */
    private String ovip;

    /**
    * RDS实例访问入口BLB的端口，传该参数且值非空，会根据该值为blb的listener port去申请blb，否则默认3306，端口取值范围：1024-65535
    */
    private Integer entryPort;

    /**
    * 资源分组Id。例如：RESG-bKMxbExtnoG
    */
    private String resourceGroupId;

    /**
    * basic表示基础版只读实例，ha表示高可用版只读实例，不传默认basic
    */
    private String replicaType;

    /**
    * 当前参数表示新建的只读实例是否要继承主实例IP白名单配置，值为true表示继承，false表示不继承。默认为 false，不继承主实例的 IP 白名单
    */
    private Boolean isInheritMasterAuthip;

    /**
    * 当前购买实例的个数，默认为1 最大为10
    */
    private Integer purchaseCount;

    /**
    * 实例类型，支持exclusive/shared，默认exclusive。exclusive表示独享型，shared表示通用型
    */
    private String resourceType;

    /**
    * 自动续费单位（"year";"month"）
    */
    private String autoRenewTimeUnit;

    /**
    * 自动续费时长（续费单位为year 不大于3，续费单位为month 不大于9）
    */
    private Integer autoRenewTime;

    public String getClientToken() {
        return clientToken;
    }

    public CreateReadOnlyInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateReadOnlyInstanceRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public CreateReadOnlyInstanceRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public CreateReadOnlyInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public CreateReadOnlyInstanceRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getMemoryCapacity() {
        return memoryCapacity;
    }

    public CreateReadOnlyInstanceRequest setMemoryCapacity(Integer memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }

    public Integer getVolumeCapacity() {
        return volumeCapacity;
    }

    public CreateReadOnlyInstanceRequest setVolumeCapacity(Integer volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
        return this;
    }

    public String getDiskIoType() {
        return diskIoType;
    }

    public CreateReadOnlyInstanceRequest setDiskIoType(String diskIoType) {
        this.diskIoType = diskIoType;
        return this;
    }

    public List<String> getZoneNames() {
        return zoneNames;
    }

    public CreateReadOnlyInstanceRequest setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateReadOnlyInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getBcmGroupName() {
        return bcmGroupName;
    }

    public CreateReadOnlyInstanceRequest setBcmGroupName(String bcmGroupName) {
        this.bcmGroupName = bcmGroupName;
        return this;
    }

    public Boolean getIsDirectPay() {
        return isDirectPay;
    }

    public CreateReadOnlyInstanceRequest setIsDirectPay(Boolean isDirectPay) {
        this.isDirectPay = isDirectPay;
        return this;
    }

    public List<SubnetMap> getSubnets() {
        return subnets;
    }

    public CreateReadOnlyInstanceRequest setSubnets(List<SubnetMap> subnets) {
        this.subnets = subnets;
        return this;
    }

    public String getOvip() {
        return ovip;
    }

    public CreateReadOnlyInstanceRequest setOvip(String ovip) {
        this.ovip = ovip;
        return this;
    }

    public Integer getEntryPort() {
        return entryPort;
    }

    public CreateReadOnlyInstanceRequest setEntryPort(Integer entryPort) {
        this.entryPort = entryPort;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateReadOnlyInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public String getReplicaType() {
        return replicaType;
    }

    public CreateReadOnlyInstanceRequest setReplicaType(String replicaType) {
        this.replicaType = replicaType;
        return this;
    }

    public Boolean getIsInheritMasterAuthip() {
        return isInheritMasterAuthip;
    }

    public CreateReadOnlyInstanceRequest setIsInheritMasterAuthip(Boolean isInheritMasterAuthip) {
        this.isInheritMasterAuthip = isInheritMasterAuthip;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public CreateReadOnlyInstanceRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public CreateReadOnlyInstanceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public CreateReadOnlyInstanceRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public CreateReadOnlyInstanceRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

}
