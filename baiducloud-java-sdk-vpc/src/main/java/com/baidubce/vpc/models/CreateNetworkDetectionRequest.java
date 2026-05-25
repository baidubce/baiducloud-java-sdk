package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNetworkDetectionRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 网络探测名称，长度不超过65个字符，可由数字、字符、下划线组成
    */
    private String name;

    /**
    * 网络探测描述，不超过200字符
    */
    private String description;

    /**
    * 网络探测所属VPC ID
    */
    private String vpcId;

    /**
    * 网络探测所属子网ID
    */
    private String subnetId;

    /**
    * 探测类型，目前支持ICMP、TCP、UDP、DNS
    */
    private String protocol;

    /**
    * 探测频率取值为10、20、30
    */
    private Integer frequency;

    /**
    * 探测源IP列表，可以不指定列表为空，该情况sourceIpNum就必须取值
    */
    private List<String> sourceIps;

    /**
    * 自动分配的探测源IP个数
    */
    private Integer sourceIpNum;

    /**
    * 探测目的IP
    */
    private String destIp;

    /**
    * 探测目的端口，TCP、UDP和DNS类型的需要
    */
    private Integer destPort;

    /**
    * UDP类型的探测字符串和DNS类型的探测域名
    */
    private String payload;

    public String getClientToken() {
        return clientToken;
    }

    public CreateNetworkDetectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateNetworkDetectionRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateNetworkDetectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateNetworkDetectionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateNetworkDetectionRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public CreateNetworkDetectionRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public CreateNetworkDetectionRequest setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    public List<String> getSourceIps() {
        return sourceIps;
    }

    public CreateNetworkDetectionRequest setSourceIps(List<String> sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }

    public Integer getSourceIpNum() {
        return sourceIpNum;
    }

    public CreateNetworkDetectionRequest setSourceIpNum(Integer sourceIpNum) {
        this.sourceIpNum = sourceIpNum;
        return this;
    }

    public String getDestIp() {
        return destIp;
    }

    public CreateNetworkDetectionRequest setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public Integer getDestPort() {
        return destPort;
    }

    public CreateNetworkDetectionRequest setDestPort(Integer destPort) {
        this.destPort = destPort;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public CreateNetworkDetectionRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }

}
