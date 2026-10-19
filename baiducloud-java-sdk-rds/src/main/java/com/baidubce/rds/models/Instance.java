package com.baidubce.rds.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Instance {
    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例短ID
     */
    private String instanceShortId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 数据库引擎类型。
     */
    private String engine;

    /**
     * 数据库引擎版本。
     */
    private String engineVersion;

    /**
     * 实例小版本
     */
    private String rdsMinorVersion;

    /**
     * 指定实例字符集有"utf8mb4","latin1","gbk","utf8"可选，默认为"utf8"（目前只支持mysql主实例）
     */
    private String characterSetName;

    /**
     * endpoint
     */
    private Endpoint endpoint;

    /**
     * 实例分类 。MASTER(主实例)，REPLICA（只读实例）,PROXY（代理实例）
     */
    private String instanceClass;

    /**
     * 分配内大小（单位：MB）
     */
    private Integer allocatedMemoryInMB;

    /**
     * 内存大小，单位是 GB。
     */
    private Integer allocatedMemoryInGB;

    /**
     * 实例内存（单位：GB）
     */
    private Double memoryCapacity;

    /**
     * 存储大小，单位是 GB。
     */
    private Integer allocatedStorageInGB;

    /**
     * 存储空间（单位：GB）
     */
    private Integer volumeCapacity;

    /**
     * 磁盘总大小（单位：GB）
     */
    private Integer totalStorageInGB;

    /**
     * 已经使用存储空间（单位：MB）
     */
    private Integer usedStorageInMB;

    /**
     * 已经使用存储空间（单位GB）
     */
    private Double usedStorageInGB;

    /**
     * 已用存储空间（单位GB）
     */
    private Double usedStorage;

    /**
     * CPU 个数。
     */
    private Integer cpuCount;

    /**
     * 实例类型，参考[实例类型](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E7%B1%BB%E5%9E%8B)
     */
    private String instanceType;

    /**
     * 主实例ID，如果为主实例则为空
     */
    private String sourceInstanceId;

    /**
     * 只读实例数量
     */
    private Integer readReplicaNum;

    /**
     * 只读实例名称的集合
     */
    private List<String> readReplica;

    /**
     * 实例状态，参见[实例状态表](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E7%8A%B6%E6%80%81)
     */
    private String instanceStatus;

    /**
     * 实例锁定状态：   unlock：解锁   lockExpiration：锁过期   lockDiskQuota：锁定磁盘配额
     */
    private String lockMode;

    /**
     * 外网访问功能状态，参考[公网状态表](/doc/RDS/s/9jwvz0wd3#%E5%85%AC%E7%BD%91%E8%AE%BF%E9%97%AE%E7%8A%B6%E6%80%81)
     */
    private String eipStatus;

    /**
     * 外网访问功能状态，参考[公网状态表](/doc/RDS/s/9jwvz0wd3#%E5%85%AC%E7%BD%91%E8%AE%BF%E9%97%AE%E7%8A%B6%E6%80%81)
     */
    private String publicAccessStatus;

    /**
     * 账号权限类型，取值是super或common super：读写账号  common：只读账号
     */
    private String superUserFlag;

    /**
     * 数据复制方式： async：异步复制 semi\_sync：半同步复制
     */
    private String replicationType;

    /**
     * 数据同步方式,参考[同步方式](/doc/RDS/s/9jwvz0wd3#%E5%90%8C%E6%AD%A5%E6%A8%A1%E5%BC%8F%E7%8A%B6%E6%80%81)
     */
    private String syncMode;

    /**
     * SQLServer备份恢复类型，非SQLServer实例返回null
     */
    private String sqlserverBrType;

    /**
     * backupPolicy
     */
    private SnapshotPolicy backupPolicy;

    /**
     * blbService
     */
    private BlbService blbService;

    /**
     * 是否可访问公网， true 可以，false不可以
     */
    private Boolean publiclyAccessible;

    /**
     * 实例创建时间，规范参考[时间与日期](/doc/RDS/s/9jwvz0wd3#%E6%97%B6%E9%97%B4%E4%B8%8E%E6%97%A5%E6%9C%9F)
     */
    private String instanceCreateTime;

    /**
     * 实例到期时间，规范参考[时间与日期](/doc/RDS/s/9jwvz0wd3#%E6%97%B6%E9%97%B4%E4%B8%8E%E6%97%A5%E6%9C%9F)
     */
    private String instanceExpireTime;

    /**
     * 付费方式，预付费：postpay，后付费：prepay
     */
    private String productType;

    /**
     * 付费方式， 预付费：Prepaid，后付费：Postpaid
     */
    private String paymentTiming;

    /**
     * topology
     */
    private Topology topology;

    /**
     * 实例的逻辑可用区名字 ,多个逗号分隔。如：zoneD,zoneE
     */
    private String azone;

    /**
     * 实例所属VPC的ID
     */
    private String vpcId;

    /**
     * 
     */
    private Map<String, String> subnetId;

    /**
     * 实例所在物理可用区信息，格式为 {zone: 值}
     */
    private Map<String, String> physicalZone;

    /**
     * 该实例的地域首字母。如bj
     */
    private String region;

    /**
     * 该实例的主实例的区域。如bj
     */
    private String sourceRegion;

    /**
     * 订单状态。有以下状态： AVAILABLE：运行中 CREATEING：创建中 CREATED：已创建 CREATE\_FAILED：创建失败 NEED\_PURCHASE：未支付 CANCELLED：取消支付
     */
    private String billingStatus;

    /**
     * 所属系列，single：单机基础版，normal：双机高可用版
     */
    private String applicationType;

    /**
     * 询价代理实例时，此值必填，表示代理节点个数。
     */
    private Integer nodeAmount;

    /**
     * 旧实例数量
     */
    private Integer oldInstance;

    /**
     * 在线状态，0：下线、1：上线
     */
    private Integer onlineStatus;

    /**
     * 是否单机实例，true：是，false：否
     */
    private Boolean isSingle;

    /**
     * dccHostIds
     */
    private DccHostInfo dccHostIds;

    /**
     * 主机类型，默认只有dcc
     */
    private Integer machineType;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 节点类型,默认为空，没有返回值
     */
    private String nodeType;

    /**
     * 维护开始时间，规范参考[时间与日期](/doc/RDS/s/9jwvz0wd3#%E6%97%B6%E9%97%B4%E4%B8%8E%E6%97%A5%E6%9C%9F)
     */
    private String repairStartTime;

    /**
     * 维护结束时间，规范参考[时间与日期](/doc/RDS/s/9jwvz0wd3#%E6%97%B6%E9%97%B4%E4%B8%8E%E6%97%A5%E6%9C%9F)
     */
    private String repairEndTime;

    /**
     * 分配状态： pendingRepair（待分配） processing（分配中） solved（已分配）
     */
    private String quotStatus;

    /**
     * nodeReadReplica
     */
    private RoleInfo nodeReadReplica;

    /**
     * nodeMaster
     */
    private RoleInfo nodeMaster;

    /**
     * nodeSlave
     */
    private RoleInfo nodeSlave;

    /**
     * nodeProxy
     */
    private RoleInfo nodeProxy;

    /**
     * 存储磁盘包括本地SSD磁盘（取值为：normal\_io）、增强型SSD云磁盘（取值为：cloud\_enha）、 高性能云磁盘（取值为：cloud\_high）、cloud\_nor（取值为: 通用型SSD）四种。
     */
    private String diskIoType;

    /**
     * 分组ID
     */
    private String groupId;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 透明数据加密状态：close：（关闭）、open（打开）
     */
    private String tdeStatus;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 如果bgwGroupExclusive为true，若创建实例时指定了专属集群ID，则将blb分配到指定的专属集群，如果不传按照默认情况
     */
    private String bgwGroupId;

    /**
     * 负载均衡集群属性，true表示指定专属集群，false表示使用共享集群。
     */
    private Boolean bgwGroupExclusive;

    /**
     * 只读组列表
     */
    private List<RoGroup> roGroupList;

    /**
     * 是否为异常只读组。true：是，false：不是；默认是false
     */
    private Boolean roGroupAbnormal;

    /**
     * 
     */
    private String diskType;

    /**
     * 
     */
    private String cdsType;

    /**
     * 维护时间窗口
     */
    private String maintainStartTime;

    /**
     * 维护时间窗口时长（单位:小时）
     */
    private Integer maintainDuration;

    /**
     * 维护时间窗口的持续时间
     */
    private String maintainPeriod;

    /**
     * 实例状态，参考[实例类型](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E7%B1%BB%E5%9E%8B)
     */
    private String instanceSubStatus;

    /**
     * 监控数据发送周期（单位：分钟）
     */
    private String bcmSendCycle;

    /**
     * 自动扩容磁盘大小（单位：GB）
     */
    private Integer autoResizeDisk;

    /**
     * 自动扩容CPU核数
     */
    private Integer autoResizeCpu;

    /**
     * 边缘区域
     */
    private String edgeRegion;

    /**
     * 边缘区域名称
     */
    private String edgeRegionName;

    /**
     * 边缘 VpcID
     */
    private String edgeVpcId;

    /**
     * 边缘子网ID
     */
    private String edgeSubnetId;

    /**
     * GTID模式类型
     */
    private Integer gtidType;

    /**
     * nodeMasterReadReplica
     */
    private RoleInfo nodeMasterReadReplica;

    /**
     * nodeBackupReadReplica
     */
    private RoleInfo nodeBackupReadReplica;

    /**
     * 高可用切换策略。0：立即切换，1：维护时间切换
     */
    private Integer haStrategy;

    /**
     * 是否开启数据库回收站功能
     */
    private Boolean isDBRSEnable;

    /**
     * 副本类型
     */
    private String replicaType;

    /**
     * 资源类型，如shared（共享）
     */
    private String resourceType;

    /**
     * 云磁盘是否加密。0：否
     */
    private Integer cdsEncrypt;

    /**
     * 云磁盘加密密钥ID
     */
    private String cdsEncryptKey;

    /**
     * 资源平台
     */
    private String resourcePlatform;

    /**
     * 区域位置
     */
    private String location;

    /**
     * 是否有从节，true：有、false：没有；默认是false
     */
    private Boolean hasSlave;

    /**
     * 过期日期，默认是0
     */
    private Integer expireDate;

    /**
     * 是否有代理，true：有、false：没有；默认是false
     */
    private Boolean hasProxy;

    /**
     * vpc名称
     */
    private String vpcName;

    /**
     * 资源，唯一序列ID
     */
    private String resourceUuid;

    /**
     * 分组标签
     */
    private List<Tag> tags;

    /**
     * 相关任务， 如自动续费（目前只有这个）
     */
    private String task;

    /**
     * 相关联的计费变更订单的类型to\_prepay、 to\_postpay两种
     */
    private String orderStatus;

    /**
     * VPC的IP地址及子网掩码
     */
    private String vpcCidr;

    /**
     * 实例的可用区名称，数组列表
     */
    private List<String> zoneNames;

    /**
     * dcc主机对象
     */
    private List<MachinePO> dccHosts;

    /**
     * 不传值的话默认为双机版，传 Singleton 则指定为单机版。
     */
    private String category;

    /**
     * 实例名称，只给iam的实例列表接口使用，其他接口不要用
     */
    private String name;

    /**
     * resourceGroup
     */
    private ResourceGroupsDetailFull resourceGroup;

    /**
     * 资源分组ID
     */
    private String resourceGroupId;

    /**
     * 资源分组名称
     */
    private String resourceGroupName;

    /**
     * 是否对代理节点计费
     */
    private Boolean isChargeProxy;

    /**
     * 是否单机实例（内部字段）
     */
    private Boolean single;

    public Instance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Instance setInstanceShortId(String instanceShortId) {
        this.instanceShortId = instanceShortId;
        return this;
    }

    public String getInstanceShortId() {
        return this.instanceShortId;
    }

    public Instance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public Instance setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngine() {
        return this.engine;
    }

    public Instance setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public Instance setRdsMinorVersion(String rdsMinorVersion) {
        this.rdsMinorVersion = rdsMinorVersion;
        return this;
    }

    public String getRdsMinorVersion() {
        return this.rdsMinorVersion;
    }

    public Instance setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public Instance setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    public Instance setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    public String getInstanceClass() {
        return this.instanceClass;
    }

    public Instance setAllocatedMemoryInMB(Integer allocatedMemoryInMB) {
        this.allocatedMemoryInMB = allocatedMemoryInMB;
        return this;
    }

    public Integer getAllocatedMemoryInMB() {
        return this.allocatedMemoryInMB;
    }

    public Instance setAllocatedMemoryInGB(Integer allocatedMemoryInGB) {
        this.allocatedMemoryInGB = allocatedMemoryInGB;
        return this;
    }

    public Integer getAllocatedMemoryInGB() {
        return this.allocatedMemoryInGB;
    }

    public Instance setMemoryCapacity(Double memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }

    public Double getMemoryCapacity() {
        return this.memoryCapacity;
    }

    public Instance setAllocatedStorageInGB(Integer allocatedStorageInGB) {
        this.allocatedStorageInGB = allocatedStorageInGB;
        return this;
    }

    public Integer getAllocatedStorageInGB() {
        return this.allocatedStorageInGB;
    }

    public Instance setVolumeCapacity(Integer volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
        return this;
    }

    public Integer getVolumeCapacity() {
        return this.volumeCapacity;
    }

    public Instance setTotalStorageInGB(Integer totalStorageInGB) {
        this.totalStorageInGB = totalStorageInGB;
        return this;
    }

    public Integer getTotalStorageInGB() {
        return this.totalStorageInGB;
    }

    public Instance setUsedStorageInMB(Integer usedStorageInMB) {
        this.usedStorageInMB = usedStorageInMB;
        return this;
    }

    public Integer getUsedStorageInMB() {
        return this.usedStorageInMB;
    }

    public Instance setUsedStorageInGB(Double usedStorageInGB) {
        this.usedStorageInGB = usedStorageInGB;
        return this;
    }

    public Double getUsedStorageInGB() {
        return this.usedStorageInGB;
    }

    public Instance setUsedStorage(Double usedStorage) {
        this.usedStorage = usedStorage;
        return this;
    }

    public Double getUsedStorage() {
        return this.usedStorage;
    }

    public Instance setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public Instance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public Instance setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public Instance setReadReplicaNum(Integer readReplicaNum) {
        this.readReplicaNum = readReplicaNum;
        return this;
    }

    public Integer getReadReplicaNum() {
        return this.readReplicaNum;
    }

    public Instance setReadReplica(List<String> readReplica) {
        this.readReplica = readReplica;
        return this;
    }

    public List<String> getReadReplica() {
        return this.readReplica;
    }

    public Instance setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public Instance setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    public String getLockMode() {
        return this.lockMode;
    }

    public Instance setEipStatus(String eipStatus) {
        this.eipStatus = eipStatus;
        return this;
    }

    public String getEipStatus() {
        return this.eipStatus;
    }

    public Instance setPublicAccessStatus(String publicAccessStatus) {
        this.publicAccessStatus = publicAccessStatus;
        return this;
    }

    public String getPublicAccessStatus() {
        return this.publicAccessStatus;
    }

    public Instance setSuperUserFlag(String superUserFlag) {
        this.superUserFlag = superUserFlag;
        return this;
    }

    public String getSuperUserFlag() {
        return this.superUserFlag;
    }

    public Instance setReplicationType(String replicationType) {
        this.replicationType = replicationType;
        return this;
    }

    public String getReplicationType() {
        return this.replicationType;
    }

    public Instance setSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    public String getSyncMode() {
        return this.syncMode;
    }

    public Instance setSqlserverBrType(String sqlserverBrType) {
        this.sqlserverBrType = sqlserverBrType;
        return this;
    }

    public String getSqlserverBrType() {
        return this.sqlserverBrType;
    }

    public Instance setBackupPolicy(SnapshotPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public SnapshotPolicy getBackupPolicy() {
        return this.backupPolicy;
    }

    public Instance setBlbService(BlbService blbService) {
        this.blbService = blbService;
        return this;
    }

    public BlbService getBlbService() {
        return this.blbService;
    }

    public Instance setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    public Instance setInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    public String getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    public Instance setInstanceExpireTime(String instanceExpireTime) {
        this.instanceExpireTime = instanceExpireTime;
        return this;
    }

    public String getInstanceExpireTime() {
        return this.instanceExpireTime;
    }

    public Instance setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getProductType() {
        return this.productType;
    }

    public Instance setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public Instance setTopology(Topology topology) {
        this.topology = topology;
        return this;
    }

    public Topology getTopology() {
        return this.topology;
    }

    public Instance setAzone(String azone) {
        this.azone = azone;
        return this;
    }

    public String getAzone() {
        return this.azone;
    }

    public Instance setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Instance setSubnetId(Map<String, String> subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public Map<String, String> getSubnetId() {
        return this.subnetId;
    }

    public Instance setPhysicalZone(Map<String, String> physicalZone) {
        this.physicalZone = physicalZone;
        return this;
    }

    public Map<String, String> getPhysicalZone() {
        return this.physicalZone;
    }

    public Instance setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public Instance setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public Instance setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
        return this;
    }

    public String getBillingStatus() {
        return this.billingStatus;
    }

    public Instance setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    public String getApplicationType() {
        return this.applicationType;
    }

    public Instance setNodeAmount(Integer nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }

    public Integer getNodeAmount() {
        return this.nodeAmount;
    }

    public Instance setOldInstance(Integer oldInstance) {
        this.oldInstance = oldInstance;
        return this;
    }

    public Integer getOldInstance() {
        return this.oldInstance;
    }

    public Instance setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    public Integer getOnlineStatus() {
        return this.onlineStatus;
    }

    public Instance setIsSingle(Boolean isSingle) {
        this.isSingle = isSingle;
        return this;
    }

    public Boolean getIsSingle() {
        return this.isSingle;
    }

    public Instance setDccHostIds(DccHostInfo dccHostIds) {
        this.dccHostIds = dccHostIds;
        return this;
    }

    public DccHostInfo getDccHostIds() {
        return this.dccHostIds;
    }

    public Instance setMachineType(Integer machineType) {
        this.machineType = machineType;
        return this;
    }

    public Integer getMachineType() {
        return this.machineType;
    }

    public Instance setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Instance setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public Instance setRepairStartTime(String repairStartTime) {
        this.repairStartTime = repairStartTime;
        return this;
    }

    public String getRepairStartTime() {
        return this.repairStartTime;
    }

    public Instance setRepairEndTime(String repairEndTime) {
        this.repairEndTime = repairEndTime;
        return this;
    }

    public String getRepairEndTime() {
        return this.repairEndTime;
    }

    public Instance setQuotStatus(String quotStatus) {
        this.quotStatus = quotStatus;
        return this;
    }

    public String getQuotStatus() {
        return this.quotStatus;
    }

    public Instance setNodeReadReplica(RoleInfo nodeReadReplica) {
        this.nodeReadReplica = nodeReadReplica;
        return this;
    }

    public RoleInfo getNodeReadReplica() {
        return this.nodeReadReplica;
    }

    public Instance setNodeMaster(RoleInfo nodeMaster) {
        this.nodeMaster = nodeMaster;
        return this;
    }

    public RoleInfo getNodeMaster() {
        return this.nodeMaster;
    }

    public Instance setNodeSlave(RoleInfo nodeSlave) {
        this.nodeSlave = nodeSlave;
        return this;
    }

    public RoleInfo getNodeSlave() {
        return this.nodeSlave;
    }

    public Instance setNodeProxy(RoleInfo nodeProxy) {
        this.nodeProxy = nodeProxy;
        return this;
    }

    public RoleInfo getNodeProxy() {
        return this.nodeProxy;
    }

    public Instance setDiskIoType(String diskIoType) {
        this.diskIoType = diskIoType;
        return this;
    }

    public String getDiskIoType() {
        return this.diskIoType;
    }

    public Instance setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public Instance setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Instance setTdeStatus(String tdeStatus) {
        this.tdeStatus = tdeStatus;
        return this;
    }

    public String getTdeStatus() {
        return this.tdeStatus;
    }

    public Instance setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public Instance setBgwGroupId(String bgwGroupId) {
        this.bgwGroupId = bgwGroupId;
        return this;
    }

    public String getBgwGroupId() {
        return this.bgwGroupId;
    }

    public Instance setBgwGroupExclusive(Boolean bgwGroupExclusive) {
        this.bgwGroupExclusive = bgwGroupExclusive;
        return this;
    }

    public Boolean getBgwGroupExclusive() {
        return this.bgwGroupExclusive;
    }

    public Instance setRoGroupList(List<RoGroup> roGroupList) {
        this.roGroupList = roGroupList;
        return this;
    }

    public List<RoGroup> getRoGroupList() {
        return this.roGroupList;
    }

    public Instance setRoGroupAbnormal(Boolean roGroupAbnormal) {
        this.roGroupAbnormal = roGroupAbnormal;
        return this;
    }

    public Boolean getRoGroupAbnormal() {
        return this.roGroupAbnormal;
    }

    public Instance setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    public String getDiskType() {
        return this.diskType;
    }

    public Instance setCdsType(String cdsType) {
        this.cdsType = cdsType;
        return this;
    }

    public String getCdsType() {
        return this.cdsType;
    }

    public Instance setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }

    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public Instance setMaintainDuration(Integer maintainDuration) {
        this.maintainDuration = maintainDuration;
        return this;
    }

    public Integer getMaintainDuration() {
        return this.maintainDuration;
    }

    public Instance setMaintainPeriod(String maintainPeriod) {
        this.maintainPeriod = maintainPeriod;
        return this;
    }

    public String getMaintainPeriod() {
        return this.maintainPeriod;
    }

    public Instance setInstanceSubStatus(String instanceSubStatus) {
        this.instanceSubStatus = instanceSubStatus;
        return this;
    }

    public String getInstanceSubStatus() {
        return this.instanceSubStatus;
    }

    public Instance setBcmSendCycle(String bcmSendCycle) {
        this.bcmSendCycle = bcmSendCycle;
        return this;
    }

    public String getBcmSendCycle() {
        return this.bcmSendCycle;
    }

    public Instance setAutoResizeDisk(Integer autoResizeDisk) {
        this.autoResizeDisk = autoResizeDisk;
        return this;
    }

    public Integer getAutoResizeDisk() {
        return this.autoResizeDisk;
    }

    public Instance setAutoResizeCpu(Integer autoResizeCpu) {
        this.autoResizeCpu = autoResizeCpu;
        return this;
    }

    public Integer getAutoResizeCpu() {
        return this.autoResizeCpu;
    }

    public Instance setEdgeRegion(String edgeRegion) {
        this.edgeRegion = edgeRegion;
        return this;
    }

    public String getEdgeRegion() {
        return this.edgeRegion;
    }

    public Instance setEdgeRegionName(String edgeRegionName) {
        this.edgeRegionName = edgeRegionName;
        return this;
    }

    public String getEdgeRegionName() {
        return this.edgeRegionName;
    }

    public Instance setEdgeVpcId(String edgeVpcId) {
        this.edgeVpcId = edgeVpcId;
        return this;
    }

    public String getEdgeVpcId() {
        return this.edgeVpcId;
    }

    public Instance setEdgeSubnetId(String edgeSubnetId) {
        this.edgeSubnetId = edgeSubnetId;
        return this;
    }

    public String getEdgeSubnetId() {
        return this.edgeSubnetId;
    }

    public Instance setGtidType(Integer gtidType) {
        this.gtidType = gtidType;
        return this;
    }

    public Integer getGtidType() {
        return this.gtidType;
    }

    public Instance setNodeMasterReadReplica(RoleInfo nodeMasterReadReplica) {
        this.nodeMasterReadReplica = nodeMasterReadReplica;
        return this;
    }

    public RoleInfo getNodeMasterReadReplica() {
        return this.nodeMasterReadReplica;
    }

    public Instance setNodeBackupReadReplica(RoleInfo nodeBackupReadReplica) {
        this.nodeBackupReadReplica = nodeBackupReadReplica;
        return this;
    }

    public RoleInfo getNodeBackupReadReplica() {
        return this.nodeBackupReadReplica;
    }

    public Instance setHaStrategy(Integer haStrategy) {
        this.haStrategy = haStrategy;
        return this;
    }

    public Integer getHaStrategy() {
        return this.haStrategy;
    }

    public Instance setIsDBRSEnable(Boolean isDBRSEnable) {
        this.isDBRSEnable = isDBRSEnable;
        return this;
    }

    public Boolean getIsDBRSEnable() {
        return this.isDBRSEnable;
    }

    public Instance setReplicaType(String replicaType) {
        this.replicaType = replicaType;
        return this;
    }

    public String getReplicaType() {
        return this.replicaType;
    }

    public Instance setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public Instance setCdsEncrypt(Integer cdsEncrypt) {
        this.cdsEncrypt = cdsEncrypt;
        return this;
    }

    public Integer getCdsEncrypt() {
        return this.cdsEncrypt;
    }

    public Instance setCdsEncryptKey(String cdsEncryptKey) {
        this.cdsEncryptKey = cdsEncryptKey;
        return this;
    }

    public String getCdsEncryptKey() {
        return this.cdsEncryptKey;
    }

    public Instance setResourcePlatform(String resourcePlatform) {
        this.resourcePlatform = resourcePlatform;
        return this;
    }

    public String getResourcePlatform() {
        return this.resourcePlatform;
    }

    public Instance setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getLocation() {
        return this.location;
    }

    public Instance setHasSlave(Boolean hasSlave) {
        this.hasSlave = hasSlave;
        return this;
    }

    public Boolean getHasSlave() {
        return this.hasSlave;
    }

    public Instance setExpireDate(Integer expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    public Integer getExpireDate() {
        return this.expireDate;
    }

    public Instance setHasProxy(Boolean hasProxy) {
        this.hasProxy = hasProxy;
        return this;
    }

    public Boolean getHasProxy() {
        return this.hasProxy;
    }

    public Instance setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public Instance setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
        return this;
    }

    public String getResourceUuid() {
        return this.resourceUuid;
    }

    public Instance setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public Instance setTask(String task) {
        this.task = task;
        return this;
    }

    public String getTask() {
        return this.task;
    }

    public Instance setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public Instance setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public String getVpcCidr() {
        return this.vpcCidr;
    }

    public Instance setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public List<String> getZoneNames() {
        return this.zoneNames;
    }

    public Instance setDccHosts(List<MachinePO> dccHosts) {
        this.dccHosts = dccHosts;
        return this;
    }

    public List<MachinePO> getDccHosts() {
        return this.dccHosts;
    }

    public Instance setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getCategory() {
        return this.category;
    }

    public Instance setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Instance setResourceGroup(ResourceGroupsDetailFull resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    public ResourceGroupsDetailFull getResourceGroup() {
        return this.resourceGroup;
    }

    public Instance setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public Instance setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public Instance setIsChargeProxy(Boolean isChargeProxy) {
        this.isChargeProxy = isChargeProxy;
        return this;
    }

    public Boolean getIsChargeProxy() {
        return this.isChargeProxy;
    }

    public Instance setSingle(Boolean single) {
        this.single = single;
        return this;
    }

    public Boolean getSingle() {
        return this.single;
    }

    @Override
    public String toString() {
        return "Instance{" + "instanceId=" + instanceId + "\n" + "instanceShortId=" + instanceShortId + "\n" + "instanceName=" + instanceName + "\n" + "engine=" + engine + "\n"
                + "engineVersion=" + engineVersion + "\n" + "rdsMinorVersion=" + rdsMinorVersion + "\n" + "characterSetName=" + characterSetName + "\n" + "endpoint=" + endpoint
                + "\n" + "instanceClass=" + instanceClass + "\n" + "allocatedMemoryInMB=" + allocatedMemoryInMB + "\n" + "allocatedMemoryInGB=" + allocatedMemoryInGB + "\n"
                + "memoryCapacity=" + memoryCapacity + "\n" + "allocatedStorageInGB=" + allocatedStorageInGB + "\n" + "volumeCapacity=" + volumeCapacity + "\n"
                + "totalStorageInGB=" + totalStorageInGB + "\n" + "usedStorageInMB=" + usedStorageInMB + "\n" + "usedStorageInGB=" + usedStorageInGB + "\n" + "usedStorage="
                + usedStorage + "\n" + "cpuCount=" + cpuCount + "\n" + "instanceType=" + instanceType + "\n" + "sourceInstanceId=" + sourceInstanceId + "\n" + "readReplicaNum="
                + readReplicaNum + "\n" + "readReplica=" + readReplica + "\n" + "instanceStatus=" + instanceStatus + "\n" + "lockMode=" + lockMode + "\n" + "eipStatus="
                + eipStatus + "\n" + "publicAccessStatus=" + publicAccessStatus + "\n" + "superUserFlag=" + superUserFlag + "\n" + "replicationType=" + replicationType + "\n"
                + "syncMode=" + syncMode + "\n" + "sqlserverBrType=" + sqlserverBrType + "\n" + "backupPolicy=" + backupPolicy + "\n" + "blbService=" + blbService + "\n"
                + "publiclyAccessible=" + publiclyAccessible + "\n" + "instanceCreateTime=" + instanceCreateTime + "\n" + "instanceExpireTime=" + instanceExpireTime + "\n"
                + "productType=" + productType + "\n" + "paymentTiming=" + paymentTiming + "\n" + "topology=" + topology + "\n" + "azone=" + azone + "\n" + "vpcId=" + vpcId + "\n"
                + "subnetId=" + subnetId + "\n" + "physicalZone=" + physicalZone + "\n" + "region=" + region + "\n" + "sourceRegion=" + sourceRegion + "\n" + "billingStatus="
                + billingStatus + "\n" + "applicationType=" + applicationType + "\n" + "nodeAmount=" + nodeAmount + "\n" + "oldInstance=" + oldInstance + "\n" + "onlineStatus="
                + onlineStatus + "\n" + "isSingle=" + isSingle + "\n" + "dccHostIds=" + dccHostIds + "\n" + "machineType=" + machineType + "\n" + "weight=" + weight + "\n"
                + "nodeType=" + nodeType + "\n" + "repairStartTime=" + repairStartTime + "\n" + "repairEndTime=" + repairEndTime + "\n" + "quotStatus=" + quotStatus + "\n"
                + "nodeReadReplica=" + nodeReadReplica + "\n" + "nodeMaster=" + nodeMaster + "\n" + "nodeSlave=" + nodeSlave + "\n" + "nodeProxy=" + nodeProxy + "\n"
                + "diskIoType=" + diskIoType + "\n" + "groupId=" + groupId + "\n" + "groupName=" + groupName + "\n" + "tdeStatus=" + tdeStatus + "\n" + "userId=" + userId + "\n"
                + "bgwGroupId=" + bgwGroupId + "\n" + "bgwGroupExclusive=" + bgwGroupExclusive + "\n" + "roGroupList=" + roGroupList + "\n" + "roGroupAbnormal=" + roGroupAbnormal
                + "\n" + "diskType=" + diskType + "\n" + "cdsType=" + cdsType + "\n" + "maintainStartTime=" + maintainStartTime + "\n" + "maintainDuration=" + maintainDuration
                + "\n" + "maintainPeriod=" + maintainPeriod + "\n" + "instanceSubStatus=" + instanceSubStatus + "\n" + "bcmSendCycle=" + bcmSendCycle + "\n" + "autoResizeDisk="
                + autoResizeDisk + "\n" + "autoResizeCpu=" + autoResizeCpu + "\n" + "edgeRegion=" + edgeRegion + "\n" + "edgeRegionName=" + edgeRegionName + "\n" + "edgeVpcId="
                + edgeVpcId + "\n" + "edgeSubnetId=" + edgeSubnetId + "\n" + "gtidType=" + gtidType + "\n" + "nodeMasterReadReplica=" + nodeMasterReadReplica + "\n"
                + "nodeBackupReadReplica=" + nodeBackupReadReplica + "\n" + "haStrategy=" + haStrategy + "\n" + "isDBRSEnable=" + isDBRSEnable + "\n" + "replicaType="
                + replicaType + "\n" + "resourceType=" + resourceType + "\n" + "cdsEncrypt=" + cdsEncrypt + "\n" + "cdsEncryptKey=" + cdsEncryptKey + "\n" + "resourcePlatform="
                + resourcePlatform + "\n" + "location=" + location + "\n" + "hasSlave=" + hasSlave + "\n" + "expireDate=" + expireDate + "\n" + "hasProxy=" + hasProxy + "\n"
                + "vpcName=" + vpcName + "\n" + "resourceUuid=" + resourceUuid + "\n" + "tags=" + tags + "\n" + "task=" + task + "\n" + "orderStatus=" + orderStatus + "\n"
                + "vpcCidr=" + vpcCidr + "\n" + "zoneNames=" + zoneNames + "\n" + "dccHosts=" + dccHosts + "\n" + "category=" + category + "\n" + "name=" + name + "\n"
                + "resourceGroup=" + resourceGroup + "\n" + "resourceGroupId=" + resourceGroupId + "\n" + "resourceGroupName=" + resourceGroupName + "\n" + "isChargeProxy="
                + isChargeProxy + "\n" + "single=" + single + "\n" + "}";
    }

}