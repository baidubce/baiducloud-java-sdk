package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VolumeModel {
    /**
     * 磁盘ID（查询磁盘列表、查询磁盘详情返回）
     */
    private String id;

    /**
     * 磁盘类别，Ephemeral：弹性临时盘，Standard：非弹性临时盘（查询磁盘列表、查询磁盘详情返回、查询实例列表、查询指定实例详情）
     */
    private String diskCategory;

    /**
     * 挂载的实例服务类别，可选值包含BCC/HPAS（查询磁盘列表、查询磁盘详情返回）
     */
    private String productCategory;

    /**
     * 磁盘名称（查询磁盘列表、查询磁盘详情返回）
     */
    private String name;

    /**
     * 磁盘大小，单位是GB（查询磁盘列表、查询磁盘详情返回、查询实例列表、查询指定实例详情）
     */
    private Integer diskSizeInGB;

    /**
     * 额外性能（查询磁盘列表、查询磁盘详情返回）
     */
    private Integer cdsExtraIo;

    /**
     * 失败状态信息（查询磁盘列表、查询磁盘详情返回）
     */
    private String failureStatus;

    /**
     * 创建日期，符合BCE日期规范（查询磁盘列表、查询磁盘详情返回）
     */
    private String createTime;

    /**
     * 过期时间（查询磁盘列表、查询磁盘详情返回）
     */
    private String expireTime;

    /**
     * 磁盘状态（查询磁盘列表、查询磁盘详情返回）
     */
    private String status;

    /**
     * 共享快照ID，支持从共享快照创建磁盘。当此参数存在时且不为空时，cdsSizeInGB参数将被忽略，此时非必需。（查询磁盘列表、查询磁盘详情返回）
     */
    private String shareSnapshotId;

    /**
     * 是否开启磁盘释放保护（查询磁盘列表、查询磁盘详情返回）
     */
    private Boolean enableDeleteProtection;

    /**
     * EBC磁盘大小（查询磁盘列表返回）
     */
    private Integer ebcDiskSize;

    /**
     * 是否自动续费（查询磁盘列表、查询磁盘详情返回）
     */
    private Boolean enableAutoRenew;

    /**
     * 自动续费时间（查询磁盘列表、查询磁盘详情返回）
     */
    private Integer autoRenewTime;

    /**
     * 磁盘当前配置的标签（查询磁盘列表、查询磁盘详情返回）
     */
    private List<TagModel> tags;

    /**
     * 磁盘类型（查询磁盘列表、查询磁盘详情返回）
     */
    private String type;

    /**
     * 
     */
    private String storageType;

    /**
     * 是否为系统盘（查询磁盘列表、查询磁盘详情返回、查询实例列表、查询指定实例详情）
     */
    private Boolean isSystemVolume;

    /**
     * 描述信息（查询磁盘列表返回）
     */
    private String description;

    /**
     * 付费方式，包括Postpaid(按量付费)，Prepaid(包年包月)两种。（查询磁盘列表、查询磁盘详情返回）
     */
    private String paymentTiming;

    /**
     * 可用区信息（查询磁盘列表、查询磁盘详情返回）
     */
    private String zoneName;

    /**
     * CDS专属集群ID（查询磁盘列表、查询磁盘详情返回）
     */
    private String clusterId;

    /**
     * 是否加密（查询磁盘列表、查询磁盘详情返回）
     */
    private Boolean encrypted;

    /**
     * 磁盘随实例删除，仅后付费类型的数据盘返回（查询磁盘列表、查询磁盘详情返回）
     */
    private Boolean deleteWithInstance;

    /**
     * 自动快照随磁盘删除，任何类型的磁盘都会返回（查询磁盘列表、查询磁盘详情返回）
     */
    private Boolean deleteAutoSnapshot;

    /**
     * 挂载设备信息列表，磁盘未挂载时该值为空。（查询磁盘列表、查询磁盘详情返回）
     */
    private List<VolumeAttachmentModel> attachments;

    /**
     * 多挂载信息列表（查询磁盘列表、查询磁盘详情返回）
     */
    private List<VolumeMultiAttachInfo> multiAttachInfos;

    /**
     * 描述信息（查询磁盘详情返回）
     */
    private String desc;

    /**
     * 所在region（查询磁盘详情返回）
     */
    private String regionId;

    /**
     * 创建磁盘所用的快照id（查询磁盘详情返回）
     */
    private String sourceSnapshotId;

    /**
     * 磁盘当前具有的快照数量（查询磁盘详情返回）
     */
    private String snapshotNum;

    /**
     * 磁盘当前绑定的资源组（查询磁盘详情返回）
     */
    private List<GroupInfo> resGroupInfos;

    /**
     * autoSnapshotPolicy
     */
    private AutoSnapshotPolicyModel autoSnapshotPolicy;

    /**
     * 快照策略信息列表（查询磁盘详情返回）
     */
    private List<AutoSnapshotPolicyInfo> autoSnapshotPolicyInfos;

    /**
     * 加密密钥（查询磁盘详情返回）
     */
    private String encryptKey;

    /**
     * 加密密钥规格（查询磁盘详情返回）
     */
    private String encryptKeySpec;

    /**
     * 是否支持多挂载（查询指定实例详情）
     */
    private Boolean multiAttach;

    /**
     * 磁盘ID（查询实例列表、查询指定实例详情）
     */
    private String volumeId;

    public VolumeModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public VolumeModel setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }

    public String getDiskCategory() {
        return this.diskCategory;
    }

    public VolumeModel setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public VolumeModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public VolumeModel setDiskSizeInGB(Integer diskSizeInGB) {
        this.diskSizeInGB = diskSizeInGB;
        return this;
    }

    public Integer getDiskSizeInGB() {
        return this.diskSizeInGB;
    }

    public VolumeModel setCdsExtraIo(Integer cdsExtraIo) {
        this.cdsExtraIo = cdsExtraIo;
        return this;
    }

    public Integer getCdsExtraIo() {
        return this.cdsExtraIo;
    }

    public VolumeModel setFailureStatus(String failureStatus) {
        this.failureStatus = failureStatus;
        return this;
    }

    public String getFailureStatus() {
        return this.failureStatus;
    }

    public VolumeModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public VolumeModel setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public VolumeModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public VolumeModel setShareSnapshotId(String shareSnapshotId) {
        this.shareSnapshotId = shareSnapshotId;
        return this;
    }

    public String getShareSnapshotId() {
        return this.shareSnapshotId;
    }

    public VolumeModel setEnableDeleteProtection(Boolean enableDeleteProtection) {
        this.enableDeleteProtection = enableDeleteProtection;
        return this;
    }

    public Boolean getEnableDeleteProtection() {
        return this.enableDeleteProtection;
    }

    public VolumeModel setEbcDiskSize(Integer ebcDiskSize) {
        this.ebcDiskSize = ebcDiskSize;
        return this;
    }

    public Integer getEbcDiskSize() {
        return this.ebcDiskSize;
    }

    public VolumeModel setEnableAutoRenew(Boolean enableAutoRenew) {
        this.enableAutoRenew = enableAutoRenew;
        return this;
    }

    public Boolean getEnableAutoRenew() {
        return this.enableAutoRenew;
    }

    public VolumeModel setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

    public Integer getAutoRenewTime() {
        return this.autoRenewTime;
    }

    public VolumeModel setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    public VolumeModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public VolumeModel setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public VolumeModel setIsSystemVolume(Boolean isSystemVolume) {
        this.isSystemVolume = isSystemVolume;
        return this;
    }

    public Boolean getIsSystemVolume() {
        return this.isSystemVolume;
    }

    public VolumeModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public VolumeModel setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public VolumeModel setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public VolumeModel setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public VolumeModel setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public VolumeModel setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }

    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public VolumeModel setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }

    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    public VolumeModel setAttachments(List<VolumeAttachmentModel> attachments) {
        this.attachments = attachments;
        return this;
    }

    public List<VolumeAttachmentModel> getAttachments() {
        return this.attachments;
    }

    public VolumeModel setMultiAttachInfos(List<VolumeMultiAttachInfo> multiAttachInfos) {
        this.multiAttachInfos = multiAttachInfos;
        return this;
    }

    public List<VolumeMultiAttachInfo> getMultiAttachInfos() {
        return this.multiAttachInfos;
    }

    public VolumeModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public VolumeModel setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public VolumeModel setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    public String getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }

    public VolumeModel setSnapshotNum(String snapshotNum) {
        this.snapshotNum = snapshotNum;
        return this;
    }

    public String getSnapshotNum() {
        return this.snapshotNum;
    }

    public VolumeModel setResGroupInfos(List<GroupInfo> resGroupInfos) {
        this.resGroupInfos = resGroupInfos;
        return this;
    }

    public List<GroupInfo> getResGroupInfos() {
        return this.resGroupInfos;
    }

    public VolumeModel setAutoSnapshotPolicy(AutoSnapshotPolicyModel autoSnapshotPolicy) {
        this.autoSnapshotPolicy = autoSnapshotPolicy;
        return this;
    }

    public AutoSnapshotPolicyModel getAutoSnapshotPolicy() {
        return this.autoSnapshotPolicy;
    }

    public VolumeModel setAutoSnapshotPolicyInfos(List<AutoSnapshotPolicyInfo> autoSnapshotPolicyInfos) {
        this.autoSnapshotPolicyInfos = autoSnapshotPolicyInfos;
        return this;
    }

    public List<AutoSnapshotPolicyInfo> getAutoSnapshotPolicyInfos() {
        return this.autoSnapshotPolicyInfos;
    }

    public VolumeModel setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
        return this;
    }

    public String getEncryptKey() {
        return this.encryptKey;
    }

    public VolumeModel setEncryptKeySpec(String encryptKeySpec) {
        this.encryptKeySpec = encryptKeySpec;
        return this;
    }

    public String getEncryptKeySpec() {
        return this.encryptKeySpec;
    }

    public VolumeModel setMultiAttach(Boolean multiAttach) {
        this.multiAttach = multiAttach;
        return this;
    }

    public Boolean getMultiAttach() {
        return this.multiAttach;
    }

    public VolumeModel setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return this.volumeId;
    }

    @Override
    public String toString() {
        return "VolumeModel{" + "id=" + id + "\n" + "diskCategory=" + diskCategory + "\n" + "productCategory=" + productCategory + "\n" + "name=" + name + "\n" + "diskSizeInGB="
                + diskSizeInGB + "\n" + "cdsExtraIo=" + cdsExtraIo + "\n" + "failureStatus=" + failureStatus + "\n" + "createTime=" + createTime + "\n" + "expireTime="
                + expireTime + "\n" + "status=" + status + "\n" + "shareSnapshotId=" + shareSnapshotId + "\n" + "enableDeleteProtection=" + enableDeleteProtection + "\n"
                + "ebcDiskSize=" + ebcDiskSize + "\n" + "enableAutoRenew=" + enableAutoRenew + "\n" + "autoRenewTime=" + autoRenewTime + "\n" + "tags=" + tags + "\n" + "type="
                + type + "\n" + "storageType=" + storageType + "\n" + "isSystemVolume=" + isSystemVolume + "\n" + "description=" + description + "\n" + "paymentTiming="
                + paymentTiming + "\n" + "zoneName=" + zoneName + "\n" + "clusterId=" + clusterId + "\n" + "encrypted=" + encrypted + "\n" + "deleteWithInstance="
                + deleteWithInstance + "\n" + "deleteAutoSnapshot=" + deleteAutoSnapshot + "\n" + "attachments=" + attachments + "\n" + "multiAttachInfos=" + multiAttachInfos
                + "\n" + "desc=" + desc + "\n" + "regionId=" + regionId + "\n" + "sourceSnapshotId=" + sourceSnapshotId + "\n" + "snapshotNum=" + snapshotNum + "\n"
                + "resGroupInfos=" + resGroupInfos + "\n" + "autoSnapshotPolicy=" + autoSnapshotPolicy + "\n" + "autoSnapshotPolicyInfos=" + autoSnapshotPolicyInfos + "\n"
                + "encryptKey=" + encryptKey + "\n" + "encryptKeySpec=" + encryptKeySpec + "\n" + "multiAttach=" + multiAttach + "\n" + "volumeId=" + volumeId + "\n" + "}";
    }

}