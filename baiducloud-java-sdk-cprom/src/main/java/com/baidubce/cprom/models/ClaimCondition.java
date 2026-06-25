package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimCondition {
    /**
     * 认领后多久未恢复
     */
    private Integer condition;

    public ClaimCondition setCondition(Integer condition) {
        this.condition = condition;
        return this;
    }

    public Integer getCondition() {
        return this.condition;
    }

    @Override
    public String toString() {
        return "ClaimCondition{" + "condition=" + condition + "\n" + "}";
    }

}