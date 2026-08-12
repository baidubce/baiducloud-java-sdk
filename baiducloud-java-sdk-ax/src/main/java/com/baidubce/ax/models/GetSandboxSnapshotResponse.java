package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSandboxSnapshotResponse extends BaseBceResponse {

    /**
    * 沙箱实例 ID。
    */
    private String sandboxId;

    /**
    * snapshot
    */
    private SnapshotInfo snapshot;

    public String getSandboxId() {
        return sandboxId;
    }

    public GetSandboxSnapshotResponse setSandboxId(String sandboxId) {
        this.sandboxId = sandboxId;
        return this;
    }

    public SnapshotInfo getSnapshot() {
        return snapshot;
    }

    public GetSandboxSnapshotResponse setSnapshot(SnapshotInfo snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    @Override
    public String toString() {
        return "GetSandboxSnapshotResponse{" + "sandboxId=" + sandboxId + "\n" + "snapshot=" + snapshot + "\n" + "}";
    }

}
