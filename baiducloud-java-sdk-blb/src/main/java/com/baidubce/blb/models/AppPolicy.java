package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppPolicy {
    /**
     * 策略标识符
     */
    private String id;

    /**
     * 策略描述默认为空
     */
    private String desc;

    /**
     * 策略绑定服务器组标识符
     */
    private String appServerGroupId;

    /**
     * 策略绑定服务器组名称
     */
    private String appServerGroupName;

    /**
     * 策略绑定IP组标识符
     */
    private String appIpGroupId;

    /**
     * 策略绑定IP组名称
     */
    private String appIpGroupName;

    /**
     * 前端服务器的监听端口
     */
    private Integer frontendPort;

    /**
     * 前端服务器的监听端口协议
     */
    private String type;

    /**
     * 
     */
    private Integer backendPort;

    /**
     * 端口类型
     */
    private String portType;

    /**
     * 策略优先级，有效取值范围是1-32768
     */
    private Integer priority;

    /**
     * 策略规则列表
     */
    private List<AppRule> ruleList;

    /**
     * "Server" 表示后端绑定的是服务器组，“IP” 表示后端绑定的是IP组
     */
    private String groupType;

    public AppPolicy setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AppPolicy setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public AppPolicy setAppServerGroupId(String appServerGroupId) {
        this.appServerGroupId = appServerGroupId;
        return this;
    }

    public String getAppServerGroupId() {
        return this.appServerGroupId;
    }

    public AppPolicy setAppServerGroupName(String appServerGroupName) {
        this.appServerGroupName = appServerGroupName;
        return this;
    }

    public String getAppServerGroupName() {
        return this.appServerGroupName;
    }

    public AppPolicy setAppIpGroupId(String appIpGroupId) {
        this.appIpGroupId = appIpGroupId;
        return this;
    }

    public String getAppIpGroupId() {
        return this.appIpGroupId;
    }

    public AppPolicy setAppIpGroupName(String appIpGroupName) {
        this.appIpGroupName = appIpGroupName;
        return this;
    }

    public String getAppIpGroupName() {
        return this.appIpGroupName;
    }

    public AppPolicy setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public AppPolicy setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public AppPolicy setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public Integer getBackendPort() {
        return this.backendPort;
    }

    public AppPolicy setPortType(String portType) {
        this.portType = portType;
        return this;
    }

    public String getPortType() {
        return this.portType;
    }

    public AppPolicy setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public AppPolicy setRuleList(List<AppRule> ruleList) {
        this.ruleList = ruleList;
        return this;
    }

    public List<AppRule> getRuleList() {
        return this.ruleList;
    }

    public AppPolicy setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    public String getGroupType() {
        return this.groupType;
    }

    @Override
    public String toString() {
        return "AppPolicy{" + "id=" + id + "\n" + "desc=" + desc + "\n" + "appServerGroupId=" + appServerGroupId + "\n" + "appServerGroupName=" + appServerGroupName + "\n"
                + "appIpGroupId=" + appIpGroupId + "\n" + "appIpGroupName=" + appIpGroupName + "\n" + "frontendPort=" + frontendPort + "\n" + "type=" + type + "\n"
                + "backendPort=" + backendPort + "\n" + "portType=" + portType + "\n" + "priority=" + priority + "\n" + "ruleList=" + ruleList + "\n" + "groupType=" + groupType
                + "\n" + "}";
    }

}