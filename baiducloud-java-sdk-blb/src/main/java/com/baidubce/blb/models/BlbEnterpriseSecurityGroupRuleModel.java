package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlbEnterpriseSecurityGroupRuleModel {
    /**
     * 备注，长度1-255。
     */
    private String remark;

    /**
     * 入站/出站，取值ingress或egress。
     */
    private String direction;

    /**
     * 网络类型，取值IPv4或IPv6。值为空时表示默认取值IPv4。
     */
    private String ethertype;

    /**
     * 端口范围，支持连续端口（比如“1-80”）和离散端口（比如“80,7000,8000”，英文逗号隔开，离散值数量不超过15个），值为空时默认取值1-65535。
     */
    private String portRange;

    /**
     * 协议类型，tcp、udp或icmp，值为空时默认取值all。
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

    public BlbEnterpriseSecurityGroupRuleModel setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public BlbEnterpriseSecurityGroupRuleModel setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    public BlbEnterpriseSecurityGroupRuleModel setEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    public String getEthertype() {
        return this.ethertype;
    }

    public BlbEnterpriseSecurityGroupRuleModel setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    public String getPortRange() {
        return this.portRange;
    }

    public BlbEnterpriseSecurityGroupRuleModel setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public BlbEnterpriseSecurityGroupRuleModel setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    public String getSourceIp() {
        return this.sourceIp;
    }

    public BlbEnterpriseSecurityGroupRuleModel setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public String getDestIp() {
        return this.destIp;
    }

    public BlbEnterpriseSecurityGroupRuleModel setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public BlbEnterpriseSecurityGroupRuleModel setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public BlbEnterpriseSecurityGroupRuleModel setEnterpriseSecurityGroupRuleId(String enterpriseSecurityGroupRuleId) {
        this.enterpriseSecurityGroupRuleId = enterpriseSecurityGroupRuleId;
        return this;
    }

    public String getEnterpriseSecurityGroupRuleId() {
        return this.enterpriseSecurityGroupRuleId;
    }

    @Override
    public String toString() {
        return "BlbEnterpriseSecurityGroupRuleModel{" + "remark=" + remark + "\n" + "direction=" + direction + "\n" + "ethertype=" + ethertype + "\n" + "portRange=" + portRange
                + "\n" + "protocol=" + protocol + "\n" + "sourceIp=" + sourceIp + "\n" + "destIp=" + destIp + "\n" + "action=" + action + "\n" + "priority=" + priority + "\n"
                + "enterpriseSecurityGroupRuleId=" + enterpriseSecurityGroupRuleId + "\n" + "}";
    }

}