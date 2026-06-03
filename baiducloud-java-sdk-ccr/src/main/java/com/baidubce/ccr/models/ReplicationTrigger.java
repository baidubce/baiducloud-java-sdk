package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationTrigger {
    /**
     * triggerSettings
     */
    private ReplicationSettings triggerSettings;

    /**
     * 迁移规则触发类型，有效值为 `manual`、`event_based` 和 `scheduled`
     */
    private String type;

    public ReplicationTrigger setTriggerSettings(ReplicationSettings triggerSettings) {
        this.triggerSettings = triggerSettings;
        return this;
    }

    public ReplicationSettings getTriggerSettings() {
        return this.triggerSettings;
    }

    public ReplicationTrigger setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "ReplicationTrigger{" + "triggerSettings=" + triggerSettings + "\n" + "type=" + type + "\n" + "}";
    }

}