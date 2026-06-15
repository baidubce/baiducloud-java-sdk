package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NicInfo {
    /**
     * 网卡ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String eniId;

    /**
     * 网卡长ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String eniUuid;

    /**
     * 网卡名称（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String name;

    /**
     * 网卡类型，primary为主网卡（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String type;

    /**
     * 子网ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String subnetId;

    /**
     * 子网类型（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String subnetType;

    /**
     * 可用区信息（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String az;

    /**
     * 描述（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String description;

    /**
     * 虚机长ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String deviceId;

    /**
     * 网卡状态（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String status;

    /**
     * 物理地址（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String macAddress;

    /**
     * VPC ID（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String vpcId;

    /**
     * 创建时间（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private String createdTime;

    /**
     * 网卡数量（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private Integer eniNum;

    /**
     * rdma套餐的eri网卡数量（查询实例列表、查询指定实例详情）
     */
    private Integer eriNum;

    /**
     * eri网卡信息（查询实例列表、查询指定实例详情）
     */
    private List<EriInfo> eriInfos;

    /**
     * eni网卡信息（查询实例列表、查询指定实例详情）
     */
    private List<EniInfo> eniInfos;

    /**
     * 辅助IP和主IP信息（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private List<IpInfo> ips;

    /**
     * ipv6信息（查询实例列表、查询指定实例详情、根据实例id查询实例列表）
     */
    private List<IpInfo> ipv6s;

    /**
     * 安全组短ID列表（主网卡+弹性网卡的安全组）（查询实例列表、查询指定实例详情、根据实例id查询实例列表、查询可关机不计费的实例列表）
     */
    private List<String> securityGroups;

    /**
     * 企业安全组短ID列表（主网卡+弹性网卡的企业安全组）（查询实例列表、查询指定实例详情）
     */
    private List<String> enterpriseSecurityGroups;

    public NicInfo setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getEniId() {
        return this.eniId;
    }

    public NicInfo setEniUuid(String eniUuid) {
        this.eniUuid = eniUuid;
        return this;
    }

    public String getEniUuid() {
        return this.eniUuid;
    }

    public NicInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public NicInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public NicInfo setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public NicInfo setSubnetType(String subnetType) {
        this.subnetType = subnetType;
        return this;
    }

    public String getSubnetType() {
        return this.subnetType;
    }

    public NicInfo setAz(String az) {
        this.az = az;
        return this;
    }

    public String getAz() {
        return this.az;
    }

    public NicInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public NicInfo setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public NicInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public NicInfo setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public NicInfo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public NicInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public NicInfo setEniNum(Integer eniNum) {
        this.eniNum = eniNum;
        return this;
    }

    public Integer getEniNum() {
        return this.eniNum;
    }

    public NicInfo setEriNum(Integer eriNum) {
        this.eriNum = eriNum;
        return this;
    }

    public Integer getEriNum() {
        return this.eriNum;
    }

    public NicInfo setEriInfos(List<EriInfo> eriInfos) {
        this.eriInfos = eriInfos;
        return this;
    }

    public List<EriInfo> getEriInfos() {
        return this.eriInfos;
    }

    public NicInfo setEniInfos(List<EniInfo> eniInfos) {
        this.eniInfos = eniInfos;
        return this;
    }

    public List<EniInfo> getEniInfos() {
        return this.eniInfos;
    }

    public NicInfo setIps(List<IpInfo> ips) {
        this.ips = ips;
        return this;
    }

    public List<IpInfo> getIps() {
        return this.ips;
    }

    public NicInfo setIpv6s(List<IpInfo> ipv6s) {
        this.ipv6s = ipv6s;
        return this;
    }

    public List<IpInfo> getIpv6s() {
        return this.ipv6s;
    }

    public NicInfo setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    public NicInfo setEnterpriseSecurityGroups(List<String> enterpriseSecurityGroups) {
        this.enterpriseSecurityGroups = enterpriseSecurityGroups;
        return this;
    }

    public List<String> getEnterpriseSecurityGroups() {
        return this.enterpriseSecurityGroups;
    }

    @Override
    public String toString() {
        return "NicInfo{" + "eniId=" + eniId + "\n" + "eniUuid=" + eniUuid + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "subnetId=" + subnetId + "\n" + "subnetType="
                + subnetType + "\n" + "az=" + az + "\n" + "description=" + description + "\n" + "deviceId=" + deviceId + "\n" + "status=" + status + "\n" + "macAddress="
                + macAddress + "\n" + "vpcId=" + vpcId + "\n" + "createdTime=" + createdTime + "\n" + "eniNum=" + eniNum + "\n" + "eriNum=" + eriNum + "\n" + "eriInfos="
                + eriInfos + "\n" + "eniInfos=" + eniInfos + "\n" + "ips=" + ips + "\n" + "ipv6s=" + ipv6s + "\n" + "securityGroups=" + securityGroups + "\n"
                + "enterpriseSecurityGroups=" + enterpriseSecurityGroups + "\n" + "}";
    }

}