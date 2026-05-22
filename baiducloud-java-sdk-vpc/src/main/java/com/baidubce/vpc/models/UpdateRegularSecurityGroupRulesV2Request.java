package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRegularSecurityGroupRulesV2Request extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * sgVersion
    */
    @JsonIgnore
    private Long sgVersion;

    /**
    * 安全组规则ID
    */
    private String securityGroupRuleId;

    /**
    * 描述
    */
    private String remark;

    /**
    * 端口范围
    */
    private String portRange;

    /**
    * 入站规则Ip，与sourceGroupId不可同时存在
    */
    private String sourceIp;

    /**
    * 入站规则安全组ID，与sourceIp不可同时存在
    */
    private String sourceGroupId;

    /**
    * 出站规则Ip，与destGroupId不可同时存在
    */
    private String destIp;

    /**
    * 出站规则安全组ID，与destIp不可同时存在
    */
    private String destGroupId;

    /**
    * 协议，暂不支持tcp/udp转icmp
    */
    private String protocol;

    public String getClientToken() {
        return clientToken;
    }

    public UpdateRegularSecurityGroupRulesV2Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Long getSgVersion() {
        return sgVersion;
    }

    public UpdateRegularSecurityGroupRulesV2Request setSgVersion(Long sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public String getSecurityGroupRuleId() {
        return securityGroupRuleId;
    }

    public UpdateRegularSecurityGroupRulesV2Request setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public UpdateRegularSecurityGroupRulesV2Request setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getPortRange() {
        return portRange;
    }

    public UpdateRegularSecurityGroupRulesV2Request setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public UpdateRegularSecurityGroupRulesV2Request setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    public String getSourceGroupId() {
        return sourceGroupId;
    }

    public UpdateRegularSecurityGroupRulesV2Request setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }

    public String getDestIp() {
        return destIp;
    }

    public UpdateRegularSecurityGroupRulesV2Request setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public String getDestGroupId() {
        return destGroupId;
    }

    public UpdateRegularSecurityGroupRulesV2Request setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public UpdateRegularSecurityGroupRulesV2Request setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

}
