package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopoNode {
    /**
     * 应用名
     */
    private String serviceName;

    /**
     * 语言
     */
    private String language;

    /**
     * 节点类型，可选项：`server` - 服务，`db` - 数据库，`mq-producer` - 消息队列生产者，`mq-consumer` - 消息队列消费者，`llm` - 大模型
     */
    private String type;

    /**
     * 是否是推断出的节点
     */
    private Boolean inferred;

    /**
     * 组件类型
     */
    private String component;

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
     * 节点状态，可选项：`OK` - 正常，`WARNING` - 警示，`ERROR` - 异常
     */
    private String state;

    public TopoNode setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public TopoNode setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getLanguage() {
        return this.language;
    }

    public TopoNode setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public TopoNode setInferred(Boolean inferred) {
        this.inferred = inferred;
        return this;
    }

    public Boolean getInferred() {
        return this.inferred;
    }

    public TopoNode setComponent(String component) {
        this.component = component;
        return this;
    }

    public String getComponent() {
        return this.component;
    }

    public TopoNode setRequests(Integer requests) {
        this.requests = requests;
        return this;
    }

    public Integer getRequests() {
        return this.requests;
    }

    public TopoNode setRequestsPerSecond(Float requestsPerSecond) {
        this.requestsPerSecond = requestsPerSecond;
        return this;
    }

    public Float getRequestsPerSecond() {
        return this.requestsPerSecond;
    }

    public TopoNode setErrors(Integer errors) {
        this.errors = errors;
        return this;
    }

    public Integer getErrors() {
        return this.errors;
    }

    public TopoNode setErrorRate(Float errorRate) {
        this.errorRate = errorRate;
        return this;
    }

    public Float getErrorRate() {
        return this.errorRate;
    }

    public TopoNode setDurationSeconds(Float durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    public Float getDurationSeconds() {
        return this.durationSeconds;
    }

    public TopoNode setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return "TopoNode{" + "serviceName=" + serviceName + "\n" + "language=" + language + "\n" + "type=" + type + "\n" + "inferred=" + inferred + "\n" + "component=" + component
                + "\n" + "requests=" + requests + "\n" + "requestsPerSecond=" + requestsPerSecond + "\n" + "errors=" + errors + "\n" + "errorRate=" + errorRate + "\n"
                + "durationSeconds=" + durationSeconds + "\n" + "state=" + state + "\n" + "}";
    }

}