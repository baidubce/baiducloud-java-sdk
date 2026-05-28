package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TCPListenerModel {
    /**
     * 监听器的监听端口
     */
    private Integer listenerPort;

    /**
     * 后端服务器的监听端口
     */
    private Integer backendPort;

    /**
     * 负载均衡算法，值为"RoundRobin"/"WeightLeastConn"/"Hash"，"RoundRobin"代表加权轮询、"WeightLeastConn"代表加权最小连接数、"Hash"代表根据源ip哈希
     */
    private String scheduler;

    /**
     * 健康检查超时
     */
    private Integer healthCheckTimeoutInSecond;

    /**
     * 健康检查间隔
     */
    private Integer healthCheckInterval;

    /**
     * 不健康阈值，即连续多少次健康检查失败后，屏蔽该后端服务器
     */
    private Integer unhealthyThreshold;

    /**
     * 健康阈值，即连续多少次健康检查成功后，重新将该后端服务器置为可用
     */
    private Integer healthyThreshold;

    /**
     * tcp设置连接超时时间（单位：秒），默认为900，需为10-4000间的整数
     */
    private Integer tcpSessionTimeout;

    public TCPListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public TCPListenerModel setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public Integer getBackendPort() {
        return this.backendPort;
    }

    public TCPListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public TCPListenerModel setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return this.healthCheckTimeoutInSecond;
    }

    public TCPListenerModel setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public TCPListenerModel setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public TCPListenerModel setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public TCPListenerModel setTcpSessionTimeout(Integer tcpSessionTimeout) {
        this.tcpSessionTimeout = tcpSessionTimeout;
        return this;
    }

    public Integer getTcpSessionTimeout() {
        return this.tcpSessionTimeout;
    }

    @Override
    public String toString() {
        return "TCPListenerModel{" + "listenerPort=" + listenerPort + "\n" + "backendPort=" + backendPort + "\n" + "scheduler=" + scheduler + "\n" + "healthCheckTimeoutInSecond="
                + healthCheckTimeoutInSecond + "\n" + "healthCheckInterval=" + healthCheckInterval + "\n" + "unhealthyThreshold=" + unhealthyThreshold + "\n" + "healthyThreshold="
                + healthyThreshold + "\n" + "tcpSessionTimeout=" + tcpSessionTimeout + "\n" + "}";
    }

}