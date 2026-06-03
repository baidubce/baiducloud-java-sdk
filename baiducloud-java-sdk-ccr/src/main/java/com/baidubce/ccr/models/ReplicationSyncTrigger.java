package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationSyncTrigger {
    /**
     * 同步规则触发类型，有效值为 `manual`、`event_based` 和 `scheduled`
     */
    private String type;

    public ReplicationSyncTrigger setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "ReplicationSyncTrigger{" + "type=" + type + "\n" + "}";
    }

}