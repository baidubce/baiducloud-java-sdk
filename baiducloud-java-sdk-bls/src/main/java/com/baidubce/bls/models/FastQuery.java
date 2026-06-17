package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FastQuery {
    /**
     * 快速查询创建的日期时间
     */
    private String creationDateTime;

    /**
     * 最后修改的日期时间
     */
    private String lastModifiedTime;

    /**
     * 快速查询名称
     */
    private String fastQueryName;

    /**
     * 信息描述
     */
    private String description;

    /**
     * 快速查询语句
     */
    private String query;

    /**
     * 日志组名称
     */
    private String project;

    /**
     * 日志集名称
     */
    private String logStoreName;

    /**
     * 日志流名称
     */
    private String logStreamName;

    public FastQuery setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    public FastQuery setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public FastQuery setFastQueryName(String fastQueryName) {
        this.fastQueryName = fastQueryName;
        return this;
    }

    public String getFastQueryName() {
        return this.fastQueryName;
    }

    public FastQuery setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public FastQuery setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    public FastQuery setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public FastQuery setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStoreName() {
        return this.logStoreName;
    }

    public FastQuery setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    public String getLogStreamName() {
        return this.logStreamName;
    }

    @Override
    public String toString() {
        return "FastQuery{" + "creationDateTime=" + creationDateTime + "\n" + "lastModifiedTime=" + lastModifiedTime + "\n" + "fastQueryName=" + fastQueryName + "\n"
                + "description=" + description + "\n" + "query=" + query + "\n" + "project=" + project + "\n" + "logStoreName=" + logStoreName + "\n" + "logStreamName="
                + logStreamName + "\n" + "}";
    }

}