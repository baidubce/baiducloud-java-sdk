package com.baidubce.cprom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PodMonitorItem {
    /**
     * Pod Monitor名称
     */
    private String podMonitorName;

    /**
     * Pod Monitor命名空间
     */
    private String namespace;

    /**
     * 是否启用：true/false
     */
    private String enable;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 端点信息
     */
    private List<Endpoint> endpoints;

    public PodMonitorItem setPodMonitorName(String podMonitorName) {
        this.podMonitorName = podMonitorName;
        return this;
    }

    public String getPodMonitorName() {
        return this.podMonitorName;
    }

    public PodMonitorItem setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public PodMonitorItem setEnable(String enable) {
        this.enable = enable;
        return this;
    }

    public String getEnable() {
        return this.enable;
    }

    public PodMonitorItem setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public PodMonitorItem setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public List<Endpoint> getEndpoints() {
        return this.endpoints;
    }

    @Override
    public String toString() {
        return "PodMonitorItem{" + "podMonitorName=" + podMonitorName + "\n" + "namespace=" + namespace + "\n" + "enable=" + enable + "\n" + "createTime=" + createTime + "\n"
                + "endpoints=" + endpoints + "\n" + "}";
    }

}