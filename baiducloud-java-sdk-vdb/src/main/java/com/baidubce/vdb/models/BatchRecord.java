package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchRecord {
    /**
     * 
     */
    private Long backupId;

    /**
     * 
     */
    private String backupStatus;

    /**
     * 
     */
    private String backupType;

    /**
     * 
     */
    private String comment;

    /**
     * 
     */
    private Long duration;

    /**
     * 
     */
    private String nodeInfo;

    /**
     * 
     */
    private Long objectSize;

    /**
     * 
     */
    private String startTime;

    public BatchRecord setBackupId(Long backupId) {
        this.backupId = backupId;
        return this;
    }

    public Long getBackupId() {
        return this.backupId;
    }

    public BatchRecord setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }

    public String getBackupStatus() {
        return this.backupStatus;
    }

    public BatchRecord setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    public String getBackupType() {
        return this.backupType;
    }

    public BatchRecord setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return this.comment;
    }

    public BatchRecord setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Long getDuration() {
        return this.duration;
    }

    public BatchRecord setNodeInfo(String nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public String getNodeInfo() {
        return this.nodeInfo;
    }

    public BatchRecord setObjectSize(Long objectSize) {
        this.objectSize = objectSize;
        return this;
    }

    public Long getObjectSize() {
        return this.objectSize;
    }

    public BatchRecord setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    @Override
    public String toString() {
        return "BatchRecord{" + "backupId=" + backupId + "\n" + "backupStatus=" + backupStatus + "\n" + "backupType=" + backupType + "\n" + "comment=" + comment + "\n"
                + "duration=" + duration + "\n" + "nodeInfo=" + nodeInfo + "\n" + "objectSize=" + objectSize + "\n" + "startTime=" + startTime + "\n" + "}";
    }

}