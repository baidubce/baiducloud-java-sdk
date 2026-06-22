package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeSnapshotsUsageResponse extends BaseBceResponse {

    /**
    * 该地域下创建的所有快照数量
    */
    private Integer snapshotCount;

    /**
    * 该地域下创建的自动快照数量
    */
    private Integer autoSnapshotCount;

    /**
    * 该地域下创建的手动快照数量
    */
    private Integer manualSnapshotCount;

    /**
    * 该地域下快照占用的容量（GB）
    */
    private Double snapshotCapacity;

    public Integer getSnapshotCount() {
        return snapshotCount;
    }

    public DescribeSnapshotsUsageResponse setSnapshotCount(Integer snapshotCount) {
        this.snapshotCount = snapshotCount;
        return this;
    }

    public Integer getAutoSnapshotCount() {
        return autoSnapshotCount;
    }

    public DescribeSnapshotsUsageResponse setAutoSnapshotCount(Integer autoSnapshotCount) {
        this.autoSnapshotCount = autoSnapshotCount;
        return this;
    }

    public Integer getManualSnapshotCount() {
        return manualSnapshotCount;
    }

    public DescribeSnapshotsUsageResponse setManualSnapshotCount(Integer manualSnapshotCount) {
        this.manualSnapshotCount = manualSnapshotCount;
        return this;
    }

    public Double getSnapshotCapacity() {
        return snapshotCapacity;
    }

    public DescribeSnapshotsUsageResponse setSnapshotCapacity(Double snapshotCapacity) {
        this.snapshotCapacity = snapshotCapacity;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeSnapshotsUsageResponse{" + "snapshotCount=" + snapshotCount + "\n" + "autoSnapshotCount=" + autoSnapshotCount + "\n" + "manualSnapshotCount="
                + manualSnapshotCount + "\n" + "snapshotCapacity=" + snapshotCapacity + "\n" + "}";
    }

}
