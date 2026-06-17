package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogStoreDetail {
    /**
     * 创建时间
     */
    private String creationDateTime;

    /**
     * 是否关闭自动分裂
     */
    private Boolean disableShardAutoSplit;

    /**
     * 是否开启归档存储
     */
    private Boolean enableArchiveRetention;

    /**
     * 是否开启热存
     */
    private Boolean enableHotRetention;

    /**
     * 热存时长，单位天
     */
    private Integer hotRetention;

    /**
     * 是否开启索引
     */
    private Boolean indexEnabled;

    /**
     * 更新时间
     */
    private String lastModifiedTime;

    /**
     * 日志集名称
     */
    private String logStoreName;

    /**
     * 低频存储时长，单位天
     */
    private Integer lowFrequencyRetention;

    /**
     * 最大分片数量
     */
    private Integer maxShardCount;

    /**
     * 日志项目
     */
    private String project;

    /**
     * 资源id
     */
    private String resourceID;

    /**
     * 存储时长，单位天
     */
    private Integer retention;

    /**
     * 分片数量
     */
    private Integer shardCount;

    /**
     * 日志集短id
     */
    private String shortID;

    /**
     * 日志集标签
     */
    private List<Tag> tags;

    public LogStoreDetail setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    public LogStoreDetail setDisableShardAutoSplit(Boolean disableShardAutoSplit) {
        this.disableShardAutoSplit = disableShardAutoSplit;
        return this;
    }

    public Boolean getDisableShardAutoSplit() {
        return this.disableShardAutoSplit;
    }

    public LogStoreDetail setEnableArchiveRetention(Boolean enableArchiveRetention) {
        this.enableArchiveRetention = enableArchiveRetention;
        return this;
    }

    public Boolean getEnableArchiveRetention() {
        return this.enableArchiveRetention;
    }

    public LogStoreDetail setEnableHotRetention(Boolean enableHotRetention) {
        this.enableHotRetention = enableHotRetention;
        return this;
    }

    public Boolean getEnableHotRetention() {
        return this.enableHotRetention;
    }

    public LogStoreDetail setHotRetention(Integer hotRetention) {
        this.hotRetention = hotRetention;
        return this;
    }

    public Integer getHotRetention() {
        return this.hotRetention;
    }

    public LogStoreDetail setIndexEnabled(Boolean indexEnabled) {
        this.indexEnabled = indexEnabled;
        return this;
    }

    public Boolean getIndexEnabled() {
        return this.indexEnabled;
    }

    public LogStoreDetail setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public LogStoreDetail setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStoreName() {
        return this.logStoreName;
    }

    public LogStoreDetail setLowFrequencyRetention(Integer lowFrequencyRetention) {
        this.lowFrequencyRetention = lowFrequencyRetention;
        return this;
    }

    public Integer getLowFrequencyRetention() {
        return this.lowFrequencyRetention;
    }

    public LogStoreDetail setMaxShardCount(Integer maxShardCount) {
        this.maxShardCount = maxShardCount;
        return this;
    }

    public Integer getMaxShardCount() {
        return this.maxShardCount;
    }

    public LogStoreDetail setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public LogStoreDetail setResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    public String getResourceID() {
        return this.resourceID;
    }

    public LogStoreDetail setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    public Integer getRetention() {
        return this.retention;
    }

    public LogStoreDetail setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    public Integer getShardCount() {
        return this.shardCount;
    }

    public LogStoreDetail setShortID(String shortID) {
        this.shortID = shortID;
        return this;
    }

    public String getShortID() {
        return this.shortID;
    }

    public LogStoreDetail setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "LogStoreDetail{" + "creationDateTime=" + creationDateTime + "\n" + "disableShardAutoSplit=" + disableShardAutoSplit + "\n" + "enableArchiveRetention="
                + enableArchiveRetention + "\n" + "enableHotRetention=" + enableHotRetention + "\n" + "hotRetention=" + hotRetention + "\n" + "indexEnabled=" + indexEnabled + "\n"
                + "lastModifiedTime=" + lastModifiedTime + "\n" + "logStoreName=" + logStoreName + "\n" + "lowFrequencyRetention=" + lowFrequencyRetention + "\n"
                + "maxShardCount=" + maxShardCount + "\n" + "project=" + project + "\n" + "resourceID=" + resourceID + "\n" + "retention=" + retention + "\n" + "shardCount="
                + shardCount + "\n" + "shortID=" + shortID + "\n" + "tags=" + tags + "\n" + "}";
    }

}