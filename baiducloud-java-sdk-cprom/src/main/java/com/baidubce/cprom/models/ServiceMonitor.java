package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceMonitor {
    /**
     * 固定值：monitoring.coreos.com/v1
     */
    private String apiVersion;

    /**
     * 固定值：ServiceMonitor
     */
    private String kind;

    /**
     * metadata
     */
    private ObjectMeta metadata;

    /**
     * spec
     */
    private ServiceMonitorSpec spec;

    public ServiceMonitor setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public ServiceMonitor setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getKind() {
        return this.kind;
    }

    public ServiceMonitor setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ObjectMeta getMetadata() {
        return this.metadata;
    }

    public ServiceMonitor setSpec(ServiceMonitorSpec spec) {
        this.spec = spec;
        return this;
    }

    public ServiceMonitorSpec getSpec() {
        return this.spec;
    }

    @Override
    public String toString() {
        return "ServiceMonitor{" + "apiVersion=" + apiVersion + "\n" + "kind=" + kind + "\n" + "metadata=" + metadata + "\n" + "spec=" + spec + "\n" + "}";
    }

}