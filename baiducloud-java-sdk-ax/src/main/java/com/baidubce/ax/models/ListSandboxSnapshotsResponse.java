package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSandboxSnapshotsResponse extends BaseBceResponse {

    /**
    * 沙箱实例 ID。
    */
    private String sandboxId;

    /**
    * 快照列表。
    */
    private List<SnapshotInfo> snapshots;

    public String getSandboxId() {
        return sandboxId;
    }

    public ListSandboxSnapshotsResponse setSandboxId(String sandboxId) {
        this.sandboxId = sandboxId;
        return this;
    }

    public List<SnapshotInfo> getSnapshots() {
        return snapshots;
    }

    public ListSandboxSnapshotsResponse setSnapshots(List<SnapshotInfo> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    @Override
    public String toString() {
        return "ListSandboxSnapshotsResponse{" + "sandboxId=" + sandboxId + "\n" + "snapshots=" + snapshots + "\n" + "}";
    }

}
