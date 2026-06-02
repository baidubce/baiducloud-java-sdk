package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssociateBlbModel {
    /**
     * 负载均衡id
     */
    private String blbId;

    /**
     * blb名称
     */
    private String name;

    /**
     * blb状态
     */
    private String status;

    /**
     * blb类型
     */
    private String blbType;

    /**
     * 公网ip
     */
    private String publicIp;

    /**
     * eip线路类型
     */
    private String eipRouteType;

    /**
     * 带宽
     */
    private Integer bandwidth;

    /**
     * 内网ip地址
     */
    private String address;

    /**
     * ipv6地址
     */
    private String ipv6;

    /**
     * vpcId
     */
    private String vpcId;

    /**
     * 子网id
     */
    private String subnetId;

    public AssociateBlbModel setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getBlbId() {
        return this.blbId;
    }

    public AssociateBlbModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AssociateBlbModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public AssociateBlbModel setBlbType(String blbType) {
        this.blbType = blbType;
        return this;
    }

    public String getBlbType() {
        return this.blbType;
    }

    public AssociateBlbModel setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public String getPublicIp() {
        return this.publicIp;
    }

    public AssociateBlbModel setEipRouteType(String eipRouteType) {
        this.eipRouteType = eipRouteType;
        return this;
    }

    public String getEipRouteType() {
        return this.eipRouteType;
    }

    public AssociateBlbModel setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public AssociateBlbModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public AssociateBlbModel setIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }

    public String getIpv6() {
        return this.ipv6;
    }

    public AssociateBlbModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public AssociateBlbModel setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    @Override
    public String toString() {
        return "AssociateBlbModel{" + "blbId=" + blbId + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "blbType=" + blbType + "\n" + "publicIp=" + publicIp + "\n"
                + "eipRouteType=" + eipRouteType + "\n" + "bandwidth=" + bandwidth + "\n" + "address=" + address + "\n" + "ipv6=" + ipv6 + "\n" + "vpcId=" + vpcId + "\n"
                + "subnetId=" + subnetId + "\n" + "}";
    }

}