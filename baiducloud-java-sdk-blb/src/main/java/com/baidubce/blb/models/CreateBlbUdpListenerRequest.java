package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateBlbUdpListenerRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

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
    * 健康检查协议类型，支持"UDP"/"ICMP"，默认"UDP"
    */
    private String healthCheckType;

    /**
    * 健康检查端口，当健康检查协议为"UDP"时指定，默认为backendPort.
    */
    private Integer healthCheckPort;

    /**
    * 健康发送的请求字符串，后端服务器收到后需要进行应答，支持16进制\00-\FF和标准ASCII字符串，最大长度1299，健康检查协议为"UDP"时必传
    */
    private String healthCheckString;

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

    /**
    * udp会话超时时间。默认为90，需为5-4000间的整数，单位秒
    */
    private Integer udpSessionTimeout;

    public String getBlbId() {
        return blbId;
    }

    public CreateBlbUdpListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateBlbUdpListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public CreateBlbUdpListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getBackendPort() {
        return backendPort;
    }

    public CreateBlbUdpListenerRequest setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public String getScheduler() {
        return scheduler;
    }

    public CreateBlbUdpListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getHealthCheckType() {
        return healthCheckType;
    }

    public CreateBlbUdpListenerRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    public CreateBlbUdpListenerRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public String getHealthCheckString() {
        return healthCheckString;
    }

    public CreateBlbUdpListenerRequest setHealthCheckString(String healthCheckString) {
        this.healthCheckString = healthCheckString;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return healthCheckTimeoutInSecond;
    }

    public CreateBlbUdpListenerRequest setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return healthCheckInterval;
    }

    public CreateBlbUdpListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    public CreateBlbUdpListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    public CreateBlbUdpListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    public Integer getUdpSessionTimeout() {
        return udpSessionTimeout;
    }

    public CreateBlbUdpListenerRequest setUdpSessionTimeout(Integer udpSessionTimeout) {
        this.udpSessionTimeout = udpSessionTimeout;
        return this;
    }

}
