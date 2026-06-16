package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecurityGroupRuleModel {
    /**
     * 规则备注（创建安全组、查询安全组列表、授权安全组规则、撤销安全组规则）
     */
    private String remark;

    /**
     * 规则方向，取值：ingress/egress（创建安全组、查询安全组列表、授权安全组规则、撤销安全组规则）
     */
    private String direction;

    /**
     * 以太网协议类型（创建安全组、查询安全组列表、授权安全组规则、撤销安全组规则）
     */
    private String ethertype;

    /**
     * 端口范围，如1-65535，空字符串表示所有端口（创建安全组、查询安全组列表、授权安全组规则、撤销安全组规则）
     */
    private String portRange;

    /**
     * 协议类型，取值：tcp/udp/icmp，空字符串表示所有协议（创建安全组、查询安全组列表、授权安全组规则、撤销安全组规则）
     */
    private String protocol;

    /**
     * 源安全组ID，仅direction为ingress时有效（创建安全组、查询安全组列表、授权安全组规则、撤销安全组规则）
     */
    private String sourceGroupId;

    /**
     * 源IP地址（CIDR格式），仅direction为ingress时有效（创建安全组、查询安全组列表、授权安全组规则、撤销安全组规则）
     */
    private String sourceIp;

    /**
     * 目标安全组ID，仅direction为egress时有效（创建安全组、查询安全组列表、授权安全组规则、撤销安全组规则）
     */
    private String destGroupId;

    /**
     * 目标IP地址（CIDR格式），仅direction为egress时有效（创建安全组、查询安全组列表、授权安全组规则、撤销安全组规则）
     */
    private String destIp;

    /**
     * 规则所属安全组ID（查询安全组列表）
     */
    private String securityGroupId;

    /**
     * 安全组规则ID（查询安全组列表）
     */
    private String securityGroupRuleId;

    /**
     * 规则创建时间（查询安全组列表）
     */
    private String createdTime;

    /**
     * 规则更新时间（查询安全组列表）
     */
    private String updatedTime;

    public SecurityGroupRuleModel setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public SecurityGroupRuleModel setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public SecurityGroupRuleModel setEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    public String getEthertype() {
        return this.ethertype;
    }

    public SecurityGroupRuleModel setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    public String getPortRange() {
        return this.portRange;
    }

    public SecurityGroupRuleModel setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public SecurityGroupRuleModel setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }

    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public SecurityGroupRuleModel setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    public String getSourceIp() {
        return this.sourceIp;
    }

    public SecurityGroupRuleModel setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }

    public String getDestGroupId() {
        return this.destGroupId;
    }

    public SecurityGroupRuleModel setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public String getDestIp() {
        return this.destIp;
    }

    public SecurityGroupRuleModel setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SecurityGroupRuleModel setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }

    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    public SecurityGroupRuleModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public SecurityGroupRuleModel setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    @Override
    public String toString() {
        return "SecurityGroupRuleModel{" + "remark=" + remark + "\n" + "direction=" + direction + "\n" + "ethertype=" + ethertype + "\n" + "portRange=" + portRange + "\n"
                + "protocol=" + protocol + "\n" + "sourceGroupId=" + sourceGroupId + "\n" + "sourceIp=" + sourceIp + "\n" + "destGroupId=" + destGroupId + "\n" + "destIp="
                + destIp + "\n" + "securityGroupId=" + securityGroupId + "\n" + "securityGroupRuleId=" + securityGroupRuleId + "\n" + "createdTime=" + createdTime + "\n"
                + "updatedTime=" + updatedTime + "\n" + "}";
    }

}