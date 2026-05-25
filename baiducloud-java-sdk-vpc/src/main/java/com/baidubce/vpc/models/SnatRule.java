package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SnatRule {
    /**
     * 规则ID
     */
    private String ruleId;

    /**
     * 规则名称，由大小写字母、数字以及-_ /.特殊字符组成，必须以字母开头，长度1-65
     */
    private String ruleName;

    /**
     * 公网IP列表，关联在NAT网关SNAT上的EIP或共享带宽中的IPs
     */
    private List<String> publicIpsAddress;

    /**
     * 内网IP/网段
     */
    private String sourceCIDR;

    /**
     * 规则状态
     */
    private String status;

    public SnatRule setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public SnatRule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public SnatRule setPublicIpsAddress(List<String> publicIpsAddress) {
        this.publicIpsAddress = publicIpsAddress;
        return this;
    }

    public List<String> getPublicIpsAddress() {
        return this.publicIpsAddress;
    }

    public SnatRule setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }

    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    public SnatRule setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "SnatRule{" + "ruleId=" + ruleId + "\n" + "ruleName=" + ruleName + "\n" + "publicIpsAddress=" + publicIpsAddress + "\n" + "sourceCIDR=" + sourceCIDR + "\n"
                + "status=" + status + "\n" + "}";
    }

}