package com.baidubce.cprom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PodMonitorSpec {
    /**
     * namespaceSelector
     */
    private NamespaceSelector namespaceSelector;

    /**
     * 采集端点配置列表
     */
    private List<PodMetricsEndpoint> podMetricsEndpoints;

    /**
     * selector
     */
    private LabelSelector selector;

    public PodMonitorSpec setNamespaceSelector(NamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public NamespaceSelector getNamespaceSelector() {
        return this.namespaceSelector;
    }

    public PodMonitorSpec setPodMetricsEndpoints(List<PodMetricsEndpoint> podMetricsEndpoints) {
        this.podMetricsEndpoints = podMetricsEndpoints;
        return this;
    }

    public List<PodMetricsEndpoint> getPodMetricsEndpoints() {
        return this.podMetricsEndpoints;
    }

    public PodMonitorSpec setSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public LabelSelector getSelector() {
        return this.selector;
    }

    @Override
    public String toString() {
        return "PodMonitorSpec{" + "namespaceSelector=" + namespaceSelector + "\n" + "podMetricsEndpoints=" + podMetricsEndpoints + "\n" + "selector=" + selector + "\n" + "}";
    }

}