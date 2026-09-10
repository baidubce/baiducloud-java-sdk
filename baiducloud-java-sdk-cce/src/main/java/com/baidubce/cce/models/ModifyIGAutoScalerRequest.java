package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyIGAutoScalerRequest extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * instanceGroupID
    */
    @JsonIgnore
    private String instanceGroupID;

    /**
    * 是否启用Autoscaler
    */
    private Boolean enabled;

    /**
    * 最小副本数. 取值范围是自然数集, 默认值为0.
    */
    private Integer minReplicas;

    /**
    * 最大副本数. 取值范围是自然数集, 需大于minReplicas.
    */
    private Integer maxReplicas;

    /**
    * 伸缩组优先级. 取值范围是自然数集,默认值为0.
    */
    private Integer scalingGroupPriority;

    public String getClusterID() {
        return clusterID;
    }

    public ModifyIGAutoScalerRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceGroupID() {
        return instanceGroupID;
    }

    public ModifyIGAutoScalerRequest setInstanceGroupID(String instanceGroupID) {
        this.instanceGroupID = instanceGroupID;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public ModifyIGAutoScalerRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getMinReplicas() {
        return minReplicas;
    }

    public ModifyIGAutoScalerRequest setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    public ModifyIGAutoScalerRequest setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    public Integer getScalingGroupPriority() {
        return scalingGroupPriority;
    }

    public ModifyIGAutoScalerRequest setScalingGroupPriority(Integer scalingGroupPriority) {
        this.scalingGroupPriority = scalingGroupPriority;
        return this;
    }

}
