package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionTrace {
    /**
     * trace开始时间，UTC时间
     */
    private String startTime;

    /**
     * trace结束时间，UTC时间
     */
    private String endTime;

    /**
     * trace持续时长，单位：ms
     */
    private Integer duration;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * Trace ID
     */
    private String traceId;

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

    public SessionTrace setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public SessionTrace setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public SessionTrace setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public SessionTrace setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public SessionTrace setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public SessionTrace setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    public Integer getInputTokens() {
        return this.inputTokens;
    }

    public SessionTrace setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    public Integer getOutputTokens() {
        return this.outputTokens;
    }

    public SessionTrace setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }

    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    public SessionTrace setInput(String input) {
        this.input = input;
        return this;
    }

    public String getInput() {
        return this.input;
    }

    public SessionTrace setOutput(String output) {
        this.output = output;
        return this;
    }

    public String getOutput() {
        return this.output;
    }

    public SessionTrace setModels(List<String> models) {
        this.models = models;
        return this;
    }

    public List<String> getModels() {
        return this.models;
    }

    public SessionTrace setTools(List<String> tools) {
        this.tools = tools;
        return this;
    }

    public List<String> getTools() {
        return this.tools;
    }

    @Override
    public String toString() {
        return "SessionTrace{" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "duration=" + duration + "\n" + "userId=" + userId + "\n" + "traceId=" + traceId
                + "\n" + "inputTokens=" + inputTokens + "\n" + "outputTokens=" + outputTokens + "\n" + "totalTokens=" + totalTokens + "\n" + "input=" + input + "\n" + "output="
                + output + "\n" + "models=" + models + "\n" + "tools=" + tools + "\n" + "}";
    }

}