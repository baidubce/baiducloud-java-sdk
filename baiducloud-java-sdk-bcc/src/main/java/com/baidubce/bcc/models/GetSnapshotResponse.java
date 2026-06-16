package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSnapshotResponse extends BaseBceResponse {

    /**
    * snapshot
    */
    private SnapshotModel snapshot;

    public SnapshotModel getSnapshot() {
        return snapshot;
    }

    public GetSnapshotResponse setSnapshot(SnapshotModel snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    @Override
    public String toString() {
        return "GetSnapshotResponse{" + "snapshot=" + snapshot + "\n" + "}";
    }

}
