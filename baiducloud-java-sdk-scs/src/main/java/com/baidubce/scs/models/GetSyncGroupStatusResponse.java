package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSyncGroupStatusResponse extends BaseBceResponse {

    /**
    * 实例组ID。
    */
    private String syncGroupShowId;

    /**
    * 状态列表。
    */
    private List<SyncStatusItem> syncStatus;

    public String getSyncGroupShowId() {
        return syncGroupShowId;
    }

    public GetSyncGroupStatusResponse setSyncGroupShowId(String syncGroupShowId) {
        this.syncGroupShowId = syncGroupShowId;
        return this;
    }

    public List<SyncStatusItem> getSyncStatus() {
        return syncStatus;
    }

    public GetSyncGroupStatusResponse setSyncStatus(List<SyncStatusItem> syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    @Override
    public String toString() {
        return "GetSyncGroupStatusResponse{" + "syncGroupShowId=" + syncGroupShowId + "\n" + "syncStatus=" + syncStatus + "\n" + "}";
    }

}
