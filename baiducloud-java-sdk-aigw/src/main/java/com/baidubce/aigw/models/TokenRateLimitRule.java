package com.baidubce.aigw.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenRateLimitRule {
    /**
     * 匹配条件，包含 type、key、value；type 支持 global、consumer、header、query_param
     */
    @JsonProperty("match_condition")
    private Map<String, String> matchCondition;

    /**
     * limitConfig
     */
    @JsonProperty("limit_config")
    private TokenLimitConfig limitConfig;

    public TokenRateLimitRule setMatchCondition(Map<String, String> matchCondition) {
        this.matchCondition = matchCondition;
        return this;
    }

    public Map<String, String> getMatchCondition() {
        return this.matchCondition;
    }

    public TokenRateLimitRule setLimitConfig(TokenLimitConfig limitConfig) {
        this.limitConfig = limitConfig;
        return this;
    }

    public TokenLimitConfig getLimitConfig() {
        return this.limitConfig;
    }

    @Override
    public String toString() {
        return "TokenRateLimitRule{" + "matchCondition=" + matchCondition + "\n" + "limitConfig=" + limitConfig + "\n" + "}";
    }

}