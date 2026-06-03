package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Privatelinks {
    /**
     * 私有网络 ID
     */
    private String vpcID;

    /**
     * 私有网络子网 ID
     */
    private String subnetID;

    /**
     * 服务网卡 ID
     */
    private String serviceNetID;

    /**
     * 内网解析 IP 地址
     */
    private String ipAddress;

    /**
     * 私有网络状态
     */
    private String status;

    public Privatelinks setVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    public String getVpcID() {
        return this.vpcID;
    }

    public Privatelinks setSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    public String getSubnetID() {
        return this.subnetID;
    }

    public Privatelinks setServiceNetID(String serviceNetID) {
        this.serviceNetID = serviceNetID;
        return this;
    }

    public String getServiceNetID() {
        return this.serviceNetID;
    }

    public Privatelinks setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public Privatelinks setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "Privatelinks{" + "vpcID=" + vpcID + "\n" + "subnetID=" + subnetID + "\n" + "serviceNetID=" + serviceNetID + "\n" + "ipAddress=" + ipAddress + "\n" + "status="
                + status + "\n" + "}";
    }

}