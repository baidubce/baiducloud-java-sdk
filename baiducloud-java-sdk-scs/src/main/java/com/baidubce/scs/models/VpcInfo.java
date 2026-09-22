package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VpcInfo {
    /**
     * vpc短ID
     */
    private String vpcId;

    /**
     * vpc名称
     */
    private String vpcName;

    /**
     * vpc网段
     */
    private String vpcCidr;

    public VpcInfo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public VpcInfo setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public VpcInfo setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public String getVpcCidr() {
        return this.vpcCidr;
    }

    @Override
    public String toString() {
        return "VpcInfo{" + "vpcId=" + vpcId + "\n" + "vpcName=" + vpcName + "\n" + "vpcCidr=" + vpcCidr + "\n" + "}";
    }

}