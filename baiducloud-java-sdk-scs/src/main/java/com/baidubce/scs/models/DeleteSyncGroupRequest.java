package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSyncGroupRequest extends BaseBceRequest {

    /**
    * syncGroupShowId
    */
    @JsonIgnore
    private String syncGroupShowId;

    public String getSyncGroupShowId() {
        return syncGroupShowId;
    }

    public DeleteSyncGroupRequest setSyncGroupShowId(String syncGroupShowId) {
        this.syncGroupShowId = syncGroupShowId;
        return this;
    }

}
