package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyBackupCommentRequest extends BaseBceRequest {

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

    /**
    * 备注。字符长度限制0-256个字符。
    */
    private String comment;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyBackupCommentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getBatchId() {
        return batchId;
    }

    public ModifyBackupCommentRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public ModifyBackupCommentRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }

}
