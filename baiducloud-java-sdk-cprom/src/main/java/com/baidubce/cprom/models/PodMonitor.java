package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PodMonitor {
    /**
     * 固定值：monitoring.coreos.com/v1
     */
    private String apiVersion;

    /**
     * 固定值：PodMonitor
     */
    private String kind;

    /**
     * metadata
     */
    private ObjectMeta metadata;

    /**
     * spec
     */
    private PodMonitorSpec spec;

    public PodMonitor setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public PodMonitor setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getKind() {
        return this.kind;
    }

    public PodMonitor setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ObjectMeta getMetadata() {
        return this.metadata;
    }

    public PodMonitor setSpec(PodMonitorSpec spec) {
        this.spec = spec;
        return this;
    }

    public PodMonitorSpec getSpec() {
        return this.spec;
    }

    @Override
    public String toString() {
        return "PodMonitor{" + "apiVersion=" + apiVersion + "\n" + "kind=" + kind + "\n" + "metadata=" + metadata + "\n" + "spec=" + spec + "\n" + "}";
    }

}