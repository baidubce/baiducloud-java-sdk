package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeoutPolicy {
    /**
     * 是否启用超时策略
     */
    private Boolean enabled;

    /**
     * 超时时长，单位为秒，enabled 为 true 时必需
     */
    private Integer timeout;

    public TimeoutPolicy setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public TimeoutPolicy setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    @Override
    public String toString() {
        return "TimeoutPolicy{" + "enabled=" + enabled + "\n" + "timeout=" + timeout + "\n" + "}";
    }

}