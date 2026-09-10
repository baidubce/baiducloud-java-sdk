package com.baidubce.cce.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CAConfig {
    /**
     * 
     */
    private Integer replicaCount;

    /**
     * 
     */
    private Boolean scaleDownEnabled;

    /**
     * 
     */
    private Integer scaleDownUtilizationThreshold;

    /**
     * 
     */
    private Integer scaleDownGPUUtilizationThreshold;

    /**
     * 
     */
    private Integer scaleDownUnneededTime;

    /**
     * 
     */
    private Integer scaleDownDelayAfterAdd;

    /**
     * 
     */
    private Integer maxEmptyBulkDelete;

    /**
     * 
     */
    private Boolean skipNodesWithLocalStorage;

    /**
     * 
     */
    private Boolean skipNodesWithSystemPods;

    /**
     * 
     */
    private String expander;

    /**
     * 
     */
    private Map<String, String> customConfigs;

    public CAConfig setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    public Integer getReplicaCount() {
        return this.replicaCount;
    }

    public CAConfig setScaleDownEnabled(Boolean scaleDownEnabled) {
        this.scaleDownEnabled = scaleDownEnabled;
        return this;
    }

    public Boolean getScaleDownEnabled() {
        return this.scaleDownEnabled;
    }

    public CAConfig setScaleDownUtilizationThreshold(Integer scaleDownUtilizationThreshold) {
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        return this;
    }

    public Integer getScaleDownUtilizationThreshold() {
        return this.scaleDownUtilizationThreshold;
    }

    public CAConfig setScaleDownGPUUtilizationThreshold(Integer scaleDownGPUUtilizationThreshold) {
        this.scaleDownGPUUtilizationThreshold = scaleDownGPUUtilizationThreshold;
        return this;
    }

    public Integer getScaleDownGPUUtilizationThreshold() {
        return this.scaleDownGPUUtilizationThreshold;
    }

    public CAConfig setScaleDownUnneededTime(Integer scaleDownUnneededTime) {
        this.scaleDownUnneededTime = scaleDownUnneededTime;
        return this;
    }

    public Integer getScaleDownUnneededTime() {
        return this.scaleDownUnneededTime;
    }

    public CAConfig setScaleDownDelayAfterAdd(Integer scaleDownDelayAfterAdd) {
        this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
        return this;
    }

    public Integer getScaleDownDelayAfterAdd() {
        return this.scaleDownDelayAfterAdd;
    }

    public CAConfig setMaxEmptyBulkDelete(Integer maxEmptyBulkDelete) {
        this.maxEmptyBulkDelete = maxEmptyBulkDelete;
        return this;
    }

    public Integer getMaxEmptyBulkDelete() {
        return this.maxEmptyBulkDelete;
    }

    public CAConfig setSkipNodesWithLocalStorage(Boolean skipNodesWithLocalStorage) {
        this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
        return this;
    }

    public Boolean getSkipNodesWithLocalStorage() {
        return this.skipNodesWithLocalStorage;
    }

    public CAConfig setSkipNodesWithSystemPods(Boolean skipNodesWithSystemPods) {
        this.skipNodesWithSystemPods = skipNodesWithSystemPods;
        return this;
    }

    public Boolean getSkipNodesWithSystemPods() {
        return this.skipNodesWithSystemPods;
    }

    public CAConfig setExpander(String expander) {
        this.expander = expander;
        return this;
    }

    public String getExpander() {
        return this.expander;
    }

    public CAConfig setCustomConfigs(Map<String, String> customConfigs) {
        this.customConfigs = customConfigs;
        return this;
    }

    public Map<String, String> getCustomConfigs() {
        return this.customConfigs;
    }

    @Override
    public String toString() {
        return "CAConfig{" + "replicaCount=" + replicaCount + "\n" + "scaleDownEnabled=" + scaleDownEnabled + "\n" + "scaleDownUtilizationThreshold="
                + scaleDownUtilizationThreshold + "\n" + "scaleDownGPUUtilizationThreshold=" + scaleDownGPUUtilizationThreshold + "\n" + "scaleDownUnneededTime="
                + scaleDownUnneededTime + "\n" + "scaleDownDelayAfterAdd=" + scaleDownDelayAfterAdd + "\n" + "maxEmptyBulkDelete=" + maxEmptyBulkDelete + "\n"
                + "skipNodesWithLocalStorage=" + skipNodesWithLocalStorage + "\n" + "skipNodesWithSystemPods=" + skipNodesWithSystemPods + "\n" + "expander=" + expander + "\n"
                + "customConfigs=" + customConfigs + "\n" + "}";
    }

}