package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAnInstanceRequest extends BaseBceRequest {

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
    * 用户自定义实例名称，要求:<br/>1）支持大小写字母、数字、中文以及\-\_ /\.等特殊字符，必须以字母或者中文开头<br/>2）长度限制为1\-64
    */
    private String instanceName;

    /**
    * 实例规格。<br>Redis内存型和Redis容量型时为必填项。具体规格通过   [获取实例规格列表](https://cloud.baidu.com/doc/SCS/s/ikhvw6dqg)接口获取。<br>Memcache时为非必填项，此参数无效。
    */
    private String nodeType;

    /**
    * 端口号可选1025-7041、7043-22221、22223-65534，创建后支持更改
    */
    private Integer port;

    /**
    * 引擎类型，默认值为2。 redis内存型:2；Redis容量型:3
    */
    private Integer engine;

    /**
    * 数据库版本：<br/>Redis企业集群版：4\.0、 5\.0、6\.0<br/> Redis社区标准版：4\.0、 5\.0、6\.0、7\.0
    */
    private String engineVersion;

    /**
    * 存储类型，默认为0。高性能内存:0、容量型存储：3
    */
    private Integer storeType;

    /**
    * 副本只读，默认值为2。 打开：1、关闭：2
    */
    private Integer enableReadOnly;

    /**
    * 购买个数，最大不超过10，默认1
    */
    private Integer purchaseCount;

    /**
    * 分片个数，默认值为1
    */
    private Integer shardNum;

    /**
    * 代理节点数，目前支持的取值：主从版：0<br>集群版：代理节点数=分片个数<br>集群版分片数为1时，代理节点数量为2
    */
    private Integer proxyNum;

    /**
    * 集群类型：<br/>企业版集群："cluster"<br/>主从版："master\_slave"<br>
    */
    private String clusterType;

    /**
    * 单分片存储空间,引擎类型为3，即为Redis容量型(原PegaDB)时传入
    */
    private Integer diskFlavor;

    /**
    * 存储类型:目前支持 "cds"
    */
    private String diskType;

    /**
    * vpcId，如果不提供则属于默认vpc<br>可通过调用查询VPC列表接口查询可用的VPC<br>如果传入该参数，则副本信息replicationInfo字段必传，并且副本信息中的子网需要是该vpcId所属子网
    */
    private String vpcId;

    /**
    * 副本信息。<br>需要创建多少副本，该数组就传多少项，数组中的一项代表一个副本<br>可用区和子网所属关系须一致<br>子网和vpcId所属关系须一致<br>主节点有且仅有一个<br>Redis和Redis容量型最多支持10副本<br>Redis集群版和Redis容量型最少2副本，Redis标准版支持单副本<br>可用区和子网只能是一对一的关系
    */
    private List<ReplicationMap> replicationInfo;

    /**
    * 按月付费或者按年付费 月是"month"，年是"year"
    */
    private String autoRenewTimeUnit;

    /**
    * 自动续费的时间 按月是1-9 按年是 1-3
    */
    private Integer autoRenewTime;

    /**
    * blb专属集群Id。该参数不传，默认为共享集群。
    */
    private String bgwGroupId;

    /**
    * 密码长度8～16位，至少包含字母、数字和特殊字符中两种。允许的特殊字符包括 $^\*\(\)\_\+\-=,密码需要加密传输，禁止明文传输，详情请参考[密码加密传输规范定义](SCS/API参考/通用说明.md#密码加密传输规范定义)
    */
    private String clientAuth;

    /**
    * 标签键值对列表
    */
    private List<Tag> tags;

    /**
    * 指定的参数模版ID
    */
    private String confTpl;

    /**
    * 资源分组ID。资源分组信息可通过 [资源管理接口](https://cloud.baidu.com/doc/ResManagement/s/Qlth2ic41)查询。
    */
    private String resourceGroupId;

    /**
    * 备份配置。格式："${备份周期};${备份时间};${备份时长}"。<br>备份周期取值参考：周一：'Mon',  周二：'Tue', 周三： 'Wed', 周四：'Thu',周五： 'Fri', 周六：'Sta', 周日：'Sun'。<br>备份时间为UTC时间，如16:00:00，北京时间为00:00:00。<br>备份时间：取值1-15
    */
    private String autoBackupConfig;

    /**
    * 部署集ID列表。建议仅传一个部署集ID，即此列表长度不能大于1。部署集ID通过[部署集列表接口](https://cloud.baidu.com/doc/SCS/s/dm423yimp)获取。
    */
    private List<String> deployIdList;

    public String getClientToken() {
        return clientToken;
    }

    public CreateAnInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateAnInstanceRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public CreateAnInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public CreateAnInstanceRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public CreateAnInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getEngine() {
        return engine;
    }

    public CreateAnInstanceRequest setEngine(Integer engine) {
        this.engine = engine;
        return this;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public CreateAnInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public CreateAnInstanceRequest setStoreType(Integer storeType) {
        this.storeType = storeType;
        return this;
    }

    public Integer getEnableReadOnly() {
        return enableReadOnly;
    }

    public CreateAnInstanceRequest setEnableReadOnly(Integer enableReadOnly) {
        this.enableReadOnly = enableReadOnly;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public CreateAnInstanceRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public Integer getShardNum() {
        return shardNum;
    }

    public CreateAnInstanceRequest setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public Integer getProxyNum() {
        return proxyNum;
    }

    public CreateAnInstanceRequest setProxyNum(Integer proxyNum) {
        this.proxyNum = proxyNum;
        return this;
    }

    public String getClusterType() {
        return clusterType;
    }

    public CreateAnInstanceRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public Integer getDiskFlavor() {
        return diskFlavor;
    }

    public CreateAnInstanceRequest setDiskFlavor(Integer diskFlavor) {
        this.diskFlavor = diskFlavor;
        return this;
    }

    public String getDiskType() {
        return diskType;
    }

    public CreateAnInstanceRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateAnInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public List<ReplicationMap> getReplicationInfo() {
        return replicationInfo;
    }

    public CreateAnInstanceRequest setReplicationInfo(List<ReplicationMap> replicationInfo) {
        this.replicationInfo = replicationInfo;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public CreateAnInstanceRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public CreateAnInstanceRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

    public String getBgwGroupId() {
        return bgwGroupId;
    }

    public CreateAnInstanceRequest setBgwGroupId(String bgwGroupId) {
        this.bgwGroupId = bgwGroupId;
        return this;
    }

    public String getClientAuth() {
        return clientAuth;
    }

    public CreateAnInstanceRequest setClientAuth(String clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateAnInstanceRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public String getConfTpl() {
        return confTpl;
    }

    public CreateAnInstanceRequest setConfTpl(String confTpl) {
        this.confTpl = confTpl;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateAnInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public String getAutoBackupConfig() {
        return autoBackupConfig;
    }

    public CreateAnInstanceRequest setAutoBackupConfig(String autoBackupConfig) {
        this.autoBackupConfig = autoBackupConfig;
        return this;
    }

    public List<String> getDeployIdList() {
        return deployIdList;
    }

    public CreateAnInstanceRequest setDeployIdList(List<String> deployIdList) {
        this.deployIdList = deployIdList;
        return this;
    }

}
