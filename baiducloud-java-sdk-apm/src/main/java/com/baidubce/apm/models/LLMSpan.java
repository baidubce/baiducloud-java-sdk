package com.baidubce.apm.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LLMSpan {
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
     * Span状态码，可选项：`STATUS_CODE_OK`，`STATUS_CODE_ERROR`，`STATUS_CODE_UNSET`
     */
    private String statusCode;

    /**
     * Span类型，可选项：`SPAN_KIND_SERVER`，`SPAN_KIND_CLIENT`，`SPAN_KIND_PRODUCER`，`SPAN_KIND_CONSUMER`，`SPAN_KIND_INTERNAL`
     */
    private String kind;

    /**
     * input
     */
    private SpanContentRef input;

    /**
     * output
     */
    private SpanContentRef output;

    /**
     * 输入消息列表
     */
    private List<SpanMessage> inputMessages;

    /**
     * 输出消息列表
     */
    private List<SpanMessage> outputMessages;

    /**
     * Span属性列表，包含gen_ai.kind、gen_ai.response.model、llm.usage.total_tokens等
     */
    private Map<String, String> attributes;

    /**
     * OTEL Resource对象
     */
    private Map<String, String> resource;

    /**
     * 事件列表
     */
    private List<SpanEvent> events;

    /**
     * 当前span在瀑布图中的高度
     */
    private Integer height;

    /**
     * 子span列表
     */
    private List<LLMSpan> subSpans;

    public LLMSpan setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public LLMSpan setSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    public String getSpanId() {
        return this.spanId;
    }

    public LLMSpan setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
        return this;
    }

    public String getParentSpanId() {
        return this.parentSpanId;
    }

    public LLMSpan setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public LLMSpan setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    public LLMSpan setStart(Long start) {
        this.start = start;
        return this;
    }

    public Long getStart() {
        return this.start;
    }

    public LLMSpan setEnd(Long end) {
        this.end = end;
        return this;
    }

    public Long getEnd() {
        return this.end;
    }

    public LLMSpan setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Long getDuration() {
        return this.duration;
    }

    public LLMSpan setHost(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return this.host;
    }

    public LLMSpan setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public LLMSpan setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getKind() {
        return this.kind;
    }

    public LLMSpan setInput(SpanContentRef input) {
        this.input = input;
        return this;
    }

    public SpanContentRef getInput() {
        return this.input;
    }

    public LLMSpan setOutput(SpanContentRef output) {
        this.output = output;
        return this;
    }

    public SpanContentRef getOutput() {
        return this.output;
    }

    public LLMSpan setInputMessages(List<SpanMessage> inputMessages) {
        this.inputMessages = inputMessages;
        return this;
    }

    public List<SpanMessage> getInputMessages() {
        return this.inputMessages;
    }

    public LLMSpan setOutputMessages(List<SpanMessage> outputMessages) {
        this.outputMessages = outputMessages;
        return this;
    }

    public List<SpanMessage> getOutputMessages() {
        return this.outputMessages;
    }

    public LLMSpan setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public LLMSpan setResource(Map<String, String> resource) {
        this.resource = resource;
        return this;
    }

    public Map<String, String> getResource() {
        return this.resource;
    }

    public LLMSpan setEvents(List<SpanEvent> events) {
        this.events = events;
        return this;
    }

    public List<SpanEvent> getEvents() {
        return this.events;
    }

    public LLMSpan setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    public LLMSpan setSubSpans(List<LLMSpan> subSpans) {
        this.subSpans = subSpans;
        return this;
    }

    public List<LLMSpan> getSubSpans() {
        return this.subSpans;
    }

    @Override
    public String toString() {
        return "LLMSpan{" + "traceId=" + traceId + "\n" + "spanId=" + spanId + "\n" + "parentSpanId=" + parentSpanId + "\n" + "name=" + name + "\n" + "service=" + service + "\n"
                + "start=" + start + "\n" + "end=" + end + "\n" + "duration=" + duration + "\n" + "host=" + host + "\n" + "statusCode=" + statusCode + "\n" + "kind=" + kind + "\n"
                + "input=" + input + "\n" + "output=" + output + "\n" + "inputMessages=" + inputMessages + "\n" + "outputMessages=" + outputMessages + "\n" + "attributes="
                + attributes + "\n" + "resource=" + resource + "\n" + "events=" + events + "\n" + "height=" + height + "\n" + "subSpans=" + subSpans + "\n" + "}";
    }

}