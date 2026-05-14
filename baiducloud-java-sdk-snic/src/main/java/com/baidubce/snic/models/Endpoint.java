package com.baidubce.snic.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Endpoint {
    /**
     * 服务网卡的ID
     */
    private String endpointId;

    /**
     * 服务网卡的名称
     */
    private String name;

    /**
     * 服务网卡IP
     */
    private String ipAddress;

    /**
     * 服务网卡状态，取值：available/unavailable，分别表示：可挂载/不可挂载
     */
    private String status;

    /**
     * 服务唯一域名
     */
    private String service;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * VPC的ID
     */
    private String vpcId;

    /**
     * 付费类型
     */
    private String productType;

    public Endpoint setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    public String getEndpointId() {
        return this.endpointId;
    }

    public Endpoint setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Endpoint setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public Endpoint setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Endpoint setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    public Endpoint setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public Endpoint setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Endpoint setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Endpoint setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Endpoint setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getProductType() {
        return this.productType;
    }

    @Override
    public String toString() {
        return "Endpoint{" + "endpointId=" + endpointId + "\n" + "name=" + name + "\n" + "ipAddress=" + ipAddress + "\n" + "status=" + status + "\n" + "service=" + service + "\n"
                + "subnetId=" + subnetId + "\n" + "description=" + description + "\n" + "createTime=" + createTime + "\n" + "vpcId=" + vpcId + "\n" + "productType=" + productType
                + "\n" + "}";
    }

}