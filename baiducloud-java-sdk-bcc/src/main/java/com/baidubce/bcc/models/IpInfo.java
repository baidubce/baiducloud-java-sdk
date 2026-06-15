package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpInfo {
    /**
     * 内网IP地址
     */
    private String privateIp;

    /**
     * 公网IP地址
     */
    private String eip;

    /**
     * 是否为主IP
     */
    private String primary;

    /**
     * 绑定的eip 长ID
     */
    private String eipId;

    /**
     * eip 短ID
     */
    private String eipAllocationId;

    /**
     * eip带宽峰值
     */
    private String eipSize;

    /**
     * eip状态
     */
    private String eipStatus;

    /**
     * 共享带宽组ID
     */
    private String eipGroupId;

    /**
     * eip类型，shared表示共享带宽，normal表示普通eip
     */
    private String eipType;

    public IpInfo setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    public String getPrivateIp() {
        return this.privateIp;
    }

    public IpInfo setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    public IpInfo setPrimary(String primary) {
        this.primary = primary;
        return this;
    }

    public String getPrimary() {
        return this.primary;
    }

    public IpInfo setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    public String getEipId() {
        return this.eipId;
    }

    public IpInfo setEipAllocationId(String eipAllocationId) {
        this.eipAllocationId = eipAllocationId;
        return this;
    }

    public String getEipAllocationId() {
        return this.eipAllocationId;
    }

    public IpInfo setEipSize(String eipSize) {
        this.eipSize = eipSize;
        return this;
    }

    public String getEipSize() {
        return this.eipSize;
    }

    public IpInfo setEipStatus(String eipStatus) {
        this.eipStatus = eipStatus;
        return this;
    }

    public String getEipStatus() {
        return this.eipStatus;
    }

    public IpInfo setEipGroupId(String eipGroupId) {
        this.eipGroupId = eipGroupId;
        return this;
    }

    public String getEipGroupId() {
        return this.eipGroupId;
    }

    public IpInfo setEipType(String eipType) {
        this.eipType = eipType;
        return this;
    }

    public String getEipType() {
        return this.eipType;
    }

    @Override
    public String toString() {
        return "IpInfo{" + "privateIp=" + privateIp + "\n" + "eip=" + eip + "\n" + "primary=" + primary + "\n" + "eipId=" + eipId + "\n" + "eipAllocationId=" + eipAllocationId
                + "\n" + "eipSize=" + eipSize + "\n" + "eipStatus=" + eipStatus + "\n" + "eipGroupId=" + eipGroupId + "\n" + "eipType=" + eipType + "\n" + "}";
    }

}