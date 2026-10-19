package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SnapshotPolicy {
    /**
     * 备份时间. 时:分:秒Z。
     */
    private String backupTime;

    /**
     * 以英文半角逗号分隔的备份时日间，周日为第一天。
     */
    private String backupDays;

    /**
     * 是否启用备份数据持久化。 true：是 ，false：否。
     */
    private Boolean persistent;

    /**
     * 持久化天数（单位:天数）。
     */
    private Integer expireInDays;

    /**
     * 日志备份保留时长（单位:天数）。
     */
    private Integer logBackupRetainDays;

    /**
     * 空闲空间大小（单位:GB）。
     */
    private Integer freeSpaceInGB;

    /**
     * 备份类型，支持physical/snapshot， 取值为：snapshot，磁盘类型为ssd将不支持快照备份。
     */
    private String dataBackupType;

    /**
     * 空闲空间大小（单位:MB）。
     */
    private Integer freeSpace;

    /**
     * 是否开启高频备份，默认为 false。
     */
    private Boolean incrementalDataBackupEnable;

    /**
     * 增量备份保留策略时长单位，取值为 week、month，默认为 week。
     */
    private String timeUnit;

    /**
     * 是否开启备份跨区域复制。true：是，false：否。
     */
    private Boolean dataBackupCopyEnable;

    /**
     * 增量数据备份间隔（秒）最小粒度是小时级别。
     */
    private Integer incrementalDataBackupInterval;

    /**
     * 最新数据备份保留天数（实例删除后），天级别。
     */
    private Integer latestDataBackupRetainDays;

    /**
     * 增量备份保留时长。
     */
    private Integer retentionPeriod;

    /**
     * 数据备份保留策略列表。
     */
    private List<DataBackupRetainStrategy> dataBackupRetainStrategys;

    /**
     * encryptStrategy
     */
    private EncryptStrategy encryptStrategy;

    public SnapshotPolicy setBackupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }

    public String getBackupTime() {
        return this.backupTime;
    }

    public SnapshotPolicy setBackupDays(String backupDays) {
        this.backupDays = backupDays;
        return this;
    }

    public String getBackupDays() {
        return this.backupDays;
    }

    public SnapshotPolicy setPersistent(Boolean persistent) {
        this.persistent = persistent;
        return this;
    }

    public Boolean getPersistent() {
        return this.persistent;
    }

    public SnapshotPolicy setExpireInDays(Integer expireInDays) {
        this.expireInDays = expireInDays;
        return this;
    }

    public Integer getExpireInDays() {
        return this.expireInDays;
    }

    public SnapshotPolicy setLogBackupRetainDays(Integer logBackupRetainDays) {
        this.logBackupRetainDays = logBackupRetainDays;
        return this;
    }

    public Integer getLogBackupRetainDays() {
        return this.logBackupRetainDays;
    }

    public SnapshotPolicy setFreeSpaceInGB(Integer freeSpaceInGB) {
        this.freeSpaceInGB = freeSpaceInGB;
        return this;
    }

    public Integer getFreeSpaceInGB() {
        return this.freeSpaceInGB;
    }

    public SnapshotPolicy setDataBackupType(String dataBackupType) {
        this.dataBackupType = dataBackupType;
        return this;
    }

    public String getDataBackupType() {
        return this.dataBackupType;
    }

    public SnapshotPolicy setFreeSpace(Integer freeSpace) {
        this.freeSpace = freeSpace;
        return this;
    }

    public Integer getFreeSpace() {
        return this.freeSpace;
    }

    public SnapshotPolicy setIncrementalDataBackupEnable(Boolean incrementalDataBackupEnable) {
        this.incrementalDataBackupEnable = incrementalDataBackupEnable;
        return this;
    }

    public Boolean getIncrementalDataBackupEnable() {
        return this.incrementalDataBackupEnable;
    }

    public SnapshotPolicy setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    public String getTimeUnit() {
        return this.timeUnit;
    }

    public SnapshotPolicy setDataBackupCopyEnable(Boolean dataBackupCopyEnable) {
        this.dataBackupCopyEnable = dataBackupCopyEnable;
        return this;
    }

    public Boolean getDataBackupCopyEnable() {
        return this.dataBackupCopyEnable;
    }

    public SnapshotPolicy setIncrementalDataBackupInterval(Integer incrementalDataBackupInterval) {
        this.incrementalDataBackupInterval = incrementalDataBackupInterval;
        return this;
    }

    public Integer getIncrementalDataBackupInterval() {
        return this.incrementalDataBackupInterval;
    }

    public SnapshotPolicy setLatestDataBackupRetainDays(Integer latestDataBackupRetainDays) {
        this.latestDataBackupRetainDays = latestDataBackupRetainDays;
        return this;
    }

    public Integer getLatestDataBackupRetainDays() {
        return this.latestDataBackupRetainDays;
    }

    public SnapshotPolicy setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    public SnapshotPolicy setDataBackupRetainStrategys(List<DataBackupRetainStrategy> dataBackupRetainStrategys) {
        this.dataBackupRetainStrategys = dataBackupRetainStrategys;
        return this;
    }

    public List<DataBackupRetainStrategy> getDataBackupRetainStrategys() {
        return this.dataBackupRetainStrategys;
    }

    public SnapshotPolicy setEncryptStrategy(EncryptStrategy encryptStrategy) {
        this.encryptStrategy = encryptStrategy;
        return this;
    }

    public EncryptStrategy getEncryptStrategy() {
        return this.encryptStrategy;
    }

    @Override
    public String toString() {
        return "SnapshotPolicy{" + "backupTime=" + backupTime + "\n" + "backupDays=" + backupDays + "\n" + "persistent=" + persistent + "\n" + "expireInDays=" + expireInDays
                + "\n" + "logBackupRetainDays=" + logBackupRetainDays + "\n" + "freeSpaceInGB=" + freeSpaceInGB + "\n" + "dataBackupType=" + dataBackupType + "\n" + "freeSpace="
                + freeSpace + "\n" + "incrementalDataBackupEnable=" + incrementalDataBackupEnable + "\n" + "timeUnit=" + timeUnit + "\n" + "dataBackupCopyEnable="
                + dataBackupCopyEnable + "\n" + "incrementalDataBackupInterval=" + incrementalDataBackupInterval + "\n" + "latestDataBackupRetainDays="
                + latestDataBackupRetainDays + "\n" + "retentionPeriod=" + retentionPeriod + "\n" + "dataBackupRetainStrategys=" + dataBackupRetainStrategys + "\n"
                + "encryptStrategy=" + encryptStrategy + "\n" + "}";
    }

}