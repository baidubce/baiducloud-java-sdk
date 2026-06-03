package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerFilter {
    /**
     * 触发器过滤类型：`project_name`（命名空间）、`repository_name`（仓库）、`repository_name`（版本）
     */
    private String type;

    /**
     * 该类型对应的值
     */
    private String value;

    public TriggerFilter setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public TriggerFilter setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "TriggerFilter{" + "type=" + type + "\n" + "value=" + value + "\n" + "}";
    }

}