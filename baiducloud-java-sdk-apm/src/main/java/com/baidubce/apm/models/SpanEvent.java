package com.baidubce.apm.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpanEvent {
    /**
     * 事件名称，若name="exception"表示异常事件
     */
    private String name;

    /**
     * 事件发生的时间戳，单位：ns
     */
    private Long timestamp;

    /**
     * 事件属性，异常事件包含exception.type、exception.message、exception.stacktrace
     */
    private Map<String, String> attributes;

    public SpanEvent setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SpanEvent setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public SpanEvent setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    @Override
    public String toString() {
        return "SpanEvent{" + "name=" + name + "\n" + "timestamp=" + timestamp + "\n" + "attributes=" + attributes + "\n" + "}";
    }

}