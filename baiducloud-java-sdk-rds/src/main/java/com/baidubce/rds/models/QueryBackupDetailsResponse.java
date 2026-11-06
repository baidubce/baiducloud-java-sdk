package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryBackupDetailsResponse extends BaseBceResponse {

    /**
    * 备份 ID
    */
    private String backupId;

    /**
    * 实例大小 ，单位MB
    */
    private Long backupSize;

    /**
    * 备份类型:  manual(手工创建) automated(自动创建)
    */
    private String backupType;

    /**
    * 备份状态  creating(创建中) available(备份可用)   deleting(正在删除)
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
    * 下载URL信息，当前字段仅针对 SqlServerL 类型实例
    */
    private List<MultiDownloads> multiDownloadUrl;

    /**
    * 下载过期时间
    */
    private String downloadExpires;

    public String getBackupId() {
        return backupId;
    }

    public QueryBackupDetailsResponse setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    public Long getBackupSize() {
        return backupSize;
    }

    public QueryBackupDetailsResponse setBackupSize(Long backupSize) {
        this.backupSize = backupSize;
        return this;
    }

    public String getBackupType() {
        return backupType;
    }

    public QueryBackupDetailsResponse setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    public String getBackupStatus() {
        return backupStatus;
    }

    public QueryBackupDetailsResponse setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }

    public String getBackupStartTime() {
        return backupStartTime;
    }

    public QueryBackupDetailsResponse setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }

    public String getBackupEndTime() {
        return backupEndTime;
    }

    public QueryBackupDetailsResponse setBackupEndTime(String backupEndTime) {
        this.backupEndTime = backupEndTime;
        return this;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public QueryBackupDetailsResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    public List<MultiDownloads> getMultiDownloadUrl() {
        return multiDownloadUrl;
    }

    public QueryBackupDetailsResponse setMultiDownloadUrl(List<MultiDownloads> multiDownloadUrl) {
        this.multiDownloadUrl = multiDownloadUrl;
        return this;
    }

    public String getDownloadExpires() {
        return downloadExpires;
    }

    public QueryBackupDetailsResponse setDownloadExpires(String downloadExpires) {
        this.downloadExpires = downloadExpires;
        return this;
    }

    @Override
    public String toString() {
        return "QueryBackupDetailsResponse{" + "backupId=" + backupId + "\n" + "backupSize=" + backupSize + "\n" + "backupType=" + backupType + "\n" + "backupStatus="
                + backupStatus + "\n" + "backupStartTime=" + backupStartTime + "\n" + "backupEndTime=" + backupEndTime + "\n" + "downloadUrl=" + downloadUrl + "\n"
                + "multiDownloadUrl=" + multiDownloadUrl + "\n" + "downloadExpires=" + downloadExpires + "\n" + "}";
    }

}
