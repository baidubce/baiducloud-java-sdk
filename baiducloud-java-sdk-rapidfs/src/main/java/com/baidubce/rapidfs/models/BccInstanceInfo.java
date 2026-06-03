package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BccInstanceInfo {
    /**
     * BCC 实例 IP 地址
     */
    private String ip;

    /**
     * BCC 实例 ID
     */
    private String bccId;

    /**
     * BCC 实例名称
     */
    private String bccName;

    /**
     * VPC ID
     */
    private String vpcId;

    /**
     * 可用区
     */
    private String zone;

    /**
     * BCC 规格
     */
    private String bccSpec;

    /**
     * BCC 实例状态，参考 [BCC 文档](https://cloud.baidu.com/doc/BCC/s/6jwvyo0q2#instancestatus)，例如 Running、Stopped 等
     */
    private String status;

    /**
     * BSM Agent 信息
     */
    private String bsmAgentStatus;

    public BccInstanceInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public BccInstanceInfo setBccId(String bccId) {
        this.bccId = bccId;
        return this;
    }

    public String getBccId() {
        return this.bccId;
    }

    public BccInstanceInfo setBccName(String bccName) {
        this.bccName = bccName;
        return this;
    }

    public String getBccName() {
        return this.bccName;
    }

    public BccInstanceInfo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public BccInstanceInfo setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getZone() {
        return this.zone;
    }

    public BccInstanceInfo setBccSpec(String bccSpec) {
        this.bccSpec = bccSpec;
        return this;
    }

    public String getBccSpec() {
        return this.bccSpec;
    }

    public BccInstanceInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public BccInstanceInfo setBsmAgentStatus(String bsmAgentStatus) {
        this.bsmAgentStatus = bsmAgentStatus;
        return this;
    }

    public String getBsmAgentStatus() {
        return this.bsmAgentStatus;
    }

    @Override
    public String toString() {
        return "BccInstanceInfo{" + "ip=" + ip + "\n" + "bccId=" + bccId + "\n" + "bccName=" + bccName + "\n" + "vpcId=" + vpcId + "\n" + "zone=" + zone + "\n" + "bccSpec="
                + bccSpec + "\n" + "status=" + status + "\n" + "bsmAgentStatus=" + bsmAgentStatus + "\n" + "}";
    }

}