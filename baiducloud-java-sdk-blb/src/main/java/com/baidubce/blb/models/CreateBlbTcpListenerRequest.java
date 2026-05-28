package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateBlbTcpListenerRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * 监听器的监听端口，需为1-65535间的整数
    */
    private Integer listenerPort;

    /**
    * 后端服务器的监听端口，需为1-65535间的整数
    */
    private Integer backendPort;

    /**
    * 负载均衡算法，支持3种方式："RoundRobin"/"WeightLeastConn"/"Hash"，"RoundRobin"代表加权轮询、"WeightLeastConn"代表加权最小连接、"Hash"代表根据源ip哈希
    */
    private String scheduler;

    /**
    * tcp设置连接超时时间（单位：秒），默认900，需为10-4000间的整数
    */
    private Integer tcpSessionTimeout;

    /**
    * 健康检查协议类型，默认"TCP"
    */
    private String healthCheckType;

    /**
    * 健康检查超时（单位：秒），默认为3，需为1-60间的整数
    */
    private Integer healthCheckTimeoutInSecond;

    /**
    * 健康检查间隔（单位：秒），默认为3，需为1-10间的整数
    */
    private Integer healthCheckInterval;

    /**
    * 不健康阈值，即连续多少次健康检查失败后，屏蔽该后端服务器。默认为3，需为2-5间的整数
    */
    private Integer unhealthyThreshold;

    /**
    * 健康阈值，即连续多少次健康检查成功后，重新将该后端服务器置为可用。默认为3，需为2-5间的整数
    */
    private Integer healthyThreshold;

    public String getBlbId() {
        return blbId;
    }

    public CreateBlbTcpListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public CreateBlbTcpListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getBackendPort() {
        return backendPort;
    }

    public CreateBlbTcpListenerRequest setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public String getScheduler() {
        return scheduler;
    }

    public CreateBlbTcpListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public Integer getTcpSessionTimeout() {
        return tcpSessionTimeout;
    }

    public CreateBlbTcpListenerRequest setTcpSessionTimeout(Integer tcpSessionTimeout) {
        this.tcpSessionTimeout = tcpSessionTimeout;
        return this;
    }

    public String getHealthCheckType() {
        return healthCheckType;
    }

    public CreateBlbTcpListenerRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return healthCheckTimeoutInSecond;
    }

    public CreateBlbTcpListenerRequest setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return healthCheckInterval;
    }

    public CreateBlbTcpListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    public CreateBlbTcpListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    public CreateBlbTcpListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

}
