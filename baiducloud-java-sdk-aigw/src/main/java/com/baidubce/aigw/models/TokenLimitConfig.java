package com.baidubce.aigw.models;

import java.math.BigDecimal;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenLimitConfig {
    /**
     * 时间单位：second、minute、hour、day
     */
    @JsonProperty("time_unit")
    private String timeUnit;

    /**
     * 时间窗口倍数，必须大于 0，默认为 1
     */
    @JsonProperty("time_window")
    private Float timeWindow;

    /**
     * 兼容的 Total Token 阈值，与 limits 二选一
     */
    @JsonProperty("token_amount")
    private Integer tokenAmount;

    /**
     * 分类型阈值，可包含 total、input、output，至少配置一项
     */
    private Map<String, Integer> limits;

    /**
     * Input Token 权重，可包含 uncached_input、cached_input
     */
    @JsonProperty("token_usage_weight")
    private Map<String, BigDecimal> tokenUsageWeight;

    public TokenLimitConfig setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    public String getTimeUnit() {
        return this.timeUnit;
    }

    public TokenLimitConfig setTimeWindow(Float timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }

    public Float getTimeWindow() {
        return this.timeWindow;
    }

    public TokenLimitConfig setTokenAmount(Integer tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }

    public Integer getTokenAmount() {
        return this.tokenAmount;
    }

    public TokenLimitConfig setLimits(Map<String, Integer> limits) {
        this.limits = limits;
        return this;
    }

    public Map<String, Integer> getLimits() {
        return this.limits;
    }

    public TokenLimitConfig setTokenUsageWeight(Map<String, BigDecimal> tokenUsageWeight) {
        this.tokenUsageWeight = tokenUsageWeight;
        return this;
    }

    public Map<String, BigDecimal> getTokenUsageWeight() {
        return this.tokenUsageWeight;
    }

    @Override
    public String toString() {
        return "TokenLimitConfig{" + "timeUnit=" + timeUnit + "\n" + "timeWindow=" + timeWindow + "\n" + "tokenAmount=" + tokenAmount + "\n" + "limits=" + limits + "\n"
                + "tokenUsageWeight=" + tokenUsageWeight + "\n" + "}";
    }

}