package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TensorboardConfig {
    /**
     * 否
     */
    private Boolean enable;

    /**
     * 否
     */
    private String logPath;

    public TensorboardConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public TensorboardConfig setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    public String getLogPath() {
        return this.logPath;
    }

    @Override
    public String toString() {
        return "TensorboardConfig{" + "enable=" + enable + "\n" + "logPath=" + logPath + "\n" + "}";
    }

}