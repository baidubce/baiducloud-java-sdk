package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppServerGroupPort {
    /**
     * 服务器组端口标识符
     */
    private String id;

    /**
     * 服务器组开放端口号
     */
    private Integer port;

    /**
     * 端口协议类型，"TCP"/"HTTP"
     */
    private String type;

    /**
     * 服务器组状态，详见[blbStatus](#blbStatus)
     */
    private String status;

    /**
     * 健康检查协议，支持"HTTP"/"TCP"
     */
    private String healthCheck;

    /**
     * 健康检查端口
     */
    private Integer healthCheckPort;

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
     * 健康检查正常时的HTTP状态码，支持5类状态码的组合，例如"http_1xx\|http_2xx"，默认"http_2xx\|http_3xx"。当健康检查协议为"HTTP"时生效
     */
    private String healthCheckNormalStatus;

    /**
     * 健康检查URI，默认/。当健康检查协议为"HTTP"时生效
     */
    private String healthCheckUrlPath;

    /**
     * 7层健康检查请求的头部域会带指定的host字段，例如"localhost"，默认""。当健康检查协议为"HTTP"时生效
     */
    private String healthCheckHost;

    /**
     * udp健康检查字符串，当端口类型为udp是有效
     */
    private String udpHealthCheckString;

    public AppServerGroupPort setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AppServerGroupPort setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public AppServerGroupPort setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public AppServerGroupPort setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public AppServerGroupPort setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public String getHealthCheck() {
        return this.healthCheck;
    }

    public AppServerGroupPort setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public AppServerGroupPort setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return this.healthCheckTimeoutInSecond;
    }

    public AppServerGroupPort setHealthCheckIntervalInSecond(Integer healthCheckIntervalInSecond) {
        this.healthCheckIntervalInSecond = healthCheckIntervalInSecond;
        return this;
    }

    public Integer getHealthCheckIntervalInSecond() {
        return this.healthCheckIntervalInSecond;
    }

    public AppServerGroupPort setHealthCheckDownRetry(Integer healthCheckDownRetry) {
        this.healthCheckDownRetry = healthCheckDownRetry;
        return this;
    }

    public Integer getHealthCheckDownRetry() {
        return this.healthCheckDownRetry;
    }

    public AppServerGroupPort setHealthCheckUpRetry(Integer healthCheckUpRetry) {
        this.healthCheckUpRetry = healthCheckUpRetry;
        return this;
    }

    public Integer getHealthCheckUpRetry() {
        return this.healthCheckUpRetry;
    }

    public AppServerGroupPort setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return this.healthCheckNormalStatus;
    }

    public AppServerGroupPort setHealthCheckUrlPath(String healthCheckUrlPath) {
        this.healthCheckUrlPath = healthCheckUrlPath;
        return this;
    }

    public String getHealthCheckUrlPath() {
        return this.healthCheckUrlPath;
    }

    public AppServerGroupPort setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }

    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public AppServerGroupPort setUdpHealthCheckString(String udpHealthCheckString) {
        this.udpHealthCheckString = udpHealthCheckString;
        return this;
    }

    public String getUdpHealthCheckString() {
        return this.udpHealthCheckString;
    }

    @Override
    public String toString() {
        return "AppServerGroupPort{" + "id=" + id + "\n" + "port=" + port + "\n" + "type=" + type + "\n" + "status=" + status + "\n" + "healthCheck=" + healthCheck + "\n"
                + "healthCheckPort=" + healthCheckPort + "\n" + "healthCheckTimeoutInSecond=" + healthCheckTimeoutInSecond + "\n" + "healthCheckIntervalInSecond="
                + healthCheckIntervalInSecond + "\n" + "healthCheckDownRetry=" + healthCheckDownRetry + "\n" + "healthCheckUpRetry=" + healthCheckUpRetry + "\n"
                + "healthCheckNormalStatus=" + healthCheckNormalStatus + "\n" + "healthCheckUrlPath=" + healthCheckUrlPath + "\n" + "healthCheckHost=" + healthCheckHost + "\n"
                + "udpHealthCheckString=" + udpHealthCheckString + "\n" + "}";
    }

}