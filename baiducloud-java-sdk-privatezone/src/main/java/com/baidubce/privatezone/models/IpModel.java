package com.baidubce.privatezone.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpModel {
    /**
     * 子网 ID
     */
    private String subnetId;

    /**
     * 子网掩码参数范围内的 IP 地址（留空则系统自动分配）
     */
    private String ipAddress;

    public IpModel setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public IpModel setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    @Override
    public String toString() {
        return "IpModel{" + "subnetId=" + subnetId + "\n" + "ipAddress=" + ipAddress + "\n" + "}";
    }

}