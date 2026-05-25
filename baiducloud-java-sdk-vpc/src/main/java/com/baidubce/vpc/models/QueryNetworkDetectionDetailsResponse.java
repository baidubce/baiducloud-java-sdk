package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryNetworkDetectionDetailsResponse extends BaseBceResponse {

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

    public QueryNetworkDetectionDetailsResponse setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QueryNetworkDetectionDetailsResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDestIp() {
        return destIp;
    }

    public QueryNetworkDetectionDetailsResponse setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public Integer getDestPort() {
        return destPort;
    }

    public QueryNetworkDetectionDetailsResponse setDestPort(Integer destPort) {
        this.destPort = destPort;
        return this;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public QueryNetworkDetectionDetailsResponse setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryNetworkDetectionDetailsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public QueryNetworkDetectionDetailsResponse setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public QueryNetworkDetectionDetailsResponse setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public List<String> getSourceIps() {
        return sourceIps;
    }

    public QueryNetworkDetectionDetailsResponse setSourceIps(List<String> sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryNetworkDetectionDetailsResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public QueryNetworkDetectionDetailsResponse setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryNetworkDetectionDetailsResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return "QueryNetworkDetectionDetailsResponse{" + "probeId=" + probeId + "\n" + "description=" + description + "\n" + "destIp=" + destIp + "\n" + "destPort=" + destPort
                + "\n" + "frequency=" + frequency + "\n" + "name=" + name + "\n" + "payload=" + payload + "\n" + "protocol=" + protocol + "\n" + "sourceIps=" + sourceIps + "\n"
                + "status=" + status + "\n" + "subnetId=" + subnetId + "\n" + "vpcId=" + vpcId + "\n" + "}";
    }

}
