package com.baidubce.vdb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Record {
    /**
     * 
     */
    private String backupType;

    /**
     * 
     */
    private String batchId;

    /**
     * 
     */
    private List<BatchRecord> batchRecords;

    /**
     * 
     */
    private String comment;

    /**
     * 
     */
    private String endTime;

    /**
     * 
     */
    private String recoverable;

    /**
     * 
     */
    private String startTime;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String storageType;

    /**
     * 
     */
    private Long totalSizeBytes;

    public Record setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    public String getBackupType() {
        return this.backupType;
    }

    public Record setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public String getBatchId() {
        return this.batchId;
    }

    public Record setBatchRecords(List<BatchRecord> batchRecords) {
        this.batchRecords = batchRecords;
        return this;
    }

    public List<BatchRecord> getBatchRecords() {
        return this.batchRecords;
    }

    public Record setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return this.comment;
    }

    public Record setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public Record setRecoverable(String recoverable) {
        this.recoverable = recoverable;
        return this;
    }

    public String getRecoverable() {
        return this.recoverable;
    }

    public Record setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Record setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Record setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public Record setTotalSizeBytes(Long totalSizeBytes) {
        this.totalSizeBytes = totalSizeBytes;
        return this;
    }

    public Long getTotalSizeBytes() {
        return this.totalSizeBytes;
    }

    @Override
    public String toString() {
        return "Record{" + "backupType=" + backupType + "\n" + "batchId=" + batchId + "\n" + "batchRecords=" + batchRecords + "\n" + "comment=" + comment + "\n" + "endTime="
                + endTime + "\n" + "recoverable=" + recoverable + "\n" + "startTime=" + startTime + "\n" + "status=" + status + "\n" + "storageType=" + storageType + "\n"
                + "totalSizeBytes=" + totalSizeBytes + "\n" + "}";
    }

}