package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogRecord {
    /**
     * 日志内容
     */
    private String message;

    /**
     * 日志时间戳
     */
    private Long timestamp;

    public LogRecord setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public LogRecord setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public String toString() {
        return "LogRecord{" + "message=" + message + "\n" + "timestamp=" + timestamp + "\n" + "}";
    }

}