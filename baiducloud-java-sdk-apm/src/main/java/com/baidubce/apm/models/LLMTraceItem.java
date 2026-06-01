package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LLMTraceItem {
    /**
     * Trace ID
     */
    private String traceId;

    /**
     * 开始时间，UTC时间
     */
    private String startTime;

    /**
     * 结束时间，UTC时间
     */
    private String endTime;

    /**
     * 入口应用名称
     */
    private String service;

    /**
     * 会话ID
     */
    private String sessionId;

    /**
     * 用户ID
     */
    private String userId;

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

    /**
     * 输入内容
     */
    private String input;

    /**
     * 输出内容
     */
    private String output;

    /**
     * 模型列表
     */
    private List<String> models;

    /**
     * 工具列表
     */
    private List<String> tools;

    /**
     * 持续时长，单位：ms
     */
    private Long duration;

    public LLMTraceItem setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public LLMTraceItem setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public LLMTraceItem setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public LLMTraceItem setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    public LLMTraceItem setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public LLMTraceItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public LLMTraceItem setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    public Integer getInputTokens() {
        return this.inputTokens;
    }

    public LLMTraceItem setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    public Integer getOutputTokens() {
        return this.outputTokens;
    }

    public LLMTraceItem setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }

    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    public LLMTraceItem setInput(String input) {
        this.input = input;
        return this;
    }

    public String getInput() {
        return this.input;
    }

    public LLMTraceItem setOutput(String output) {
        this.output = output;
        return this;
    }

    public String getOutput() {
        return this.output;
    }

    public LLMTraceItem setModels(List<String> models) {
        this.models = models;
        return this;
    }

    public List<String> getModels() {
        return this.models;
    }

    public LLMTraceItem setTools(List<String> tools) {
        this.tools = tools;
        return this;
    }

    public List<String> getTools() {
        return this.tools;
    }

    public LLMTraceItem setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Long getDuration() {
        return this.duration;
    }

    @Override
    public String toString() {
        return "LLMTraceItem{" + "traceId=" + traceId + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "service=" + service + "\n" + "sessionId="
                + sessionId + "\n" + "userId=" + userId + "\n" + "inputTokens=" + inputTokens + "\n" + "outputTokens=" + outputTokens + "\n" + "totalTokens=" + totalTokens + "\n"
                + "input=" + input + "\n" + "output=" + output + "\n" + "models=" + models + "\n" + "tools=" + tools + "\n" + "duration=" + duration + "\n" + "}";
    }

}