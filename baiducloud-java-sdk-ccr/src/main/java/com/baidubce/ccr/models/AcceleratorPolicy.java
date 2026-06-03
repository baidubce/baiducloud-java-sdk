package com.baidubce.ccr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceleratorPolicy {
    /**
     * 镜像加速规则创建时间
     */
    private String creationTime;

    /**
     * 备注
     */
    private String description;

    /**
     * 镜像加速规则是否开启
     */
    private Boolean enabled;

    /**
     * 触发规则
     */
    private List<AcceleratorFilter> filters;

    /**
     * 镜像加速规则 ID
     */
    private Integer id;

    /**
     * 镜像加速规则名称
     */
    private String name;

    /**
     * 镜像加速规则更新时间
     */
    private String updateTime;

    public AcceleratorPolicy setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public AcceleratorPolicy setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public AcceleratorPolicy setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public AcceleratorPolicy setFilters(List<AcceleratorFilter> filters) {
        this.filters = filters;
        return this;
    }

    public List<AcceleratorFilter> getFilters() {
        return this.filters;
    }

    public AcceleratorPolicy setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public AcceleratorPolicy setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AcceleratorPolicy setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "AcceleratorPolicy{" + "creationTime=" + creationTime + "\n" + "description=" + description + "\n" + "enabled=" + enabled + "\n" + "filters=" + filters + "\n"
                + "id=" + id + "\n" + "name=" + name + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}