package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSnapshotShareResponse extends BaseBceResponse {

    /**
    * 已共享的快照ID
    */
    private String snapshotId;

    public String getSnapshotId() {
        return snapshotId;
    }

    public CreateSnapshotShareResponse setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateSnapshotShareResponse{" + "snapshotId=" + snapshotId + "\n" + "}";
    }

}
