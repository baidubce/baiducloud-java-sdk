package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateEnterpriseSecurityGroupRulesRequest extends BaseBceRequest {

    /**
    * enterpriseSecurityGroupRuleId
    */
    @JsonIgnore
    private String enterpriseSecurityGroupRuleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 描述
    */
    private String remark;

    /**
    * 目的端口范围
    */
    private String portRange;

    /**
    * 源端口范围
    */
    private String sourcePortRange;

    /**
    * 入站规则源IP，仅入站规则使用，与remoteIpSet、remoteIpGroup三者选一
    */
    private String sourceIp;

    /**
    * 出站规则目的IP，仅出站规则使用，与remoteIpSet、remoteIpGroup三者选一
    */
    private String destIp;

    /**
    * 本端IP
    */
    private String localIp;

    /**
    * 远端IP地址组，与sourceIp(destIp)、 remoteIpGroup三者选一
    */
    private String remoteIpSet;

    /**
    * 远端IP地址族，与sourceIp(destIp)、 remoteIpSet三者选一
    */
    private String remoteIpGroup;

    /**
    * 允许/拒绝，取值allow或deny
    */
    private String action;

    /**
    * 优先级
    */
    private Integer priority;

    /**
    * 协议，取值all、tcp、udp或icmp
    */
    private String protocol;

    public String getEnterpriseSecurityGroupRuleId() {
        return enterpriseSecurityGroupRuleId;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setEnterpriseSecurityGroupRuleId(String enterpriseSecurityGroupRuleId) {
        this.enterpriseSecurityGroupRuleId = enterpriseSecurityGroupRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getPortRange() {
        return portRange;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    public String getSourcePortRange() {
        return sourcePortRange;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    public String getDestIp() {
        return destIp;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public String getLocalIp() {
        return localIp;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setLocalIp(String localIp) {
        this.localIp = localIp;
        return this;
    }

    public String getRemoteIpSet() {
        return remoteIpSet;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setRemoteIpSet(String remoteIpSet) {
        this.remoteIpSet = remoteIpSet;
        return this;
    }

    public String getRemoteIpGroup() {
        return remoteIpGroup;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setRemoteIpGroup(String remoteIpGroup) {
        this.remoteIpGroup = remoteIpGroup;
        return this;
    }

    public String getAction() {
        return action;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public UpdateEnterpriseSecurityGroupRulesRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

}
