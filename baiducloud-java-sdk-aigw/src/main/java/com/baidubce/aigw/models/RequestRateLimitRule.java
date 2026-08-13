package com.baidubce.aigw.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestRateLimitRule {
    /**
     * 匹配条件，包含 type、key、value
     */
    @JsonProperty("match_condition")
    private Map<String, String> matchCondition;

    /**
     * 次数阈值配置，包含 time_unit、time_window、request_amount
     */
    @JsonProperty("limit_config")
    private Map<String, String> limitConfig;

    public RequestRateLimitRule setMatchCondition(Map<String, String> matchCondition) {
        this.matchCondition = matchCondition;
        return this;
    }

    public Map<String, String> getMatchCondition() {
        return this.matchCondition;
    }

    public RequestRateLimitRule setLimitConfig(Map<String, String> limitConfig) {
        this.limitConfig = limitConfig;
        return this;
    }

    public Map<String, String> getLimitConfig() {
        return this.limitConfig;
    }

    @Override
    public String toString() {
        return "RequestRateLimitRule{" + "matchCondition=" + matchCondition + "\n" + "limitConfig=" + limitConfig + "\n" + "}";
    }

}