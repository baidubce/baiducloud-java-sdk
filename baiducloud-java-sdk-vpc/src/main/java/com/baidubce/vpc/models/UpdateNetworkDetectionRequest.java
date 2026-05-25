package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateNetworkDetectionRequest extends BaseBceRequest {

    /**
    * probeId
    */
    @JsonIgnore
    private String probeId;

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
    * 探测目的IP
    */
    private String destIp;

    /**
    * 探测目的端口
    */
    private Integer destPort;

    public String getProbeId() {
        return probeId;
    }

    public UpdateNetworkDetectionRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateNetworkDetectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateNetworkDetectionRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateNetworkDetectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDestIp() {
        return destIp;
    }

    public UpdateNetworkDetectionRequest setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public Integer getDestPort() {
        return destPort;
    }

    public UpdateNetworkDetectionRequest setDestPort(Integer destPort) {
        this.destPort = destPort;
        return this;
    }

}
