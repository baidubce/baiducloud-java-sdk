package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoggingConfig {
    /**
     * 是否开启日志关联
     */
    private Boolean enabled;

    /**
     * 地域
     */
    private String region;

    /**
     * 日志集所属project
     */
    private String project;

    /**
     * 日志集名称
     */
    private String logStoreName;

    /**
     * 在日志中搜索traceId的方式，可选项：`FIELD` - 指定字段搜索（默认），`FULLTEXT` - 全文检索
     */
    private String traceIdIndex;

    /**
     * 当traceIdIndex=FIELD时搜索的key，默认值：trace_id
     */
    private String traceIdKey;

    /**
     * 在日志中搜索spanId的方式，可选项：`FIELD` - 指定字段搜索（默认），`FULLTEXT` - 全文检索
     */
    private String spanIdIndex;

    /**
     * 当spanIdIndex=FIELD时搜索的key，默认值：span_id
     */
    private String spanIdKey;

    public LoggingConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public LoggingConfig setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public LoggingConfig setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public LoggingConfig setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStoreName() {
        return this.logStoreName;
    }

    public LoggingConfig setTraceIdIndex(String traceIdIndex) {
        this.traceIdIndex = traceIdIndex;
        return this;
    }

    public String getTraceIdIndex() {
        return this.traceIdIndex;
    }

    public LoggingConfig setTraceIdKey(String traceIdKey) {
        this.traceIdKey = traceIdKey;
        return this;
    }

    public String getTraceIdKey() {
        return this.traceIdKey;
    }

    public LoggingConfig setSpanIdIndex(String spanIdIndex) {
        this.spanIdIndex = spanIdIndex;
        return this;
    }

    public String getSpanIdIndex() {
        return this.spanIdIndex;
    }

    public LoggingConfig setSpanIdKey(String spanIdKey) {
        this.spanIdKey = spanIdKey;
        return this;
    }

    public String getSpanIdKey() {
        return this.spanIdKey;
    }

    @Override
    public String toString() {
        return "LoggingConfig{" + "enabled=" + enabled + "\n" + "region=" + region + "\n" + "project=" + project + "\n" + "logStoreName=" + logStoreName + "\n" + "traceIdIndex="
                + traceIdIndex + "\n" + "traceIdKey=" + traceIdKey + "\n" + "spanIdIndex=" + spanIdIndex + "\n" + "spanIdKey=" + spanIdKey + "\n" + "}";
    }

}