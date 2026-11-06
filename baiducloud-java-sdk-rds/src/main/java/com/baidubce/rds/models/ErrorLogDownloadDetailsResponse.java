package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorLogDownloadDetailsResponse extends BaseBceResponse {

    /**
    * 下载链接
    */
    private String url;

    /**
    * 下载链接有效时间
    */
    private String downloadExpires;

    /**
    * 备份类型，支持physical/snapshot
    */
    private String dataBackupType;

    public String getUrl() {
        return url;
    }

    public ErrorLogDownloadDetailsResponse setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDownloadExpires() {
        return downloadExpires;
    }

    public ErrorLogDownloadDetailsResponse setDownloadExpires(String downloadExpires) {
        this.downloadExpires = downloadExpires;
        return this;
    }

    public String getDataBackupType() {
        return dataBackupType;
    }

    public ErrorLogDownloadDetailsResponse setDataBackupType(String dataBackupType) {
        this.dataBackupType = dataBackupType;
        return this;
    }

    @Override
    public String toString() {
        return "ErrorLogDownloadDetailsResponse{" + "url=" + url + "\n" + "downloadExpires=" + downloadExpires + "\n" + "dataBackupType=" + dataBackupType + "\n" + "}";
    }

}
