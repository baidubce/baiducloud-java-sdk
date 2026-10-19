package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceSynchronizationModeRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 同步模式（异步复制：Async，半同步复制：Semi\_sync）
    */
    private String syncMode;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateInstanceSynchronizationModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getSyncMode() {
        return syncMode;
    }

    public UpdateInstanceSynchronizationModeRequest setSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

}
