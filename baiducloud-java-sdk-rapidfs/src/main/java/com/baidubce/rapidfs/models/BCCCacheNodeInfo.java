package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BCCCacheNodeInfo {
    /**
     * BCC 实例 ID
     */
    private String bccId;

    /**
     * BCC 加入时的实例名称
     */
    private String bccName;

    /**
     * 可用区
     */
    private String zone;

    /**
     * BCC 规格
     */
    private String bccSpec;

    public BCCCacheNodeInfo setBccId(String bccId) {
        this.bccId = bccId;
        return this;
    }

    public String getBccId() {
        return this.bccId;
    }

    public BCCCacheNodeInfo setBccName(String bccName) {
        this.bccName = bccName;
        return this;
    }

    public String getBccName() {
        return this.bccName;
    }

    public BCCCacheNodeInfo setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getZone() {
        return this.zone;
    }

    public BCCCacheNodeInfo setBccSpec(String bccSpec) {
        this.bccSpec = bccSpec;
        return this;
    }

    public String getBccSpec() {
        return this.bccSpec;
    }

    @Override
    public String toString() {
        return "BCCCacheNodeInfo{" + "bccId=" + bccId + "\n" + "bccName=" + bccName + "\n" + "zone=" + zone + "\n" + "bccSpec=" + bccSpec + "\n" + "}";
    }

}