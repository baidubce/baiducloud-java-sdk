package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeFastQueryResponse extends BaseBceResponse {

    /**
    * 日志集创建的日期时间
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
    * 描述信息
    */
    private String description;

    /**
    * 快速查找语句
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

    /**
    * 日志集类型，LOGSTORE或者LOGSTORE_VIEW
    */
    private String logStoreType;

    public String getCreationDateTime() {
        return creationDateTime;
    }

    public DescribeFastQueryResponse setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public DescribeFastQueryResponse setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public String getFastQueryName() {
        return fastQueryName;
    }

    public DescribeFastQueryResponse setFastQueryName(String fastQueryName) {
        this.fastQueryName = fastQueryName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DescribeFastQueryResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public DescribeFastQueryResponse setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getProject() {
        return project;
    }

    public DescribeFastQueryResponse setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public DescribeFastQueryResponse setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStreamName() {
        return logStreamName;
    }

    public DescribeFastQueryResponse setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    public String getLogStoreType() {
        return logStoreType;
    }

    public DescribeFastQueryResponse setLogStoreType(String logStoreType) {
        this.logStoreType = logStoreType;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeFastQueryResponse{" + "creationDateTime=" + creationDateTime + "\n" + "lastModifiedTime=" + lastModifiedTime + "\n" + "fastQueryName=" + fastQueryName
                + "\n" + "description=" + description + "\n" + "query=" + query + "\n" + "project=" + project + "\n" + "logStoreName=" + logStoreName + "\n" + "logStreamName="
                + logStreamName + "\n" + "logStoreType=" + logStoreType + "\n" + "}";
    }

}
