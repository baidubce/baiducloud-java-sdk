package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetProbeDetailResponse extends BaseBceResponse {

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
    private String destPort;

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
    * 探测类型，TCP、UDP、ICMP、DNS
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

    public String getProbeId() {
        return probeId;
    }

    public GetProbeDetailResponse setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetProbeDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDestIp() {
        return destIp;
    }

    public GetProbeDetailResponse setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public String getDestPort() {
        return destPort;
    }

    public GetProbeDetailResponse setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public GetProbeDetailResponse setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetProbeDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public GetProbeDetailResponse setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public GetProbeDetailResponse setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public List<String> getSourceIps() {
        return sourceIps;
    }

    public GetProbeDetailResponse setSourceIps(List<String> sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetProbeDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public GetProbeDetailResponse setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public GetProbeDetailResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return "GetProbeDetailResponse{" + "probeId=" + probeId + "\n" + "description=" + description + "\n" + "destIp=" + destIp + "\n" + "destPort=" + destPort + "\n"
                + "frequency=" + frequency + "\n" + "name=" + name + "\n" + "payload=" + payload + "\n" + "protocol=" + protocol + "\n" + "sourceIps=" + sourceIps + "\n"
                + "status=" + status + "\n" + "subnetId=" + subnetId + "\n" + "vpcId=" + vpcId + "\n" + "}";
    }

}
