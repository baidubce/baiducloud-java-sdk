package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Binlog {
    /**
     * 下载链接
     */
    private String downloadUrl;

    /**
     * 过期时间
     */
    private String downloadExpires;

    public Binlog setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public Binlog setDownloadExpires(String downloadExpires) {
        this.downloadExpires = downloadExpires;
        return this;
    }

    public String getDownloadExpires() {
        return this.downloadExpires;
    }

    @Override
    public String toString() {
        return "Binlog{" + "downloadUrl=" + downloadUrl + "\n" + "downloadExpires=" + downloadExpires + "\n" + "}";
    }

}