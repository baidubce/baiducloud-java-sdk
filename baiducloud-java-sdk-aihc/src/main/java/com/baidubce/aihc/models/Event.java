package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {
    /**
     * 原因
     */
    private String reason;

    /**
     * 详细信息
     */
    private String message;

    /**
     * 首次出现时间
     */
    private String firstTimestamp;

    /**
     * 最后出现时间
     */
    private String lastTimestamp;

    /**
     * 出现次数
     */
    private Integer count;

    /**
     * 事件类型
     */
    private Integer type;

    public Event setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public Event setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Event setFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
        return this;
    }

    public String getFirstTimestamp() {
        return this.firstTimestamp;
    }

    public Event setLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }

    public String getLastTimestamp() {
        return this.lastTimestamp;
    }

    public Event setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    public Event setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Event{" + "reason=" + reason + "\n" + "message=" + message + "\n" + "firstTimestamp=" + firstTimestamp + "\n" + "lastTimestamp=" + lastTimestamp + "\n" + "count="
                + count + "\n" + "type=" + type + "\n" + "}";
    }

}