package com.baidubce.aigw.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenRateLimit {
    /**
     * 服务端生成的规则名称，仅响应返回
     */
    @JsonProperty("rule_name")
    private String ruleName;

    /**
     * 是否启用 Token 限流
     */
    private Boolean enabled;

    /**
     * 动态预扣触发阈值，范围为 0～1；省略或为 0 时关闭
     */
    @JsonProperty("pre_reserve_remaining_ratio")
    private Float preReserveRemainingRatio;

    /**
     * 动态预扣历史窗口，单位为秒，默认 60
     */
    @JsonProperty("pre_reserve_history_window_seconds")
    private Integer preReserveHistoryWindowSeconds;

    /**
     * 动态预扣安全系数，必须大于等于 1，默认 1.0
     */
    @JsonProperty("pre_reserve_safety_factor")
    private Float preReserveSafetyFactor;

    /**
     * 估算算法：historical_mean、input_character_ratio
     */
    @JsonProperty("pre_reserve_estimation_mode")
    private String preReserveEstimationMode;

    /**
     * 首请求静态预扣，包含 input、output
     */
    @JsonProperty("pre_reserve_initial_tokens")
    private Map<String, Integer> preReserveInitialTokens;

    /**
     * legacy 模式分桶数，范围为 1～60，默认 6
     */
    @JsonProperty("sliding_window_bucket_count")
    private Integer slidingWindowBucketCount;

    /**
     * 准入模式：smooth、legacy
     */
    @JsonProperty("pre_reserve_admission_mode")
    private String preReserveAdmissionMode;

    /**
     * smooth 模式突发秒数，范围为 1～60
     */
    @JsonProperty("pre_reserve_admission_burst_seconds")
    private Integer preReserveAdmissionBurstSeconds;

    /**
     * smooth 模式重试抖动，范围为 0～1000 毫秒
     */
    @JsonProperty("pre_reserve_retry_jitter_ms")
    private Integer preReserveRetryJitterMs;

    /**
     * Token 限流规则；每项包含 match_condition 和 limit_config
     */
    @JsonProperty("rule_items")
    private List<RuleItem> ruleItems;

    public TokenRateLimit setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public TokenRateLimit setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public TokenRateLimit setPreReserveRemainingRatio(Float preReserveRemainingRatio) {
        this.preReserveRemainingRatio = preReserveRemainingRatio;
        return this;
    }

    public Float getPreReserveRemainingRatio() {
        return this.preReserveRemainingRatio;
    }

    public TokenRateLimit setPreReserveHistoryWindowSeconds(Integer preReserveHistoryWindowSeconds) {
        this.preReserveHistoryWindowSeconds = preReserveHistoryWindowSeconds;
        return this;
    }

    public Integer getPreReserveHistoryWindowSeconds() {
        return this.preReserveHistoryWindowSeconds;
    }

    public TokenRateLimit setPreReserveSafetyFactor(Float preReserveSafetyFactor) {
        this.preReserveSafetyFactor = preReserveSafetyFactor;
        return this;
    }

    public Float getPreReserveSafetyFactor() {
        return this.preReserveSafetyFactor;
    }

    public TokenRateLimit setPreReserveEstimationMode(String preReserveEstimationMode) {
        this.preReserveEstimationMode = preReserveEstimationMode;
        return this;
    }

    public String getPreReserveEstimationMode() {
        return this.preReserveEstimationMode;
    }

    public TokenRateLimit setPreReserveInitialTokens(Map<String, Integer> preReserveInitialTokens) {
        this.preReserveInitialTokens = preReserveInitialTokens;
        return this;
    }

    public Map<String, Integer> getPreReserveInitialTokens() {
        return this.preReserveInitialTokens;
    }

    public TokenRateLimit setSlidingWindowBucketCount(Integer slidingWindowBucketCount) {
        this.slidingWindowBucketCount = slidingWindowBucketCount;
        return this;
    }

    public Integer getSlidingWindowBucketCount() {
        return this.slidingWindowBucketCount;
    }

    public TokenRateLimit setPreReserveAdmissionMode(String preReserveAdmissionMode) {
        this.preReserveAdmissionMode = preReserveAdmissionMode;
        return this;
    }

    public String getPreReserveAdmissionMode() {
        return this.preReserveAdmissionMode;
    }

    public TokenRateLimit setPreReserveAdmissionBurstSeconds(Integer preReserveAdmissionBurstSeconds) {
        this.preReserveAdmissionBurstSeconds = preReserveAdmissionBurstSeconds;
        return this;
    }

    public Integer getPreReserveAdmissionBurstSeconds() {
        return this.preReserveAdmissionBurstSeconds;
    }

    public TokenRateLimit setPreReserveRetryJitterMs(Integer preReserveRetryJitterMs) {
        this.preReserveRetryJitterMs = preReserveRetryJitterMs;
        return this;
    }

    public Integer getPreReserveRetryJitterMs() {
        return this.preReserveRetryJitterMs;
    }

    public TokenRateLimit setRuleItems(List<RuleItem> ruleItems) {
        this.ruleItems = ruleItems;
        return this;
    }

    public List<RuleItem> getRuleItems() {
        return this.ruleItems;
    }

    @Override
    public String toString() {
        return "TokenRateLimit{" + "ruleName=" + ruleName + "\n" + "enabled=" + enabled + "\n" + "preReserveRemainingRatio=" + preReserveRemainingRatio + "\n"
                + "preReserveHistoryWindowSeconds=" + preReserveHistoryWindowSeconds + "\n" + "preReserveSafetyFactor=" + preReserveSafetyFactor + "\n"
                + "preReserveEstimationMode=" + preReserveEstimationMode + "\n" + "preReserveInitialTokens=" + preReserveInitialTokens + "\n" + "slidingWindowBucketCount="
                + slidingWindowBucketCount + "\n" + "preReserveAdmissionMode=" + preReserveAdmissionMode + "\n" + "preReserveAdmissionBurstSeconds="
                + preReserveAdmissionBurstSeconds + "\n" + "preReserveRetryJitterMs=" + preReserveRetryJitterMs + "\n" + "ruleItems=" + ruleItems + "\n" + "}";
    }

}