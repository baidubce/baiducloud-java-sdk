package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Subnet {
    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 子网名称
     */
    private String name;

    /**
     * 可用区名称
     */
    private String zoneName;

    /**
     * 子网CIDR
     */
    private String cidr;

    /**
     * 子网的IPv6网段
     */
    private String ipv6Cidr;

    /**
     * 子网所属VPC的ID
     */
    private String vpcId;

    /**
     * 子网类型，"BCC”、"BCC_NAT”、”BBC”
     */
    private String subnetType;

    /**
     * 描述
     */
    private String description;

    /**
     * 子网内可用IP数
     */
    private Integer availableIp;

    /**
     * 子网内除预留网段外的可用IP数
     */
    private Integer availableUnreservedIp;

    /**
     * 子网的创建时间
     */
    private String createdTime;

    /**
     * 子网绑定的标签列表
     */
    private List<TagModel> tags;

    public Subnet setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public Subnet setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Subnet setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public Subnet setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public Subnet setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
        return this;
    }

    public String getIpv6Cidr() {
        return this.ipv6Cidr;
    }

    public Subnet setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Subnet setSubnetType(String subnetType) {
        this.subnetType = subnetType;
        return this;
    }

    public String getSubnetType() {
        return this.subnetType;
    }

    public Subnet setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Subnet setAvailableIp(Integer availableIp) {
        this.availableIp = availableIp;
        return this;
    }

    public Integer getAvailableIp() {
        return this.availableIp;
    }

    public Subnet setAvailableUnreservedIp(Integer availableUnreservedIp) {
        this.availableUnreservedIp = availableUnreservedIp;
        return this;
    }

    public Integer getAvailableUnreservedIp() {
        return this.availableUnreservedIp;
    }

    public Subnet setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public Subnet setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "Subnet{" + "subnetId=" + subnetId + "\n" + "name=" + name + "\n" + "zoneName=" + zoneName + "\n" + "cidr=" + cidr + "\n" + "ipv6Cidr=" + ipv6Cidr + "\n" + "vpcId="
                + vpcId + "\n" + "subnetType=" + subnetType + "\n" + "description=" + description + "\n" + "availableIp=" + availableIp + "\n" + "availableUnreservedIp="
                + availableUnreservedIp + "\n" + "createdTime=" + createdTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}