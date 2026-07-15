package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppIpGroupBackendPolicy {
    /**
     * IP组协议标识符
     */
    private String id;

    /**
     * IP组协议类型，"TCP"/"HTTP"/"UDP"
     */
    private String type;

    /**
     * 健康检查协议类型，"TCP"/"HTTP"/"UDP"
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
     * 健康检查正常时的HTTP状态码，支持5类状态码的组合，例如"http_1xx\|http_2xx"，默认"http_2xx\|http_3xx"。当健康检查协议为"HTTP"时生效
     */
    private String healthCheckNormalStatus;

    /**
     * udp健康检查字符串，当端口类型为udp时有效
     */
    private String udpHealthCheckString;

    public AppIpGroupBackendPolicy setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AppIpGroupBackendPolicy setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public AppIpGroupBackendPolicy setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public String getHealthCheck() {
        return this.healthCheck;
    }

    public AppIpGroupBackendPolicy setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public AppIpGroupBackendPolicy setHealthCheckUrlPath(String healthCheckUrlPath) {
        this.healthCheckUrlPath = healthCheckUrlPath;
        return this;
    }

    public String getHealthCheckUrlPath() {
        return this.healthCheckUrlPath;
    }

    public AppIpGroupBackendPolicy setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return this.healthCheckTimeoutInSecond;
    }

    public AppIpGroupBackendPolicy setHealthCheckIntervalInSecond(Integer healthCheckIntervalInSecond) {
        this.healthCheckIntervalInSecond = healthCheckIntervalInSecond;
        return this;
    }

    public Integer getHealthCheckIntervalInSecond() {
        return this.healthCheckIntervalInSecond;
    }

    public AppIpGroupBackendPolicy setHealthCheckDownRetry(Integer healthCheckDownRetry) {
        this.healthCheckDownRetry = healthCheckDownRetry;
        return this;
    }

    public Integer getHealthCheckDownRetry() {
        return this.healthCheckDownRetry;
    }

    public AppIpGroupBackendPolicy setHealthCheckUpRetry(Integer healthCheckUpRetry) {
        this.healthCheckUpRetry = healthCheckUpRetry;
        return this;
    }

    public Integer getHealthCheckUpRetry() {
        return this.healthCheckUpRetry;
    }

    public AppIpGroupBackendPolicy setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return this.healthCheckNormalStatus;
    }

    public AppIpGroupBackendPolicy setUdpHealthCheckString(String udpHealthCheckString) {
        this.udpHealthCheckString = udpHealthCheckString;
        return this;
    }

    public String getUdpHealthCheckString() {
        return this.udpHealthCheckString;
    }

    @Override
    public String toString() {
        return "AppIpGroupBackendPolicy{" + "id=" + id + "\n" + "type=" + type + "\n" + "healthCheck=" + healthCheck + "\n" + "healthCheckPort=" + healthCheckPort + "\n"
                + "healthCheckUrlPath=" + healthCheckUrlPath + "\n" + "healthCheckTimeoutInSecond=" + healthCheckTimeoutInSecond + "\n" + "healthCheckIntervalInSecond="
                + healthCheckIntervalInSecond + "\n" + "healthCheckDownRetry=" + healthCheckDownRetry + "\n" + "healthCheckUpRetry=" + healthCheckUpRetry + "\n"
                + "healthCheckNormalStatus=" + healthCheckNormalStatus + "\n" + "udpHealthCheckString=" + udpHealthCheckString + "\n" + "}";
    }

}