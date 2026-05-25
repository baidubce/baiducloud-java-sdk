package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Eni {
    /**
     * 弹性网卡的ID
     */
    private String eniId;

    /**
     * 弹性网卡的名称
     */
    private String name;

    /**
     * 弹性网卡所属的可用区
     */
    private String zoneName;

    /**
     * 弹性网卡的描述
     */
    private String description;

    /**
     * 挂载的云主机ID
     */
    private String instanceId;

    /**
     * 弹性网卡的mac地址
     */
    private String macAddress;

    /**
     * 弹性网卡的VPC ID
     */
    private String vpcId;

    /**
     * 弹性网卡的子网ID
     */
    private String subnetId;

    /**
     * 弹性网卡的状态
     */
    private String status;

    /**
     * 弹性网卡的IPv4 IP集合
     */
    private List<PrivateIP> privateIpSet;

    /**
     * 弹性网卡的IPv6 IP集合
     */
    private List<PrivateIP> ipv6PrivateIpSet;

    /**
     * 弹性网卡绑定的标签集合
     */
    private List<TagModel> tags;

    public Eni setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getEniId() {
        return this.eniId;
    }

    public Eni setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Eni setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public Eni setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Eni setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Eni setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public Eni setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Eni setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public Eni setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Eni setPrivateIpSet(List<PrivateIP> privateIpSet) {
        this.privateIpSet = privateIpSet;
        return this;
    }

    public List<PrivateIP> getPrivateIpSet() {
        return this.privateIpSet;
    }

    public Eni setIpv6PrivateIpSet(List<PrivateIP> ipv6PrivateIpSet) {
        this.ipv6PrivateIpSet = ipv6PrivateIpSet;
        return this;
    }

    public List<PrivateIP> getIpv6PrivateIpSet() {
        return this.ipv6PrivateIpSet;
    }

    public Eni setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "Eni{" + "eniId=" + eniId + "\n" + "name=" + name + "\n" + "zoneName=" + zoneName + "\n" + "description=" + description + "\n" + "instanceId=" + instanceId + "\n"
                + "macAddress=" + macAddress + "\n" + "vpcId=" + vpcId + "\n" + "subnetId=" + subnetId + "\n" + "status=" + status + "\n" + "privateIpSet=" + privateIpSet + "\n"
                + "ipv6PrivateIpSet=" + ipv6PrivateIpSet + "\n" + "tags=" + tags + "\n" + "}";
    }

}