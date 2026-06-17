package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFastQueryRequest extends BaseBceRequest {

    /**
    * 快速查询名称
    */
    private String fastQueryName;

    /**
    * 快速查询语句
    */
    private String query;

    /**
    * 信息描述
    */
    private String description;

    /**
    * 日志组名称，默认default
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

    public String getFastQueryName() {
        return fastQueryName;
    }

    public CreateFastQueryRequest setFastQueryName(String fastQueryName) {
        this.fastQueryName = fastQueryName;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public CreateFastQueryRequest setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateFastQueryRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getProject() {
        return project;
    }

    public CreateFastQueryRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public CreateFastQueryRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStreamName() {
        return logStreamName;
    }

    public CreateFastQueryRequest setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

}
