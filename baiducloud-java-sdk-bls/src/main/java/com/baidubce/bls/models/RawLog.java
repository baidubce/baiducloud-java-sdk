package com.baidubce.bls.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RawLog {
    /**
     * 日志集项目
     */
    private String project;

    /**
     * 日志集名称
     */
    private String logStoreName;

    /**
     * 查询语句
     */
    private String query;

    /**
     * 指定展示字段
     */
    private List<String> columns;

    /**
     * 展示的日志条数
     */
    private Integer limit;

    /**
     * 展示的日志原文
     */
    private List<Map<String, Object>> logs;

    public RawLog setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public RawLog setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStoreName() {
        return this.logStoreName;
    }

    public RawLog setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    public RawLog setColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public List<String> getColumns() {
        return this.columns;
    }

    public RawLog setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public RawLog setLogs(List<Map<String, Object>> logs) {
        this.logs = logs;
        return this;
    }

    public List<Map<String, Object>> getLogs() {
        return this.logs;
    }

    @Override
    public String toString() {
        return "RawLog{" + "project=" + project + "\n" + "logStoreName=" + logStoreName + "\n" + "query=" + query + "\n" + "columns=" + columns + "\n" + "limit=" + limit + "\n"
                + "logs=" + logs + "\n" + "}";
    }

}