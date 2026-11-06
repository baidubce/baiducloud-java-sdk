package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryBackupListResponse extends BaseBceResponse {

    /**
    * 查找的分页的backupId，默认为-1
    */
    private String marker;

    /**
    * 是否还有下一页，如果有此选项为true，如果没有则为false
    */
    private Boolean isTruncated;

    /**
    * 下一页backupId值，如果有此选项不为空，没有则为空
    */
    private String nextMarker;

    /**
    * 备份对象
    */
    private List<OpenApiBackup> backups;

    public String getMarker() {
        return marker;
    }

    public QueryBackupListResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public QueryBackupListResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public QueryBackupListResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public List<OpenApiBackup> getBackups() {
        return backups;
    }

    public QueryBackupListResponse setBackups(List<OpenApiBackup> backups) {
        this.backups = backups;
        return this;
    }

    @Override
    public String toString() {
        return "QueryBackupListResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "backups=" + backups + "\n"
                + "}";
    }

}
