package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogStore {
    /**
     * 日志集所属的日志组名称
     */
    private String project;

    /**
     * 日志集名称
     */
    private String logStoreName;

    /**
     * 监控对象ID
     */
    private String logStoreId;

    /**
     * 日志集所在的区域
     */
    private String region;

    /**
     * 日志集的名称
     */
    private String name;

    /**
     * 允许对日志集中的索引列进行别名
     */
    @JsonProperty("extends")
    private List<Extend> blsExtends;

    public LogStore setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public LogStore setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStoreName() {
        return this.logStoreName;
    }

    public LogStore setLogStoreId(String logStoreId) {
        this.logStoreId = logStoreId;
        return this;
    }

    public String getLogStoreId() {
        return this.logStoreId;
    }

    public LogStore setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public LogStore setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public LogStore setExtends(List<Extend> blsExtends) {
        this.blsExtends = blsExtends;
        return this;
    }

    public List<Extend> getExtends() {
        return this.blsExtends;
    }

    @Override
    public String toString() {
        return "LogStore{" + "project=" + project + "\n" + "logStoreName=" + logStoreName + "\n" + "logStoreId=" + logStoreId + "\n" + "region=" + region + "\n" + "name=" + name
                + "\n" + "blsExtends=" + blsExtends + "\n" + "}";
    }

}