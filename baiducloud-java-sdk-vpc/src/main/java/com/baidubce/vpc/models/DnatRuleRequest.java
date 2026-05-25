package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnatRuleRequest {
    /**
     * 名称，由大小写字母、数字以及-\_ /.特殊字符组成，必须以字母开头，长度1-65，非必填
     */
    private String ruleName;

    /**
     * 公网IP，关联在NAT网关DNAT上的EIP或共享带宽中的IP
     */
    private String publicIpAddress;

    /**
     * 内网IP
     */
    private String privateIpAddress;

    /**
     * 协议，支持TCP、UDP、all
     */
    private String protocol;

    /**
     * 公网端口(1-65535)，协议为TCP、UDP时有效，不能与端口范围同时指定
     */
    private Integer publicPort;

    /**
     * 内网端口(1-65535)，协议为TCP、UDP时有效，不能与端口范围同时指定
     */
    private Integer privatePort;

    /**
     * 公网端口范围，如“80-90”，协议为TCP、UDP时有效，不能与单个端口同时指定
     */
    private String publicPortRange;

    /**
     * 内网端口范围，如“80-90”，协议为TCP、UDP时有效，不能与单个端口同时指定
     */
    private String privatePortRange;

    public DnatRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public DnatRuleRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public DnatRuleRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DnatRuleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public DnatRuleRequest setPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
        return this;
    }

    public Integer getPublicPort() {
        return this.publicPort;
    }

    public DnatRuleRequest setPrivatePort(Integer privatePort) {
        this.privatePort = privatePort;
        return this;
    }

    public Integer getPrivatePort() {
        return this.privatePort;
    }

    public DnatRuleRequest setPublicPortRange(String publicPortRange) {
        this.publicPortRange = publicPortRange;
        return this;
    }

    public String getPublicPortRange() {
        return this.publicPortRange;
    }

    public DnatRuleRequest setPrivatePortRange(String privatePortRange) {
        this.privatePortRange = privatePortRange;
        return this;
    }

    public String getPrivatePortRange() {
        return this.privatePortRange;
    }

    @Override
    public String toString() {
        return "DnatRuleRequest{" + "ruleName=" + ruleName + "\n" + "publicIpAddress=" + publicIpAddress + "\n" + "privateIpAddress=" + privateIpAddress + "\n" + "protocol="
                + protocol + "\n" + "publicPort=" + publicPort + "\n" + "privatePort=" + privatePort + "\n" + "publicPortRange=" + publicPortRange + "\n" + "privatePortRange="
                + privatePortRange + "\n" + "}";
    }

}