package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBackUpUrlRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * backupId
    */
    @JsonIgnore
    private Integer backupId;

    public String getInstanceId() {
        return instanceId;
    }

    public GetBackUpUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getBackupId() {
        return backupId;
    }

    public GetBackUpUrlRequest setBackupId(Integer backupId) {
        this.backupId = backupId;
        return this;
    }

}
