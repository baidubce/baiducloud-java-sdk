package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MountTargetInfo {
    /**
     * 挂载地址
     */
    private String domain;

    /**
     * 挂载点ID
     */
    private String mountTargetId;

    /**
     * 挂载点IP
     */
    private String ovip;

    /**
     * 挂载点所在VPCID
     */
    private String vpcId;

    /**
     * 挂载点所在子网ID
     */
    private String subnetId;

    public MountTargetInfo setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getDomain() {
        return this.domain;
    }

    public MountTargetInfo setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    public String getMountTargetId() {
        return this.mountTargetId;
    }

    public MountTargetInfo setOvip(String ovip) {
        this.ovip = ovip;
        return this;
    }

    public String getOvip() {
        return this.ovip;
    }

    public MountTargetInfo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public MountTargetInfo setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    @Override
    public String toString() {
        return "MountTargetInfo{" + "domain=" + domain + "\n" + "mountTargetId=" + mountTargetId + "\n" + "ovip=" + ovip + "\n" + "vpcId=" + vpcId + "\n" + "subnetId=" + subnetId
                + "\n" + "}";
    }

}