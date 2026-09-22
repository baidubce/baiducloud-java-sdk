package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceDetailResponse extends BaseBceResponse {

    /**
    * 实例ID
    */
    private String instanceId;

    /**
    * 实例名称
    */
    private String instanceName;

    /**
    * 实例状态
    */
    private String instanceStatus;

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
    * 节点规格
    */
    private String nodeType;

    /**
    * 存储类型
    */
    private Integer storeType;

    /**
    * 分片数量
    */
    private Integer shardNum;

    /**
    * 私网IP
    */
    private String vnetIp;

    /**
    * 公网IP
    */
    private String eip;

    /**
    * 内网域名
    */
    private String domain;

    /**
    * 公网域名
    */
    private String publicDomain;

    /**
    * 内网端口
    */
    private Integer port;

    /**
    * 创建时间（格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC）
    */
    private String instanceCreateTime;

    /**
    * 到期时间（格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC）
    */
    private String instanceExpireTime;

    /**
    * 总容量，单位GB
    */
    private Float capacity;

    /**
    * 已用容量，单位GB
    */
    private Double usedCapacity;

    /**
    * 付费方式。包年包月：Prepaid，按量付费：Postpaid
    */
    private String paymentTiming;

    /**
    * 可用区列表
    */
    private List<String> zoneNames;

    /**
    * 副本数
    */
    private Integer replicationNum;

    /**
    * 副本信息
    */
    private List<ReplicationItem> replicationInfo;

    /**
    * 存储容量
    */
    private Integer diskFlavor;

    /**
    * 副本只读开关。1：打开 2：关闭
    */
    private Integer enableReadOnly;

    /**
    * VPC的ID
    */
    private String vpcId;

    /**
    * 子网列表
    */
    private List<Subnet> subnets;

    /**
    * 是否自动续费。是：true，否：false
    */
    private Boolean autoRenew;

    /**
    * 统一读入口地址。开启统一读入口后生效。
    */
    private String entrance;

    /**
    * 慢日志是否开启
    */
    private Integer enableSlowLog;

    /**
    * 集团云创建的实例绑定bnsGroup
    */
    private String bnsGroup;

    /**
    * 代理节点列表
    */
    private List<ProxyItem> proxyList;

    /**
    * 分片信息
    */
    private List<CacheClusterNode> cacheClusterInstances;

    /**
    * 节点信息
    */
    private List<RedisNode> redisList;

    /**
    * 标签
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
    * fullVersionInfo
    */
    private InstanceFullVersionInfo fullVersionInfo;

    /**
    * maintainTime
    */
    private MaintainTime maintainTime;

    /**
    * 是否开启热key
    */
    private Boolean enableHotkey;

    /**
    * 预转后、后转预的标记。to_postpay: 预付费转后付费，to_prepay: 后付费转预付费
    */
    private String orderStatus;

    /**
    * featureSwitches
    */
    private FeatureSwitches featureSwitches;

    /**
    * 跨AZ就近是否开启: yes 开启, no 未开启
    */
    private String crossAzNearest;

    /**
    * 就近访问入口列表
    */
    private List<EntranceItem> entranceList;

    /**
    * sentinel命令兼容开启情况。true: 开启, false: 关闭
    */
    private Boolean supportSentinelCommands;

    public String getInstanceId() {
        return instanceId;
    }

    public GetInstanceDetailResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public GetInstanceDetailResponse setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceStatus() {
        return instanceStatus;
    }

    public GetInstanceDetailResponse setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    public String getClusterType() {
        return clusterType;
    }

    public GetInstanceDetailResponse setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public String getEngine() {
        return engine;
    }

    public GetInstanceDetailResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public GetInstanceDetailResponse setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public GetInstanceDetailResponse setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public GetInstanceDetailResponse setStoreType(Integer storeType) {
        this.storeType = storeType;
        return this;
    }

    public Integer getShardNum() {
        return shardNum;
    }

    public GetInstanceDetailResponse setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public String getVnetIp() {
        return vnetIp;
    }

    public GetInstanceDetailResponse setVnetIp(String vnetIp) {
        this.vnetIp = vnetIp;
        return this;
    }

    public String getEip() {
        return eip;
    }

    public GetInstanceDetailResponse setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public GetInstanceDetailResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getPublicDomain() {
        return publicDomain;
    }

    public GetInstanceDetailResponse setPublicDomain(String publicDomain) {
        this.publicDomain = publicDomain;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public GetInstanceDetailResponse setPort(Integer port) {
        this.port = port;
        return this;
    }

    public String getInstanceCreateTime() {
        return instanceCreateTime;
    }

    public GetInstanceDetailResponse setInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    public String getInstanceExpireTime() {
        return instanceExpireTime;
    }

    public GetInstanceDetailResponse setInstanceExpireTime(String instanceExpireTime) {
        this.instanceExpireTime = instanceExpireTime;
        return this;
    }

    public Float getCapacity() {
        return capacity;
    }

    public GetInstanceDetailResponse setCapacity(Float capacity) {
        this.capacity = capacity;
        return this;
    }

    public Double getUsedCapacity() {
        return usedCapacity;
    }

    public GetInstanceDetailResponse setUsedCapacity(Double usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public GetInstanceDetailResponse setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public List<String> getZoneNames() {
        return zoneNames;
    }

    public GetInstanceDetailResponse setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public Integer getReplicationNum() {
        return replicationNum;
    }

    public GetInstanceDetailResponse setReplicationNum(Integer replicationNum) {
        this.replicationNum = replicationNum;
        return this;
    }

    public List<ReplicationItem> getReplicationInfo() {
        return replicationInfo;
    }

    public GetInstanceDetailResponse setReplicationInfo(List<ReplicationItem> replicationInfo) {
        this.replicationInfo = replicationInfo;
        return this;
    }

    public Integer getDiskFlavor() {
        return diskFlavor;
    }

    public GetInstanceDetailResponse setDiskFlavor(Integer diskFlavor) {
        this.diskFlavor = diskFlavor;
        return this;
    }

    public Integer getEnableReadOnly() {
        return enableReadOnly;
    }

    public GetInstanceDetailResponse setEnableReadOnly(Integer enableReadOnly) {
        this.enableReadOnly = enableReadOnly;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public GetInstanceDetailResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public List<Subnet> getSubnets() {
        return subnets;
    }

    public GetInstanceDetailResponse setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public GetInstanceDetailResponse setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public String getEntrance() {
        return entrance;
    }

    public GetInstanceDetailResponse setEntrance(String entrance) {
        this.entrance = entrance;
        return this;
    }

    public Integer getEnableSlowLog() {
        return enableSlowLog;
    }

    public GetInstanceDetailResponse setEnableSlowLog(Integer enableSlowLog) {
        this.enableSlowLog = enableSlowLog;
        return this;
    }

    public String getBnsGroup() {
        return bnsGroup;
    }

    public GetInstanceDetailResponse setBnsGroup(String bnsGroup) {
        this.bnsGroup = bnsGroup;
        return this;
    }

    public List<ProxyItem> getProxyList() {
        return proxyList;
    }

    public GetInstanceDetailResponse setProxyList(List<ProxyItem> proxyList) {
        this.proxyList = proxyList;
        return this;
    }

    public List<CacheClusterNode> getCacheClusterInstances() {
        return cacheClusterInstances;
    }

    public GetInstanceDetailResponse setCacheClusterInstances(List<CacheClusterNode> cacheClusterInstances) {
        this.cacheClusterInstances = cacheClusterInstances;
        return this;
    }

    public List<RedisNode> getRedisList() {
        return redisList;
    }

    public GetInstanceDetailResponse setRedisList(List<RedisNode> redisList) {
        this.redisList = redisList;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public GetInstanceDetailResponse setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public GetInstanceDetailResponse setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public String getResourceGroupName() {
        return resourceGroupName;
    }

    public GetInstanceDetailResponse setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public InstanceFullVersionInfo getFullVersionInfo() {
        return fullVersionInfo;
    }

    public GetInstanceDetailResponse setFullVersionInfo(InstanceFullVersionInfo fullVersionInfo) {
        this.fullVersionInfo = fullVersionInfo;
        return this;
    }

    public MaintainTime getMaintainTime() {
        return maintainTime;
    }

    public GetInstanceDetailResponse setMaintainTime(MaintainTime maintainTime) {
        this.maintainTime = maintainTime;
        return this;
    }

    public Boolean getEnableHotkey() {
        return enableHotkey;
    }

    public GetInstanceDetailResponse setEnableHotkey(Boolean enableHotkey) {
        this.enableHotkey = enableHotkey;
        return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public GetInstanceDetailResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public FeatureSwitches getFeatureSwitches() {
        return featureSwitches;
    }

    public GetInstanceDetailResponse setFeatureSwitches(FeatureSwitches featureSwitches) {
        this.featureSwitches = featureSwitches;
        return this;
    }

    public String getCrossAzNearest() {
        return crossAzNearest;
    }

    public GetInstanceDetailResponse setCrossAzNearest(String crossAzNearest) {
        this.crossAzNearest = crossAzNearest;
        return this;
    }

    public List<EntranceItem> getEntranceList() {
        return entranceList;
    }

    public GetInstanceDetailResponse setEntranceList(List<EntranceItem> entranceList) {
        this.entranceList = entranceList;
        return this;
    }

    public Boolean getSupportSentinelCommands() {
        return supportSentinelCommands;
    }

    public GetInstanceDetailResponse setSupportSentinelCommands(Boolean supportSentinelCommands) {
        this.supportSentinelCommands = supportSentinelCommands;
        return this;
    }

    @Override
    public String toString() {
        return "GetInstanceDetailResponse{" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "instanceStatus=" + instanceStatus + "\n"
                + "clusterType=" + clusterType + "\n" + "engine=" + engine + "\n" + "engineVersion=" + engineVersion + "\n" + "nodeType=" + nodeType + "\n" + "storeType="
                + storeType + "\n" + "shardNum=" + shardNum + "\n" + "vnetIp=" + vnetIp + "\n" + "eip=" + eip + "\n" + "domain=" + domain + "\n" + "publicDomain=" + publicDomain
                + "\n" + "port=" + port + "\n" + "instanceCreateTime=" + instanceCreateTime + "\n" + "instanceExpireTime=" + instanceExpireTime + "\n" + "capacity=" + capacity
                + "\n" + "usedCapacity=" + usedCapacity + "\n" + "paymentTiming=" + paymentTiming + "\n" + "zoneNames=" + zoneNames + "\n" + "replicationNum=" + replicationNum
                + "\n" + "replicationInfo=" + replicationInfo + "\n" + "diskFlavor=" + diskFlavor + "\n" + "enableReadOnly=" + enableReadOnly + "\n" + "vpcId=" + vpcId + "\n"
                + "subnets=" + subnets + "\n" + "autoRenew=" + autoRenew + "\n" + "entrance=" + entrance + "\n" + "enableSlowLog=" + enableSlowLog + "\n" + "bnsGroup=" + bnsGroup
                + "\n" + "proxyList=" + proxyList + "\n" + "cacheClusterInstances=" + cacheClusterInstances + "\n" + "redisList=" + redisList + "\n" + "tags=" + tags + "\n"
                + "resourceGroupId=" + resourceGroupId + "\n" + "resourceGroupName=" + resourceGroupName + "\n" + "fullVersionInfo=" + fullVersionInfo + "\n" + "maintainTime="
                + maintainTime + "\n" + "enableHotkey=" + enableHotkey + "\n" + "orderStatus=" + orderStatus + "\n" + "featureSwitches=" + featureSwitches + "\n"
                + "crossAzNearest=" + crossAzNearest + "\n" + "entranceList=" + entranceList + "\n" + "supportSentinelCommands=" + supportSentinelCommands + "\n" + "}";
    }

}
