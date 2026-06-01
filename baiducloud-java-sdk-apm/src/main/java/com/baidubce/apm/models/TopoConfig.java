package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopoConfig {
    /**
     * 该配置是否来自全局默认配置，仅在应用配置中返回
     */
    private Boolean global;

    /**
     * 请求时长警示阈值，单位：秒
     */
    private Float requestSecondsThreshold;

    /**
     * 错误率警示阈值，取值范围：[0, 1]
     */
    private Float errorRateThreshold;

    public TopoConfig setGlobal(Boolean global) {
        this.global = global;
        return this;
    }

    public Boolean getGlobal() {
        return this.global;
    }

    public TopoConfig setRequestSecondsThreshold(Float requestSecondsThreshold) {
        this.requestSecondsThreshold = requestSecondsThreshold;
        return this;
    }

    public Float getRequestSecondsThreshold() {
        return this.requestSecondsThreshold;
    }

    public TopoConfig setErrorRateThreshold(Float errorRateThreshold) {
        this.errorRateThreshold = errorRateThreshold;
        return this;
    }

    public Float getErrorRateThreshold() {
        return this.errorRateThreshold;
    }

    @Override
    public String toString() {
        return "TopoConfig{" + "global=" + global + "\n" + "requestSecondsThreshold=" + requestSecondsThreshold + "\n" + "errorRateThreshold=" + errorRateThreshold + "\n" + "}";
    }

}