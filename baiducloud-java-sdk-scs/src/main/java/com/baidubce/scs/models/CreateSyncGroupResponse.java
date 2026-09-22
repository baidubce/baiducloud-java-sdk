package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSyncGroupResponse extends BaseBceResponse {

    /**
    * 多活实例组ID。
    */
    private String syncGroupShowId;

    public String getSyncGroupShowId() {
        return syncGroupShowId;
    }

    public CreateSyncGroupResponse setSyncGroupShowId(String syncGroupShowId) {
        this.syncGroupShowId = syncGroupShowId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateSyncGroupResponse{" + "syncGroupShowId=" + syncGroupShowId + "\n" + "}";
    }

}
