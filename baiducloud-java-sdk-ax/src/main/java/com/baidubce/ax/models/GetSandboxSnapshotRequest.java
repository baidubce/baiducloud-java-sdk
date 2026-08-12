package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSandboxSnapshotRequest extends BaseBceRequest {

    /**
    * sandboxID
    */
    @JsonIgnore
    private String sandboxID;

    /**
    * snapshotID
    */
    @JsonIgnore
    private String snapshotID;

    public String getSandboxID() {
        return sandboxID;
    }

    public GetSandboxSnapshotRequest setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public String getSnapshotID() {
        return snapshotID;
    }

    public GetSandboxSnapshotRequest setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

}
