package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmPolicySummary {
    /**
     * 策略ID
     */
    private String id;

    /**
     * 策略名称
     */
    private String name;

    /**
     * 策略内容描述，当locale=en时返回英文内容
     */
    private String content;

    /**
     * 报警级别，可选值：NOTICE / WARNING / MAJOR / CRITICAL
     */
    private String level;

    public AlarmPolicySummary setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AlarmPolicySummary setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AlarmPolicySummary setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public AlarmPolicySummary setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return "AlarmPolicySummary{" + "id=" + id + "\n" + "name=" + name + "\n" + "content=" + content + "\n" + "level=" + level + "\n" + "}";
    }

}