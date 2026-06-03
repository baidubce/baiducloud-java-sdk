package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceInfo {
    /**
     * RapidFS 实例名称
     */
    private String instanceName;

    /**
     * RapidFS 实例唯一 ID
     */
    private String instanceId;

    /**
     * RapidFS 实例描述信息
     */
    private String description;

    /**
     * RapidFS 实例状态， 见 InstanceStatus
     */
    private String status;

    /**
     * 地域缩写，bd，bj ……
     */
    private String region;

    /**
     * 可用区，ZoneA，ZoneB ……
     */
    private String zone;

    /**
     * 缓存总容量，单位 MiB
     */
    private Long capacityMiB;

    /**
     * 已使用缓存总容量，单位 MiB
     */
    private Long capacityUsedMiB;

    /**
     * 缓存使用率，百分比
     */
    private Double capacityUsedPercentage;

    /**
     * RapidFS 实例所在 vpc，短 ID
     */
    private String vpcId;

    /**
     * RapidFS 实例所在子网，短 ID
     */
    private String subnetId;

    /**
     * 
     */
    private String managedMode;

    /**
     * 
     */
    private String metaSpec;

    /**
     * 数据规格，当前仅在 FullyManaged 部署模式下生效，枚举值：* Basic：数据性能基线为 100MB/s/TiB；* Capacity：数据性能基线为 200MB/s/TiB
     */
    private String dataSpec;

    /**
     * 
     */
    private String type;

    /**
     * RapidFS实例扩缩容状态，见 ResizeStatus：状态非 Normal 时需要用户发起二次确认
     */
    private String resizeStatus;

    /**
     * 实例内所有数据源已分配 Quota 的容量之和
     */
    private Integer allocatedQuotaMiB;

    /**
     * MasterManaged 部署模式下，用户运维管理的缓存接入类型 type 为 CCE 时有效，为容器引擎 CCE 集群 ID
     */
    private String cceClusterId;

    /**
     * MasterManaged 部署模式下，用户运维管理的缓存接入类型 type 为 AIHC 时有效，为 AIHC 全托管资源池 ID
     */
    private String aihcResourcePoolId;

    /**
     * 
     */
    private String k8sControllerId;

    /**
     * 标签列表
     */
    private List<Tag> tags;

    /**
     * RapidFS 实例创建时间，例如 2026-06-01T23:00:10Z"
     */
    private String createTime;

    public InstanceInfo setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public InstanceInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public InstanceInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public InstanceInfo setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public InstanceInfo setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getZone() {
        return this.zone;
    }

    public InstanceInfo setCapacityMiB(Long capacityMiB) {
        this.capacityMiB = capacityMiB;
        return this;
    }

    public Long getCapacityMiB() {
        return this.capacityMiB;
    }

    public InstanceInfo setCapacityUsedMiB(Long capacityUsedMiB) {
        this.capacityUsedMiB = capacityUsedMiB;
        return this;
    }

    public Long getCapacityUsedMiB() {
        return this.capacityUsedMiB;
    }

    public InstanceInfo setCapacityUsedPercentage(Double capacityUsedPercentage) {
        this.capacityUsedPercentage = capacityUsedPercentage;
        return this;
    }

    public Double getCapacityUsedPercentage() {
        return this.capacityUsedPercentage;
    }

    public InstanceInfo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public InstanceInfo setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public InstanceInfo setManagedMode(String managedMode) {
        this.managedMode = managedMode;
        return this;
    }

    public String getManagedMode() {
        return this.managedMode;
    }

    public InstanceInfo setMetaSpec(String metaSpec) {
        this.metaSpec = metaSpec;
        return this;
    }

    public String getMetaSpec() {
        return this.metaSpec;
    }

    public InstanceInfo setDataSpec(String dataSpec) {
        this.dataSpec = dataSpec;
        return this;
    }

    public String getDataSpec() {
        return this.dataSpec;
    }

    public InstanceInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public InstanceInfo setResizeStatus(String resizeStatus) {
        this.resizeStatus = resizeStatus;
        return this;
    }

    public String getResizeStatus() {
        return this.resizeStatus;
    }

    public InstanceInfo setAllocatedQuotaMiB(Integer allocatedQuotaMiB) {
        this.allocatedQuotaMiB = allocatedQuotaMiB;
        return this;
    }

    public Integer getAllocatedQuotaMiB() {
        return this.allocatedQuotaMiB;
    }

    public InstanceInfo setCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
        return this;
    }

    public String getCceClusterId() {
        return this.cceClusterId;
    }

    public InstanceInfo setAihcResourcePoolId(String aihcResourcePoolId) {
        this.aihcResourcePoolId = aihcResourcePoolId;
        return this;
    }

    public String getAihcResourcePoolId() {
        return this.aihcResourcePoolId;
    }

    public InstanceInfo setK8sControllerId(String k8sControllerId) {
        this.k8sControllerId = k8sControllerId;
        return this;
    }

    public String getK8sControllerId() {
        return this.k8sControllerId;
    }

    public InstanceInfo setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public InstanceInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    @Override
    public String toString() {
        return "InstanceInfo{" + "instanceName=" + instanceName + "\n" + "instanceId=" + instanceId + "\n" + "description=" + description + "\n" + "status=" + status + "\n"
                + "region=" + region + "\n" + "zone=" + zone + "\n" + "capacityMiB=" + capacityMiB + "\n" + "capacityUsedMiB=" + capacityUsedMiB + "\n" + "capacityUsedPercentage="
                + capacityUsedPercentage + "\n" + "vpcId=" + vpcId + "\n" + "subnetId=" + subnetId + "\n" + "managedMode=" + managedMode + "\n" + "metaSpec=" + metaSpec + "\n"
                + "dataSpec=" + dataSpec + "\n" + "type=" + type + "\n" + "resizeStatus=" + resizeStatus + "\n" + "allocatedQuotaMiB=" + allocatedQuotaMiB + "\n" + "cceClusterId="
                + cceClusterId + "\n" + "aihcResourcePoolId=" + aihcResourcePoolId + "\n" + "k8sControllerId=" + k8sControllerId + "\n" + "tags=" + tags + "\n" + "createTime="
                + createTime + "\n" + "}";
    }

}