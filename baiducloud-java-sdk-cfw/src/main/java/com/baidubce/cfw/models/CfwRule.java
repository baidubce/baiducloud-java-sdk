package com.baidubce.cfw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CfwRule {
    /**
     * CFW的id
     */
    private String cfwId;

    /**
     * CFW规则的id
     */
    private String cfwRuleId;

    /**
     * IP协议类型，取值 \[ 4 \| 6 ]
     */
    private Integer ipVersion;

    /**
     * 规则优先级，取值 [ 1-1000 ]
     */
    private Integer priority;

    /**
     * 协议类型，取值 \[ TCP \| UDP \| ICMP \| ALL ]
     */
    private String protocol;

    /**
     * 方向，取值 \[ in \| out ]
     */
    private String direction;

    /**
     * 源IP，网段或IP，例如：180.76.1.0/24 或 180.76.1.1，0.0.0.0/0表示所有
     */
    private String sourceAddress;

    /**
     * 目的IP，网段或IP，例如：180.76.1.0/24 或 180.76.1.1，0.0.0.0/0表示所有
     */
    private String destAddress;

    /**
     * 源端口，0-65535之间的整数，或区间，例如：8080，8080-8090，0-65535表示所有
     */
    private String sourcePort;

    /**
     * 目的端口，0-65535之间的整数，或区间，例如：8080，8080-8090，0-65535表示所有
     */
    private String destPort;

    /**
     * 策略，取值 \[ allow \| deny \| observe ]
     */
    private String action;

    /**
     * CFW规则的描述
     */
    private String description;

    public CfwRule setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getCfwId() {
        return this.cfwId;
    }

    public CfwRule setCfwRuleId(String cfwRuleId) {
        this.cfwRuleId = cfwRuleId;
        return this;
    }

    public String getCfwRuleId() {
        return this.cfwRuleId;
    }

    public CfwRule setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public Integer getIpVersion() {
        return this.ipVersion;
    }

    public CfwRule setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public CfwRule setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public CfwRule setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public CfwRule setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    public String getSourceAddress() {
        return this.sourceAddress;
    }

    public CfwRule setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    public String getDestAddress() {
        return this.destAddress;
    }

    public CfwRule setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    public String getSourcePort() {
        return this.sourcePort;
    }

    public CfwRule setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    public String getDestPort() {
        return this.destPort;
    }

    public CfwRule setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public CfwRule setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "CfwRule{" + "cfwId=" + cfwId + "\n" + "cfwRuleId=" + cfwRuleId + "\n" + "ipVersion=" + ipVersion + "\n" + "priority=" + priority + "\n" + "protocol=" + protocol
                + "\n" + "direction=" + direction + "\n" + "sourceAddress=" + sourceAddress + "\n" + "destAddress=" + destAddress + "\n" + "sourcePort=" + sourcePort + "\n"
                + "destPort=" + destPort + "\n" + "action=" + action + "\n" + "description=" + description + "\n" + "}";
    }

}