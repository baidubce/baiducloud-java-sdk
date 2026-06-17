package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogStoreBatchRequest {
    /**
     * 项目名称
     */
    private String project;

    /**
     * 日志集名称
     */
    private String logStoreName;

    public LogStoreBatchRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public LogStoreBatchRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStoreName() {
        return this.logStoreName;
    }

    @Override
    public String toString() {
        return "LogStoreBatchRequest{" + "project=" + project + "\n" + "logStoreName=" + logStoreName + "\n" + "}";
    }

}