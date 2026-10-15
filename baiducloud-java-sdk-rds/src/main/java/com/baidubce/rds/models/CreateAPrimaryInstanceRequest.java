package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAPrimaryInstanceRequest extends BaseBceRequest {

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
    * 批量创建云数据库 RDS 实例个数, 最大不超过10；默认1
    */
    private Integer purchaseCount;

    /**
    * 1）用户自定义实例名； 2）允许小写字母、数字； 3）长度限制为1~64； 4) 默认命名规则:{engine} + {engineVersion}
    */
    private String instanceName;

    /**
    * 数据库引擎： MySQL 、SQLServer 、PostgreSQL。[详情参考](/doc/RDS/s/9jwvz0wd3#%E5%BC%95%E6%93%8E%E7%B1%BB%E5%9E%8B)
    */
    private String engine;

    /**
    * 数据库版本： MySQL：5.5/5.6/5.7/8.0 SQLServer：2008r2/2012sp3/2016sp1/2017sp1 PostgreSQL：10/11/12/13/14
    */
    private String engineVersion;

    /**
    * 所属系列： Singleton：单机基础版、Standard：双机高可用版。 默认Standard。[详情参考](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E8%B4%AD%E4%B9%B0%E7%B3%BB%E5%88%97)
    */
    private String category;

    /**
    * CPU核数。[取值参考](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E5%8F%AF%E9%80%89%E5%A5%97%E9%A4%90)
    */
    private Integer cpuCount;

    /**
    * 套餐内存大小，单位GB。[取值参考](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E5%8F%AF%E9%80%89%E5%A5%97%E9%A4%90)
    */
    private Integer memoryCapacity;

    /**
    * 套餐磁盘大小，单位GB，每5G递增。[范围参考](/doc/RDS/s/9jwvz0wd3#%E5%AE%9E%E4%BE%8B%E5%8F%AF%E9%80%89%E5%A5%97%E9%A4%90)
    */
    private Integer volumeCapacity;

    /**
    * 磁盘类型： normal\_io : 本地盘ssd磁盘 cloud\_high : 高性能云磁盘 cloud\_nor : 通用型SSD cloud\_enha: 增强型SSD
    */
    private String diskIoType;

    /**
    * 指定zone信息，默认为空，由系统自动选择，可通过调用[查询可用区列表](/doc/RDS/s/zka65zqz2)接口查询可用区列表。zoneName命名规范是小写的“国家-region-可用区序列"，例如北京可用区A为"cn-bj-a"。
    */
    private List<String> zoneNames;

    /**
    * 默认为空，代表bcm实例组名称
    */
    private String bcmGroupName;

    /**
    * vpc，如果不提供则属于默认vpc。可通过调用 [查询VPC列表](/doc/VPC/s/wjwvyub23)接口查询可用的VPC
    */
    private String vpcId;

    /**
    * 是否进行直接支付，默认false，设置为直接支付的变配订单会直接扣款，不需要在走支付逻辑
    */
    private Boolean isDirectPay;

    /**
    * vpc内，每个可用区的subnetId；如果不是默认vpc则必须指定 subnetId。创建集群版时如果主备所属可用区子网一致，此处数组只需传一项；可通过调用[查询子网列表](/doc/RDS/s/Wka66184u)接口查询子网列表。
    */
    private List<SubnetMap> subnets;

    /**
    * 实例绑定的标签信息
    */
    private List<Tag> tags;

    /**
    * 如果bgwGroupExclusive为true，若创建实例时指定了专属集群ID，则将blb分配到指定的专属集群，如果不传按照默认情况
    */
    private String bgwGroupId;

    /**
    * 负载均衡集群属性，true表示指定专属集群，false表示使用共享集群
    */
    private Boolean bgwGroupExclusive;

    /**
    * 指定实例字符集，有"utf8mb4","latin1","gbk","utf8"可选，默认为"utf8"（目前只支持mysql主实例）
    */
    private String characterSetName;

    /**
    * 自动续费单位（"year";"month"）
    */
    private String autoRenewTimeUnit;

    /**
    * 自动续费时长（续费单位为year 不大于3，续费单位为month 不大于9）
    */
    private Integer autoRenewTime;

    /**
    * 表名是否区分大小写。默认为0，表示大小写敏感，区分大小写；传1表示不区分大小写
    */
    private Integer lowerCaseTableNames;

    /**
    * 参数模板ID
    */
    private String parameterTemplateId;

    /**
    * RDS实例访问入口BLB的ovip，传该参数且值非空，会根据该值为blb的ovip去申请blb，否则申请blb随机分配ip
    */
    private String ovip;

    /**
    * RDS实例访问入口BLB的端口，传该参数且值非空，会根据该值为blb的listener port去申请blb，否则默认3306，端口取值范围：1024-65535
    */
    private Integer entryPort;

    /**
    * 数据复制方式。异步复制：async，半同步复制：semi\_sync
    */
    private String replicationType;

    /**
    * 资源分组ID。例如：RESG-bKMxbExtnoG
    */
    private String resourceGroupId;

    /**
    * initialDataReference
    */
    private InitialDataReference initialDataReference;

    /**
    * 库表恢复到新实例，恢复的库表信息
    */
    private List<RecoveryToSourceInstanceModel> data;

    /**
    * MySQL主角色ID，传入实例的MySQL大版本需要和当前创建参数里的MySQL大版本保持一致，指定了这个参数后新建实例的MySQL小版本会和指定实例的MySQL小版本保持一致
    */
    private String leaderInstanceId;

    /**
    * 实例类型，支持exclusive/shared，默认exclusive。exclusive表示独享型，shared表示通用型
    */
    private String resourceType;

    public String getClientToken() {
        return clientToken;
    }

    public CreateAPrimaryInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateAPrimaryInstanceRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public CreateAPrimaryInstanceRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public CreateAPrimaryInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getEngine() {
        return engine;
    }

    public CreateAPrimaryInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public CreateAPrimaryInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CreateAPrimaryInstanceRequest setCategory(String category) {
        this.category = category;
        return this;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public CreateAPrimaryInstanceRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getMemoryCapacity() {
        return memoryCapacity;
    }

    public CreateAPrimaryInstanceRequest setMemoryCapacity(Integer memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }

    public Integer getVolumeCapacity() {
        return volumeCapacity;
    }

    public CreateAPrimaryInstanceRequest setVolumeCapacity(Integer volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
        return this;
    }

    public String getDiskIoType() {
        return diskIoType;
    }

    public CreateAPrimaryInstanceRequest setDiskIoType(String diskIoType) {
        this.diskIoType = diskIoType;
        return this;
    }

    public List<String> getZoneNames() {
        return zoneNames;
    }

    public CreateAPrimaryInstanceRequest setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public String getBcmGroupName() {
        return bcmGroupName;
    }

    public CreateAPrimaryInstanceRequest setBcmGroupName(String bcmGroupName) {
        this.bcmGroupName = bcmGroupName;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateAPrimaryInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public Boolean getIsDirectPay() {
        return isDirectPay;
    }

    public CreateAPrimaryInstanceRequest setIsDirectPay(Boolean isDirectPay) {
        this.isDirectPay = isDirectPay;
        return this;
    }

    public List<SubnetMap> getSubnets() {
        return subnets;
    }

    public CreateAPrimaryInstanceRequest setSubnets(List<SubnetMap> subnets) {
        this.subnets = subnets;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateAPrimaryInstanceRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public String getBgwGroupId() {
        return bgwGroupId;
    }

    public CreateAPrimaryInstanceRequest setBgwGroupId(String bgwGroupId) {
        this.bgwGroupId = bgwGroupId;
        return this;
    }

    public Boolean getBgwGroupExclusive() {
        return bgwGroupExclusive;
    }

    public CreateAPrimaryInstanceRequest setBgwGroupExclusive(Boolean bgwGroupExclusive) {
        this.bgwGroupExclusive = bgwGroupExclusive;
        return this;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public CreateAPrimaryInstanceRequest setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public CreateAPrimaryInstanceRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public CreateAPrimaryInstanceRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

    public Integer getLowerCaseTableNames() {
        return lowerCaseTableNames;
    }

    public CreateAPrimaryInstanceRequest setLowerCaseTableNames(Integer lowerCaseTableNames) {
        this.lowerCaseTableNames = lowerCaseTableNames;
        return this;
    }

    public String getParameterTemplateId() {
        return parameterTemplateId;
    }

    public CreateAPrimaryInstanceRequest setParameterTemplateId(String parameterTemplateId) {
        this.parameterTemplateId = parameterTemplateId;
        return this;
    }

    public String getOvip() {
        return ovip;
    }

    public CreateAPrimaryInstanceRequest setOvip(String ovip) {
        this.ovip = ovip;
        return this;
    }

    public Integer getEntryPort() {
        return entryPort;
    }

    public CreateAPrimaryInstanceRequest setEntryPort(Integer entryPort) {
        this.entryPort = entryPort;
        return this;
    }

    public String getReplicationType() {
        return replicationType;
    }

    public CreateAPrimaryInstanceRequest setReplicationType(String replicationType) {
        this.replicationType = replicationType;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateAPrimaryInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public InitialDataReference getInitialDataReference() {
        return initialDataReference;
    }

    public CreateAPrimaryInstanceRequest setInitialDataReference(InitialDataReference initialDataReference) {
        this.initialDataReference = initialDataReference;
        return this;
    }

    public List<RecoveryToSourceInstanceModel> getData() {
        return data;
    }

    public CreateAPrimaryInstanceRequest setData(List<RecoveryToSourceInstanceModel> data) {
        this.data = data;
        return this;
    }

    public String getLeaderInstanceId() {
        return leaderInstanceId;
    }

    public CreateAPrimaryInstanceRequest setLeaderInstanceId(String leaderInstanceId) {
        this.leaderInstanceId = leaderInstanceId;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public CreateAPrimaryInstanceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

}
