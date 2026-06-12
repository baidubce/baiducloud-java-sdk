package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmRule {
    /**
     * 规则内的条件列表（AND规则）
     */
    private List<AlarmCondition> conditions;

    /**
     * 连续触发次数，取值范围：大于0
     */
    private Integer pendingCount;

    /**
     * 检查间隔，单位：秒，取值范围：大于0
     */
    private Integer checkIntervalSeconds;

    /**
     * 报警条件内容描述（仅在查询响应中返回）
     */
    private String content;

    public AlarmRule setConditions(List<AlarmCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public List<AlarmCondition> getConditions() {
        return this.conditions;
    }

    public AlarmRule setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    public Integer getPendingCount() {
        return this.pendingCount;
    }

    public AlarmRule setCheckIntervalSeconds(Integer checkIntervalSeconds) {
        this.checkIntervalSeconds = checkIntervalSeconds;
        return this;
    }

    public Integer getCheckIntervalSeconds() {
        return this.checkIntervalSeconds;
    }

    public AlarmRule setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public String toString() {
        return "AlarmRule{" + "conditions=" + conditions + "\n" + "pendingCount=" + pendingCount + "\n" + "checkIntervalSeconds=" + checkIntervalSeconds + "\n" + "content="
                + content + "\n" + "}";
    }

}