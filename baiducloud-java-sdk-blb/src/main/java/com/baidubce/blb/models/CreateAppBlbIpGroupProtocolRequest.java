package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbIpGroupProtocolRequest extends BaseBceRequest {

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
    * 所属IP组的标识符
    */
    private String ipGroupId;

    /**
    * IP组开放协议类型，"TCP"/"HTTP"/"HTTPS"/"UDP"
    */
    private String type;

    /**
    * 健康检查类型，默认与IP组协议类型相同，"TCP"/"HTTP"/"UDP"/"ICMP"/"HTTPS"监听端口协议type和健康检查协议healthCheck对应关系如下：(type)TCP->(healthCheck)TCP(type)UDP->(healthCheck)UDP、
    * ICMP(type)HTTP->(healthCheck)TCP、HTTP(type)HTTPS->(healthCheck)TCP、HTTP、HTTPS
    */
    private String healthCheck;

    /**
    * 健康检查端口，IP组协议为HTTP协议时必传
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
    * UDP健康检查字符串，当健康检查协议为"UDP"时必传
    */
    private String udpHealthCheckString;

    public String getBlbId() {
        return blbId;
    }

    public CreateAppBlbIpGroupProtocolRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateAppBlbIpGroupProtocolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpGroupId() {
        return ipGroupId;
    }

    public CreateAppBlbIpGroupProtocolRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateAppBlbIpGroupProtocolRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getHealthCheck() {
        return healthCheck;
    }

    public CreateAppBlbIpGroupProtocolRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    public CreateAppBlbIpGroupProtocolRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public String getHealthCheckUrlPath() {
        return healthCheckUrlPath;
    }

    public CreateAppBlbIpGroupProtocolRequest setHealthCheckUrlPath(String healthCheckUrlPath) {
        this.healthCheckUrlPath = healthCheckUrlPath;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return healthCheckTimeoutInSecond;
    }

    public CreateAppBlbIpGroupProtocolRequest setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckIntervalInSecond() {
        return healthCheckIntervalInSecond;
    }

    public CreateAppBlbIpGroupProtocolRequest setHealthCheckIntervalInSecond(Integer healthCheckIntervalInSecond) {
        this.healthCheckIntervalInSecond = healthCheckIntervalInSecond;
        return this;
    }

    public Integer getHealthCheckDownRetry() {
        return healthCheckDownRetry;
    }

    public CreateAppBlbIpGroupProtocolRequest setHealthCheckDownRetry(Integer healthCheckDownRetry) {
        this.healthCheckDownRetry = healthCheckDownRetry;
        return this;
    }

    public Integer getHealthCheckUpRetry() {
        return healthCheckUpRetry;
    }

    public CreateAppBlbIpGroupProtocolRequest setHealthCheckUpRetry(Integer healthCheckUpRetry) {
        this.healthCheckUpRetry = healthCheckUpRetry;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return healthCheckNormalStatus;
    }

    public CreateAppBlbIpGroupProtocolRequest setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckHost() {
        return healthCheckHost;
    }

    public CreateAppBlbIpGroupProtocolRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }

    public String getUdpHealthCheckString() {
        return udpHealthCheckString;
    }

    public CreateAppBlbIpGroupProtocolRequest setUdpHealthCheckString(String udpHealthCheckString) {
        this.udpHealthCheckString = udpHealthCheckString;
        return this;
    }

}
