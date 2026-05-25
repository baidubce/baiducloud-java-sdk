package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AclRuleRequest {
    /**
     * 子网的ID
     */
    private String subnetId;

    /**
     * 备注
     */
    private String description;

    /**
     * 协议，包括all tcp udp icmp
     */
    private String protocol;

    /**
     * 源IP
     */
    private String sourceIpAddress;

    /**
     * 目的IP
     */
    private String destinationIpAddress;

    /**
     * 源端口，例如1-65535，或8080
     */
    private String sourcePort;

    /**
     * 目的端口，例如1-65535，或8080
     */
    private String destinationPort;

    /**
     * 优先级 1-32768且不能与已有条目重复。数值越小，优先级越高，规则匹配顺序为按优先级由高到低匹配
     */
    private Integer position;

    /**
     * 规则的入站ingress 规则的出站egress
     */
    private String direction;

    /**
     * 默认为4。如果添加IPv6规则，则该值为6必传
     */
    private Integer ipversion;

    /**
     * 策略，包括allow和deny
     */
    private String action;

    public AclRuleRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public AclRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public AclRuleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public AclRuleRequest setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }

    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public AclRuleRequest setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }

    public String getDestinationIpAddress() {
        return this.destinationIpAddress;
    }

    public AclRuleRequest setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    public String getSourcePort() {
        return this.sourcePort;
    }

    public AclRuleRequest setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    public String getDestinationPort() {
        return this.destinationPort;
    }

    public AclRuleRequest setPosition(Integer position) {
        this.position = position;
        return this;
    }

    public Integer getPosition() {
        return this.position;
    }

    public AclRuleRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public AclRuleRequest setIpversion(Integer ipversion) {
        this.ipversion = ipversion;
        return this;
    }

    public Integer getIpversion() {
        return this.ipversion;
    }

    public AclRuleRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public String toString() {
        return "AclRuleRequest{" + "subnetId=" + subnetId + "\n" + "description=" + description + "\n" + "protocol=" + protocol + "\n" + "sourceIpAddress=" + sourceIpAddress
                + "\n" + "destinationIpAddress=" + destinationIpAddress + "\n" + "sourcePort=" + sourcePort + "\n" + "destinationPort=" + destinationPort + "\n" + "position="
                + position + "\n" + "direction=" + direction + "\n" + "ipversion=" + ipversion + "\n" + "action=" + action + "\n" + "}";
    }

}