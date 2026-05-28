package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlbSecurityGroupRuleModel {
    /**
     * 普通安全组规则ID
     */
    private String securityGroupRuleId;

    /**
     * 入站/出站，取值ingress或egress
     */
    private String direction;

    /**
     * 网络类型，取值IPv4或IPv6，值为空时表示默认取值IPv4
     */
    private String ethertype;

    /**
     * 端口范围，可以指定80等单个端口，值为空时默认取值1-65535
     */
    private String portRange;

    /**
     * 协议类型，tcp、udp或icmp，值为空时默认取值all
     */
    private String protocol;

    /**
     * 源安全组ID
     */
    private String sourceGroupId;

    /**
     * 源IP地址，与sourceGroupId不能同时设定值
     */
    private String sourceIp;

    /**
     * 目的安全组ID
     */
    private String destGroupId;

    /**
     * 目的IP地址，与destGroupId不能同时设定值
     */
    private String destIp;

    public BlbSecurityGroupRuleModel setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }

    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    public BlbSecurityGroupRuleModel setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public BlbSecurityGroupRuleModel setEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    public String getEthertype() {
        return this.ethertype;
    }

    public BlbSecurityGroupRuleModel setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    public String getPortRange() {
        return this.portRange;
    }

    public BlbSecurityGroupRuleModel setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public BlbSecurityGroupRuleModel setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }

    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public BlbSecurityGroupRuleModel setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    public String getSourceIp() {
        return this.sourceIp;
    }

    public BlbSecurityGroupRuleModel setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }

    public String getDestGroupId() {
        return this.destGroupId;
    }

    public BlbSecurityGroupRuleModel setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public String getDestIp() {
        return this.destIp;
    }

    @Override
    public String toString() {
        return "BlbSecurityGroupRuleModel{" + "securityGroupRuleId=" + securityGroupRuleId + "\n" + "direction=" + direction + "\n" + "ethertype=" + ethertype + "\n"
                + "portRange=" + portRange + "\n" + "protocol=" + protocol + "\n" + "sourceGroupId=" + sourceGroupId + "\n" + "sourceIp=" + sourceIp + "\n" + "destGroupId="
                + destGroupId + "\n" + "destIp=" + destIp + "\n" + "}";
    }

}