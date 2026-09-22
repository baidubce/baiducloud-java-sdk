package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Record {
    /**
     * 备份记录ID。
     */
    private String backupRecordId;

    /**
     * 备份记录ID。
     */
    private String backupId;

    /**
     * 开始时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'
     */
    private String startTime;

    /**
     * 持续时间
     */
    private Long duration;

    /**
     * 文件大小
     */
    private Long objectSize;

    /**
     * 备份类型。 auto：自动备份；manual：手动备份
     */
    private String backupType;

    /**
     * [备份状态](#BackupStatus)
     */
    private String backupStatus;

    /**
     * 分片名称
     */
    private String shardName;

    /**
     * 备注
     */
    private String comment;

    public Record setBackupRecordId(String backupRecordId) {
        this.backupRecordId = backupRecordId;
        return this;
    }

    public String getBackupRecordId() {
        return this.backupRecordId;
    }

    public Record setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    public String getBackupId() {
        return this.backupId;
    }

    public Record setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Record setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Long getDuration() {
        return this.duration;
    }

    public Record setObjectSize(Long objectSize) {
        this.objectSize = objectSize;
        return this;
    }

    public Long getObjectSize() {
        return this.objectSize;
    }

    public Record setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    public String getBackupType() {
        return this.backupType;
    }

    public Record setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }

    public String getBackupStatus() {
        return this.backupStatus;
    }

    public Record setShardName(String shardName) {
        this.shardName = shardName;
        return this;
    }

    public String getShardName() {
        return this.shardName;
    }

    public Record setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return this.comment;
    }

    @Override
    public String toString() {
        return "Record{" + "backupRecordId=" + backupRecordId + "\n" + "backupId=" + backupId + "\n" + "startTime=" + startTime + "\n" + "duration=" + duration + "\n"
                + "objectSize=" + objectSize + "\n" + "backupType=" + backupType + "\n" + "backupStatus=" + backupStatus + "\n" + "shardName=" + shardName + "\n" + "comment="
                + comment + "\n" + "}";
    }

}