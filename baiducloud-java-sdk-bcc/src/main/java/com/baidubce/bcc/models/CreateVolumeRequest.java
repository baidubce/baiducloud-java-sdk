package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVolumeRequest extends BaseBceRequest {

    /**
    * 指定可用区信息，默认为空，由系统自动选择。
    */
    private String zoneName;

    /**
    * CDS磁盘存储类型，包括enhanced_ssd_pl0【增强型SSD_PL0】，enhanced_ssd_pl1【增强型SSD_PL1】，enhanced_ssd_pl2【增强型SSD_PL2】，enhanced_ssd_pl3【增强型SSD_PL3】，cloud_hp1 或 premium_ssd 【通用型SSD】 和 hp1 或 ssd
    * 【高性能云磁盘】 六种云盘类型，elastic_ephemeral_disk【弹性临时盘_标准型】一种弹性临时盘类型，默认 hp1。
    */
    private String storageType;

    /**
    * 增强型SSD_PL1、增强型SSD_PL2、增强型SSD_PL3，支持购买额外IO性能
    */
    private Integer cdsSizeInGB;

    /**
    * 磁盘的额外IO性能配置
    */
    private Integer cdsExtraIo;

    /**
    * 快照ID，支持从快照创建磁盘。当此参数存在时且不为空时，cdsSizeInGB参数将被忽略，此时非必需。
    */
    private String snapshotId;

    /**
    * 共享快照ID，支持从共享快照创建磁盘。当此参数存在时且不为空时，cdsSizeInGB参数将被忽略，此时非必需。
    */
    private String shareSnapshotId;

    /**
    * 是否开启磁盘释放保护
    */
    private String enableDeleteProtection;

    /**
    * 创建磁盘并挂载到该虚机上。预付费CDS必须挂载预付费BCC。注意：当创建预付费CDS并挂载到已经开通自动续费的BCC时，CDS磁盘自动开通自动续费且续费周期和BCC实例保持一致。
    */
    private String instanceId;

    /**
    * KMS密钥ID。
    */
    private String encryptKey;

    /**
    * 磁盘新的名称，自定义镜像名称，支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65。
    */
    private String name;

    /**
    * 磁盘新的描述信息，只支持中文、字母、数字、点号"."、空格、下划线"_"、中划线"-"、等号"="、英文逗号","、中文逗号"，"、冒号"："、斜杠 "/" 和中文句号"。"
    */
    private String description;

    /**
    * 按月付费或者按年付费 月是"month",年是"year"。注意：该参数已废弃，当创建预付费CDS并挂载到已经开通自动续费的BCC时，CDS磁盘自动开通自动续费且续费周期和BCC实例保持一致。
    */
    private String renewTimeUnit;

    /**
    * 自动续费的时间 按月是1-9 按年是 1-3。注意：该参数已废弃，当创建预付费CDS并挂载到已经开通自动续费的BCC时，CDS磁盘自动开通自动续费且续费周期和BCC实例保持一致。
    */
    private Integer renewTime;

    /**
    * 待创建CDS指定的标签是否需要和已有标签键进行关联，默认为false。注意值为true时要保证该标签键已存在
    */
    private Boolean relationTag;

    /**
    * 待绑定的标签列表
    */
    private List<TagModel> tags;

    /**
    * 资源组ID
    */
    private String resGroupId;

    /**
    * billing
    */
    private Billing billing;

    /**
    * CDS专属集群ID
    */
    private String clusterId;

    /**
    * 计费类型，付费方式，包括预支付（Prepaid）和后支付（Postpaid），该参数仅当instanceId非空，且对应实例类型为预付费时需要指定。如果instanceId为空，则创建后付费类型CDS；如果instanceId非空： 如果实例为预付费，需要指定chargeType；如果实例为后付费，创建后付费CDS
    */
    private String chargeType;

    /**
    * autoSnapshotPolicy
    */
    private AutoSnapshotPolicyModel autoSnapshotPolicy;

    /**
    * 磁盘随实例删除，计费方式为按量后付时生效，初始值为false，V2 API需要在释放实例时指定cdsAttributeActive参数为true才可生效
    */
    private Boolean deleteWithInstance;

    /**
    * 是否删除已有的自动快照
    */
    private Boolean deleteAutoSnapshot;

    /**
    * 批量创建的CDS磁盘的个数，必须为大于0的整数，单次创建不能超过5个。可选参数，缺省为1
    */
    private Integer purchaseCount;

    public String getZoneName() {
        return zoneName;
    }

    public CreateVolumeRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getStorageType() {
        return storageType;
    }

    public CreateVolumeRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public Integer getCdsSizeInGB() {
        return cdsSizeInGB;
    }

    public CreateVolumeRequest setCdsSizeInGB(Integer cdsSizeInGB) {
        this.cdsSizeInGB = cdsSizeInGB;
        return this;
    }

    public Integer getCdsExtraIo() {
        return cdsExtraIo;
    }

    public CreateVolumeRequest setCdsExtraIo(Integer cdsExtraIo) {
        this.cdsExtraIo = cdsExtraIo;
        return this;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public CreateVolumeRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getShareSnapshotId() {
        return shareSnapshotId;
    }

    public CreateVolumeRequest setShareSnapshotId(String shareSnapshotId) {
        this.shareSnapshotId = shareSnapshotId;
        return this;
    }

    public String getEnableDeleteProtection() {
        return enableDeleteProtection;
    }

    public CreateVolumeRequest setEnableDeleteProtection(String enableDeleteProtection) {
        this.enableDeleteProtection = enableDeleteProtection;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CreateVolumeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEncryptKey() {
        return encryptKey;
    }

    public CreateVolumeRequest setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateVolumeRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateVolumeRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getRenewTimeUnit() {
        return renewTimeUnit;
    }

    public CreateVolumeRequest setRenewTimeUnit(String renewTimeUnit) {
        this.renewTimeUnit = renewTimeUnit;
        return this;
    }

    public Integer getRenewTime() {
        return renewTime;
    }

    public CreateVolumeRequest setRenewTime(Integer renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    public Boolean getRelationTag() {
        return relationTag;
    }

    public CreateVolumeRequest setRelationTag(Boolean relationTag) {
        this.relationTag = relationTag;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateVolumeRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getResGroupId() {
        return resGroupId;
    }

    public CreateVolumeRequest setResGroupId(String resGroupId) {
        this.resGroupId = resGroupId;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateVolumeRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public CreateVolumeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getChargeType() {
        return chargeType;
    }

    public CreateVolumeRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    public AutoSnapshotPolicyModel getAutoSnapshotPolicy() {
        return autoSnapshotPolicy;
    }

    public CreateVolumeRequest setAutoSnapshotPolicy(AutoSnapshotPolicyModel autoSnapshotPolicy) {
        this.autoSnapshotPolicy = autoSnapshotPolicy;
        return this;
    }

    public Boolean getDeleteWithInstance() {
        return deleteWithInstance;
    }

    public CreateVolumeRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }

    public Boolean getDeleteAutoSnapshot() {
        return deleteAutoSnapshot;
    }

    public CreateVolumeRequest setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public CreateVolumeRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

}
