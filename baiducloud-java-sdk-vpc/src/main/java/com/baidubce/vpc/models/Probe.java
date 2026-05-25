package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Probe {
    /**
     * 探测ID
     */
    private String probeId;

    /**
     * 探测描述
     */
    private String description;

    /**
     * 目的地址
     */
    private String destIp;

    /**
     * 目的端口
     */
    private Integer destPort;

    /**
     * 探测频率
     */
    private Integer frequency;

    /**
     * 探测名称
     */
    private String name;

    /**
     * 探测内容实体
     */
    private String payload;

    /**
     * 探测类型。TCP、UDP、ICMP、DNS
     */
    private String protocol;

    /**
     * 探测源地址
     */
    private List<String> sourceIps;

    /**
     * 状态，active可用
     */
    private String status;

    /**
     * 所属子网ID
     */
    private String subnetId;

    /**
     * 所属VPC ID
     */
    private String vpcId;

    public Probe setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

    public String getProbeId() {
        return this.probeId;
    }

    public Probe setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Probe setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public String getDestIp() {
        return this.destIp;
    }

    public Probe setDestPort(Integer destPort) {
        this.destPort = destPort;
        return this;
    }

    public Integer getDestPort() {
        return this.destPort;
    }

    public Probe setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    public Integer getFrequency() {
        return this.frequency;
    }

    public Probe setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Probe setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public String getPayload() {
        return this.payload;
    }

    public Probe setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public Probe setSourceIps(List<String> sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }

    public List<String> getSourceIps() {
        return this.sourceIps;
    }

    public Probe setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Probe setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public Probe setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    @Override
    public String toString() {
        return "Probe{" + "probeId=" + probeId + "\n" + "description=" + description + "\n" + "destIp=" + destIp + "\n" + "destPort=" + destPort + "\n" + "frequency=" + frequency
                + "\n" + "name=" + name + "\n" + "payload=" + payload + "\n" + "protocol=" + protocol + "\n" + "sourceIps=" + sourceIps + "\n" + "status=" + status + "\n"
                + "subnetId=" + subnetId + "\n" + "vpcId=" + vpcId + "\n" + "}";
    }

}