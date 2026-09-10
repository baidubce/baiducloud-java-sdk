package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterAutoscalerSpec {
    /**
     * 
     */
    private Boolean enabled;

    /**
     * 
     */
    private Integer minReplicas;

    /**
     * 
     */
    private Integer maxReplicas;

    /**
     * 
     */
    private Integer scalingGroupPriority;

    public ClusterAutoscalerSpec setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ClusterAutoscalerSpec setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    public Integer getMinReplicas() {
        return this.minReplicas;
    }

    public ClusterAutoscalerSpec setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    public Integer getMaxReplicas() {
        return this.maxReplicas;
    }

    public ClusterAutoscalerSpec setScalingGroupPriority(Integer scalingGroupPriority) {
        this.scalingGroupPriority = scalingGroupPriority;
        return this;
    }

    public Integer getScalingGroupPriority() {
        return this.scalingGroupPriority;
    }

    @Override
    public String toString() {
        return "ClusterAutoscalerSpec{" + "enabled=" + enabled + "\n" + "minReplicas=" + minReplicas + "\n" + "maxReplicas=" + maxReplicas + "\n" + "scalingGroupPriority="
                + scalingGroupPriority + "\n" + "}";
    }

}