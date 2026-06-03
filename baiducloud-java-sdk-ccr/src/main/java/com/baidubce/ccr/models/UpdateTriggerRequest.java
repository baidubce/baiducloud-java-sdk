package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateTriggerRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * policyId
    */
    @JsonIgnore
    private String policyId;

    /**
    * 触发器策略备注
    */
    private String description;

    /**
    * 触发事件列表，有效值为：<br />UPLOAD_CHART（Helm Chart推送）、<br />DOWNLOAD_CHART（Helm Chart拉取）、<br />DELETE_CHART（Helm Chart删除）、<br />PUSH_ARTIFACT（制品推送）、<br />PULL_ARTIFACT（制品拉取）、<br
    * />DELETE_ARTIFACT（制品删除）
    */
    private List<String> eventTypes;

    /**
    * 触发规则
    */
    private List<TriggerFilter> filters;

    /**
    * 触发器名称
    */
    private String name;

    /**
    * 访问配置
    */
    private List<TriggerTarget> targets;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateTriggerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public UpdateTriggerRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateTriggerRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getEventTypes() {
        return eventTypes;
    }

    public UpdateTriggerRequest setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public List<TriggerFilter> getFilters() {
        return filters;
    }

    public UpdateTriggerRequest setFilters(List<TriggerFilter> filters) {
        this.filters = filters;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateTriggerRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<TriggerTarget> getTargets() {
        return targets;
    }

    public UpdateTriggerRequest setTargets(List<TriggerTarget> targets) {
        this.targets = targets;
        return this;
    }

}
