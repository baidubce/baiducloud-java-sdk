package com.baidubce.ccr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerPolicy {
    /**
     * 触发器创建时间
     */
    private String creationTime;

    /**
     * 触发器策略备注
     */
    private String description;

    /**
     * 启动状态
     */
    private Boolean enabled;

    /**
     * 
     */
    private List<String> eventTypes;

    /**
     * 触发规则
     */
    private List<TriggerFilter> filters;

    /**
     * 触发器 ID
     */
    private Integer id;

    /**
     * 触发器名称
     */
    private String name;

    /**
     * 访问配置
     */
    private List<TriggerTarget> targets;

    /**
     * 触发器更新时间
     */
    private String updateTime;

    public TriggerPolicy setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public TriggerPolicy setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public TriggerPolicy setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public TriggerPolicy setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public List<String> getEventTypes() {
        return this.eventTypes;
    }

    public TriggerPolicy setFilters(List<TriggerFilter> filters) {
        this.filters = filters;
        return this;
    }

    public List<TriggerFilter> getFilters() {
        return this.filters;
    }

    public TriggerPolicy setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public TriggerPolicy setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TriggerPolicy setTargets(List<TriggerTarget> targets) {
        this.targets = targets;
        return this;
    }

    public List<TriggerTarget> getTargets() {
        return this.targets;
    }

    public TriggerPolicy setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "TriggerPolicy{" + "creationTime=" + creationTime + "\n" + "description=" + description + "\n" + "enabled=" + enabled + "\n" + "eventTypes=" + eventTypes + "\n"
                + "filters=" + filters + "\n" + "id=" + id + "\n" + "name=" + name + "\n" + "targets=" + targets + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}