package com.baidubce.cfw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRule {
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
     * 方向，取值 \[ in \| out ]，NAT边界防火墙只能配置出向规则，入向默认全放行
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

    public CreateRule setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public Integer getIpVersion() {
        return this.ipVersion;
    }

    public CreateRule setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public CreateRule setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public CreateRule setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public CreateRule setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    public String getSourceAddress() {
        return this.sourceAddress;
    }

    public CreateRule setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    public String getDestAddress() {
        return this.destAddress;
    }

    public CreateRule setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    public String getSourcePort() {
        return this.sourcePort;
    }

    public CreateRule setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    public String getDestPort() {
        return this.destPort;
    }

    public CreateRule setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public CreateRule setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "CreateRule{" + "ipVersion=" + ipVersion + "\n" + "priority=" + priority + "\n" + "protocol=" + protocol + "\n" + "direction=" + direction + "\n" + "sourceAddress="
                + sourceAddress + "\n" + "destAddress=" + destAddress + "\n" + "sourcePort=" + sourcePort + "\n" + "destPort=" + destPort + "\n" + "action=" + action + "\n"
                + "description=" + description + "\n" + "}";
    }

}