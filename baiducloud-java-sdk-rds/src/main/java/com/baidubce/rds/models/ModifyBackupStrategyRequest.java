package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyBackupStrategyRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 以英文半角逗号分隔的备份时日间，周日为第一天，取值0 举例："0,1,2,3,5,6"
    */
    private String backupDays;

    /**
    * 备份开始时间,这里的时间是用的UTC时间
    */
    private String backupTime;

    /**
    * 是否启用备份数据持久化
    */
    private Boolean persistent;

    /**
    * 数据备份保留时长，范围1-730天；未启用则为0或不填
    */
    private Integer expireInDays;

    /**
    * 日志备份保留时长，范围1-730天；未启用则为0或不填
    */
    private Integer logBackupRetainDays;

    /**
    * 类型：physical（物理）、snapshot（快照），仅支持MySQL
    */
    private String dataBackupType;

    /**
    * 是否开启高频备份，默认为 false
    */
    private Boolean incrementalDataBackupEnable;

    /**
    * 增量数据备份间隔（秒）最小粒度是小时级别，开启高频备份后必传，值需要可以被3600整除
    */
    private Integer incrementalDataBackupInterval;

    /**
    * 最新数据备份保留天数（实例删除后），天级别，不传默认0天
    */
    private Integer latestDataBackupRetainDays;

    /**
    * 增量备份保留时长
    */
    private Integer retentionPeriod;

    /**
    * 增量备份保留策略时长单位，取值为 week、month，默认为 week
    */
    private String timeUnit;

    /**
    * 标识是否开启跨地域备份，默认为false
    */
    private Boolean dataBackupCopyEnable;

    /**
    * 表示跨地域备份支持的地域列表，此处暂时只支持单个地域，若填写多个地域，默认取列表中的第一个地域，取值可包括：["bj","gz","bd","su","hkg","fwh","yq","cd","nj"]
    */
    private List<String> dataBackupCopyStoragesRegions;

    /**
    * 跨地域备份保留时长支持1-730天
    */
    private Integer dataBackupCopyRetainDays;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyBackupStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getBackupDays() {
        return backupDays;
    }

    public ModifyBackupStrategyRequest setBackupDays(String backupDays) {
        this.backupDays = backupDays;
        return this;
    }

    public String getBackupTime() {
        return backupTime;
    }

    public ModifyBackupStrategyRequest setBackupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }

    public Boolean getPersistent() {
        return persistent;
    }

    public ModifyBackupStrategyRequest setPersistent(Boolean persistent) {
        this.persistent = persistent;
        return this;
    }

    public Integer getExpireInDays() {
        return expireInDays;
    }

    public ModifyBackupStrategyRequest setExpireInDays(Integer expireInDays) {
        this.expireInDays = expireInDays;
        return this;
    }

    public Integer getLogBackupRetainDays() {
        return logBackupRetainDays;
    }

    public ModifyBackupStrategyRequest setLogBackupRetainDays(Integer logBackupRetainDays) {
        this.logBackupRetainDays = logBackupRetainDays;
        return this;
    }

    public String getDataBackupType() {
        return dataBackupType;
    }

    public ModifyBackupStrategyRequest setDataBackupType(String dataBackupType) {
        this.dataBackupType = dataBackupType;
        return this;
    }

    public Boolean getIncrementalDataBackupEnable() {
        return incrementalDataBackupEnable;
    }

    public ModifyBackupStrategyRequest setIncrementalDataBackupEnable(Boolean incrementalDataBackupEnable) {
        this.incrementalDataBackupEnable = incrementalDataBackupEnable;
        return this;
    }

    public Integer getIncrementalDataBackupInterval() {
        return incrementalDataBackupInterval;
    }

    public ModifyBackupStrategyRequest setIncrementalDataBackupInterval(Integer incrementalDataBackupInterval) {
        this.incrementalDataBackupInterval = incrementalDataBackupInterval;
        return this;
    }

    public Integer getLatestDataBackupRetainDays() {
        return latestDataBackupRetainDays;
    }

    public ModifyBackupStrategyRequest setLatestDataBackupRetainDays(Integer latestDataBackupRetainDays) {
        this.latestDataBackupRetainDays = latestDataBackupRetainDays;
        return this;
    }

    public Integer getRetentionPeriod() {
        return retentionPeriod;
    }

    public ModifyBackupStrategyRequest setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public ModifyBackupStrategyRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    public Boolean getDataBackupCopyEnable() {
        return dataBackupCopyEnable;
    }

    public ModifyBackupStrategyRequest setDataBackupCopyEnable(Boolean dataBackupCopyEnable) {
        this.dataBackupCopyEnable = dataBackupCopyEnable;
        return this;
    }

    public List<String> getDataBackupCopyStoragesRegions() {
        return dataBackupCopyStoragesRegions;
    }

    public ModifyBackupStrategyRequest setDataBackupCopyStoragesRegions(List<String> dataBackupCopyStoragesRegions) {
        this.dataBackupCopyStoragesRegions = dataBackupCopyStoragesRegions;
        return this;
    }

    public Integer getDataBackupCopyRetainDays() {
        return dataBackupCopyRetainDays;
    }

    public ModifyBackupStrategyRequest setDataBackupCopyRetainDays(Integer dataBackupCopyRetainDays) {
        this.dataBackupCopyRetainDays = dataBackupCopyRetainDays;
        return this;
    }

}
