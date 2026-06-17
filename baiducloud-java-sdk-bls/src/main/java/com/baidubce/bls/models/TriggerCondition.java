package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerCondition {
    /**
     * 报警等级，可选项：INFO、WARN、CRITICAL
     */
    private String level;

    /**
     * 触发条件表达式
     */
    private String condition;

    public TriggerCondition setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getLevel() {
        return this.level;
    }

    public TriggerCondition setCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public String getCondition() {
        return this.condition;
    }

    @Override
    public String toString() {
        return "TriggerCondition{" + "level=" + level + "\n" + "condition=" + condition + "\n" + "}";
    }

}