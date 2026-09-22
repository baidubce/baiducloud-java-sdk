package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogDetailsResponse extends BaseBceResponse {

    /**
    * 日志ID
    */
    private String logId;

    /**
    * 日志下载链接
    */
    private String downloadUrl;

    /**
    * 下载链接到期时间
    */
    private String downloadExpire;

    public String getLogId() {
        return logId;
    }

    public LogDetailsResponse setLogId(String logId) {
        this.logId = logId;
        return this;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public LogDetailsResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getDownloadExpire() {
        return downloadExpire;
    }

    public LogDetailsResponse setDownloadExpire(String downloadExpire) {
        this.downloadExpire = downloadExpire;
        return this;
    }

    @Override
    public String toString() {
        return "LogDetailsResponse{" + "logId=" + logId + "\n" + "downloadUrl=" + downloadUrl + "\n" + "downloadExpire=" + downloadExpire + "\n" + "}";
    }

}
