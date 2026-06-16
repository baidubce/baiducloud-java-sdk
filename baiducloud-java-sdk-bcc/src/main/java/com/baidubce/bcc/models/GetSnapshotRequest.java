package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSnapshotRequest extends BaseBceRequest {

    /**
    * snapshotId
    */
    @JsonIgnore
    private String snapshotId;

    public String getSnapshotId() {
        return snapshotId;
    }

    public GetSnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

}
