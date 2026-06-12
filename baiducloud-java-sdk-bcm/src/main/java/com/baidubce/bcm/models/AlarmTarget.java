package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmTarget {
    /**
     * 目标类型，可选值：ALL_INSTANCES / INSTANCES / TAGS / INSTANCE_GROUPS
     */
    private String type;

    /**
     * 当type=INSTANCES时必填，报警实例列表
     */
    private List<TargetInstance> instances;

    /**
     * 当type=INSTANCES时必填，实例所属region
     */
    private String region;

    /**
     * 当type=TAGS时必填，报警实例标签列表
     */
    private List<Dimension> tags;

    /**
     * 当type=INSTANCE_GROUPS时必填，实例组ID列表
     */
    private List<String> instanceGroups;

    /**
     * 必须包含的维度列表
     */
    private List<String> includingDimensions;

    /**
     * 必须排除的维度列表
     */
    private List<String> excludingDimensions;

    public AlarmTarget setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public AlarmTarget setInstances(List<TargetInstance> instances) {
        this.instances = instances;
        return this;
    }

    public List<TargetInstance> getInstances() {
        return this.instances;
    }

    public AlarmTarget setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public AlarmTarget setTags(List<Dimension> tags) {
        this.tags = tags;
        return this;
    }

    public List<Dimension> getTags() {
        return this.tags;
    }

    public AlarmTarget setInstanceGroups(List<String> instanceGroups) {
        this.instanceGroups = instanceGroups;
        return this;
    }

    public List<String> getInstanceGroups() {
        return this.instanceGroups;
    }

    public AlarmTarget setIncludingDimensions(List<String> includingDimensions) {
        this.includingDimensions = includingDimensions;
        return this;
    }

    public List<String> getIncludingDimensions() {
        return this.includingDimensions;
    }

    public AlarmTarget setExcludingDimensions(List<String> excludingDimensions) {
        this.excludingDimensions = excludingDimensions;
        return this;
    }

    public List<String> getExcludingDimensions() {
        return this.excludingDimensions;
    }

    @Override
    public String toString() {
        return "AlarmTarget{" + "type=" + type + "\n" + "instances=" + instances + "\n" + "region=" + region + "\n" + "tags=" + tags + "\n" + "instanceGroups=" + instanceGroups
                + "\n" + "includingDimensions=" + includingDimensions + "\n" + "excludingDimensions=" + excludingDimensions + "\n" + "}";
    }

}