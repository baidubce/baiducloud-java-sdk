package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeInfo {
    /**
     * 套餐规格
     */
    private String spec;

    /**
     * CPU数量
     */
    private Integer cpuCount;

    /**
     * 磁盘容量
     */
    private Integer memoryCapacityInGB;

    /**
     * 系统盘类型
     */
    private String sysDiskType;

    /**
     * 系统盘大小
     */
    private Integer sysDiskInGB;

    /**
     * billing
     */
    private BillingInfo billing;

    /**
     * 抢占式实例释放策略：市场价释放-market，自定义释放价格-custom
     */
    private String bidModel;

    /**
     * 自定义释放时，价格值
     */
    private String bidPrice;

    /**
     * 本地盘信息
     */
    private List<EphemeralDisk> ephemeralDisks;

    /**
     * 实例类型
     */
    private String instanceType;

    /**
     * gpu卡属性
     */
    private String gpuCard;

    /**
     * gpu数量
     */
    private Integer gpuCount;

    /**
     * fpga卡属性
     */
    private String fpgaCard;

    /**
     * fpga卡数量
     */
    private Integer fpgaCount;

    /**
     * 是否包含fpga卡
     */
    private Boolean containsFpga;

    /**
     * 昆仑卡属性
     */
    private String kunlunCard;

    /**
     * 昆仑卡数量
     */
    private Integer kunlunCount;

    /**
     * 实例镜像类型
     */
    private String imageType;

    /**
     * 实例镜像ID
     */
    private String imageId;

    /**
     * 实例镜像名称
     */
    private String imageName;

    /**
     * 操作系统类型
     */
    private String osType;

    /**
     * 操作系统名称
     */
    private String osName;

    /**
     * 操作系统版本
     */
    private String osVersion;

    /**
     * 操作系统架构
     */
    private String osArch;

    /**
     * 安全组ID
     */
    private String securityGroupId;

    /**
     * 密码
     */
    private String adminPass;

    /**
     * 密码类型: "0"(随机); "1"(用户自定义)
     */
    private String adminPassType;

    /**
     * 安全组名称
     */
    private String securityGroupName;

    /**
     * 总数量
     */
    private Integer totalCount;

    /**
     * 子网类型
     */
    private String aspId;

    /**
     * 本地存储信息
     */
    private List<CdsInfo> cds;

    /**
     * zone subnet 信息json, 对应类为List. 格式:[{"zone": "zoneA","subnetId": "subnetA"},...]
     */
    private String zoneSubnet;

    /**
     * 用户高级配置能力
     */
    private String userData;

    /**
     * 模板顺序
     */
    private Integer priorities;

    /**
     * 所属模板的ID
     */
    private String templateId;

    public NodeInfo setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    public NodeInfo setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public NodeInfo setMemoryCapacityInGB(Integer memoryCapacityInGB) {
        this.memoryCapacityInGB = memoryCapacityInGB;
        return this;
    }

    public Integer getMemoryCapacityInGB() {
        return this.memoryCapacityInGB;
    }

    public NodeInfo setSysDiskType(String sysDiskType) {
        this.sysDiskType = sysDiskType;
        return this;
    }

    public String getSysDiskType() {
        return this.sysDiskType;
    }

    public NodeInfo setSysDiskInGB(Integer sysDiskInGB) {
        this.sysDiskInGB = sysDiskInGB;
        return this;
    }

    public Integer getSysDiskInGB() {
        return this.sysDiskInGB;
    }

    public NodeInfo setBilling(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public BillingInfo getBilling() {
        return this.billing;
    }

    public NodeInfo setBidModel(String bidModel) {
        this.bidModel = bidModel;
        return this;
    }

    public String getBidModel() {
        return this.bidModel;
    }

    public NodeInfo setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    public String getBidPrice() {
        return this.bidPrice;
    }

    public NodeInfo setEphemeralDisks(List<EphemeralDisk> ephemeralDisks) {
        this.ephemeralDisks = ephemeralDisks;
        return this;
    }

    public List<EphemeralDisk> getEphemeralDisks() {
        return this.ephemeralDisks;
    }

    public NodeInfo setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public NodeInfo setGpuCard(String gpuCard) {
        this.gpuCard = gpuCard;
        return this;
    }

    public String getGpuCard() {
        return this.gpuCard;
    }

    public NodeInfo setGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }

    public Integer getGpuCount() {
        return this.gpuCount;
    }

    public NodeInfo setFpgaCard(String fpgaCard) {
        this.fpgaCard = fpgaCard;
        return this;
    }

    public String getFpgaCard() {
        return this.fpgaCard;
    }

    public NodeInfo setFpgaCount(Integer fpgaCount) {
        this.fpgaCount = fpgaCount;
        return this;
    }

    public Integer getFpgaCount() {
        return this.fpgaCount;
    }

    public NodeInfo setContainsFpga(Boolean containsFpga) {
        this.containsFpga = containsFpga;
        return this;
    }

    public Boolean getContainsFpga() {
        return this.containsFpga;
    }

    public NodeInfo setKunlunCard(String kunlunCard) {
        this.kunlunCard = kunlunCard;
        return this;
    }

    public String getKunlunCard() {
        return this.kunlunCard;
    }

    public NodeInfo setKunlunCount(Integer kunlunCount) {
        this.kunlunCount = kunlunCount;
        return this;
    }

    public Integer getKunlunCount() {
        return this.kunlunCount;
    }

    public NodeInfo setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getImageType() {
        return this.imageType;
    }

    public NodeInfo setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getImageId() {
        return this.imageId;
    }

    public NodeInfo setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    public String getImageName() {
        return this.imageName;
    }

    public NodeInfo setOsType(String osType) {
        this.osType = osType;
        return this;
    }

    public String getOsType() {
        return this.osType;
    }

    public NodeInfo setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public String getOsName() {
        return this.osName;
    }

    public NodeInfo setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public NodeInfo setOsArch(String osArch) {
        this.osArch = osArch;
        return this;
    }

    public String getOsArch() {
        return this.osArch;
    }

    public NodeInfo setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public NodeInfo setAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getAdminPass() {
        return this.adminPass;
    }

    public NodeInfo setAdminPassType(String adminPassType) {
        this.adminPassType = adminPassType;
        return this;
    }

    public String getAdminPassType() {
        return this.adminPassType;
    }

    public NodeInfo setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public NodeInfo setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public NodeInfo setAspId(String aspId) {
        this.aspId = aspId;
        return this;
    }

    public String getAspId() {
        return this.aspId;
    }

    public NodeInfo setCds(List<CdsInfo> cds) {
        this.cds = cds;
        return this;
    }

    public List<CdsInfo> getCds() {
        return this.cds;
    }

    public NodeInfo setZoneSubnet(String zoneSubnet) {
        this.zoneSubnet = zoneSubnet;
        return this;
    }

    public String getZoneSubnet() {
        return this.zoneSubnet;
    }

    public NodeInfo setUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getUserData() {
        return this.userData;
    }

    public NodeInfo setPriorities(Integer priorities) {
        this.priorities = priorities;
        return this;
    }

    public Integer getPriorities() {
        return this.priorities;
    }

    public NodeInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    @Override
    public String toString() {
        return "NodeInfo{" + "spec=" + spec + "\n" + "cpuCount=" + cpuCount + "\n" + "memoryCapacityInGB=" + memoryCapacityInGB + "\n" + "sysDiskType=" + sysDiskType + "\n"
                + "sysDiskInGB=" + sysDiskInGB + "\n" + "billing=" + billing + "\n" + "bidModel=" + bidModel + "\n" + "bidPrice=" + bidPrice + "\n" + "ephemeralDisks="
                + ephemeralDisks + "\n" + "instanceType=" + instanceType + "\n" + "gpuCard=" + gpuCard + "\n" + "gpuCount=" + gpuCount + "\n" + "fpgaCard=" + fpgaCard + "\n"
                + "fpgaCount=" + fpgaCount + "\n" + "containsFpga=" + containsFpga + "\n" + "kunlunCard=" + kunlunCard + "\n" + "kunlunCount=" + kunlunCount + "\n" + "imageType="
                + imageType + "\n" + "imageId=" + imageId + "\n" + "imageName=" + imageName + "\n" + "osType=" + osType + "\n" + "osName=" + osName + "\n" + "osVersion="
                + osVersion + "\n" + "osArch=" + osArch + "\n" + "securityGroupId=" + securityGroupId + "\n" + "adminPass=" + adminPass + "\n" + "adminPassType=" + adminPassType
                + "\n" + "securityGroupName=" + securityGroupName + "\n" + "totalCount=" + totalCount + "\n" + "aspId=" + aspId + "\n" + "cds=" + cds + "\n" + "zoneSubnet="
                + zoneSubnet + "\n" + "userData=" + userData + "\n" + "priorities=" + priorities + "\n" + "templateId=" + templateId + "\n" + "}";
    }

}