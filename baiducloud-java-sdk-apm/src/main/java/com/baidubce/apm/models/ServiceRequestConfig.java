package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceRequestConfig {
    /**
     * 
     */
    private Boolean global;

    /**
     * 
     */
    private Double serverSlowRequestThresholdSeconds;

    /**
     * 
     */
    private Double dbSlowRequestThresholdSeconds;

    /**
     * 
     */
    private List<Integer> okHttpStatus;

    public ServiceRequestConfig setGlobal(Boolean global) {
        this.global = global;
        return this;
    }

    public Boolean getGlobal() {
        return this.global;
    }

    public ServiceRequestConfig setServerSlowRequestThresholdSeconds(Double serverSlowRequestThresholdSeconds) {
        this.serverSlowRequestThresholdSeconds = serverSlowRequestThresholdSeconds;
        return this;
    }

    public Double getServerSlowRequestThresholdSeconds() {
        return this.serverSlowRequestThresholdSeconds;
    }

    public ServiceRequestConfig setDbSlowRequestThresholdSeconds(Double dbSlowRequestThresholdSeconds) {
        this.dbSlowRequestThresholdSeconds = dbSlowRequestThresholdSeconds;
        return this;
    }

    public Double getDbSlowRequestThresholdSeconds() {
        return this.dbSlowRequestThresholdSeconds;
    }

    public ServiceRequestConfig setOkHttpStatus(List<Integer> okHttpStatus) {
        this.okHttpStatus = okHttpStatus;
        return this;
    }

    public List<Integer> getOkHttpStatus() {
        return this.okHttpStatus;
    }

    @Override
    public String toString() {
        return "ServiceRequestConfig{" + "global=" + global + "\n" + "serverSlowRequestThresholdSeconds=" + serverSlowRequestThresholdSeconds + "\n"
                + "dbSlowRequestThresholdSeconds=" + dbSlowRequestThresholdSeconds + "\n" + "okHttpStatus=" + okHttpStatus + "\n" + "}";
    }

}