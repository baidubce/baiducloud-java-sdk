package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMSessionV3Response extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

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
    private Integer duration;

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

    /**
    * Traces列表
    */
    private List<SessionTrace> traces;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeLLMSessionV3Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLLMSessionV3Response setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLLMSessionV3Response setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public DescribeLLMSessionV3Response setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public DescribeLLMSessionV3Response setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public DescribeLLMSessionV3Response setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public DescribeLLMSessionV3Response setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Integer getTraceCount() {
        return traceCount;
    }

    public DescribeLLMSessionV3Response setTraceCount(Integer traceCount) {
        this.traceCount = traceCount;
        return this;
    }

    public Integer getInputTokens() {
        return inputTokens;
    }

    public DescribeLLMSessionV3Response setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    public Integer getOutputTokens() {
        return outputTokens;
    }

    public DescribeLLMSessionV3Response setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    public Integer getTotalTokens() {
        return totalTokens;
    }

    public DescribeLLMSessionV3Response setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }

    public List<SessionTrace> getTraces() {
        return traces;
    }

    public DescribeLLMSessionV3Response setTraces(List<SessionTrace> traces) {
        this.traces = traces;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLLMSessionV3Response{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "startTime=" + startTime + "\n" + "endTime="
                + endTime + "\n" + "duration=" + duration + "\n" + "userId=" + userId + "\n" + "traceCount=" + traceCount + "\n" + "inputTokens=" + inputTokens + "\n"
                + "outputTokens=" + outputTokens + "\n" + "totalTokens=" + totalTokens + "\n" + "traces=" + traces + "\n" + "}";
    }

}
