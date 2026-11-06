package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiDownloads {
    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 下载链接名称
     */
    private String downloadName;

    /**
     * 备份大小，单位为 Byte
     */
    private Long downloadSize;

    /**
     * 备份下载链接
     */
    private String downloadUrl;

    public MultiDownloads setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getDbName() {
        return this.dbName;
    }

    public MultiDownloads setDownloadName(String downloadName) {
        this.downloadName = downloadName;
        return this;
    }

    public String getDownloadName() {
        return this.downloadName;
    }

    public MultiDownloads setDownloadSize(Long downloadSize) {
        this.downloadSize = downloadSize;
        return this;
    }

    public Long getDownloadSize() {
        return this.downloadSize;
    }

    public MultiDownloads setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Override
    public String toString() {
        return "MultiDownloads{" + "dbName=" + dbName + "\n" + "downloadName=" + downloadName + "\n" + "downloadSize=" + downloadSize + "\n" + "downloadUrl=" + downloadUrl + "\n"
                + "}";
    }

}