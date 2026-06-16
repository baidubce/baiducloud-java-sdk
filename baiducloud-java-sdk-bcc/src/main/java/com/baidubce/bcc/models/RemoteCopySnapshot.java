package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteCopySnapshot {
    /**
     * 目标区域
     */
    private String region;

    /**
     * 成功复制到目标区域快照的快照ID
     */
    private String snapshotId;

    public RemoteCopySnapshot setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public RemoteCopySnapshot setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    @Override
    public String toString() {
        return "RemoteCopySnapshot{" + "region=" + region + "\n" + "snapshotId=" + snapshotId + "\n" + "}";
    }

}