package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RollbackVolumeRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    /**
    * 用于回滚指定磁盘的快照ID，必须为 volumeId 所创建的快照
    */
    private String snapshotId;

    public String getVolumeId() {
        return volumeId;
    }

    public RollbackVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public RollbackVolumeRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

}
