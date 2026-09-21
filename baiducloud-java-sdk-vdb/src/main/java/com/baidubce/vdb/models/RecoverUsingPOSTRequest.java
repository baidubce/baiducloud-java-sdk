package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecoverUsingPOSTRequest extends BaseBceRequest {

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
    * backupId
    */
    private String backupId;

    /**
    * batchId
    */
    private String batchId;

    /**
    * confirmed
    */
    private Boolean confirmed;

    public String getInstanceId() {
        return instanceId;
    }

    public RecoverUsingPOSTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public RecoverUsingPOSTRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getBackupId() {
        return backupId;
    }

    public RecoverUsingPOSTRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    public String getBatchId() {
        return batchId;
    }

    public RecoverUsingPOSTRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public RecoverUsingPOSTRequest setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
        return this;
    }

}
