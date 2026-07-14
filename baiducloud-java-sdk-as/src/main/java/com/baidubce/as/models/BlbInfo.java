package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlbInfo {
    /**
     * BLB实例ID
     */
    private String blbId;

    /**
     * BLB实例名称
     */
    private String blbName;

    /**
     * blbType类型：Blb-普通型BLB，AppBLb-应用型BLB，Ipv6Blb-ipv6型BLB
     */
    private String blbType;

    /**
     * 当blb类型为应用型BLB时，服务器组必填，可选多个。其他类型BLB不需要填写该值。
     */
    private List<String> sgIds;

    public BlbInfo setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getBlbId() {
        return this.blbId;
    }

    public BlbInfo setBlbName(String blbName) {
        this.blbName = blbName;
        return this;
    }

    public String getBlbName() {
        return this.blbName;
    }

    public BlbInfo setBlbType(String blbType) {
        this.blbType = blbType;
        return this;
    }

    public String getBlbType() {
        return this.blbType;
    }

    public BlbInfo setSgIds(List<String> sgIds) {
        this.sgIds = sgIds;
        return this;
    }

    public List<String> getSgIds() {
        return this.sgIds;
    }

    @Override
    public String toString() {
        return "BlbInfo{" + "blbId=" + blbId + "\n" + "blbName=" + blbName + "\n" + "blbType=" + blbType + "\n" + "sgIds=" + sgIds + "\n" + "}";
    }

}