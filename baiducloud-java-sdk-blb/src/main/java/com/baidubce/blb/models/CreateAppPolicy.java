package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppPolicy {
    /**
     * 策略绑定服务器组标识符，当绑定的目标组类型为服务器组时该字段必传
     */
    private String appServerGroupId;

    /**
     * 策略绑定IP组标识符，当绑定的目标组类型为IP组时该字段必传
     */
    private String appIpGroupId;

    /**
     * 
     */
    private Integer backendPort;

    /**
     * 目标端口类型，当目标组是服务器组时默认为目标端口号所使用的协议
     */
    private String portType;

    /**
     * 策略优先级，有效取值范围是1-32768
     */
    private Integer priority;

    /**
     * 策略规则列表
     */
    private List<CreateAppRule> ruleList;

    /**
     * 策略描述默认为空
     */
    private String desc;

    public CreateAppPolicy setAppServerGroupId(String appServerGroupId) {
        this.appServerGroupId = appServerGroupId;
        return this;
    }

    public String getAppServerGroupId() {
        return this.appServerGroupId;
    }

    public CreateAppPolicy setAppIpGroupId(String appIpGroupId) {
        this.appIpGroupId = appIpGroupId;
        return this;
    }

    public String getAppIpGroupId() {
        return this.appIpGroupId;
    }

    public CreateAppPolicy setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public Integer getBackendPort() {
        return this.backendPort;
    }

    public CreateAppPolicy setPortType(String portType) {
        this.portType = portType;
        return this;
    }

    public String getPortType() {
        return this.portType;
    }

    public CreateAppPolicy setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public CreateAppPolicy setRuleList(List<CreateAppRule> ruleList) {
        this.ruleList = ruleList;
        return this;
    }

    public List<CreateAppRule> getRuleList() {
        return this.ruleList;
    }

    public CreateAppPolicy setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "CreateAppPolicy{" + "appServerGroupId=" + appServerGroupId + "\n" + "appIpGroupId=" + appIpGroupId + "\n" + "backendPort=" + backendPort + "\n" + "portType="
                + portType + "\n" + "priority=" + priority + "\n" + "ruleList=" + ruleList + "\n" + "desc=" + desc + "\n" + "}";
    }

}