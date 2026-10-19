package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransformationExampleRequest extends BaseBceRequest {

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
    * 内存大小，单位MB。最小值为1
    */
    private Integer allocatedMemoryInMB;

    /**
    * 代理实例节点数，如果变配类型非代理节点，则可以不用传递这个参数，如果是变配代理节点数必须是(2, 4, 6, 8, 16）之一
    */
    private Integer nodeAmount;

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
    * 存储磁盘类型包括本地SSD磁盘（取值为：normal\_io）、增强型ESSD云磁盘（取值为：cloud\_enha）、 高性能云磁盘（取值为：cloud\_high）、通用型云磁盘（取值为: cloud\_nor）四种。
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

    public String getInstanceId() {
        return instanceId;
    }

    public TransformationExampleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public TransformationExampleRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getMemoryCapacity() {
        return memoryCapacity;
    }

    public TransformationExampleRequest setMemoryCapacity(Integer memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }

    public Integer getVolumeCapacity() {
        return volumeCapacity;
    }

    public TransformationExampleRequest setVolumeCapacity(Integer volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
        return this;
    }

    public Integer getAllocatedMemoryInMB() {
        return allocatedMemoryInMB;
    }

    public TransformationExampleRequest setAllocatedMemoryInMB(Integer allocatedMemoryInMB) {
        this.allocatedMemoryInMB = allocatedMemoryInMB;
        return this;
    }

    public Integer getNodeAmount() {
        return nodeAmount;
    }

    public TransformationExampleRequest setNodeAmount(Integer nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }

    public Boolean getIsDirectPay() {
        return isDirectPay;
    }

    public TransformationExampleRequest setIsDirectPay(Boolean isDirectPay) {
        this.isDirectPay = isDirectPay;
        return this;
    }

    public Boolean getIsEnhanced() {
        return isEnhanced;
    }

    public TransformationExampleRequest setIsEnhanced(Boolean isEnhanced) {
        this.isEnhanced = isEnhanced;
        return this;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public TransformationExampleRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    public String getMasterAzone() {
        return masterAzone;
    }

    public TransformationExampleRequest setMasterAzone(String masterAzone) {
        this.masterAzone = masterAzone;
        return this;
    }

    public String getBackupAzone() {
        return backupAzone;
    }

    public TransformationExampleRequest setBackupAzone(String backupAzone) {
        this.backupAzone = backupAzone;
        return this;
    }

    public String getDiskIoType() {
        return diskIoType;
    }

    public TransformationExampleRequest setDiskIoType(String diskIoType) {
        this.diskIoType = diskIoType;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public TransformationExampleRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getEdgeSubnetId() {
        return edgeSubnetId;
    }

    public TransformationExampleRequest setEdgeSubnetId(String edgeSubnetId) {
        this.edgeSubnetId = edgeSubnetId;
        return this;
    }

    public List<SubnetMap> getSubnets() {
        return subnets;
    }

    public TransformationExampleRequest setSubnets(List<SubnetMap> subnets) {
        this.subnets = subnets;
        return this;
    }

}
