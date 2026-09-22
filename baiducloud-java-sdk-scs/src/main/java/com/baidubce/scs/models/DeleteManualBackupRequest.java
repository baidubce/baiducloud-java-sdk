package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteManualBackupRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * batchId
    */
    @JsonIgnore
    private String batchId;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteManualBackupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getBatchId() {
        return batchId;
    }

    public DeleteManualBackupRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

}
