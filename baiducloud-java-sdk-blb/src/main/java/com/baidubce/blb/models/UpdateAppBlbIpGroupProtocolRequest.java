package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbIpGroupProtocolRequest extends BaseBceRequest {

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
    * IP组的id
    */
    private String ipGroupId;

    /**
    * IP组协议的id
    */
    private String id;

    /**
    * 健康检查协议类型(HTTPS、HTTP、TCP、UDP、ICMP)监听端口协议type和健康检查协议healthCheck对应关系如下：(type)TCP->(healthCheck)TCP(type)UDP->(healthCheck)UDP、ICMP(type)HTTP->(healthCheck)TCP、
    * HTTP(type)HTTPS->(healthCheck)TCP、HTTP、HTTPS
    */
    private String healthCheck;

    /**
    * 健康检查端口
    */
    private Integer healthCheckPort;

    /**
    * 健康检查路径，默认/，当健康检查协议为"HTTP"时生效
    */
    private String healthCheckUrlPath;

    /**
    * 健康检查超时（单位：秒），默认为3，需为1-60间的整数
    */
    private Integer healthCheckTimeoutInSecond;

    /**
    * 健康检查间隔（单位：秒），默认为3，需为1-10间的整数
    */
    private Integer healthCheckIntervalInSecond;

    /**
    * 不健康阈值，即连续多少次健康检查失败后，屏蔽该后端服务器。默认为3，需为2-5间的整数
    */
    private Integer healthCheckDownRetry;

    /**
    * 健康阈值，即连续多少次健康检查成功后，重新将该后端服务器置为可用。默认为3，需为2-5间的整数
    */
    private Integer healthCheckUpRetry;

    /**
    * 健康检查正常时的HTTP状态码，支持5类状态码的组合，例如"http_1xx
    */
    private String healthCheckNormalStatus;

    /**
    * 发往后端服务器的健康检查请求的Host头域，例如"localhost"，默认为空，当健康检查协议为"HTTP"时生效
    */
    private String healthCheckHost;

    /**
    * udp健康检查字符串，当健康检查协议为"UDP"时生效
    */
    private String udpHealthCheckString;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbIpGroupProtocolRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbIpGroupProtocolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpGroupId() {
        return ipGroupId;
    }

    public UpdateAppBlbIpGroupProtocolRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public String getId() {
        return id;
    }

    public UpdateAppBlbIpGroupProtocolRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getHealthCheck() {
        return healthCheck;
    }

    public UpdateAppBlbIpGroupProtocolRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    public UpdateAppBlbIpGroupProtocolRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public String getHealthCheckUrlPath() {
        return healthCheckUrlPath;
    }

    public UpdateAppBlbIpGroupProtocolRequest setHealthCheckUrlPath(String healthCheckUrlPath) {
        this.healthCheckUrlPath = healthCheckUrlPath;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return healthCheckTimeoutInSecond;
    }

    public UpdateAppBlbIpGroupProtocolRequest setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckIntervalInSecond() {
        return healthCheckIntervalInSecond;
    }

    public UpdateAppBlbIpGroupProtocolRequest setHealthCheckIntervalInSecond(Integer healthCheckIntervalInSecond) {
        this.healthCheckIntervalInSecond = healthCheckIntervalInSecond;
        return this;
    }

    public Integer getHealthCheckDownRetry() {
        return healthCheckDownRetry;
    }

    public UpdateAppBlbIpGroupProtocolRequest setHealthCheckDownRetry(Integer healthCheckDownRetry) {
        this.healthCheckDownRetry = healthCheckDownRetry;
        return this;
    }

    public Integer getHealthCheckUpRetry() {
        return healthCheckUpRetry;
    }

    public UpdateAppBlbIpGroupProtocolRequest setHealthCheckUpRetry(Integer healthCheckUpRetry) {
        this.healthCheckUpRetry = healthCheckUpRetry;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return healthCheckNormalStatus;
    }

    public UpdateAppBlbIpGroupProtocolRequest setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckHost() {
        return healthCheckHost;
    }

    public UpdateAppBlbIpGroupProtocolRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }

    public String getUdpHealthCheckString() {
        return udpHealthCheckString;
    }

    public UpdateAppBlbIpGroupProtocolRequest setUdpHealthCheckString(String udpHealthCheckString) {
        this.udpHealthCheckString = udpHealthCheckString;
        return this;
    }

}
