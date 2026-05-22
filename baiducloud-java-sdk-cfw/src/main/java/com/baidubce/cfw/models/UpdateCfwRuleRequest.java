package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateCfwRuleRequest extends BaseBceRequest {

    /**
    * cfwId
    */
    @JsonIgnore
    private String cfwId;

    /**
    * cfwRuleId
    */
    @JsonIgnore
    private String cfwRuleId;

    /**
    * IP协议类型，取值 \[ 4 \| 6 ]
    */
    private Integer ipVersion;

    /**
    * 规则优先级，取值 [ 1-1000 ]
    */
    private Integer priority;

    /**
    * 协议类型，取值 \[ TCP \| UDP \| ICMP \| ALL ]
    */
    private String protocol;

    /**
    * 方向，取值 \[ in \| out ]
    */
    private String direction;

    /**
    * 源IP，0.0.0.0/0表示所有
    */
    private String sourceAddress;

    /**
    * 目的IP，0.0.0.0/0表示所有
    */
    private String destAddress;

    /**
    * 源端口，0-65535表示所有
    */
    private String sourcePort;

    /**
    * 目的端口，0-65535表示所有
    */
    private String destPort;

    /**
    * 策略，取值 \[ allow \| deny ]
    */
    private String action;

    /**
    * CFW规则的描述
    */
    private String description;

    public String getCfwId() {
        return cfwId;
    }

    public UpdateCfwRuleRequest setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getCfwRuleId() {
        return cfwRuleId;
    }

    public UpdateCfwRuleRequest setCfwRuleId(String cfwRuleId) {
        this.cfwRuleId = cfwRuleId;
        return this;
    }

    public Integer getIpVersion() {
        return ipVersion;
    }

    public UpdateCfwRuleRequest setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public UpdateCfwRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public UpdateCfwRuleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public UpdateCfwRuleRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public UpdateCfwRuleRequest setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    public String getDestAddress() {
        return destAddress;
    }

    public UpdateCfwRuleRequest setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    public String getSourcePort() {
        return sourcePort;
    }

    public UpdateCfwRuleRequest setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    public String getDestPort() {
        return destPort;
    }

    public UpdateCfwRuleRequest setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    public String getAction() {
        return action;
    }

    public UpdateCfwRuleRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateCfwRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
