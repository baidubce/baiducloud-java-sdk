package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VpcInfo {
    /**
     * 子网名称
     */
    private String vpcName;

    /**
     * 子网id
     */
    private String vpcId;

    /**
     * 子网uuid
     */
    private String vpcUuid;

    public VpcInfo setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public VpcInfo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public VpcInfo setVpcUuid(String vpcUuid) {
        this.vpcUuid = vpcUuid;
        return this;
    }

    public String getVpcUuid() {
        return this.vpcUuid;
    }

    @Override
    public String toString() {
        return "VpcInfo{" + "vpcName=" + vpcName + "\n" + "vpcId=" + vpcId + "\n" + "vpcUuid=" + vpcUuid + "\n" + "}";
    }

}