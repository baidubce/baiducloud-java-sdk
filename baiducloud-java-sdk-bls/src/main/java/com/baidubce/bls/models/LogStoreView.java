package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogStoreView {
    /**
     * 日志组名称
     */
    private String project;

    /**
     * 日志视图名称
     */
    private String name;

    /**
     * 所关联的日志集列表
     */
    private List<LogStore> logstores;

    /**
     * 日志视图创建的日期时间
     */
    private String createdTimestamp;

    /**
     * 最后修改的日期时间
     */
    private String updatedTimestamp;

    public LogStoreView setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public LogStoreView setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public LogStoreView setLogstores(List<LogStore> logstores) {
        this.logstores = logstores;
        return this;
    }

    public List<LogStore> getLogstores() {
        return this.logstores;
    }

    public LogStoreView setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public LogStoreView setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    @Override
    public String toString() {
        return "LogStoreView{" + "project=" + project + "\n" + "name=" + name + "\n" + "logstores=" + logstores + "\n" + "createdTimestamp=" + createdTimestamp + "\n"
                + "updatedTimestamp=" + updatedTimestamp + "\n" + "}";
    }

}