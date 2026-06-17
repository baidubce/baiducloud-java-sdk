package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogStream {
    /**
     * 日志流创建的时间
     */
    private String creationDateTime;

    /**
     * 日志流名称
     */
    private String logStreamName;

    public LogStream setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    public LogStream setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    public String getLogStreamName() {
        return this.logStreamName;
    }

    @Override
    public String toString() {
        return "LogStream{" + "creationDateTime=" + creationDateTime + "\n" + "logStreamName=" + logStreamName + "\n" + "}";
    }

}