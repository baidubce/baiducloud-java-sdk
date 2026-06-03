package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationSettings {
    /**
     * 当迁移规则触发类型为 `scheduled` 时，对应的触发规则表达式
     */
    private String cron;

    public ReplicationSettings setCron(String cron) {
        this.cron = cron;
        return this;
    }

    public String getCron() {
        return this.cron;
    }

    @Override
    public String toString() {
        return "ReplicationSettings{" + "cron=" + cron + "\n" + "}";
    }

}