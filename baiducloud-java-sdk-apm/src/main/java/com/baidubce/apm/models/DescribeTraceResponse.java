package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeTraceResponse extends BaseBceResponse {

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
    * 根Span列表，每个Span包含subSpans子Span列表，构成树形结构
    */
    private List<Span> rootSpans;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeTraceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeTraceResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeTraceResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public DescribeTraceResponse setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getMinStartTime() {
        return minStartTime;
    }

    public DescribeTraceResponse setMinStartTime(Integer minStartTime) {
        this.minStartTime = minStartTime;
        return this;
    }

    public Integer getMaxEndTime() {
        return maxEndTime;
    }

    public DescribeTraceResponse setMaxEndTime(Integer maxEndTime) {
        this.maxEndTime = maxEndTime;
        return this;
    }

    public List<Span> getRootSpans() {
        return rootSpans;
    }

    public DescribeTraceResponse setRootSpans(List<Span> rootSpans) {
        this.rootSpans = rootSpans;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeTraceResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "duration=" + duration + "\n" + "minStartTime="
                + minStartTime + "\n" + "maxEndTime=" + maxEndTime + "\n" + "rootSpans=" + rootSpans + "\n" + "}";
    }

}
