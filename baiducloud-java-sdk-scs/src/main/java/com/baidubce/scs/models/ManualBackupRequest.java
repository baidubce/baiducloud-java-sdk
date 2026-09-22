package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManualBackupRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 备注。字符长度限制0-256个字符。
    */
    private String comment;

    public String getInstanceId() {
        return instanceId;
    }

    public ManualBackupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public ManualBackupRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }

}
