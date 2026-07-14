package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Node {
    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例UUID
     */
    private String instanceUuid;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 浮动IP
     */
    private String floatingIp;

    /**
     * 内网IP
     */
    private String internalIp;

    /**
     * 状态
     */
    private String status;

    /**
     * 付费方式
     */
    private String payment;

    /**
     * cpu数量
     */
    private Integer cpuCount;

    /**
     * 内存大小
     */
    private Integer memoryCapacityInGB;

    /**
     * 实例类型
     */
    private String instanceType;

    /**
     * 系统盘大小
     */
    private Integer sysDiskInGB;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * eip
     */
    private AsEip eip;

    /**
     * 子网类型
     */
    private String subnetType;

    /**
     * 是否受保护节点
     */
    private Boolean isProtected;

    /**
     * 节点类型
     */
    private String nodeType;

    /**
     * 标签列表
     */
    private List<TagInfo> tags;

    /**
     * 分组ID
     */
    private String groupId;

    /**
     * 是否由系统托管
     */
    private Boolean isManaged;

    /**
     * 内部规格标识
     */
    private String internalSpec;

    /**
     * 逻辑区域标识
     */
    private String logicalZone;

    public Node setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Node setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }

    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public Node setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public Node setFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
        return this;
    }

    public String getFloatingIp() {
        return this.floatingIp;
    }

    public Node setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    public String getInternalIp() {
        return this.internalIp;
    }

    public Node setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Node setPayment(String payment) {
        this.payment = payment;
        return this;
    }

    public String getPayment() {
        return this.payment;
    }

    public Node setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public Node setMemoryCapacityInGB(Integer memoryCapacityInGB) {
        this.memoryCapacityInGB = memoryCapacityInGB;
        return this;
    }

    public Integer getMemoryCapacityInGB() {
        return this.memoryCapacityInGB;
    }

    public Node setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public Node setSysDiskInGB(Integer sysDiskInGB) {
        this.sysDiskInGB = sysDiskInGB;
        return this;
    }

    public Integer getSysDiskInGB() {
        return this.sysDiskInGB;
    }

    public Node setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Node setEip(AsEip eip) {
        this.eip = eip;
        return this;
    }

    public AsEip getEip() {
        return this.eip;
    }

    public Node setSubnetType(String subnetType) {
        this.subnetType = subnetType;
        return this;
    }

    public String getSubnetType() {
        return this.subnetType;
    }

    public Node setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    public Boolean getIsProtected() {
        return this.isProtected;
    }

    public Node setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public Node setTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagInfo> getTags() {
        return this.tags;
    }

    public Node setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public Node setIsManaged(Boolean isManaged) {
        this.isManaged = isManaged;
        return this;
    }

    public Boolean getIsManaged() {
        return this.isManaged;
    }

    public Node setInternalSpec(String internalSpec) {
        this.internalSpec = internalSpec;
        return this;
    }

    public String getInternalSpec() {
        return this.internalSpec;
    }

    public Node setLogicalZone(String logicalZone) {
        this.logicalZone = logicalZone;
        return this;
    }

    public String getLogicalZone() {
        return this.logicalZone;
    }

    @Override
    public String toString() {
        return "Node{" + "instanceId=" + instanceId + "\n" + "instanceUuid=" + instanceUuid + "\n" + "instanceName=" + instanceName + "\n" + "floatingIp=" + floatingIp + "\n"
                + "internalIp=" + internalIp + "\n" + "status=" + status + "\n" + "payment=" + payment + "\n" + "cpuCount=" + cpuCount + "\n" + "memoryCapacityInGB="
                + memoryCapacityInGB + "\n" + "instanceType=" + instanceType + "\n" + "sysDiskInGB=" + sysDiskInGB + "\n" + "createTime=" + createTime + "\n" + "eip=" + eip + "\n"
                + "subnetType=" + subnetType + "\n" + "isProtected=" + isProtected + "\n" + "nodeType=" + nodeType + "\n" + "tags=" + tags + "\n" + "groupId=" + groupId + "\n"
                + "isManaged=" + isManaged + "\n" + "internalSpec=" + internalSpec + "\n" + "logicalZone=" + logicalZone + "\n" + "}";
    }

}