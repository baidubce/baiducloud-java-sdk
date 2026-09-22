package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBackupListResponse extends BaseBceResponse {

    /**
    * 总数量。
    */
    private Integer totalCount;

    /**
    * 结果列表。
    */
    private List<BatchBackupRecord> backups;

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetBackupListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<BatchBackupRecord> getBackups() {
        return backups;
    }

    public GetBackupListResponse setBackups(List<BatchBackupRecord> backups) {
        this.backups = backups;
        return this;
    }

    @Override
    public String toString() {
        return "GetBackupListResponse{" + "totalCount=" + totalCount + "\n" + "backups=" + backups + "\n" + "}";
    }

}
