package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubnetModel {
    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 子网名称
     */
    private String name;

    /**
     * 网段及子网掩码
     */
    private String cidr;

    /**
     * vpcID
     */
    private String vpcId;

    /**
     * 子网类型：BCC、BBC、BCC_NAT、BBC_NAT
     */
    private String subnetType;

    /**
     * subnet描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createTime;

    public SubnetModel setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public SubnetModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SubnetModel setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public SubnetModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public SubnetModel setSubnetType(String subnetType) {
        this.subnetType = subnetType;
        return this;
    }

    public String getSubnetType() {
        return this.subnetType;
    }

    public SubnetModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public SubnetModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    @Override
    public String toString() {
        return "SubnetModel{" + "subnetId=" + subnetId + "\n" + "name=" + name + "\n" + "cidr=" + cidr + "\n" + "vpcId=" + vpcId + "\n" + "subnetType=" + subnetType + "\n"
                + "description=" + description + "\n" + "createTime=" + createTime + "\n" + "}";
    }

}