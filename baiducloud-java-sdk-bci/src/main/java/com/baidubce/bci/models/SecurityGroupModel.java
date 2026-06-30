package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecurityGroupModel {
    /**
     * 安全组ID
     */
    private String securityGroupId;

    /**
     * 安全组名称
     */
    private String name;

    /**
     * 安全组描述
     */
    private String description;

    /**
     * vpc Id
     */
    private String vpcId;

    public SecurityGroupModel setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SecurityGroupModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SecurityGroupModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public SecurityGroupModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    @Override
    public String toString() {
        return "SecurityGroupModel{" + "securityGroupId=" + securityGroupId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "vpcId=" + vpcId + "\n" + "}";
    }

}