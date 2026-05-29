package com.baidubce.cfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MountTargetModel {
    /**
     * 访问组名称
     */
    private String accessGroupName;

    /**
     * 挂载域名
     */
    private String domain;

    /**
     * MountTarget ID
     */
    private String mountId;

    /**
     * 挂载IP地址
     */
    private String ovip;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * VPC ID
     */
    private String vpcId;

    public MountTargetModel setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public MountTargetModel setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getDomain() {
        return this.domain;
    }

    public MountTargetModel setMountId(String mountId) {
        this.mountId = mountId;
        return this;
    }

    public String getMountId() {
        return this.mountId;
    }

    public MountTargetModel setOvip(String ovip) {
        this.ovip = ovip;
        return this;
    }

    public String getOvip() {
        return this.ovip;
    }

    public MountTargetModel setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public MountTargetModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    @Override
    public String toString() {
        return "MountTargetModel{" + "accessGroupName=" + accessGroupName + "\n" + "domain=" + domain + "\n" + "mountId=" + mountId + "\n" + "ovip=" + ovip + "\n" + "subnetId="
                + subnetId + "\n" + "vpcId=" + vpcId + "\n" + "}";
    }

}