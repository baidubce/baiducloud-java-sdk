package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoggingService {
    /**
     * 
     */
    private Boolean enabled;

    /**
     * 
     */
    private String logType;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private Boolean supported;

    public LoggingService setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public LoggingService setLogType(String logType) {
        this.logType = logType;
        return this;
    }

    public String getLogType() {
        return this.logType;
    }

    public LoggingService setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public LoggingService setSupported(Boolean supported) {
        this.supported = supported;
        return this;
    }

    public Boolean getSupported() {
        return this.supported;
    }

    @Override
    public String toString() {
        return "LoggingService{" + "enabled=" + enabled + "\n" + "logType=" + logType + "\n" + "status=" + status + "\n" + "supported=" + supported + "\n" + "}";
    }

}