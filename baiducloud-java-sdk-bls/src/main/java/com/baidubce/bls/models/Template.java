package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Template {
    /**
     * 保存时长，单位：天
     */
    private Integer retention;

    /**
     * 初始shard个数
     */
    private Integer shardCount;

    /**
     * 是否关闭shard自动分裂
     */
    private Boolean disableShardAutoSplit;

    /**
     * 最大分裂数量，取值范围:[1, 50]
     */
    private Integer maxShardCount;

    /**
     * 是否开启冷热自动分层
     */
    private Boolean enableHotRetention;

    /**
     * 热存时长，单位：天
     */
    private Integer hotRetention;

    /**
     * index
     */
    private Index index;

    /**
     * 模板名称，同user下唯一
     */
    private String name;

    /**
     * 日志组匹配模式，支持*通配符
     */
    private List<String> projectPatterns;

    /**
     * 日志集匹配模式，支持*通配符
     */
    private List<String> logstorePatterns;

    /**
     * 日志集模板优先级，值越大，优先级越高，同user下唯一
     */
    private Integer priority;

    /**
     * 创建时间，UTC时间，格式：2025-04-20T10:01:12Z
     */
    private String createdTimestamp;

    /**
     * 更新时间，UTC时间，格式：2025-04-20T10:01:12Z
     */
    private String updatedTimestamp;

    public Template setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    public Integer getRetention() {
        return this.retention;
    }

    public Template setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    public Integer getShardCount() {
        return this.shardCount;
    }

    public Template setDisableShardAutoSplit(Boolean disableShardAutoSplit) {
        this.disableShardAutoSplit = disableShardAutoSplit;
        return this;
    }

    public Boolean getDisableShardAutoSplit() {
        return this.disableShardAutoSplit;
    }

    public Template setMaxShardCount(Integer maxShardCount) {
        this.maxShardCount = maxShardCount;
        return this;
    }

    public Integer getMaxShardCount() {
        return this.maxShardCount;
    }

    public Template setEnableHotRetention(Boolean enableHotRetention) {
        this.enableHotRetention = enableHotRetention;
        return this;
    }

    public Boolean getEnableHotRetention() {
        return this.enableHotRetention;
    }

    public Template setHotRetention(Integer hotRetention) {
        this.hotRetention = hotRetention;
        return this;
    }

    public Integer getHotRetention() {
        return this.hotRetention;
    }

    public Template setIndex(Index index) {
        this.index = index;
        return this;
    }

    public Index getIndex() {
        return this.index;
    }

    public Template setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Template setProjectPatterns(List<String> projectPatterns) {
        this.projectPatterns = projectPatterns;
        return this;
    }

    public List<String> getProjectPatterns() {
        return this.projectPatterns;
    }

    public Template setLogstorePatterns(List<String> logstorePatterns) {
        this.logstorePatterns = logstorePatterns;
        return this;
    }

    public List<String> getLogstorePatterns() {
        return this.logstorePatterns;
    }

    public Template setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public Template setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public Template setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    @Override
    public String toString() {
        return "Template{" + "retention=" + retention + "\n" + "shardCount=" + shardCount + "\n" + "disableShardAutoSplit=" + disableShardAutoSplit + "\n" + "maxShardCount="
                + maxShardCount + "\n" + "enableHotRetention=" + enableHotRetention + "\n" + "hotRetention=" + hotRetention + "\n" + "index=" + index + "\n" + "name=" + name
                + "\n" + "projectPatterns=" + projectPatterns + "\n" + "logstorePatterns=" + logstorePatterns + "\n" + "priority=" + priority + "\n" + "createdTimestamp="
                + createdTimestamp + "\n" + "updatedTimestamp=" + updatedTimestamp + "\n" + "}";
    }

}