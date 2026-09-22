package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rule {
    /**
     * 安全组规则ID。
     */
    private String id;

    /**
     * 安全组规则ID。
     */
    private String securityGroupRuleId;

    /**
     * 安全组ID。
     */
    private String securityGroupId;

    /**
     * 安全组长ID。
     */
    private String securityGroupUuid;

    /**
     * 入站/出站，取值ingress/Ingress或egress/Egress。
     */
    private String direction;

    /**
     * 网络类型，取值IPv4或IPv6。值为空时表示默认取值IPv4。
     */
    private String ethertype;

    /**
     * 协议类型，tcp、udp或icmp，值为空时默认取值all。
     */
    private String protocol;

    /**
     * 端口范围，可以指定80等单个端口，值为空时默认取值1-65535。
     */
    private String portRange;

    /**
     * 源安全组ID。
     */
    private String remoteGroupId;

    /**
     * 源安全组名称。
     */
    private String remoteGroupName;

    /**
     * 源IP地址。
     */
    private String remoteIP;

    /**
     * 安全组规则名称。
     */
    private String name;

    public Rule setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Rule setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }

    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    public Rule setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public Rule setSecurityGroupUuid(String securityGroupUuid) {
        this.securityGroupUuid = securityGroupUuid;
        return this;
    }

    public String getSecurityGroupUuid() {
        return this.securityGroupUuid;
    }

    public Rule setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public Rule setEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    public String getEthertype() {
        return this.ethertype;
    }

    public Rule setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public Rule setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    public String getPortRange() {
        return this.portRange;
    }

    public Rule setRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
        return this;
    }

    public String getRemoteGroupId() {
        return this.remoteGroupId;
    }

    public Rule setRemoteGroupName(String remoteGroupName) {
        this.remoteGroupName = remoteGroupName;
        return this;
    }

    public String getRemoteGroupName() {
        return this.remoteGroupName;
    }

    public Rule setRemoteIP(String remoteIP) {
        this.remoteIP = remoteIP;
        return this;
    }

    public String getRemoteIP() {
        return this.remoteIP;
    }

    public Rule setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Rule{" + "id=" + id + "\n" + "securityGroupRuleId=" + securityGroupRuleId + "\n" + "securityGroupId=" + securityGroupId + "\n" + "securityGroupUuid="
                + securityGroupUuid + "\n" + "direction=" + direction + "\n" + "ethertype=" + ethertype + "\n" + "protocol=" + protocol + "\n" + "portRange=" + portRange + "\n"
                + "remoteGroupId=" + remoteGroupId + "\n" + "remoteGroupName=" + remoteGroupName + "\n" + "remoteIP=" + remoteIP + "\n" + "name=" + name + "\n" + "}";
    }

}