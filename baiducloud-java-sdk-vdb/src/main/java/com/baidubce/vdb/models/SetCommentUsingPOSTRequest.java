package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetCommentUsingPOSTRequest extends BaseBceRequest {

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
    * comment
    */
    private String comment;

    public String getInstanceId() {
        return instanceId;
    }

    public SetCommentUsingPOSTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public SetCommentUsingPOSTRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getBackupId() {
        return backupId;
    }

    public SetCommentUsingPOSTRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    public String getBatchId() {
        return batchId;
    }

    public SetCommentUsingPOSTRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public SetCommentUsingPOSTRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }

}
