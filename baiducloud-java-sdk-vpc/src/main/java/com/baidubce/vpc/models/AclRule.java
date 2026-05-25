package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AclRule {
    /**
     * ACL规则ID
     */
    private String id;

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
     * 源IP,可以为all
     */
    private String sourceIpAddress;

    /**
     * 目的IP,可以为all
     */
    private String destinationIpAddress;

    /**
     * 源端口,例如1-65535，或8080
     */
    private String sourcePort;

    /**
     * 目的端口,例如1-65535，或8080
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
     * acl规则的版本。4表示IPv4 6表示IPv6
     */
    private Integer ipVersion;

    /**
     * 策略，包括allow和deny
     */
    private String action;

    public AclRule setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AclRule setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public AclRule setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public AclRule setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public AclRule setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }

    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public AclRule setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }

    public String getDestinationIpAddress() {
        return this.destinationIpAddress;
    }

    public AclRule setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    public String getSourcePort() {
        return this.sourcePort;
    }

    public AclRule setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    public String getDestinationPort() {
        return this.destinationPort;
    }

    public AclRule setPosition(Integer position) {
        this.position = position;
        return this;
    }

    public Integer getPosition() {
        return this.position;
    }

    public AclRule setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public AclRule setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public Integer getIpVersion() {
        return this.ipVersion;
    }

    public AclRule setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public String toString() {
        return "AclRule{" + "id=" + id + "\n" + "subnetId=" + subnetId + "\n" + "description=" + description + "\n" + "protocol=" + protocol + "\n" + "sourceIpAddress="
                + sourceIpAddress + "\n" + "destinationIpAddress=" + destinationIpAddress + "\n" + "sourcePort=" + sourcePort + "\n" + "destinationPort=" + destinationPort + "\n"
                + "position=" + position + "\n" + "direction=" + direction + "\n" + "ipVersion=" + ipVersion + "\n" + "action=" + action + "\n" + "}";
    }

}