package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenApiBackup {
    /**
     * 备份 ID
     */
    private String backupId;

    /**
     * 实例大小，单位MB
     */
    private Long backupSize;

    /**
     * 备份类型 manual(手工创建)， automated(自动创建)
     */
    private String backupType;

    /**
     * 备份状态。  creating(创建中) available(备份可用)   deleting(正在删除)
     */
    private String backupStatus;

    /**
     * 备份开始时间
     */
    private String backupStartTime;

    /**
     * 备份结束时间
     */
    private String backupEndTime;

    /**
     * 下载URL
     */
    private String downloadUrl;

    /**
     * 下载有效期
     */
    private String downloadExpires;

    public OpenApiBackup setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    public String getBackupId() {
        return this.backupId;
    }

    public OpenApiBackup setBackupSize(Long backupSize) {
        this.backupSize = backupSize;
        return this;
    }

    public Long getBackupSize() {
        return this.backupSize;
    }

    public OpenApiBackup setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    public String getBackupType() {
        return this.backupType;
    }

    public OpenApiBackup setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }

    public String getBackupStatus() {
        return this.backupStatus;
    }

    public OpenApiBackup setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }

    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    public OpenApiBackup setBackupEndTime(String backupEndTime) {
        this.backupEndTime = backupEndTime;
        return this;
    }

    public String getBackupEndTime() {
        return this.backupEndTime;
    }

    public OpenApiBackup setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public OpenApiBackup setDownloadExpires(String downloadExpires) {
        this.downloadExpires = downloadExpires;
        return this;
    }

    public String getDownloadExpires() {
        return this.downloadExpires;
    }

    @Override
    public String toString() {
        return "OpenApiBackup{" + "backupId=" + backupId + "\n" + "backupSize=" + backupSize + "\n" + "backupType=" + backupType + "\n" + "backupStatus=" + backupStatus + "\n"
                + "backupStartTime=" + backupStartTime + "\n" + "backupEndTime=" + backupEndTime + "\n" + "downloadUrl=" + downloadUrl + "\n" + "downloadExpires="
                + downloadExpires + "\n" + "}";
    }

}