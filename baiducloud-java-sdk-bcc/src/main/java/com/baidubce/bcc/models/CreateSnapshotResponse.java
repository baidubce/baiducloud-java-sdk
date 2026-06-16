package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSnapshotResponse extends BaseBceResponse {

    /**
    * 已创建的快照ID
    */
    private String snapshotId;

    public String getSnapshotId() {
        return snapshotId;
    }

    public CreateSnapshotResponse setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateSnapshotResponse{" + "snapshotId=" + snapshotId + "\n" + "}";
    }

}
