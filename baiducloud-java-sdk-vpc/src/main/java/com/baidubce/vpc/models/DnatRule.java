package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnatRule {
    /**
     * 规则ID
     */
    private String ruleId;

    /**
     * DNAT规则名称，由大小写字母、数字以及-_ /.特殊字符组成，必须以字母开头，长度1-65
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
     * 公网IP端口（1-65535）
     */
    private String publicPort;

    /**
     * 内网IP端口（1-65535）
     */
    private String privatePort;

    /**
     * 规则状态
     */
    private String status;

    /**
     * 内网端口范围
     */
    private String privatePortRange;

    /**
     * 公网端口范围
     */
    private String publicPortRange;

    public DnatRule setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public DnatRule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public DnatRule setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public DnatRule setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DnatRule setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public DnatRule setPublicPort(String publicPort) {
        this.publicPort = publicPort;
        return this;
    }

    public String getPublicPort() {
        return this.publicPort;
    }

    public DnatRule setPrivatePort(String privatePort) {
        this.privatePort = privatePort;
        return this;
    }

    public String getPrivatePort() {
        return this.privatePort;
    }

    public DnatRule setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public DnatRule setPrivatePortRange(String privatePortRange) {
        this.privatePortRange = privatePortRange;
        return this;
    }

    public String getPrivatePortRange() {
        return this.privatePortRange;
    }

    public DnatRule setPublicPortRange(String publicPortRange) {
        this.publicPortRange = publicPortRange;
        return this;
    }

    public String getPublicPortRange() {
        return this.publicPortRange;
    }

    @Override
    public String toString() {
        return "DnatRule{" + "ruleId=" + ruleId + "\n" + "ruleName=" + ruleName + "\n" + "publicIpAddress=" + publicIpAddress + "\n" + "privateIpAddress=" + privateIpAddress
                + "\n" + "protocol=" + protocol + "\n" + "publicPort=" + publicPort + "\n" + "privatePort=" + privatePort + "\n" + "status=" + status + "\n" + "privatePortRange="
                + privatePortRange + "\n" + "publicPortRange=" + publicPortRange + "\n" + "}";
    }

}