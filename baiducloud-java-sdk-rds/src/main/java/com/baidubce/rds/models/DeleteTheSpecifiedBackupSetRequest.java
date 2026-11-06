package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteTheSpecifiedBackupSetRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * snapshotId
    */
    @JsonIgnore
    private String snapshotId;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteTheSpecifiedBackupSetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public DeleteTheSpecifiedBackupSetRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

}
