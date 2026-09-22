package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchBackupRecord {
    /**
     * 备份ID
     */
    private String batchId;

    /**
     * 备份类型。auto表示自动备份；manual表示手动产生的备份
     */
    private String backupType;

    /**
     * 备注
     */
    private String comment;

    /**
     * 开始时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'
     */
    private String startTime;

    /**
     * 是否可用于备份恢复。recoverable - 可用；non-recoverable - 不可用
     */
    private String recoverable;

    /**
     * 按分片备份的列表。
     */
    private List<Record> records;

    public BatchBackupRecord setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public String getBatchId() {
        return this.batchId;
    }

    public BatchBackupRecord setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    public String getBackupType() {
        return this.backupType;
    }

    public BatchBackupRecord setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return this.comment;
    }

    public BatchBackupRecord setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public BatchBackupRecord setRecoverable(String recoverable) {
        this.recoverable = recoverable;
        return this;
    }

    public String getRecoverable() {
        return this.recoverable;
    }

    public BatchBackupRecord setRecords(List<Record> records) {
        this.records = records;
        return this;
    }

    public List<Record> getRecords() {
        return this.records;
    }

    @Override
    public String toString() {
        return "BatchBackupRecord{" + "batchId=" + batchId + "\n" + "backupType=" + backupType + "\n" + "comment=" + comment + "\n" + "startTime=" + startTime + "\n"
                + "recoverable=" + recoverable + "\n" + "records=" + records + "\n" + "}";
    }

}