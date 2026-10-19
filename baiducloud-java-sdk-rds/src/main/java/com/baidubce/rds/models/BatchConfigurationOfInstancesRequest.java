package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchConfigurationOfInstancesRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * CPU核数，最小值是1
    */
    private Integer cpuCount;

    /**
    * 内存大小，单位GB。最小值为1
    */
    private Integer memoryCapacity;

    /**
    * 存储大小，单位GB。最小值为1，如果磁盘类型为diskIoType为cloud\_enha，则volumeCapacity必须大于50
    */
    private Integer volumeCapacity;

    /**
    * 批量变配时的只读实例数组，当参数isBatchResize = true 时此值无效，否则此值必填。
    */
    private List<ReplicaRequest> readReplicas;

    /**
    * 取值为 true，代表开启一键批量变配功能，此时客户填写的只读信息（readReplicas）是无用的，会按照默认约定将需要升级的只读的存储大小与目标主实例存储大小保持一致；取值为 false 时，readReplicas值必填。
    */
    private Boolean isBatchResize;

    /**
    * 是否进行直接支付，默认为否，设置为直接支付的变配订单会直接扣款，不需要在走支付逻辑
    */
    private Boolean isDirectPay;

    /**
    * 是否为增强版RDS
    */
    private Boolean isEnhanced;

    /**
    * 操作执行方式，有两种取值：timewindow、immediate。其中timewindow表示在时间窗口内执行，immediate表示立即执行。默认为immediate。实例默认的时间窗口为05:00~06:00，具体可参考实例详情内容
    */
    private String effectiveTime;

    /**
    * 变配时需要变更主库可用区，此参数需要传值，如：cn-bj-a。不传默认取当前主库az
    */
    private String masterAzone;

    /**
    * 变配时需要变更备库可用区，此参数需要传值，如：cn-bj-a。不传默认取当前备库az
    */
    private String backupAzone;

    /**
    * 存储磁盘包括本地SSD磁盘（取值为：normal\_io）、增强型SSD云磁盘（取值为：cloud\_enha）、 高性能云磁盘（取值为：cloud\_high）、cloud\_nor（取值为:
    * 通用型SSD）四种，支持本地盘变更为增强型SSD云盘类型，即取消disable限制。反之，云盘不允许变更为本地盘。限制本地转云盘条件：1）当实例是应用是mysql且版本是5.5或5.6；2）参数是非本地SSD磁盘（normal\_io）且此参数不为空字符
    */
    private String diskIoType;

    /**
    * 子网ID，默认为空
    */
    private String subnetId;

    /**
    * 边缘子网ID
    */
    private String edgeSubnetId;

    /**
    * 变配时如果主库或备库需要变更可用区，此参数需要传值
    */
    private List<SubnetMap> subnets;

    /**
    * 批量变配时，API支付支持传入指定代金券ID，当主实例为预付费类型且想使用已有代金券支持时，此值必传。当前只支持传入一个值。
    */
    private List<Long> couponId;

    public String getInstanceId() {
        return instanceId;
    }

    public BatchConfigurationOfInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public BatchConfigurationOfInstancesRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getMemoryCapacity() {
        return memoryCapacity;
    }

    public BatchConfigurationOfInstancesRequest setMemoryCapacity(Integer memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }

    public Integer getVolumeCapacity() {
        return volumeCapacity;
    }

    public BatchConfigurationOfInstancesRequest setVolumeCapacity(Integer volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
        return this;
    }

    public List<ReplicaRequest> getReadReplicas() {
        return readReplicas;
    }

    public BatchConfigurationOfInstancesRequest setReadReplicas(List<ReplicaRequest> readReplicas) {
        this.readReplicas = readReplicas;
        return this;
    }

    public Boolean getIsBatchResize() {
        return isBatchResize;
    }

    public BatchConfigurationOfInstancesRequest setIsBatchResize(Boolean isBatchResize) {
        this.isBatchResize = isBatchResize;
        return this;
    }

    public Boolean getIsDirectPay() {
        return isDirectPay;
    }

    public BatchConfigurationOfInstancesRequest setIsDirectPay(Boolean isDirectPay) {
        this.isDirectPay = isDirectPay;
        return this;
    }

    public Boolean getIsEnhanced() {
        return isEnhanced;
    }

    public BatchConfigurationOfInstancesRequest setIsEnhanced(Boolean isEnhanced) {
        this.isEnhanced = isEnhanced;
        return this;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public BatchConfigurationOfInstancesRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    public String getMasterAzone() {
        return masterAzone;
    }

    public BatchConfigurationOfInstancesRequest setMasterAzone(String masterAzone) {
        this.masterAzone = masterAzone;
        return this;
    }

    public String getBackupAzone() {
        return backupAzone;
    }

    public BatchConfigurationOfInstancesRequest setBackupAzone(String backupAzone) {
        this.backupAzone = backupAzone;
        return this;
    }

    public String getDiskIoType() {
        return diskIoType;
    }

    public BatchConfigurationOfInstancesRequest setDiskIoType(String diskIoType) {
        this.diskIoType = diskIoType;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public BatchConfigurationOfInstancesRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getEdgeSubnetId() {
        return edgeSubnetId;
    }

    public BatchConfigurationOfInstancesRequest setEdgeSubnetId(String edgeSubnetId) {
        this.edgeSubnetId = edgeSubnetId;
        return this;
    }

    public List<SubnetMap> getSubnets() {
        return subnets;
    }

    public BatchConfigurationOfInstancesRequest setSubnets(List<SubnetMap> subnets) {
        this.subnets = subnets;
        return this;
    }

    public List<Long> getCouponId() {
        return couponId;
    }

    public BatchConfigurationOfInstancesRequest setCouponId(List<Long> couponId) {
        this.couponId = couponId;
        return this;
    }

}
