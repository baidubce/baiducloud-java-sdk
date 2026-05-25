package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HaVip {
    /**
     * 高可用虚拟IP的ID
     */
    private String haVipId;

    /**
     * 高可用虚拟IP的名称
     */
    private String name;

    /**
     * 高可用虚拟IP的描述
     */
    private String description;

    /**
     * 高可用虚拟IP所在VPC的ID
     */
    private String vpcId;

    /**
     * 高可用虚拟IP所在子网的ID
     */
    private String subnetId;

    /**
     * 高可用虚拟IP的状态，"available"表示可用，"binded"表示已绑定实例
     */
    private String status;

    /**
     * 高可用虚拟IP内网地址
     */
    private String privateIpAddress;

    /**
     * 高可用虚拟IP公网地址
     */
    private String publicIpAddress;

    /**
     * 高可用虚拟IP实例创建时间
     */
    private String createdTime;

    public HaVip setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

    public String getHaVipId() {
        return this.haVipId;
    }

    public HaVip setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public HaVip setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public HaVip setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public HaVip setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public HaVip setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public HaVip setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public HaVip setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public HaVip setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    @Override
    public String toString() {
        return "HaVip{" + "haVipId=" + haVipId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "vpcId=" + vpcId + "\n" + "subnetId=" + subnetId + "\n"
                + "status=" + status + "\n" + "privateIpAddress=" + privateIpAddress + "\n" + "publicIpAddress=" + publicIpAddress + "\n" + "createdTime=" + createdTime + "\n"
                + "}";
    }

}