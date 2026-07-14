package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthCheckConfig {
    /**
     * 健康检查间隔
     */
    private Integer healthCheckInterval;

    /**
     * 健康检查时间
     */
    private Integer graceTime;

    public HealthCheckConfig setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public HealthCheckConfig setGraceTime(Integer graceTime) {
        this.graceTime = graceTime;
        return this;
    }

    public Integer getGraceTime() {
        return this.graceTime;
    }

    @Override
    public String toString() {
        return "HealthCheckConfig{" + "healthCheckInterval=" + healthCheckInterval + "\n" + "graceTime=" + graceTime + "\n" + "}";
    }

}