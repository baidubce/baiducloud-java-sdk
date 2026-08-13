package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuleItem {
    /**
     * 匹配条件
     */
    @JsonProperty("match_condition")
    private Object matchCondition;

    /**
     * 限流配置
     */
    @JsonProperty("limit_config")
    private Object limitConfig;

    public RuleItem setMatchCondition(Object matchCondition) {
        this.matchCondition = matchCondition;
        return this;
    }

    public Object getMatchCondition() {
        return this.matchCondition;
    }

    public RuleItem setLimitConfig(Object limitConfig) {
        this.limitConfig = limitConfig;
        return this;
    }

    public Object getLimitConfig() {
        return this.limitConfig;
    }

    @Override
    public String toString() {
        return "RuleItem{" + "matchCondition=" + matchCondition + "\n" + "limitConfig=" + limitConfig + "\n" + "}";
    }

}