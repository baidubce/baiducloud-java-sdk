package com.baidubce.privatezone.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vpc {
    /**
     * Vpc的ID
     */
    private String vpcId;

    /**
     * Vpc的名称
     */
    private String vpcName;

    /**
     * Vpc的区域
     */
    private String vpcRegion;

    public Vpc setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Vpc setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public Vpc setVpcRegion(String vpcRegion) {
        this.vpcRegion = vpcRegion;
        return this;
    }

    public String getVpcRegion() {
        return this.vpcRegion;
    }

    @Override
    public String toString() {
        return "Vpc{" + "vpcId=" + vpcId + "\n" + "vpcName=" + vpcName + "\n" + "vpcRegion=" + vpcRegion + "\n" + "}";
    }

}