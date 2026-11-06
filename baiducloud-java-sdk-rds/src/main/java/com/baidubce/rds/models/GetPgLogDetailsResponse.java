package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPgLogDetailsResponse extends BaseBceResponse {

    /**
    * 日志ID。
    */
    private String pglogId;

    /**
    * 日志大小。
    */
    private Long pglogSizeInBytes;

    /**
    * 日志开始时间。
    */
    private String pglogStartTime;

    /**
    * 日志结束时间。
    */
    private String pglogEndTime;

    /**
    * 日志下载链接。
    */
    private String downloadUrl;

    /**
    * 日志下载链接有效期。
    */
    private String downloadExpires;

    public String getPglogId() {
        return pglogId;
    }

    public GetPgLogDetailsResponse setPglogId(String pglogId) {
        this.pglogId = pglogId;
        return this;
    }

    public Long getPglogSizeInBytes() {
        return pglogSizeInBytes;
    }

    public GetPgLogDetailsResponse setPglogSizeInBytes(Long pglogSizeInBytes) {
        this.pglogSizeInBytes = pglogSizeInBytes;
        return this;
    }

    public String getPglogStartTime() {
        return pglogStartTime;
    }

    public GetPgLogDetailsResponse setPglogStartTime(String pglogStartTime) {
        this.pglogStartTime = pglogStartTime;
        return this;
    }

    public String getPglogEndTime() {
        return pglogEndTime;
    }

    public GetPgLogDetailsResponse setPglogEndTime(String pglogEndTime) {
        this.pglogEndTime = pglogEndTime;
        return this;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public GetPgLogDetailsResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getDownloadExpires() {
        return downloadExpires;
    }

    public GetPgLogDetailsResponse setDownloadExpires(String downloadExpires) {
        this.downloadExpires = downloadExpires;
        return this;
    }

    @Override
    public String toString() {
        return "GetPgLogDetailsResponse{" + "pglogId=" + pglogId + "\n" + "pglogSizeInBytes=" + pglogSizeInBytes + "\n" + "pglogStartTime=" + pglogStartTime + "\n"
                + "pglogEndTime=" + pglogEndTime + "\n" + "downloadUrl=" + downloadUrl + "\n" + "downloadExpires=" + downloadExpires + "\n" + "}";
    }

}
