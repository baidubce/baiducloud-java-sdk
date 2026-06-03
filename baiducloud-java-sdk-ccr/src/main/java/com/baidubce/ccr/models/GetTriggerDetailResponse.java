package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTriggerDetailResponse extends BaseBceResponse {

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
    * 触发器ID
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

    public String getCreationTime() {
        return creationTime;
    }

    public GetTriggerDetailResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetTriggerDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public GetTriggerDetailResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public List<String> getEventTypes() {
        return eventTypes;
    }

    public GetTriggerDetailResponse setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public List<TriggerFilter> getFilters() {
        return filters;
    }

    public GetTriggerDetailResponse setFilters(List<TriggerFilter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetTriggerDetailResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetTriggerDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public List<TriggerTarget> getTargets() {
        return targets;
    }

    public GetTriggerDetailResponse setTargets(List<TriggerTarget> targets) {
        this.targets = targets;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public GetTriggerDetailResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetTriggerDetailResponse{" + "creationTime=" + creationTime + "\n" + "description=" + description + "\n" + "enabled=" + enabled + "\n" + "eventTypes=" + eventTypes
                + "\n" + "filters=" + filters + "\n" + "id=" + id + "\n" + "name=" + name + "\n" + "targets=" + targets + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}
