package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlowLogDownloadDetailsResponse extends BaseBceResponse {

    /**
    * 下载URL
    */
    @JsonProperty("URL")
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

    public SlowLogDownloadDetailsResponse setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDownloadExpires() {
        return downloadExpires;
    }

    public SlowLogDownloadDetailsResponse setDownloadExpires(String downloadExpires) {
        this.downloadExpires = downloadExpires;
        return this;
    }

    public String getDataBackupType() {
        return dataBackupType;
    }

    public SlowLogDownloadDetailsResponse setDataBackupType(String dataBackupType) {
        this.dataBackupType = dataBackupType;
        return this;
    }

    @Override
    public String toString() {
        return "SlowLogDownloadDetailsResponse{" + "url=" + url + "\n" + "downloadExpires=" + downloadExpires + "\n" + "dataBackupType=" + dataBackupType + "\n" + "}";
    }

}
