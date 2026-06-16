package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSecurityGroupRuleRequest extends BaseBceRequest {

    /**
    * sgVersion
    */
    @JsonIgnore
    private Integer sgVersion;

    /**
    * 安全组规则ID
    */
    private String securityGroupRuleId;

    /**
    * 规则备注描述
    */
    private String remark;

    /**
    * 端口范围
    */
    private String portRange;

    /**
    * 入站规则IP，与sourceGroupId不可同时存在
    */
    private String sourceIp;

    /**
    * 入站规则安全组ID，与sourceIp不可同时存在
    */
    private String sourceGroupId;

    /**
    * 出站规则IP，与destGroupId不可同时存在
    */
    private String destIp;

    /**
    * 出站规则安全组ID，与destIp不可同时存在
    */
    private String destGroupId;

    /**
    * 协议类型，暂不支持tcp/udp转icmp
    */
    private String protocol;

    public Integer getSgVersion() {
        return sgVersion;
    }

    public UpdateSecurityGroupRuleRequest setSgVersion(Integer sgVersion) {
        this.sgVersion = sgVersion;
        return this;
    }

    public String getSecurityGroupRuleId() {
        return securityGroupRuleId;
    }

    public UpdateSecurityGroupRuleRequest setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public UpdateSecurityGroupRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getPortRange() {
        return portRange;
    }

    public UpdateSecurityGroupRuleRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public UpdateSecurityGroupRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    public String getSourceGroupId() {
        return sourceGroupId;
    }

    public UpdateSecurityGroupRuleRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }

    public String getDestIp() {
        return destIp;
    }

    public UpdateSecurityGroupRuleRequest setDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    public String getDestGroupId() {
        return destGroupId;
    }

    public UpdateSecurityGroupRuleRequest setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public UpdateSecurityGroupRuleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

}
