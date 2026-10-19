package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleInfo {
    /**
     * 节点ID。
     */
    private String id;

    /**
     * 可用区名称，多个逗号分隔。
     */
    private String azone;

    /**
     * 子网ID，多个逗号分隔。
     */
    private String subnetId;

    /**
     * 角色名称。
     */
    private String name;

    /**
     * VPC地址。
     */
    private String vpcCidr;

    /**
     * 短ID。
     */
    private String shortId;

    public RoleInfo setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public RoleInfo setAzone(String azone) {
        this.azone = azone;
        return this;
    }

    public String getAzone() {
        return this.azone;
    }

    public RoleInfo setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public RoleInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public RoleInfo setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public String getVpcCidr() {
        return this.vpcCidr;
    }

    public RoleInfo setShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public String getShortId() {
        return this.shortId;
    }

    @Override
    public String toString() {
        return "RoleInfo{" + "id=" + id + "\n" + "azone=" + azone + "\n" + "subnetId=" + subnetId + "\n" + "name=" + name + "\n" + "vpcCidr=" + vpcCidr + "\n" + "shortId="
                + shortId + "\n" + "}";
    }

}