package com.baidubce.cprom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceMonitorSpec {
    /**
     * 采集端点配置列表
     */
    private List<ServiceMonitorEndpoint> endpoints;

    /**
     * namespaceSelector
     */
    private NamespaceSelector namespaceSelector;

    /**
     * selector
     */
    private LabelSelector selector;

    public ServiceMonitorSpec setEndpoints(List<ServiceMonitorEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public List<ServiceMonitorEndpoint> getEndpoints() {
        return this.endpoints;
    }

    public ServiceMonitorSpec setNamespaceSelector(NamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public NamespaceSelector getNamespaceSelector() {
        return this.namespaceSelector;
    }

    public ServiceMonitorSpec setSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public LabelSelector getSelector() {
        return this.selector;
    }

    @Override
    public String toString() {
        return "ServiceMonitorSpec{" + "endpoints=" + endpoints + "\n" + "namespaceSelector=" + namespaceSelector + "\n" + "selector=" + selector + "\n" + "}";
    }

}