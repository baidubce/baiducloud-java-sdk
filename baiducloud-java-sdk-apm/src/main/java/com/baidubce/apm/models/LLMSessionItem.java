package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LLMSessionItem {
    /**
     * 会话ID
     */
    private String sessionId;

    /**
     * Session开始时间，UTC时间
     */
    private String startTime;

    /**
     * Session结束时间，UTC时间
     */
    private String endTime;

    /**
     * Session持续时长，单位：ms
     */
    private Long duration;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * Trace数量
     */
    private Integer traceCount;

    /**
     * 输入token数
     */
    private Integer inputTokens;

    /**
     * 输出token数
     */
    private Integer outputTokens;

    /**
     * 总token数
     */
    private Integer totalTokens;

    public LLMSessionItem setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public LLMSessionItem setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public LLMSessionItem setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public LLMSessionItem setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Long getDuration() {
        return this.duration;
    }

    public LLMSessionItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public LLMSessionItem setTraceCount(Integer traceCount) {
        this.traceCount = traceCount;
        return this;
    }

    public Integer getTraceCount() {
        return this.traceCount;
    }

    public LLMSessionItem setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    public Integer getInputTokens() {
        return this.inputTokens;
    }

    public LLMSessionItem setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    public Integer getOutputTokens() {
        return this.outputTokens;
    }

    public LLMSessionItem setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }

    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    @Override
    public String toString() {
        return "LLMSessionItem{" + "sessionId=" + sessionId + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "duration=" + duration + "\n" + "userId="
                + userId + "\n" + "traceCount=" + traceCount + "\n" + "inputTokens=" + inputTokens + "\n" + "outputTokens=" + outputTokens + "\n" + "totalTokens=" + totalTokens
                + "\n" + "}";
    }

}