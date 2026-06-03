package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetaSyncRuleInfo {
    /**
     * 元数据同步规则 ID
     */
    private String metaSyncRuleId;

    /**
     * 元数据同步规则名称
     */
    private String metaSyncRuleName;

    /**
     * RapidFS 实例 ID
     */
    private String instanceId;

    /**
     * RapidFS 实例名称
     */
    private String instanceName;

    /**
     * 数据源名称
     */
    private String dataSrcName;

    /**
     * 数据源 ID
     */
    private String dataSrcId;

    /**
     * 元数据同步规则类型，枚举值：* MANUAL：单次同步，需要手动触发；* PERIODIC：周期自动同步
     */
    private String type;

    /**
     * 规则的目录前缀，为数据源目录的相对目录
     */
    private String directory;

    /**
     * 同步间隔周期，单位分钟，周期同步时有效。有效范围 [1, 28800(20 天)]
     */
    private Integer intervalMinutes;

    /**
     * 元数据同步状态，见 MetaSyncRuleStatus
     */
    private String status;

    /**
     * 创建时间，例如 2026-06-01T23:00:10Z"
     */
    private String createTime;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 最近一次任务状态，见 MetaSyncJobStatus
     */
    private String lastJobStatus;

    /**
     * 最近一次任务开始时间，例如 2026-06-01T23:00:10Z"
     */
    private String lastJobStartTime;

    /**
     * 最近一次任务结束时间，例如 2026-06-01T23:00:10Z"
     */
    private String lastJobEndTime;

    public MetaSyncRuleInfo setMetaSyncRuleId(String metaSyncRuleId) {
        this.metaSyncRuleId = metaSyncRuleId;
        return this;
    }

    public String getMetaSyncRuleId() {
        return this.metaSyncRuleId;
    }

    public MetaSyncRuleInfo setMetaSyncRuleName(String metaSyncRuleName) {
        this.metaSyncRuleName = metaSyncRuleName;
        return this;
    }

    public String getMetaSyncRuleName() {
        return this.metaSyncRuleName;
    }

    public MetaSyncRuleInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public MetaSyncRuleInfo setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public MetaSyncRuleInfo setDataSrcName(String dataSrcName) {
        this.dataSrcName = dataSrcName;
        return this;
    }

    public String getDataSrcName() {
        return this.dataSrcName;
    }

    public MetaSyncRuleInfo setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getDataSrcId() {
        return this.dataSrcId;
    }

    public MetaSyncRuleInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public MetaSyncRuleInfo setDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    public String getDirectory() {
        return this.directory;
    }

    public MetaSyncRuleInfo setIntervalMinutes(Integer intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
        return this;
    }

    public Integer getIntervalMinutes() {
        return this.intervalMinutes;
    }

    public MetaSyncRuleInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public MetaSyncRuleInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public MetaSyncRuleInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public MetaSyncRuleInfo setLastJobStatus(String lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
        return this;
    }

    public String getLastJobStatus() {
        return this.lastJobStatus;
    }

    public MetaSyncRuleInfo setLastJobStartTime(String lastJobStartTime) {
        this.lastJobStartTime = lastJobStartTime;
        return this;
    }

    public String getLastJobStartTime() {
        return this.lastJobStartTime;
    }

    public MetaSyncRuleInfo setLastJobEndTime(String lastJobEndTime) {
        this.lastJobEndTime = lastJobEndTime;
        return this;
    }

    public String getLastJobEndTime() {
        return this.lastJobEndTime;
    }

    @Override
    public String toString() {
        return "MetaSyncRuleInfo{" + "metaSyncRuleId=" + metaSyncRuleId + "\n" + "metaSyncRuleName=" + metaSyncRuleName + "\n" + "instanceId=" + instanceId + "\n"
                + "instanceName=" + instanceName + "\n" + "dataSrcName=" + dataSrcName + "\n" + "dataSrcId=" + dataSrcId + "\n" + "type=" + type + "\n" + "directory=" + directory
                + "\n" + "intervalMinutes=" + intervalMinutes + "\n" + "status=" + status + "\n" + "createTime=" + createTime + "\n" + "description=" + description + "\n"
                + "lastJobStatus=" + lastJobStatus + "\n" + "lastJobStartTime=" + lastJobStartTime + "\n" + "lastJobEndTime=" + lastJobEndTime + "\n" + "}";
    }

}