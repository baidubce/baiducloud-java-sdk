package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMTraceResponse extends BaseBceResponse {

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
    * Trace耗时，单位：us
    */
    private Integer duration;

    /**
    * Trace开始时间戳，单位：us
    */
    private Integer minStartTime;

    /**
    * Trace结束时间戳，单位：us
    */
    private Integer maxEndTime;

    /**
    * Trace包含的tokens总数
    */
    private Integer tokens;

    /**
    * Trace LLM输入，可以是任意类型
    */
    private String input;

    /**
    * Trace LLM输出，可以是任意类型
    */
    private String output;

    /**
    * 根Span列表，每个Span包含subSpans子Span列表，形成树形结构
    */
    private List<LLMSpan> rootSpans;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeLLMTraceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLLMTraceResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLLMTraceResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public DescribeLLMTraceResponse setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getMinStartTime() {
        return minStartTime;
    }

    public DescribeLLMTraceResponse setMinStartTime(Integer minStartTime) {
        this.minStartTime = minStartTime;
        return this;
    }

    public Integer getMaxEndTime() {
        return maxEndTime;
    }

    public DescribeLLMTraceResponse setMaxEndTime(Integer maxEndTime) {
        this.maxEndTime = maxEndTime;
        return this;
    }

    public Integer getTokens() {
        return tokens;
    }

    public DescribeLLMTraceResponse setTokens(Integer tokens) {
        this.tokens = tokens;
        return this;
    }

    public String getInput() {
        return input;
    }

    public DescribeLLMTraceResponse setInput(String input) {
        this.input = input;
        return this;
    }

    public String getOutput() {
        return output;
    }

    public DescribeLLMTraceResponse setOutput(String output) {
        this.output = output;
        return this;
    }

    public List<LLMSpan> getRootSpans() {
        return rootSpans;
    }

    public DescribeLLMTraceResponse setRootSpans(List<LLMSpan> rootSpans) {
        this.rootSpans = rootSpans;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLLMTraceResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "duration=" + duration + "\n" + "minStartTime="
                + minStartTime + "\n" + "maxEndTime=" + maxEndTime + "\n" + "tokens=" + tokens + "\n" + "input=" + input + "\n" + "output=" + output + "\n" + "rootSpans="
                + rootSpans + "\n" + "}";
    }

}
