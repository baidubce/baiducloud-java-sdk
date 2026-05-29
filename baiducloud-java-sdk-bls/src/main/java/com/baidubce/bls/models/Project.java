package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project {
    /**
     * 日志组UUID
     */
    private String uuid;

    /**
     * 日志组名称
     */
    private String name;

    /**
     * 日志组描述
     */
    private String description;

    /**
     * 日志组是否置顶
     */
    private Boolean top;

    /**
     * 日志组中日志集的个数
     */
    private Integer logStoreCount;

    /**
     * 日志组创建的日期时间
     */
    private String createdTime;

    /**
     * 日志组最后修改的日期时间
     */
    private String updatedTime;

    public Project setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return this.uuid;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Project setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Project setTop(Boolean top) {
        this.top = top;
        return this;
    }

    public Boolean getTop() {
        return this.top;
    }

    public Project setLogStoreCount(Integer logStoreCount) {
        this.logStoreCount = logStoreCount;
        return this;
    }

    public Integer getLogStoreCount() {
        return this.logStoreCount;
    }

    public Project setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public Project setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    @Override
    public String toString() {
        return "Project{" + "uuid=" + uuid + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "top=" + top + "\n" + "logStoreCount=" + logStoreCount + "\n"
                + "createdTime=" + createdTime + "\n" + "updatedTime=" + updatedTime + "\n" + "}";
    }

}