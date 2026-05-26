package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnterpriseSecurityGroupRuleModel {
    /**
     * 备注，长度1-255。
     */
    private String remark;

    /**
     * 入站/出站，取值ingress或egress。
     */
    private String direction;

    /**
     * 网络类型，取值IPv4或IPv6。
     */
    private String ethertype;

    /**
     * 目的端口范围，支持连续端口（比如“1-80”）和离散端口（比如“80,7000,8000”，英文逗号隔开，离散值数量不超过15个），值为空时默认取值1-65535。
     */
    private String portRange;

    /**
     * 源端口范围，支持连续端口（比如“1-80”）和离散端口（比如“80,7000,8000”，英文逗号隔开，离散值数量不超过15个），值为空时默认取值1-65535。
     */
    private String sourcePortRange;

    /**
     * 协议类型，tcp、udp或icmp。
     */
    private String protocol;

    /**
     * 源IP地址，all表示全部。
     */
    private String sourceIp;

    /**
     * 目的IP地址，all表示全部。
     */
    private String destIp;

    /**
     * 本端IP地址，all表示全部。
     */
    private String localIp;

    /**
     * 远端IP地址组
     */
    private String remoteIpSet;

    /**
     * 远端IP地址族
     */
    private String remoteIpGroup;

    /**
     * 允许/拒绝，取值allow或deny。
     */
    private String action;

    /**
     * 优先级，取值范围1-1000。
     */
    private Integer priority;

    /**
     * 企业安全组规则ID
     */
    private String enterpriseSecurityGroupRuleId;

    /**
     * 企业安全组规则创建时间
     */
    private String createdTime;

    /**
     * 企业安全组规则修改时间
     */
    private String updatedTime;

    public EnterpriseSecurityGroupRuleModel setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public EnterpriseSecurityGroupRuleModel setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public EnterpriseSecurityGroupRuleModel setEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    public String getEthertype() {
        return this.ethertype;
    }

    public EnterpriseSecurityGroupRuleModel setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    public String getPortRange() {
        return this.portRange;
    }

    public EnterpriseSecurityGroupRuleModel setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public EnterpriseSecurityGroupRuleModel setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public EnterpriseSecurityGroupRuleModel setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    public String getSourceIp() {
        return this.sourceIp;
    }

    public EnterpriseSecurityGroupRuleModel setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public String getDestIp() {
        return this.destIp;
    }

    public EnterpriseSecurityGroupRuleModel setLocalIp(String localIp) {
        this.localIp = localIp;
        return this;
    }

    public String getLocalIp() {
        return this.localIp;
    }

    public EnterpriseSecurityGroupRuleModel setRemoteIpSet(String remoteIpSet) {
        this.remoteIpSet = remoteIpSet;
        return this;
    }

    public String getRemoteIpSet() {
        return this.remoteIpSet;
    }

    public EnterpriseSecurityGroupRuleModel setRemoteIpGroup(String remoteIpGroup) {
        this.remoteIpGroup = remoteIpGroup;
        return this;
    }

    public String getRemoteIpGroup() {
        return this.remoteIpGroup;
    }

    public EnterpriseSecurityGroupRuleModel setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public EnterpriseSecurityGroupRuleModel setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public EnterpriseSecurityGroupRuleModel setEnterpriseSecurityGroupRuleId(String enterpriseSecurityGroupRuleId) {
        this.enterpriseSecurityGroupRuleId = enterpriseSecurityGroupRuleId;
        return this;
    }

    public String getEnterpriseSecurityGroupRuleId() {
        return this.enterpriseSecurityGroupRuleId;
    }

    public EnterpriseSecurityGroupRuleModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public EnterpriseSecurityGroupRuleModel setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    @Override
    public String toString() {
        return "EnterpriseSecurityGroupRuleModel{" + "remark=" + remark + "\n" + "direction=" + direction + "\n" + "ethertype=" + ethertype + "\n" + "portRange=" + portRange
                + "\n" + "sourcePortRange=" + sourcePortRange + "\n" + "protocol=" + protocol + "\n" + "sourceIp=" + sourceIp + "\n" + "destIp=" + destIp + "\n" + "localIp="
                + localIp + "\n" + "remoteIpSet=" + remoteIpSet + "\n" + "remoteIpGroup=" + remoteIpGroup + "\n" + "action=" + action + "\n" + "priority=" + priority + "\n"
                + "enterpriseSecurityGroupRuleId=" + enterpriseSecurityGroupRuleId + "\n" + "createdTime=" + createdTime + "\n" + "updatedTime=" + updatedTime + "\n" + "}";
    }

}