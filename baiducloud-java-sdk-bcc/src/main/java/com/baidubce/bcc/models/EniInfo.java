package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EniInfo {
    /**
     * 网卡ID
     */
    private String eniId;

    /**
     * 网卡名称
     */
    private String name;

    /**
     * VPC ID
     */
    private String vpcId;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 区域
     */
    private String zoneName;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 物理地址
     */
    private String macAddress;

    /**
     * 状态
     */
    private String status;

    /**
     * 绑定的安全组列表
     */
    private List<String> securityGroupIds;

    /**
     * IP地址信息
     */
    private List<IpAddress> privateIpSet;

    public EniInfo setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getEniId() {
        return this.eniId;
    }

    public EniInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EniInfo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public EniInfo setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public EniInfo setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public EniInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public EniInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public EniInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public EniInfo setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public EniInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public EniInfo setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public EniInfo setPrivateIpSet(List<IpAddress> privateIpSet) {
        this.privateIpSet = privateIpSet;
        return this;
    }

    public List<IpAddress> getPrivateIpSet() {
        return this.privateIpSet;
    }

    @Override
    public String toString() {
        return "EniInfo{" + "eniId=" + eniId + "\n" + "name=" + name + "\n" + "vpcId=" + vpcId + "\n" + "subnetId=" + subnetId + "\n" + "zoneName=" + zoneName + "\n"
                + "description=" + description + "\n" + "createdTime=" + createdTime + "\n" + "instanceId=" + instanceId + "\n" + "macAddress=" + macAddress + "\n" + "status="
                + status + "\n" + "securityGroupIds=" + securityGroupIds + "\n" + "privateIpSet=" + privateIpSet + "\n" + "}";
    }

}