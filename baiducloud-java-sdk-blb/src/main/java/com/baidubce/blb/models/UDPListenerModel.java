package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UDPListenerModel {
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
     * 健康检查协议，值为"UDP"/"ICMP"
     */
    private String healthCheckType;

    /**
     * 健康检查端口，当健康检查协议为"UDP"时可使用
     */
    private Integer healthCheckPort;

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
     * 健康发送的请求字符串，后端服务器收到后需要进行应答，支持标准转义如\\00、\\xf2，方便配置二进制格式请求
     */
    private String healthCheckString;

    /**
     * udp会话超时时间。默认为90，需为5-4000间的整数，单位秒
     */
    private Integer udpSessionTimeout;

    public UDPListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public UDPListenerModel setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public Integer getBackendPort() {
        return this.backendPort;
    }

    public UDPListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public UDPListenerModel setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public UDPListenerModel setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public UDPListenerModel setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return this.healthCheckTimeoutInSecond;
    }

    public UDPListenerModel setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public UDPListenerModel setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public UDPListenerModel setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public UDPListenerModel setHealthCheckString(String healthCheckString) {
        this.healthCheckString = healthCheckString;
        return this;
    }

    public String getHealthCheckString() {
        return this.healthCheckString;
    }

    public UDPListenerModel setUdpSessionTimeout(Integer udpSessionTimeout) {
        this.udpSessionTimeout = udpSessionTimeout;
        return this;
    }

    public Integer getUdpSessionTimeout() {
        return this.udpSessionTimeout;
    }

    @Override
    public String toString() {
        return "UDPListenerModel{" + "listenerPort=" + listenerPort + "\n" + "backendPort=" + backendPort + "\n" + "scheduler=" + scheduler + "\n" + "healthCheckType="
                + healthCheckType + "\n" + "healthCheckPort=" + healthCheckPort + "\n" + "healthCheckTimeoutInSecond=" + healthCheckTimeoutInSecond + "\n" + "healthCheckInterval="
                + healthCheckInterval + "\n" + "unhealthyThreshold=" + unhealthyThreshold + "\n" + "healthyThreshold=" + healthyThreshold + "\n" + "healthCheckString="
                + healthCheckString + "\n" + "udpSessionTimeout=" + udpSessionTimeout + "\n" + "}";
    }

}