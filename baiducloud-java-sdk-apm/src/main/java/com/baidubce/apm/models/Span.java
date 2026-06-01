package com.baidubce.apm.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Span {
    /**
     * Trace ID
     */
    private String traceId;

    /**
     * Span ID
     */
    private String spanId;

    /**
     * 父Span ID
     */
    private String parentSpanId;

    /**
     * Span名称
     */
    private String name;

    /**
     * Span所属服务名称
     */
    private String service;

    /**
     * 开始时间戳，单位：us
     */
    private Long start;

    /**
     * 结束时间戳，单位：us
     */
    private Long end;

    /**
     * 响应耗时，单位：us
     */
    private Long duration;

    /**
     * 实例名称
     */
    private String host;

    /**
     * Span状态码，可选项：`STATUS_CODE_OK` - 成功，`STATUS_CODE_ERROR` - 失败，`STATUS_CODE_UNSET` - 未设置
     */
    private String statusCode;

    /**
     * 
     */
    private String kind;

    /**
     * Span属性列表，值可以是任意类型
     */
    private Map<String, String> attributes;

    /**
     * OTEL Resource对象，值可以是任意类型
     */
    private Map<String, String> resource;

    /**
     * 事件列表
     */
    private List<SpanEvent> events;

    /**
     * 当前span在瀑布图中的高度，从0开始计数
     */
    private Integer height;

    /**
     * 子span列表，用于Trace详情的树形结构
     */
    private List<Span> subSpans;

    public Span setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public Span setSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    public String getSpanId() {
        return this.spanId;
    }

    public Span setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
        return this;
    }

    public String getParentSpanId() {
        return this.parentSpanId;
    }

    public Span setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Span setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    public Span setStart(Long start) {
        this.start = start;
        return this;
    }

    public Long getStart() {
        return this.start;
    }

    public Span setEnd(Long end) {
        this.end = end;
        return this;
    }

    public Long getEnd() {
        return this.end;
    }

    public Span setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Long getDuration() {
        return this.duration;
    }

    public Span setHost(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return this.host;
    }

    public Span setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public Span setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getKind() {
        return this.kind;
    }

    public Span setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public Span setResource(Map<String, String> resource) {
        this.resource = resource;
        return this;
    }

    public Map<String, String> getResource() {
        return this.resource;
    }

    public Span setEvents(List<SpanEvent> events) {
        this.events = events;
        return this;
    }

    public List<SpanEvent> getEvents() {
        return this.events;
    }

    public Span setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Span setSubSpans(List<Span> subSpans) {
        this.subSpans = subSpans;
        return this;
    }

    public List<Span> getSubSpans() {
        return this.subSpans;
    }

    @Override
    public String toString() {
        return "Span{" + "traceId=" + traceId + "\n" + "spanId=" + spanId + "\n" + "parentSpanId=" + parentSpanId + "\n" + "name=" + name + "\n" + "service=" + service + "\n"
                + "start=" + start + "\n" + "end=" + end + "\n" + "duration=" + duration + "\n" + "host=" + host + "\n" + "statusCode=" + statusCode + "\n" + "kind=" + kind + "\n"
                + "attributes=" + attributes + "\n" + "resource=" + resource + "\n" + "events=" + events + "\n" + "height=" + height + "\n" + "subSpans=" + subSpans + "\n" + "}";
    }

}