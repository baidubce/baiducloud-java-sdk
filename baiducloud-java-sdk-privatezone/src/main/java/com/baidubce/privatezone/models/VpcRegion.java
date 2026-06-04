package com.baidubce.privatezone.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VpcRegion {
    /**
     * VPC 所在的地区
     */
    private String region;

    /**
     * VPC 的 id 列表
     */
    private List<String> vpcIds;

    public VpcRegion setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public VpcRegion setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    @Override
    public String toString() {
        return "VpcRegion{" + "region=" + region + "\n" + "vpcIds=" + vpcIds + "\n" + "}";
    }

}