package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppRsPortModel {
    /**
     * 监听器端口(后端端口关联的监听器端口)
     */
    private Integer listenerPort;

    /**
     * 后端开放的端口
     */
    private String backendPort;

    /**
     * 端口协议类型(服务器组开放的端口类型，包含TCP、UDP、HTTP、HTTPS)
     */
    private String portType;

    /**
     * 健康检查端口协议类型(TCP、UDP、ICMP、HTTP、HTTPS)
     */
    private String healthCheckPortType;

    /**
     * 端口状态，"Alive"/"Dead"/"Unknown"
     */
    private String status;

    /**
     * 端口id
     */
    private String portId;

    /**
     * 对应策略id
     */
    private String policyId;

    public AppRsPortModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public AppRsPortModel setBackendPort(String backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public String getBackendPort() {
        return this.backendPort;
    }

    public AppRsPortModel setPortType(String portType) {
        this.portType = portType;
        return this;
    }

    public String getPortType() {
        return this.portType;
    }

    public AppRsPortModel setHealthCheckPortType(String healthCheckPortType) {
        this.healthCheckPortType = healthCheckPortType;
        return this;
    }

    public String getHealthCheckPortType() {
        return this.healthCheckPortType;
    }

    public AppRsPortModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public AppRsPortModel setPortId(String portId) {
        this.portId = portId;
        return this;
    }

    public String getPortId() {
        return this.portId;
    }

    public AppRsPortModel setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return this.policyId;
    }

    @Override
    public String toString() {
        return "AppRsPortModel{" + "listenerPort=" + listenerPort + "\n" + "backendPort=" + backendPort + "\n" + "portType=" + portType + "\n" + "healthCheckPortType="
                + healthCheckPortType + "\n" + "status=" + status + "\n" + "portId=" + portId + "\n" + "policyId=" + policyId + "\n" + "}";
    }

}