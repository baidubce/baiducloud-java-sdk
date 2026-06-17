package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BbcFlavor {
    /**
     * cpu数量
     */
    private Integer cpuCount;

    /**
     * 内存容量（单位：GB）
     */
    private Integer memoryCapacityInGB;

    /**
     * 本地数据盘数量
     */
    private String ephemeralDiskCount;

    /**
     * 本地数据盘类型
     */
    private String ephemeralDiskType;

    /**
     * gpu卡数量
     */
    private String gpuCardCount;

    /**
     * fpga卡类型
     */
    private String fpgaCardType;

    /**
     * fpga卡数量
     */
    private String fpgaCardCount;

    /**
     * 支持计费类型（PrePaid：包年包月；PostPaid：按量付费；both：包年包月/按量付费）
     */
    private String productType;

    /**
     * 实例套餐规格
     */
    private String spec;

    /**
     * 实例套餐规格类型
     */
    private String specId;

    /**
     * 实例套餐是否支持开启Jumbo帧，开启:true，关闭:false
     */
    private Boolean enableJumboFrame;

    /**
     * 处理器型号
     */
    private String cpuModel;

    /**
     * 处理器主频
     */
    private String cpuGHz;

    /**
     * 内网带宽(Gbps)
     */
    private String networkBandwidth;

    /**
     * 网络收发包
     */
    private String networkPackage;

    /**
     * 套餐网卡队列数
     */
    private String netEthQueueCount;

    /**
     * 套餐网卡最大支持的队列数
     */
    private String netEthMaxQueueCount;

    /**
     * ENI最大数量（配额）
     */
    private Integer eniQuota;

    /**
     * ERI最大数量（配额）
     */
    private Integer eriQuota;

    /**
     * rdma类型，RoCE或IB
     */
    private String rdmaType;

    /**
     * rdma网卡数量
     */
    private Integer rdmaNetCardCount;

    /**
     * rdma网卡带宽(Gbps)
     */
    private Integer rdmaNetBandwidth;

    /**
     * 
     */
    private List<String> systemDiskType;

    /**
     * 
     */
    private List<String> dataDiskType;

    /**
     * 单网卡IPv4地址数量（配额）
     */
    private Integer nicIpv4Quota;

    /**
     * 单网卡IPv6地址数量（配额）
     */
    private Integer nicIpv6Quota;

    /**
     * CDS数量
     */
    private Integer volumeCount;

    /**
     * gpu卡类型
     */
    private String gpuCardType;

    public BbcFlavor setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public BbcFlavor setMemoryCapacityInGB(Integer memoryCapacityInGB) {
        this.memoryCapacityInGB = memoryCapacityInGB;
        return this;
    }

    public Integer getMemoryCapacityInGB() {
        return this.memoryCapacityInGB;
    }

    public BbcFlavor setEphemeralDiskCount(String ephemeralDiskCount) {
        this.ephemeralDiskCount = ephemeralDiskCount;
        return this;
    }

    public String getEphemeralDiskCount() {
        return this.ephemeralDiskCount;
    }

    public BbcFlavor setEphemeralDiskType(String ephemeralDiskType) {
        this.ephemeralDiskType = ephemeralDiskType;
        return this;
    }

    public String getEphemeralDiskType() {
        return this.ephemeralDiskType;
    }

    public BbcFlavor setGpuCardCount(String gpuCardCount) {
        this.gpuCardCount = gpuCardCount;
        return this;
    }

    public String getGpuCardCount() {
        return this.gpuCardCount;
    }

    public BbcFlavor setFpgaCardType(String fpgaCardType) {
        this.fpgaCardType = fpgaCardType;
        return this;
    }

    public String getFpgaCardType() {
        return this.fpgaCardType;
    }

    public BbcFlavor setFpgaCardCount(String fpgaCardCount) {
        this.fpgaCardCount = fpgaCardCount;
        return this;
    }

    public String getFpgaCardCount() {
        return this.fpgaCardCount;
    }

    public BbcFlavor setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getProductType() {
        return this.productType;
    }

    public BbcFlavor setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    public BbcFlavor setSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    public String getSpecId() {
        return this.specId;
    }

    public BbcFlavor setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }

    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public BbcFlavor setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
        return this;
    }

    public String getCpuModel() {
        return this.cpuModel;
    }

    public BbcFlavor setCpuGHz(String cpuGHz) {
        this.cpuGHz = cpuGHz;
        return this;
    }

    public String getCpuGHz() {
        return this.cpuGHz;
    }

    public BbcFlavor setNetworkBandwidth(String networkBandwidth) {
        this.networkBandwidth = networkBandwidth;
        return this;
    }

    public String getNetworkBandwidth() {
        return this.networkBandwidth;
    }

    public BbcFlavor setNetworkPackage(String networkPackage) {
        this.networkPackage = networkPackage;
        return this;
    }

    public String getNetworkPackage() {
        return this.networkPackage;
    }

    public BbcFlavor setNetEthQueueCount(String netEthQueueCount) {
        this.netEthQueueCount = netEthQueueCount;
        return this;
    }

    public String getNetEthQueueCount() {
        return this.netEthQueueCount;
    }

    public BbcFlavor setNetEthMaxQueueCount(String netEthMaxQueueCount) {
        this.netEthMaxQueueCount = netEthMaxQueueCount;
        return this;
    }

    public String getNetEthMaxQueueCount() {
        return this.netEthMaxQueueCount;
    }

    public BbcFlavor setEniQuota(Integer eniQuota) {
        this.eniQuota = eniQuota;
        return this;
    }

    public Integer getEniQuota() {
        return this.eniQuota;
    }

    public BbcFlavor setEriQuota(Integer eriQuota) {
        this.eriQuota = eriQuota;
        return this;
    }

    public Integer getEriQuota() {
        return this.eriQuota;
    }

    public BbcFlavor setRdmaType(String rdmaType) {
        this.rdmaType = rdmaType;
        return this;
    }

    public String getRdmaType() {
        return this.rdmaType;
    }

    public BbcFlavor setRdmaNetCardCount(Integer rdmaNetCardCount) {
        this.rdmaNetCardCount = rdmaNetCardCount;
        return this;
    }

    public Integer getRdmaNetCardCount() {
        return this.rdmaNetCardCount;
    }

    public BbcFlavor setRdmaNetBandwidth(Integer rdmaNetBandwidth) {
        this.rdmaNetBandwidth = rdmaNetBandwidth;
        return this;
    }

    public Integer getRdmaNetBandwidth() {
        return this.rdmaNetBandwidth;
    }

    public BbcFlavor setSystemDiskType(List<String> systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }

    public List<String> getSystemDiskType() {
        return this.systemDiskType;
    }

    public BbcFlavor setDataDiskType(List<String> dataDiskType) {
        this.dataDiskType = dataDiskType;
        return this;
    }

    public List<String> getDataDiskType() {
        return this.dataDiskType;
    }

    public BbcFlavor setNicIpv4Quota(Integer nicIpv4Quota) {
        this.nicIpv4Quota = nicIpv4Quota;
        return this;
    }

    public Integer getNicIpv4Quota() {
        return this.nicIpv4Quota;
    }

    public BbcFlavor setNicIpv6Quota(Integer nicIpv6Quota) {
        this.nicIpv6Quota = nicIpv6Quota;
        return this;
    }

    public Integer getNicIpv6Quota() {
        return this.nicIpv6Quota;
    }

    public BbcFlavor setVolumeCount(Integer volumeCount) {
        this.volumeCount = volumeCount;
        return this;
    }

    public Integer getVolumeCount() {
        return this.volumeCount;
    }

    public BbcFlavor setGpuCardType(String gpuCardType) {
        this.gpuCardType = gpuCardType;
        return this;
    }

    public String getGpuCardType() {
        return this.gpuCardType;
    }

    @Override
    public String toString() {
        return "BbcFlavor{" + "cpuCount=" + cpuCount + "\n" + "memoryCapacityInGB=" + memoryCapacityInGB + "\n" + "ephemeralDiskCount=" + ephemeralDiskCount + "\n"
                + "ephemeralDiskType=" + ephemeralDiskType + "\n" + "gpuCardCount=" + gpuCardCount + "\n" + "fpgaCardType=" + fpgaCardType + "\n" + "fpgaCardCount="
                + fpgaCardCount + "\n" + "productType=" + productType + "\n" + "spec=" + spec + "\n" + "specId=" + specId + "\n" + "enableJumboFrame=" + enableJumboFrame + "\n"
                + "cpuModel=" + cpuModel + "\n" + "cpuGHz=" + cpuGHz + "\n" + "networkBandwidth=" + networkBandwidth + "\n" + "networkPackage=" + networkPackage + "\n"
                + "netEthQueueCount=" + netEthQueueCount + "\n" + "netEthMaxQueueCount=" + netEthMaxQueueCount + "\n" + "eniQuota=" + eniQuota + "\n" + "eriQuota=" + eriQuota
                + "\n" + "rdmaType=" + rdmaType + "\n" + "rdmaNetCardCount=" + rdmaNetCardCount + "\n" + "rdmaNetBandwidth=" + rdmaNetBandwidth + "\n" + "systemDiskType="
                + systemDiskType + "\n" + "dataDiskType=" + dataDiskType + "\n" + "nicIpv4Quota=" + nicIpv4Quota + "\n" + "nicIpv6Quota=" + nicIpv6Quota + "\n" + "volumeCount="
                + volumeCount + "\n" + "gpuCardType=" + gpuCardType + "\n" + "}";
    }

}