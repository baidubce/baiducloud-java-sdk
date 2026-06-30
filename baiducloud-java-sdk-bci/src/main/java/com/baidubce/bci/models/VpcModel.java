package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VpcModel {
    /**
     * vpc Id
     */
    private String vpcId;

    /**
     * vpc名称
     */
    private String name;

    /**
     * 网段及子网掩码
     */
    private String cidr;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * vpc描述
     */
    private String description;

    /**
     * 是否是默认vpc
     */
    private Boolean isDefault;

    public VpcModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public VpcModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public VpcModel setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public VpcModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public VpcModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public VpcModel setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    @Override
    public String toString() {
        return "VpcModel{" + "vpcId=" + vpcId + "\n" + "name=" + name + "\n" + "cidr=" + cidr + "\n" + "createTime=" + createTime + "\n" + "description=" + description + "\n"
                + "isDefault=" + isDefault + "\n" + "}";
    }

}