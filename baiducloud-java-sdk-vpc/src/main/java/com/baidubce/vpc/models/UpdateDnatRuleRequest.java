package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDnatRuleRequest extends BaseBceRequest {

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

    /**
    * ruleId
    */
    @JsonIgnore
    private String ruleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * DNAT规则名字
    */
    private String ruleName;

    /**
    * 协议，支持TCP、UDP、all
    */
    private String protocol;

    /**
    * 公网端口
    */
    private Integer publicPort;

    /**
    * 内网端口
    */
    private Integer privatePort;

    /**
    * 公网端口范围
    */
    private String publicPortRange;

    /**
    * 内网端口范围
    */
    private String privatePortRange;

    /**
    * 内网IP
    */
    private String privateIpAddress;

    /**
    * 公网IP
    */
    private String publicIpAddress;

    public String getNatId() {
        return natId;
    }

    public UpdateDnatRuleRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getRuleId() {
        return ruleId;
    }

    public UpdateDnatRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateDnatRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRuleName() {
        return ruleName;
    }

    public UpdateDnatRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public UpdateDnatRuleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public Integer getPublicPort() {
        return publicPort;
    }

    public UpdateDnatRuleRequest setPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
        return this;
    }

    public Integer getPrivatePort() {
        return privatePort;
    }

    public UpdateDnatRuleRequest setPrivatePort(Integer privatePort) {
        this.privatePort = privatePort;
        return this;
    }

    public String getPublicPortRange() {
        return publicPortRange;
    }

    public UpdateDnatRuleRequest setPublicPortRange(String publicPortRange) {
        this.publicPortRange = publicPortRange;
        return this;
    }

    public String getPrivatePortRange() {
        return privatePortRange;
    }

    public UpdateDnatRuleRequest setPrivatePortRange(String privatePortRange) {
        this.privatePortRange = privatePortRange;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public UpdateDnatRuleRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public UpdateDnatRuleRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

}
