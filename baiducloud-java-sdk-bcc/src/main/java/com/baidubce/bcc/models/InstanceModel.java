package com.baidubce.bcc.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceModel {
    /**
     * 实例ID，符合BCE规范，是一个定长字符串，且只允许包含大小写字母、数字、连字号（-）和下划线(_)。（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String id;

    /**
     * 来源产品ID（查询实例列表、查询指定实例详情）
     */
    private String sourceProductId;

    /**
     * 来源产品类型（查询实例列表、查询指定实例详情）
     */
    private String sourceProductType;

    /**
     * 序列号（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private String serialNumber;

    /**
     * 密钥对ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String keypairId;

    /**
     * 密钥对名称（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String keypairName;

    /**
     * 实例名称,支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65。（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String name;

    /**
     * 角色名称（查询实例列表、查询指定实例详情）
     */
    private String roleName;

    /**
     * 实例主机名,仅支持小写字母、数字以及- . 特殊字符，必须以字母头，不可连续使用特殊符号，不支持特殊符号开头或结尾，长度2-64。（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String hostname;

    /**
     * 实例类型，具体可选类型参见InstanceType，DCC（专属服务器）该字段为空（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String instanceType;

    /**
     * 规格（查询实例列表、查询指定实例详情）
     */
    private String spec;

    /**
     * 是否开启Jumbo帧，开启：true，关闭：false（查询实例列表、查询指定实例详情）
     */
    private Boolean enableJumboFrame;

    /**
     * 实例状态（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String status;

    /**
     * 实例描述信息（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String desc;

    /**
     * 创建来源（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private String createdFrom;

    /**
     * 付费方式，包括Postpaid(按量付费)，Prepaid(包年包月付费)两种。（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String paymentTiming;

    /**
     * 计费状态，包含 IS_CHARGING（计费中），STOPPED_NOT_CHARGING（关机不计费），REBOOTING_NOT_CHARGING（机中，未开始计费）。（查询实例列表）
     */
    private String chargeStatus;

    /**
     * 计费状态信息（查询指定实例详情）
     */
    private String displayChargeStatus;

    /**
     * 创建时间（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String createTime;

    /**
     * 过期时间（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String expireTime;

    /**
     * 释放时间（查询指定实例详情）
     */
    private String releaseTime;

    /**
     * 内网IP（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String internalIp;

    /**
     * 外网IP（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String publicIp;

    /**
     * CPU(Core)个数（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private Integer cpuCount;

    /**
     * RDMA单元ID（查询实例列表、查询指定实例详情）
     */
    private String rdmaUnitID;

    /**
     * RDMA Pod名称（查询实例列表、查询指定实例详情）
     */
    private String rdmaPodName;

    /**
     * 是否开启删除保护，1开启，0没开（查询实例列表、查询指定实例详情）
     */
    private Integer deletionProtection;

    /**
     * RDMA高性能网络的详细连接信息（查询实例列表、查询指定实例详情）
     */
    private List<RdmaNicTopo> rdmaNicTopo;

    /**
     * 部署集信息列表（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private List<DeploySetModel> deploysetList;

    /**
     * 实例所属的资源组信息（查询实例列表、查询指定实例详情）
     */
    private List<GroupInfo> resGroupInfos;

    /**
     * hosteye版本，enterprise企业版，open基础版，为空或无该字段表示不绑定hosteye（查询实例列表、查询指定实例详情）
     */
    private String hosteyeType;

    /**
     * 实例所携带的GPU卡信息，具体信息参照GpuType（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String gpuCard;

    /**
     * 实例的GPU显存配置信息（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private String gpuVideoMemory;

    /**
     * 实例所携带的FPGA卡信息，具体信息参照FpgaType（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String fpgaCard;

    /**
     * 实例所携带的GPU卡或FPGA卡或异构卡数量（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String cardCount;

    /**
     * 是否为异构计算卡（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String isomerismCard;

    /**
     * npu显存大小（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private String npuVideoMemory;

    /**
     * 内存容量，单位为GB（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private Integer memoryCapacityInGB;

    /**
     * 本地磁盘大小（不含系统盘，系统盘为免费赠送），单位为GB（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private Integer localDiskSizeInGB;

    /**
     * 镜像ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String imageId;

    /**
     * 镜像类型（查询实例列表、查询指定实例详情）
     */
    private String imageType;

    /**
     * 镜像名称（查询实例列表、查询指定实例详情）
     */
    private String imageName;

    /**
     * 操作系统版本（查询实例列表、查询指定实例详情）
     */
    private String osVersion;

    /**
     * 操作系统架构（查询实例列表、查询指定实例详情）
     */
    private String osArch;

    /**
     * 操作系统名称（查询实例列表、查询指定实例详情）
     */
    private String osName;

    /**
     * 实例置放策略，取值default、dedicatedHost。（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String placementPolicy;

    /**
     * 子网ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String subnetId;

    /**
     * VPC ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String vpcId;

    /**
     * 实例绑定的EIP是否随抢占实例关联自动释放，是：true，否：false（查询实例列表、查询指定实例详情）
     */
    private Boolean isEipAutoRelatedDelete;

    /**
     * 实例所在ehc集群id（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private String ehcClusterId;

    /**
     * 部署集ID（查询指定实例详情、根据实例id查询实例列表）
     */
    private String deploysetId;

    /**
     * 可用区信息（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String zoneName;

    /**
     * 实例规格子类型（查询实例列表、查询指定实例详情）
     */
    private String flavorSubType;

    /**
     * 产品类别（查询实例列表、查询指定实例详情）
     */
    private String productCategory;

    /**
     * 实例维修状态，包含normal（正常），wait_authorize（待授权维修），wait_repair（待发单维修），repairing（维修中）四种状态。（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private String repairStatus;

    /**
     * 宿主机ID（查询指定实例详情、根据实例id查询实例列表）
     */
    private String hostId;

    /**
     * 交换机ID（查询指定实例详情、根据实例id查询实例列表）
     */
    private String switchId;

    /**
     * 机架ID（查询指定实例详情、根据实例id查询实例列表）
     */
    private String rackId;

    /**
     * 专属服务器ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String dedicatedHostId;

    /**
     * 是否自动续费，是：true，否：false（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private Boolean autoRenew;

    /**
     * 自动续费周期单位（查询实例列表、查询指定实例详情）
     */
    private String autoRenewPeriodUnit;

    /**
     * 自动续费周期（查询实例列表、查询指定实例详情）
     */
    private Integer autoRenewPeriod;

    /**
     * ipv6地址（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private String ipv6;

    /**
     * 网卡队列数（查询实例列表、查询指定实例详情）
     */
    private String netEthQueueCount;

    /**
     * 弹性网卡配额（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private Integer eniQuota;

    /**
     * 弹性RDMA接口配额（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private Integer eriQuota;

    /**
     * RDMA类型（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private String rdmaType;

    /**
     * 服务组件，Map<组件名称,组件状态>（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private Map<String, String> serviceComponents;

    /**
     * IPv6地址信息（查询实例列表、查询指定实例详情）
     */
    private List<String> ipv6Addresses;

    /**
     * nicInfo
     */
    private NicInfo nicInfo;

    /**
     * 弹性网卡的数量（查询实例列表、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String eniNum;

    /**
     * 标签信息（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private List<Tag> tags;

    /**
     * 磁盘信息（查询实例列表、查询指定实例详情）
     */
    private List<VolumeModel> volumes;

    /**
     * 公网带宽，单位为Mb（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private Integer networkCapacityInMbps;

    public InstanceModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public InstanceModel setSourceProductId(String sourceProductId) {
        this.sourceProductId = sourceProductId;
        return this;
    }

    public String getSourceProductId() {
        return this.sourceProductId;
    }

    public InstanceModel setSourceProductType(String sourceProductType) {
        this.sourceProductType = sourceProductType;
        return this;
    }

    public String getSourceProductType() {
        return this.sourceProductType;
    }

    public InstanceModel setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public InstanceModel setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getKeypairId() {
        return this.keypairId;
    }

    public InstanceModel setKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    public String getKeypairName() {
        return this.keypairName;
    }

    public InstanceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public InstanceModel setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public InstanceModel setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public String getHostname() {
        return this.hostname;
    }

    public InstanceModel setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public InstanceModel setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    public InstanceModel setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }

    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public InstanceModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public InstanceModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public InstanceModel setCreatedFrom(String createdFrom) {
        this.createdFrom = createdFrom;
        return this;
    }

    public String getCreatedFrom() {
        return this.createdFrom;
    }

    public InstanceModel setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public InstanceModel setChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus;
        return this;
    }

    public String getChargeStatus() {
        return this.chargeStatus;
    }

    public InstanceModel setDisplayChargeStatus(String displayChargeStatus) {
        this.displayChargeStatus = displayChargeStatus;
        return this;
    }

    public String getDisplayChargeStatus() {
        return this.displayChargeStatus;
    }

    public InstanceModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public InstanceModel setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public InstanceModel setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

    public String getReleaseTime() {
        return this.releaseTime;
    }

    public InstanceModel setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    public String getInternalIp() {
        return this.internalIp;
    }

    public InstanceModel setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public String getPublicIp() {
        return this.publicIp;
    }

    public InstanceModel setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public InstanceModel setRdmaUnitID(String rdmaUnitID) {
        this.rdmaUnitID = rdmaUnitID;
        return this;
    }

    public String getRdmaUnitID() {
        return this.rdmaUnitID;
    }

    public InstanceModel setRdmaPodName(String rdmaPodName) {
        this.rdmaPodName = rdmaPodName;
        return this;
    }

    public String getRdmaPodName() {
        return this.rdmaPodName;
    }

    public InstanceModel setDeletionProtection(Integer deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    public Integer getDeletionProtection() {
        return this.deletionProtection;
    }

    public InstanceModel setRdmaNicTopo(List<RdmaNicTopo> rdmaNicTopo) {
        this.rdmaNicTopo = rdmaNicTopo;
        return this;
    }

    public List<RdmaNicTopo> getRdmaNicTopo() {
        return this.rdmaNicTopo;
    }

    public InstanceModel setDeploysetList(List<DeploySetModel> deploysetList) {
        this.deploysetList = deploysetList;
        return this;
    }

    public List<DeploySetModel> getDeploysetList() {
        return this.deploysetList;
    }

    public InstanceModel setResGroupInfos(List<GroupInfo> resGroupInfos) {
        this.resGroupInfos = resGroupInfos;
        return this;
    }

    public List<GroupInfo> getResGroupInfos() {
        return this.resGroupInfos;
    }

    public InstanceModel setHosteyeType(String hosteyeType) {
        this.hosteyeType = hosteyeType;
        return this;
    }

    public String getHosteyeType() {
        return this.hosteyeType;
    }

    public InstanceModel setGpuCard(String gpuCard) {
        this.gpuCard = gpuCard;
        return this;
    }

    public String getGpuCard() {
        return this.gpuCard;
    }

    public InstanceModel setGpuVideoMemory(String gpuVideoMemory) {
        this.gpuVideoMemory = gpuVideoMemory;
        return this;
    }

    public String getGpuVideoMemory() {
        return this.gpuVideoMemory;
    }

    public InstanceModel setFpgaCard(String fpgaCard) {
        this.fpgaCard = fpgaCard;
        return this;
    }

    public String getFpgaCard() {
        return this.fpgaCard;
    }

    public InstanceModel setCardCount(String cardCount) {
        this.cardCount = cardCount;
        return this;
    }

    public String getCardCount() {
        return this.cardCount;
    }

    public InstanceModel setIsomerismCard(String isomerismCard) {
        this.isomerismCard = isomerismCard;
        return this;
    }

    public String getIsomerismCard() {
        return this.isomerismCard;
    }

    public InstanceModel setNpuVideoMemory(String npuVideoMemory) {
        this.npuVideoMemory = npuVideoMemory;
        return this;
    }

    public String getNpuVideoMemory() {
        return this.npuVideoMemory;
    }

    public InstanceModel setMemoryCapacityInGB(Integer memoryCapacityInGB) {
        this.memoryCapacityInGB = memoryCapacityInGB;
        return this;
    }

    public Integer getMemoryCapacityInGB() {
        return this.memoryCapacityInGB;
    }

    public InstanceModel setLocalDiskSizeInGB(Integer localDiskSizeInGB) {
        this.localDiskSizeInGB = localDiskSizeInGB;
        return this;
    }

    public Integer getLocalDiskSizeInGB() {
        return this.localDiskSizeInGB;
    }

    public InstanceModel setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getImageId() {
        return this.imageId;
    }

    public InstanceModel setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getImageType() {
        return this.imageType;
    }

    public InstanceModel setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    public String getImageName() {
        return this.imageName;
    }

    public InstanceModel setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public InstanceModel setOsArch(String osArch) {
        this.osArch = osArch;
        return this;
    }

    public String getOsArch() {
        return this.osArch;
    }

    public InstanceModel setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public String getOsName() {
        return this.osName;
    }

    public InstanceModel setPlacementPolicy(String placementPolicy) {
        this.placementPolicy = placementPolicy;
        return this;
    }

    public String getPlacementPolicy() {
        return this.placementPolicy;
    }

    public InstanceModel setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public InstanceModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public InstanceModel setIsEipAutoRelatedDelete(Boolean isEipAutoRelatedDelete) {
        this.isEipAutoRelatedDelete = isEipAutoRelatedDelete;
        return this;
    }

    public Boolean getIsEipAutoRelatedDelete() {
        return this.isEipAutoRelatedDelete;
    }

    public InstanceModel setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

    public String getEhcClusterId() {
        return this.ehcClusterId;
    }

    public InstanceModel setDeploysetId(String deploysetId) {
        this.deploysetId = deploysetId;
        return this;
    }

    public String getDeploysetId() {
        return this.deploysetId;
    }

    public InstanceModel setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public InstanceModel setFlavorSubType(String flavorSubType) {
        this.flavorSubType = flavorSubType;
        return this;
    }

    public String getFlavorSubType() {
        return this.flavorSubType;
    }

    public InstanceModel setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public InstanceModel setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
        return this;
    }

    public String getRepairStatus() {
        return this.repairStatus;
    }

    public InstanceModel setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    public String getHostId() {
        return this.hostId;
    }

    public InstanceModel setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }

    public String getSwitchId() {
        return this.switchId;
    }

    public InstanceModel setRackId(String rackId) {
        this.rackId = rackId;
        return this;
    }

    public String getRackId() {
        return this.rackId;
    }

    public InstanceModel setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public InstanceModel setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public InstanceModel setAutoRenewPeriodUnit(String autoRenewPeriodUnit) {
        this.autoRenewPeriodUnit = autoRenewPeriodUnit;
        return this;
    }

    public String getAutoRenewPeriodUnit() {
        return this.autoRenewPeriodUnit;
    }

    public InstanceModel setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }

    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public InstanceModel setIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }

    public String getIpv6() {
        return this.ipv6;
    }

    public InstanceModel setNetEthQueueCount(String netEthQueueCount) {
        this.netEthQueueCount = netEthQueueCount;
        return this;
    }

    public String getNetEthQueueCount() {
        return this.netEthQueueCount;
    }

    public InstanceModel setEniQuota(Integer eniQuota) {
        this.eniQuota = eniQuota;
        return this;
    }

    public Integer getEniQuota() {
        return this.eniQuota;
    }

    public InstanceModel setEriQuota(Integer eriQuota) {
        this.eriQuota = eriQuota;
        return this;
    }

    public Integer getEriQuota() {
        return this.eriQuota;
    }

    public InstanceModel setRdmaType(String rdmaType) {
        this.rdmaType = rdmaType;
        return this;
    }

    public String getRdmaType() {
        return this.rdmaType;
    }

    public InstanceModel setServiceComponents(Map<String, String> serviceComponents) {
        this.serviceComponents = serviceComponents;
        return this;
    }

    public Map<String, String> getServiceComponents() {
        return this.serviceComponents;
    }

    public InstanceModel setIpv6Addresses(List<String> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }

    public List<String> getIpv6Addresses() {
        return this.ipv6Addresses;
    }

    public InstanceModel setNicInfo(NicInfo nicInfo) {
        this.nicInfo = nicInfo;
        return this;
    }

    public NicInfo getNicInfo() {
        return this.nicInfo;
    }

    public InstanceModel setEniNum(String eniNum) {
        this.eniNum = eniNum;
        return this;
    }

    public String getEniNum() {
        return this.eniNum;
    }

    public InstanceModel setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public InstanceModel setVolumes(List<VolumeModel> volumes) {
        this.volumes = volumes;
        return this;
    }

    public List<VolumeModel> getVolumes() {
        return this.volumes;
    }

    public InstanceModel setNetworkCapacityInMbps(Integer networkCapacityInMbps) {
        this.networkCapacityInMbps = networkCapacityInMbps;
        return this;
    }

    public Integer getNetworkCapacityInMbps() {
        return this.networkCapacityInMbps;
    }

    @Override
    public String toString() {
        return "InstanceModel{" + "id=" + id + "\n" + "sourceProductId=" + sourceProductId + "\n" + "sourceProductType=" + sourceProductType + "\n" + "serialNumber="
                + serialNumber + "\n" + "keypairId=" + keypairId + "\n" + "keypairName=" + keypairName + "\n" + "name=" + name + "\n" + "roleName=" + roleName + "\n" + "hostname="
                + hostname + "\n" + "instanceType=" + instanceType + "\n" + "spec=" + spec + "\n" + "enableJumboFrame=" + enableJumboFrame + "\n" + "status=" + status + "\n"
                + "desc=" + desc + "\n" + "createdFrom=" + createdFrom + "\n" + "paymentTiming=" + paymentTiming + "\n" + "chargeStatus=" + chargeStatus + "\n"
                + "displayChargeStatus=" + displayChargeStatus + "\n" + "createTime=" + createTime + "\n" + "expireTime=" + expireTime + "\n" + "releaseTime=" + releaseTime + "\n"
                + "internalIp=" + internalIp + "\n" + "publicIp=" + publicIp + "\n" + "cpuCount=" + cpuCount + "\n" + "rdmaUnitID=" + rdmaUnitID + "\n" + "rdmaPodName="
                + rdmaPodName + "\n" + "deletionProtection=" + deletionProtection + "\n" + "rdmaNicTopo=" + rdmaNicTopo + "\n" + "deploysetList=" + deploysetList + "\n"
                + "resGroupInfos=" + resGroupInfos + "\n" + "hosteyeType=" + hosteyeType + "\n" + "gpuCard=" + gpuCard + "\n" + "gpuVideoMemory=" + gpuVideoMemory + "\n"
                + "fpgaCard=" + fpgaCard + "\n" + "cardCount=" + cardCount + "\n" + "isomerismCard=" + isomerismCard + "\n" + "npuVideoMemory=" + npuVideoMemory + "\n"
                + "memoryCapacityInGB=" + memoryCapacityInGB + "\n" + "localDiskSizeInGB=" + localDiskSizeInGB + "\n" + "imageId=" + imageId + "\n" + "imageType=" + imageType
                + "\n" + "imageName=" + imageName + "\n" + "osVersion=" + osVersion + "\n" + "osArch=" + osArch + "\n" + "osName=" + osName + "\n" + "placementPolicy="
                + placementPolicy + "\n" + "subnetId=" + subnetId + "\n" + "vpcId=" + vpcId + "\n" + "isEipAutoRelatedDelete=" + isEipAutoRelatedDelete + "\n" + "ehcClusterId="
                + ehcClusterId + "\n" + "deploysetId=" + deploysetId + "\n" + "zoneName=" + zoneName + "\n" + "flavorSubType=" + flavorSubType + "\n" + "productCategory="
                + productCategory + "\n" + "repairStatus=" + repairStatus + "\n" + "hostId=" + hostId + "\n" + "switchId=" + switchId + "\n" + "rackId=" + rackId + "\n"
                + "dedicatedHostId=" + dedicatedHostId + "\n" + "autoRenew=" + autoRenew + "\n" + "autoRenewPeriodUnit=" + autoRenewPeriodUnit + "\n" + "autoRenewPeriod="
                + autoRenewPeriod + "\n" + "ipv6=" + ipv6 + "\n" + "netEthQueueCount=" + netEthQueueCount + "\n" + "eniQuota=" + eniQuota + "\n" + "eriQuota=" + eriQuota + "\n"
                + "rdmaType=" + rdmaType + "\n" + "serviceComponents=" + serviceComponents + "\n" + "ipv6Addresses=" + ipv6Addresses + "\n" + "nicInfo=" + nicInfo + "\n"
                + "eniNum=" + eniNum + "\n" + "tags=" + tags + "\n" + "volumes=" + volumes + "\n" + "networkCapacityInMbps=" + networkCapacityInMbps + "\n" + "}";
    }

}