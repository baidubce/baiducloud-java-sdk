package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateBidInstanceRequest extends BaseBceRequest {

    /**
    * 实例规格
    */
    private String spec;

    /**
    * 镜像ID
    */
    private String imageId;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 抢占实例出价模型，市场价: market，自定义: custom
    */
    private String bidModel;

    /**
    * 抢占实例出价金额，单位：元/分钟。当bidModel=custom时有效
    */
    private String bidPrice;

    /**
    * CPU核数
    */
    private Integer cpuCount;

    /**
    * 内存容量，单位GB
    */
    private Integer memoryCapacityInGB;

    /**
    * 系统盘大小，单位GB，默认40，范围[40, 2048]
    */
    private Integer rootDiskSizeInGb;

    /**
    * 系统盘介质类型
    */
    private String rootDiskStorageType;

    /**
    * 待创建的CDS磁盘列表
    */
    private List<CreateCdsModel> createCdsList;

    /**
    * 本地盘列表
    */
    private List<EphemeralDisk> ephemeralDisks;

    /**
    * 公网带宽，单位Mbps，0~200，0表示不分配公网IP
    */
    private Integer networkCapacityInMbps;

    /**
    * 公网带宽计费方式
    */
    private String internetChargeType;

    /**
    * EIP名称
    */
    private String eipName;

    /**
    * 批量创建的实例个数，默认为1
    */
    private Integer purchaseCount;

    /**
    * 虚拟机名字，批量时作为前缀
    */
    private String name;

    /**
    * 虚拟机主机名
    */
    private String hostname;

    /**
    * 是否自动生成name和hostname有序后缀
    */
    private Boolean autoSeqSuffix;

    /**
    * 是否自动生成hostname domain
    */
    private Boolean isOpenHostnameDomain;

    /**
    * 实例管理员密码，需加密传输
    */
    private String adminPass;

    /**
    * 密钥对ID
    */
    private String keypairId;

    /**
    * 用户自定义数据，Base64编码
    */
    private String userData;

    /**
    * 可用区名称，如cn-bj-a
    */
    private String zoneName;

    /**
    * 子网ID
    */
    private String subnetId;

    /**
    * 安全组ID
    */
    private String securityGroupId;

    /**
    * 企业安全组ID
    */
    private String enterpriseSecurityGroupId;

    /**
    * 异构卡信息
    */
    private String isomerismCard;

    /**
    * 实例释放保护，0未开启，1开启
    */
    private Integer deletionProtection;

    /**
    * 标签是否需要和已有标签键进行关联
    */
    private Boolean relationTag;

    /**
    * 是否开启ipv6
    */
    private Boolean isOpenIpv6;

    /**
    * 标签列表
    */
    private List<TagModel> tags;

    /**
    * 自动快照策略ID
    */
    private String aspId;

    /**
    * 挂载文件存储CFS列表
    */
    private List<FileSystemModel> fileSystems;

    /**
    * 后付费EIP是否随抢占实例关联自动释放
    */
    private Boolean isEipAutoRelatedDelete;

    /**
    * 资源组ID
    */
    private String resGroupId;

    public String getSpec() {
        return spec;
    }

    public CreateBidInstanceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getImageId() {
        return imageId;
    }

    public CreateBidInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateBidInstanceRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getBidModel() {
        return bidModel;
    }

    public CreateBidInstanceRequest setBidModel(String bidModel) {
        this.bidModel = bidModel;
        return this;
    }

    public String getBidPrice() {
        return bidPrice;
    }

    public CreateBidInstanceRequest setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public CreateBidInstanceRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getMemoryCapacityInGB() {
        return memoryCapacityInGB;
    }

    public CreateBidInstanceRequest setMemoryCapacityInGB(Integer memoryCapacityInGB) {
        this.memoryCapacityInGB = memoryCapacityInGB;
        return this;
    }

    public Integer getRootDiskSizeInGb() {
        return rootDiskSizeInGb;
    }

    public CreateBidInstanceRequest setRootDiskSizeInGb(Integer rootDiskSizeInGb) {
        this.rootDiskSizeInGb = rootDiskSizeInGb;
        return this;
    }

    public String getRootDiskStorageType() {
        return rootDiskStorageType;
    }

    public CreateBidInstanceRequest setRootDiskStorageType(String rootDiskStorageType) {
        this.rootDiskStorageType = rootDiskStorageType;
        return this;
    }

    public List<CreateCdsModel> getCreateCdsList() {
        return createCdsList;
    }

    public CreateBidInstanceRequest setCreateCdsList(List<CreateCdsModel> createCdsList) {
        this.createCdsList = createCdsList;
        return this;
    }

    public List<EphemeralDisk> getEphemeralDisks() {
        return ephemeralDisks;
    }

    public CreateBidInstanceRequest setEphemeralDisks(List<EphemeralDisk> ephemeralDisks) {
        this.ephemeralDisks = ephemeralDisks;
        return this;
    }

    public Integer getNetworkCapacityInMbps() {
        return networkCapacityInMbps;
    }

    public CreateBidInstanceRequest setNetworkCapacityInMbps(Integer networkCapacityInMbps) {
        this.networkCapacityInMbps = networkCapacityInMbps;
        return this;
    }

    public String getInternetChargeType() {
        return internetChargeType;
    }

    public CreateBidInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }

    public String getEipName() {
        return eipName;
    }

    public CreateBidInstanceRequest setEipName(String eipName) {
        this.eipName = eipName;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public CreateBidInstanceRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateBidInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getHostname() {
        return hostname;
    }

    public CreateBidInstanceRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public Boolean getAutoSeqSuffix() {
        return autoSeqSuffix;
    }

    public CreateBidInstanceRequest setAutoSeqSuffix(Boolean autoSeqSuffix) {
        this.autoSeqSuffix = autoSeqSuffix;
        return this;
    }

    public Boolean getIsOpenHostnameDomain() {
        return isOpenHostnameDomain;
    }

    public CreateBidInstanceRequest setIsOpenHostnameDomain(Boolean isOpenHostnameDomain) {
        this.isOpenHostnameDomain = isOpenHostnameDomain;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public CreateBidInstanceRequest setAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getKeypairId() {
        return keypairId;
    }

    public CreateBidInstanceRequest setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public CreateBidInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateBidInstanceRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateBidInstanceRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public CreateBidInstanceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getEnterpriseSecurityGroupId() {
        return enterpriseSecurityGroupId;
    }

    public CreateBidInstanceRequest setEnterpriseSecurityGroupId(String enterpriseSecurityGroupId) {
        this.enterpriseSecurityGroupId = enterpriseSecurityGroupId;
        return this;
    }

    public String getIsomerismCard() {
        return isomerismCard;
    }

    public CreateBidInstanceRequest setIsomerismCard(String isomerismCard) {
        this.isomerismCard = isomerismCard;
        return this;
    }

    public Integer getDeletionProtection() {
        return deletionProtection;
    }

    public CreateBidInstanceRequest setDeletionProtection(Integer deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    public Boolean getRelationTag() {
        return relationTag;
    }

    public CreateBidInstanceRequest setRelationTag(Boolean relationTag) {
        this.relationTag = relationTag;
        return this;
    }

    public Boolean getIsOpenIpv6() {
        return isOpenIpv6;
    }

    public CreateBidInstanceRequest setIsOpenIpv6(Boolean isOpenIpv6) {
        this.isOpenIpv6 = isOpenIpv6;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateBidInstanceRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getAspId() {
        return aspId;
    }

    public CreateBidInstanceRequest setAspId(String aspId) {
        this.aspId = aspId;
        return this;
    }

    public List<FileSystemModel> getFileSystems() {
        return fileSystems;
    }

    public CreateBidInstanceRequest setFileSystems(List<FileSystemModel> fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }

    public Boolean getIsEipAutoRelatedDelete() {
        return isEipAutoRelatedDelete;
    }

    public CreateBidInstanceRequest setIsEipAutoRelatedDelete(Boolean isEipAutoRelatedDelete) {
        this.isEipAutoRelatedDelete = isEipAutoRelatedDelete;
        return this;
    }

    public String getResGroupId() {
        return resGroupId;
    }

    public CreateBidInstanceRequest setResGroupId(String resGroupId) {
        this.resGroupId = resGroupId;
        return this;
    }

}
