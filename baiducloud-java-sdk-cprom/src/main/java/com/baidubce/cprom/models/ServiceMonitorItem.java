package com.baidubce.cprom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceMonitorItem {
    /**
     * Service Monitor名称
     */
    private String serviceMonitorName;

    /**
     * Service Monitor命名空间
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

    public ServiceMonitorItem setServiceMonitorName(String serviceMonitorName) {
        this.serviceMonitorName = serviceMonitorName;
        return this;
    }

    public String getServiceMonitorName() {
        return this.serviceMonitorName;
    }

    public ServiceMonitorItem setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public ServiceMonitorItem setEnable(String enable) {
        this.enable = enable;
        return this;
    }

    public String getEnable() {
        return this.enable;
    }

    public ServiceMonitorItem setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public ServiceMonitorItem setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public List<Endpoint> getEndpoints() {
        return this.endpoints;
    }

    @Override
    public String toString() {
        return "ServiceMonitorItem{" + "serviceMonitorName=" + serviceMonitorName + "\n" + "namespace=" + namespace + "\n" + "enable=" + enable + "\n" + "createTime=" + createTime
                + "\n" + "endpoints=" + endpoints + "\n" + "}";
    }

}