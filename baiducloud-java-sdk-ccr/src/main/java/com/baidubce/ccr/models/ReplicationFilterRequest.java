package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationFilterRequest {
    /**
     * 迁移规则资源筛选种类
     */
    private String type;

    /**
     * 迁移规则资源筛选种类对应值
     */
    private String value;

    public ReplicationFilterRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ReplicationFilterRequest setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "ReplicationFilterRequest{" + "type=" + type + "\n" + "value=" + value + "\n" + "}";
    }

}