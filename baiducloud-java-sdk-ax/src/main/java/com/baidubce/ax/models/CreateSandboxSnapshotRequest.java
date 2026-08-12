package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSandboxSnapshotRequest extends BaseBceRequest {

    /**
    * sandboxID
    */
    @JsonIgnore
    private String sandboxID;

    /**
    * 快照模板名称，同时作为模板 ID。
    */
    private String name;

    public String getSandboxID() {
        return sandboxID;
    }

    public CreateSandboxSnapshotRequest setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateSandboxSnapshotRequest setName(String name) {
        this.name = name;
        return this;
    }

}
