package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationSyncTriggerRequest {
    /**
     * 同步规则触发类型，有效值为 `manual` 和 `event_based`
     */
    private String type;

    public ReplicationSyncTriggerRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "ReplicationSyncTriggerRequest{" + "type=" + type + "\n" + "}";
    }

}