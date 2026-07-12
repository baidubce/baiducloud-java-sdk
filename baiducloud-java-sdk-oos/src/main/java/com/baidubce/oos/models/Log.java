package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Log {
    /**
     * 时间戳，精确到毫秒，如：2022-01-18 13:30:00.000
     */
    private String timestamp;

    /**
     * 日志等级
     */
    private String level;

    /**
     * 日志内容
     */
    private String msg;

    /**
     * 日志标签键值对
     */
    private Object tags;

    public Log setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Log setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getLevel() {
        return this.level;
    }

    public Log setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getMsg() {
        return this.msg;
    }

    public Log setTags(Object tags) {
        this.tags = tags;
        return this;
    }

    public Object getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "Log{" + "timestamp=" + timestamp + "\n" + "level=" + level + "\n" + "msg=" + msg + "\n" + "tags=" + tags + "\n" + "}";
    }

}