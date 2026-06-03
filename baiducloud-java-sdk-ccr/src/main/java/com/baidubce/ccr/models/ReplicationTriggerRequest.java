package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationTriggerRequest {
    /**
     * 迁移规则触发类型，镜像迁移场景下只能为 `manual`
     */
    private String type;

    public ReplicationTriggerRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "ReplicationTriggerRequest{" + "type=" + type + "\n" + "}";
    }

}