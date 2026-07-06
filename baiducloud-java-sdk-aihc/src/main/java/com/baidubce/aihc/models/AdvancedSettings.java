package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedSettings {
    /**
     * 否
     */
    private String runtimeEnv;

    /**
     * 否
     */
    private Integer submitterBackoffLimit;

    public AdvancedSettings setRuntimeEnv(String runtimeEnv) {
        this.runtimeEnv = runtimeEnv;
        return this;
    }

    public String getRuntimeEnv() {
        return this.runtimeEnv;
    }

    public AdvancedSettings setSubmitterBackoffLimit(Integer submitterBackoffLimit) {
        this.submitterBackoffLimit = submitterBackoffLimit;
        return this;
    }

    public Integer getSubmitterBackoffLimit() {
        return this.submitterBackoffLimit;
    }

    @Override
    public String toString() {
        return "AdvancedSettings{" + "runtimeEnv=" + runtimeEnv + "\n" + "submitterBackoffLimit=" + submitterBackoffLimit + "\n" + "}";
    }

}