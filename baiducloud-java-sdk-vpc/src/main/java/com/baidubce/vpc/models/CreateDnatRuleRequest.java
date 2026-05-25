package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDnatRuleRequest extends BaseBceRequest {

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 名称，由大小写字母、数字以及-\_ /.特殊字符组成，必须以字母开头，长度1-65
    */
    private String ruleName;

    /**
    * 公网IP，关联在NAT网关dnatEips或bindEips上的EIP或共享带宽中的IP
    */
    private String publicIpAddress;

    /**
    * 内网IP
    */
    private String privateIpAddress;

    /**
    * 协议，支持TCP、UDP、all
    */
    private String protocol;

    /**
    * 公网端口(1-65535)，协议为TCP、UDP时有效，不能与端口范围同时指定
    */
    private Integer publicPort;

    /**
    * 内网端口(1-65535)，协议为TCP、UDP时有效，不能与端口范围同时指定
    */
    private Integer privatePort;

    /**
    * 公网端口范围，如“80-90”，协议为TCP、UDP时有效，不能与单个端口同时指定
    */
    private String publicPortRange;

    /**
    * 内网端口范围，如“80-90”，协议为TCP、UDP时有效，不能与单个端口同时指定
    */
    private String privatePortRange;

    public String getNatId() {
        return natId;
    }

    public CreateDnatRuleRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateDnatRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRuleName() {
        return ruleName;
    }

    public CreateDnatRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public CreateDnatRuleRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public CreateDnatRuleRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public CreateDnatRuleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public Integer getPublicPort() {
        return publicPort;
    }

    public CreateDnatRuleRequest setPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
        return this;
    }

    public Integer getPrivatePort() {
        return privatePort;
    }

    public CreateDnatRuleRequest setPrivatePort(Integer privatePort) {
        this.privatePort = privatePort;
        return this;
    }

    public String getPublicPortRange() {
        return publicPortRange;
    }

    public CreateDnatRuleRequest setPublicPortRange(String publicPortRange) {
        this.publicPortRange = publicPortRange;
        return this;
    }

    public String getPrivatePortRange() {
        return privatePortRange;
    }

    public CreateDnatRuleRequest setPrivatePortRange(String privatePortRange) {
        this.privatePortRange = privatePortRange;
        return this;
    }

}
