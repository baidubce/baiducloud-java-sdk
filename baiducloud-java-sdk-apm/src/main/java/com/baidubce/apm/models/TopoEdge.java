package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopoEdge {
    /**
     * 起始节点
     */
    private String source;

    /**
     * 目标节点
     */
    private String target;

    /**
     * 请求类型
     */
    private String type;

    /**
     * 总请求数
     */
    private Integer requests;

    /**
     * 每秒请求数
     */
    private Float requestsPerSecond;

    /**
     * 错误数
     */
    private Integer errors;

    /**
     * 错误率
     */
    private Float errorRate;

    /**
     * 平均响应时间，单位：秒
     */
    private Float durationSeconds;

    /**
     * 边状态，可选项：`OK` - 正常，`WARNING` - 警示，`ERROR` - 异常
     */
    private String state;

    public TopoEdge setSource(String source) {
        this.source = source;
        return this;
    }

    public String getSource() {
        return this.source;
    }

    public TopoEdge setTarget(String target) {
        this.target = target;
        return this;
    }

    public String getTarget() {
        return this.target;
    }

    public TopoEdge setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public TopoEdge setRequests(Integer requests) {
        this.requests = requests;
        return this;
    }

    public Integer getRequests() {
        return this.requests;
    }

    public TopoEdge setRequestsPerSecond(Float requestsPerSecond) {
        this.requestsPerSecond = requestsPerSecond;
        return this;
    }

    public Float getRequestsPerSecond() {
        return this.requestsPerSecond;
    }

    public TopoEdge setErrors(Integer errors) {
        this.errors = errors;
        return this;
    }

    public Integer getErrors() {
        return this.errors;
    }

    public TopoEdge setErrorRate(Float errorRate) {
        this.errorRate = errorRate;
        return this;
    }

    public Float getErrorRate() {
        return this.errorRate;
    }

    public TopoEdge setDurationSeconds(Float durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    public Float getDurationSeconds() {
        return this.durationSeconds;
    }

    public TopoEdge setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return "TopoEdge{" + "source=" + source + "\n" + "target=" + target + "\n" + "type=" + type + "\n" + "requests=" + requests + "\n" + "requestsPerSecond="
                + requestsPerSecond + "\n" + "errors=" + errors + "\n" + "errorRate=" + errorRate + "\n" + "durationSeconds=" + durationSeconds + "\n" + "state=" + state + "\n"
                + "}";
    }

}