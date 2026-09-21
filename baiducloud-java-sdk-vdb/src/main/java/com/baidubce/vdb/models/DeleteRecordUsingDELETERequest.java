package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRecordUsingDELETERequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    /**
    * batchId
    */
    @JsonIgnore
    private String batchId;

    /**
    * backupId
    */
    @JsonIgnore
    private String backupId;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteRecordUsingDELETERequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public DeleteRecordUsingDELETERequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getBatchId() {
        return batchId;
    }

    public DeleteRecordUsingDELETERequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public String getBackupId() {
        return backupId;
    }

    public DeleteRecordUsingDELETERequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

}
