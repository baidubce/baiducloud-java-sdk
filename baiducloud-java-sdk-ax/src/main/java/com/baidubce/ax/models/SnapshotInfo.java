package com.baidubce.ax.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SnapshotInfo {
    /**
     * 快照 ID。
     */
    private String snapshotID;

    /**
     * 快照名称列表。
     */
    private List<String> names;

    public SnapshotInfo setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    public String getSnapshotID() {
        return this.snapshotID;
    }

    public SnapshotInfo setNames(List<String> names) {
        this.names = names;
        return this;
    }

    public List<String> getNames() {
        return this.names;
    }

    @Override
    public String toString() {
        return "SnapshotInfo{" + "snapshotID=" + snapshotID + "\n" + "names=" + names + "\n" + "}";
    }

}