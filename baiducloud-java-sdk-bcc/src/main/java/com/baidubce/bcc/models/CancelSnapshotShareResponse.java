package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelSnapshotShareResponse extends BaseBceResponse {

    /**
    * 源快照ID
    */
    private String sourceSnapshotId;

    /**
    * 共享快照ID
    */
    private String shareSnapshotId;

    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }

    public CancelSnapshotShareResponse setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    public String getShareSnapshotId() {
        return shareSnapshotId;
    }

    public CancelSnapshotShareResponse setShareSnapshotId(String shareSnapshotId) {
        this.shareSnapshotId = shareSnapshotId;
        return this;
    }

    @Override
    public String toString() {
        return "CancelSnapshotShareResponse{" + "sourceSnapshotId=" + sourceSnapshotId + "\n" + "shareSnapshotId=" + shareSnapshotId + "\n" + "}";
    }

}
