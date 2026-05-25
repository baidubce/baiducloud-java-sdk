package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAclRulesRequest extends BaseBceRequest {

    /**
    * aclRuleId
    */
    @JsonIgnore
    private String aclRuleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 备注
    */
    private String description;

    /**
    * 协议，包括all/tcp/udp/icmp
    */
    private String protocol;

    /**
    * 源IP
    */
    private String sourceIpAddress;

    /**
    * 目的IP
    */
    private String destinationIpAddress;

    /**
    * 源端口
    */
    private String sourcePort;

    /**
    * 目的端口
    */
    private String destinationPort;

    /**
    * 优先级 1-5000且不能与已有条目重复；数值越小，优先级越高，规则匹配顺序为按优先级由高到低匹配
    */
    private Integer position;

    /**
    * 策略，包括allow和deny
    */
    private String action;

    public String getAclRuleId() {
        return aclRuleId;
    }

    public UpdateAclRulesRequest setAclRuleId(String aclRuleId) {
        this.aclRuleId = aclRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAclRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAclRulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public UpdateAclRulesRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    public UpdateAclRulesRequest setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }

    public String getDestinationIpAddress() {
        return destinationIpAddress;
    }

    public UpdateAclRulesRequest setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }

    public String getSourcePort() {
        return sourcePort;
    }

    public UpdateAclRulesRequest setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public UpdateAclRulesRequest setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    public Integer getPosition() {
        return position;
    }

    public UpdateAclRulesRequest setPosition(Integer position) {
        this.position = position;
        return this;
    }

    public String getAction() {
        return action;
    }

    public UpdateAclRulesRequest setAction(String action) {
        this.action = action;
        return this;
    }

}
