package com.baidubce.cfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientInfoModel {
    /**
     * 可用区
     */
    private String zone;

    /**
     * VPC ID
     */
    private String vpcId;

    /**
     * 挂载点 ID
     */
    private String mountId;

    /**
     * 客户端 IP 地址
     */
    private String clientIp;

    public ClientInfoModel setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getZone() {
        return this.zone;
    }

    public ClientInfoModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public ClientInfoModel setMountId(String mountId) {
        this.mountId = mountId;
        return this;
    }

    public String getMountId() {
        return this.mountId;
    }

    public ClientInfoModel setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    @Override
    public String toString() {
        return "ClientInfoModel{" + "zone=" + zone + "\n" + "vpcId=" + vpcId + "\n" + "mountId=" + mountId + "\n" + "clientIp=" + clientIp + "\n" + "}";
    }

}