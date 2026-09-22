package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceModel {
    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名
     */
    private String instanceName;

    /**
     * [实例状态](#InstanceStatus)
     */
    private String instanceStatus;

    /**
     * 已隔离:Isolated(实例在回收站内)
     */
    private String isolatedStatus;

    /**
     * [集群类型](#ClusterType)
     */
    private String clusterType;

    /**
     * [引擎类型](#Engine)
     */
    private String engine;

    /**
     * 引擎版本
     */
    private String engineVersion;

    /**
     * 私网IP
     */
    private String vnetIp;

    /**
     * 内网域名
     */
    private String domain;

    /**
     * 链接端口
     */
    private Integer port;

    /**
     * 创建时间（格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC）
     */
    private String instanceCreateTime;

    /**
     * 总容量，单位GB
     */
    private Float capacity;

    /**
     * 已用容量，单位GB
     */
    private Double usedCapacity;

    /**
     * 付费方式。预付费：Prepaid，后付费：Postpaid
     */
    private String paymentTiming;

    /**
     * 可用区列表
     */
    private List<String> zoneNames;

    /**
     * 集群存储空间
     */
    private Integer diskFlavor;

    /**
     * 公网IP
     */
    private String eip;

    /**
     * 到期时间（格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC）
     */
    private String instanceExpireTime;

    /**
     * 副本数
     */
    private Integer replicationNum;

    /**
     * 节点规格
     */
    private String nodeType;

    /**
     * 存储类型
     */
    private Integer storeType;

    /**
     * 分片数
     */
    private Integer shardNum;

    /**
     * 标签列表
     */
    private List<Tag> tags;

    /**
     * 资源分组ID
     */
    private String resourceGroupId;

    /**
     * 资源分组名称
     */
    private String resourceGroupName;

    /**
     * 预转后、后转预的标记。 <li>to_postpay: 预付费转后付费<li> to_prepay: 后付费转预付费
     */
    private String orderStatus;

    /**
     * 集群绑定的部署集ID列表。
     */
    private List<String> deployIdList;

    /**
     * vpc
     */
    private VpcInfo vpc;

    /**
     * 子网信息
     */
    private List<SubnetInfo> subnets;

    public InstanceModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceModel setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public InstanceModel setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public InstanceModel setIsolatedStatus(String isolatedStatus) {
        this.isolatedStatus = isolatedStatus;
        return this;
    }

    public String getIsolatedStatus() {
        return this.isolatedStatus;
    }

    public InstanceModel setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public String getClusterType() {
        return this.clusterType;
    }

    public InstanceModel setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngine() {
        return this.engine;
    }

    public InstanceModel setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public InstanceModel setVnetIp(String vnetIp) {
        this.vnetIp = vnetIp;
        return this;
    }

    public String getVnetIp() {
        return this.vnetIp;
    }

    public InstanceModel setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getDomain() {
        return this.domain;
    }

    public InstanceModel setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public InstanceModel setInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    public String getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    public InstanceModel setCapacity(Float capacity) {
        this.capacity = capacity;
        return this;
    }

    public Float getCapacity() {
        return this.capacity;
    }

    public InstanceModel setUsedCapacity(Double usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    public Double getUsedCapacity() {
        return this.usedCapacity;
    }

    public InstanceModel setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public InstanceModel setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public List<String> getZoneNames() {
        return this.zoneNames;
    }

    public InstanceModel setDiskFlavor(Integer diskFlavor) {
        this.diskFlavor = diskFlavor;
        return this;
    }

    public Integer getDiskFlavor() {
        return this.diskFlavor;
    }

    public InstanceModel setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    public InstanceModel setInstanceExpireTime(String instanceExpireTime) {
        this.instanceExpireTime = instanceExpireTime;
        return this;
    }

    public String getInstanceExpireTime() {
        return this.instanceExpireTime;
    }

    public InstanceModel setReplicationNum(Integer replicationNum) {
        this.replicationNum = replicationNum;
        return this;
    }

    public Integer getReplicationNum() {
        return this.replicationNum;
    }

    public InstanceModel setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public InstanceModel setStoreType(Integer storeType) {
        this.storeType = storeType;
        return this;
    }

    public Integer getStoreType() {
        return this.storeType;
    }

    public InstanceModel setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public Integer getShardNum() {
        return this.shardNum;
    }

    public InstanceModel setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public InstanceModel setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public InstanceModel setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public InstanceModel setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public InstanceModel setDeployIdList(List<String> deployIdList) {
        this.deployIdList = deployIdList;
        return this;
    }

    public List<String> getDeployIdList() {
        return this.deployIdList;
    }

    public InstanceModel setVpc(VpcInfo vpc) {
        this.vpc = vpc;
        return this;
    }

    public VpcInfo getVpc() {
        return this.vpc;
    }

    public InstanceModel setSubnets(List<SubnetInfo> subnets) {
        this.subnets = subnets;
        return this;
    }

    public List<SubnetInfo> getSubnets() {
        return this.subnets;
    }

    @Override
    public String toString() {
        return "InstanceModel{" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "instanceStatus=" + instanceStatus + "\n" + "isolatedStatus="
                + isolatedStatus + "\n" + "clusterType=" + clusterType + "\n" + "engine=" + engine + "\n" + "engineVersion=" + engineVersion + "\n" + "vnetIp=" + vnetIp + "\n"
                + "domain=" + domain + "\n" + "port=" + port + "\n" + "instanceCreateTime=" + instanceCreateTime + "\n" + "capacity=" + capacity + "\n" + "usedCapacity="
                + usedCapacity + "\n" + "paymentTiming=" + paymentTiming + "\n" + "zoneNames=" + zoneNames + "\n" + "diskFlavor=" + diskFlavor + "\n" + "eip=" + eip + "\n"
                + "instanceExpireTime=" + instanceExpireTime + "\n" + "replicationNum=" + replicationNum + "\n" + "nodeType=" + nodeType + "\n" + "storeType=" + storeType + "\n"
                + "shardNum=" + shardNum + "\n" + "tags=" + tags + "\n" + "resourceGroupId=" + resourceGroupId + "\n" + "resourceGroupName=" + resourceGroupName + "\n"
                + "orderStatus=" + orderStatus + "\n" + "deployIdList=" + deployIdList + "\n" + "vpc=" + vpc + "\n" + "subnets=" + subnets + "\n" + "}";
    }

}