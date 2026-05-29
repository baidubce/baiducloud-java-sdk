package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppIpGroupMemberPortModel {
    /**
     * 健康检查端口协议类型
     */
    private String healthCheckPortType;

    /**
     * 端口状态，"Alive"/"Dead"/"Unknown"
     */
    private String status;

    public AppIpGroupMemberPortModel setHealthCheckPortType(String healthCheckPortType) {
        this.healthCheckPortType = healthCheckPortType;
        return this;
    }

    public String getHealthCheckPortType() {
        return this.healthCheckPortType;
    }

    public AppIpGroupMemberPortModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "AppIpGroupMemberPortModel{" + "healthCheckPortType=" + healthCheckPortType + "\n" + "status=" + status + "\n" + "}";
    }

}