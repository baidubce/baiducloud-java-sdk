package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogService {
    /**
     * 
     */
    private Boolean enabled;

    /**
     * 
     */
    private String logStoreName;

    /**
     * 
     */
    private String project;

    /**
     * 
     */
    private Integer retentionDays;

    public LogService setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public LogService setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getLogStoreName() {
        return this.logStoreName;
    }

    public LogService setProject(String project) {
        this.project = project;
        return this;
    }

    public String getProject() {
        return this.project;
    }

    public LogService setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    @Override
    public String toString() {
        return "LogService{" + "enabled=" + enabled + "\n" + "logStoreName=" + logStoreName + "\n" + "project=" + project + "\n" + "retentionDays=" + retentionDays + "\n" + "}";
    }

}