package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CdsInfo {
    /**
     * 磁盘类型
     */
    private String volumeType;

    /**
     * 磁盘大小
     */
    private Integer sizeInGB;

    /**
     * 磁盘快照ID
     */
    private String snapshotId;

    /**
     * 磁盘快照名称
     */
    private String snapshotName;

    public CdsInfo setVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    public String getVolumeType() {
        return this.volumeType;
    }

    public CdsInfo setSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }

    public Integer getSizeInGB() {
        return this.sizeInGB;
    }

    public CdsInfo setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CdsInfo setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    public String getSnapshotName() {
        return this.snapshotName;
    }

    @Override
    public String toString() {
        return "CdsInfo{" + "volumeType=" + volumeType + "\n" + "sizeInGB=" + sizeInGB + "\n" + "snapshotId=" + snapshotId + "\n" + "snapshotName=" + snapshotName + "\n" + "}";
    }

}