package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CacheRuleInfo {
    /**
     * 缓存管理规则 ID
     */
    private String cacheRuleId;

    /**
     * 缓存管理规则名称
     */
    private String cacheRuleName;

    /**
     * RapidFS 实例 ID
     */
    private String instanceId;

    /**
     * RapidFS 实例名称
     */
    private String instanceName;

    /**
     * 数据源 ID
     */
    private String dataSrcId;

    /**
     * 数据源名称
     */
    private String dataSrcName;

    /**
     * 缓存管理规则类型，枚举值：* WARMUP：缓存预热，将缓存从持久存储预热到 RapidFS 实例内；* EVICTION：缓存淘汰，将已预热到 RapidFS 实例的缓存淘汰
     */
    private String type;

    /**
     * 规则的目录前缀，为数据源目录的相对目录
     */
    private String directory;

    /**
     * 缓存管理规则状态，见 CacheRuleStatus
     */
    private String status;

    /**
     * 创建时间，例如 2026-06-01T23:00:10Z
     */
    private String createTime;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 最近一次任务状态，见 CacheJobStatus
     */
    private String lastJobStatus;

    /**
     * 最近一次任务已完成数据量大小，单位 Bytes
     */
    private Long lastJobSize;

    /**
     * 最近一次任务开始时间，例如 2026-06-01T23:00:10Z
     */
    private String lastJobStartTime;

    /**
     * 最近一次任务结束时间，例如 2026-06-01T23:00:10Z
     */
    private String lastJobEndTime;

    public CacheRuleInfo setCacheRuleId(String cacheRuleId) {
        this.cacheRuleId = cacheRuleId;
        return this;
    }

    public String getCacheRuleId() {
        return this.cacheRuleId;
    }

    public CacheRuleInfo setCacheRuleName(String cacheRuleName) {
        this.cacheRuleName = cacheRuleName;
        return this;
    }

    public String getCacheRuleName() {
        return this.cacheRuleName;
    }

    public CacheRuleInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public CacheRuleInfo setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public CacheRuleInfo setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getDataSrcId() {
        return this.dataSrcId;
    }

    public CacheRuleInfo setDataSrcName(String dataSrcName) {
        this.dataSrcName = dataSrcName;
        return this;
    }

    public String getDataSrcName() {
        return this.dataSrcName;
    }

    public CacheRuleInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public CacheRuleInfo setDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    public String getDirectory() {
        return this.directory;
    }

    public CacheRuleInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public CacheRuleInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public CacheRuleInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public CacheRuleInfo setLastJobStatus(String lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
        return this;
    }

    public String getLastJobStatus() {
        return this.lastJobStatus;
    }

    public CacheRuleInfo setLastJobSize(Long lastJobSize) {
        this.lastJobSize = lastJobSize;
        return this;
    }

    public Long getLastJobSize() {
        return this.lastJobSize;
    }

    public CacheRuleInfo setLastJobStartTime(String lastJobStartTime) {
        this.lastJobStartTime = lastJobStartTime;
        return this;
    }

    public String getLastJobStartTime() {
        return this.lastJobStartTime;
    }

    public CacheRuleInfo setLastJobEndTime(String lastJobEndTime) {
        this.lastJobEndTime = lastJobEndTime;
        return this;
    }

    public String getLastJobEndTime() {
        return this.lastJobEndTime;
    }

    @Override
    public String toString() {
        return "CacheRuleInfo{" + "cacheRuleId=" + cacheRuleId + "\n" + "cacheRuleName=" + cacheRuleName + "\n" + "instanceId=" + instanceId + "\n" + "instanceName="
                + instanceName + "\n" + "dataSrcId=" + dataSrcId + "\n" + "dataSrcName=" + dataSrcName + "\n" + "type=" + type + "\n" + "directory=" + directory + "\n" + "status="
                + status + "\n" + "createTime=" + createTime + "\n" + "description=" + description + "\n" + "lastJobStatus=" + lastJobStatus + "\n" + "lastJobSize=" + lastJobSize
                + "\n" + "lastJobStartTime=" + lastJobStartTime + "\n" + "lastJobEndTime=" + lastJobEndTime + "\n" + "}";
    }

}