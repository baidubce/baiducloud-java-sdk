package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestConfig {
    /**
     * 该配置是否来自全局默认配置，仅在应用配置中返回
     */
    private Boolean global;

    /**
     * 接口慢调用阈值，单位：秒
     */
    private Float serverSlowRequestThresholdSeconds;

    /**
     * 数据库慢调用阈值，单位：秒
     */
    private Float dbSlowRequestThresholdSeconds;

    /**
     * 用户自定义不被视为错误的HTTP状态码列表
     */
    private List<Integer> okHttpStatus;

    public RequestConfig setGlobal(Boolean global) {
        this.global = global;
        return this;
    }

    public Boolean getGlobal() {
        return this.global;
    }

    public RequestConfig setServerSlowRequestThresholdSeconds(Float serverSlowRequestThresholdSeconds) {
        this.serverSlowRequestThresholdSeconds = serverSlowRequestThresholdSeconds;
        return this;
    }

    public Float getServerSlowRequestThresholdSeconds() {
        return this.serverSlowRequestThresholdSeconds;
    }

    public RequestConfig setDbSlowRequestThresholdSeconds(Float dbSlowRequestThresholdSeconds) {
        this.dbSlowRequestThresholdSeconds = dbSlowRequestThresholdSeconds;
        return this;
    }

    public Float getDbSlowRequestThresholdSeconds() {
        return this.dbSlowRequestThresholdSeconds;
    }

    public RequestConfig setOkHttpStatus(List<Integer> okHttpStatus) {
        this.okHttpStatus = okHttpStatus;
        return this;
    }

    public List<Integer> getOkHttpStatus() {
        return this.okHttpStatus;
    }

    @Override
    public String toString() {
        return "RequestConfig{" + "global=" + global + "\n" + "serverSlowRequestThresholdSeconds=" + serverSlowRequestThresholdSeconds + "\n" + "dbSlowRequestThresholdSeconds="
                + dbSlowRequestThresholdSeconds + "\n" + "okHttpStatus=" + okHttpStatus + "\n" + "}";
    }

}