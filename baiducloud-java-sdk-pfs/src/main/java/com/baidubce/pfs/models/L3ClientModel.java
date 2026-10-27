package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class L3ClientModel {
    /**
     * 客户端 IP
     */
    private String clientIp;

    /**
     * 客户端 ID
     */
    private Long clientId;

    /**
     * 客户端所挂载的挂载点 ID
     */
    private String mountId;

    /**
     * 客户端所挂载的挂载点名称
     */
    private String mountTargetName;

    /**
     * 客户端所在 VPC ID
     */
    private String vpcId;

    /**
     * 客户端所在可用区
     */
    private String zoneName;

    /**
     * 为该客户端提供服务的服务端 IP
     */
    private String serverIp;

    /**
     * 挂载使用的协议类型，bpfs / nfs
     */
    private String protocol;

    public L3ClientModel setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public L3ClientModel setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }

    public Long getClientId() {
        return this.clientId;
    }

    public L3ClientModel setMountId(String mountId) {
        this.mountId = mountId;
        return this;
    }

    public String getMountId() {
        return this.mountId;
    }

    public L3ClientModel setMountTargetName(String mountTargetName) {
        this.mountTargetName = mountTargetName;
        return this;
    }

    public String getMountTargetName() {
        return this.mountTargetName;
    }

    public L3ClientModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public L3ClientModel setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public L3ClientModel setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    public String getServerIp() {
        return this.serverIp;
    }

    public L3ClientModel setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    @Override
    public String toString() {
        return "L3ClientModel{" + "clientIp=" + clientIp + "\n" + "clientId=" + clientId + "\n" + "mountId=" + mountId + "\n" + "mountTargetName=" + mountTargetName + "\n"
                + "vpcId=" + vpcId + "\n" + "zoneName=" + zoneName + "\n" + "serverIp=" + serverIp + "\n" + "protocol=" + protocol + "\n" + "}";
    }

}