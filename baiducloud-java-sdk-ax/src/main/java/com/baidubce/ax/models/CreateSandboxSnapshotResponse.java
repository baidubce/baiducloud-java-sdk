package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSandboxSnapshotResponse extends BaseBceResponse {

    /**
    * 快照模板 ID。
    */
    private String snapshotID;

    /**
    * 快照模板名称列表。
    */
    private List<String> names;

    public String getSnapshotID() {
        return snapshotID;
    }

    public CreateSandboxSnapshotResponse setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    public List<String> getNames() {
        return names;
    }

    public CreateSandboxSnapshotResponse setNames(List<String> names) {
        this.names = names;
        return this;
    }

    @Override
    public String toString() {
        return "CreateSandboxSnapshotResponse{" + "snapshotID=" + snapshotID + "\n" + "names=" + names + "\n" + "}";
    }

}
