package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPListenerModel {
    /**
     * 监听器的监听端口
     */
    private Integer listenerPort;

    /**
     * 后端服务器的监听端口
     */
    private Integer backendPort;

    /**
     * 负载均衡算法，值为"RoundRobin"/"LeastConnection"
     */
    private String scheduler;

    /**
     * 是否开启会话保持功能，即同一个Client发出的请求都会到达同一个后端服务器
     */
    private Boolean keepSession;

    /**
     * 会话保持的cookie处理方式，当且仅当开启会话保持时有效，值为"insert"/"rewrite"
     */
    private String keepSessionType;

    /**
     * 会话保持的cookie有效时间（单位：秒），当且仅当开启会话保持时有效
     */
    private Integer keepSessionDuration;

    /**
     * 会话保持需要覆盖的cookie名称，当且仅当开启会话保持且keepSessionType="rewrite"时有效
     */
    private String keepSessionCookieName;

    /**
     * 是否开启获取Client真实IP，开启后后端服务器上可以通过X-Forwarded-For这个HTTP Header来获得Client端的真实地址
     */
    private Boolean xForwardFor;

    /**
     * additionalAttributes
     */
    private AdditionalAttributesModel additionalAttributes;

    /**
     * 健康检查协议，值为"HTTP"/"TCP"
     */
    private String healthCheckType;

    /**
     * 健康检查端口
     */
    private Integer healthCheckPort;

    /**
     * 健康检查URI
     */
    private String healthCheckURI;

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
     * 健康检查正常时的HTTP状态码，支持5类状态码的组合，格式为http_1xx或http_2xx
     */
    private String healthCheckNormalStatus;

    /**
     * 7层健康检查请求的头部域会带指定的host字段，例如"localhost"，默认""。当健康检查协议为"HTTP"时生效
     */
    private String healthCheckHost;

    /**
     * 后端服务器最大超时（单位：秒）
     */
    private Integer serverTimeout;

    /**
     * 将此监听器收到的请求转发到HTTPS监听器，HTTPS监听器通过这个端口指定
     */
    private Integer redirectPort;

    public HTTPListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public HTTPListenerModel setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public Integer getBackendPort() {
        return this.backendPort;
    }

    public HTTPListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public HTTPListenerModel setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public Boolean getKeepSession() {
        return this.keepSession;
    }

    public HTTPListenerModel setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public String getKeepSessionType() {
        return this.keepSessionType;
    }

    public HTTPListenerModel setKeepSessionDuration(Integer keepSessionDuration) {
        this.keepSessionDuration = keepSessionDuration;
        return this;
    }

    public Integer getKeepSessionDuration() {
        return this.keepSessionDuration;
    }

    public HTTPListenerModel setKeepSessionCookieName(String keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public String getKeepSessionCookieName() {
        return this.keepSessionCookieName;
    }

    public HTTPListenerModel setxForwardFor(Boolean xForwardFor) {
        this.xForwardFor = xForwardFor;
        return this;
    }

    public Boolean getxForwardFor() {
        return this.xForwardFor;
    }

    public HTTPListenerModel setAdditionalAttributes(AdditionalAttributesModel additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }

    public AdditionalAttributesModel getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public HTTPListenerModel setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public HTTPListenerModel setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public HTTPListenerModel setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }

    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public HTTPListenerModel setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return this.healthCheckTimeoutInSecond;
    }

    public HTTPListenerModel setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public HTTPListenerModel setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public HTTPListenerModel setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public HTTPListenerModel setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return this.healthCheckNormalStatus;
    }

    public HTTPListenerModel setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }

    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public HTTPListenerModel setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public Integer getServerTimeout() {
        return this.serverTimeout;
    }

    public HTTPListenerModel setRedirectPort(Integer redirectPort) {
        this.redirectPort = redirectPort;
        return this;
    }

    public Integer getRedirectPort() {
        return this.redirectPort;
    }

    @Override
    public String toString() {
        return "HTTPListenerModel{" + "listenerPort=" + listenerPort + "\n" + "backendPort=" + backendPort + "\n" + "scheduler=" + scheduler + "\n" + "keepSession=" + keepSession
                + "\n" + "keepSessionType=" + keepSessionType + "\n" + "keepSessionDuration=" + keepSessionDuration + "\n" + "keepSessionCookieName=" + keepSessionCookieName
                + "\n" + "xForwardFor=" + xForwardFor + "\n" + "additionalAttributes=" + additionalAttributes + "\n" + "healthCheckType=" + healthCheckType + "\n"
                + "healthCheckPort=" + healthCheckPort + "\n" + "healthCheckURI=" + healthCheckURI + "\n" + "healthCheckTimeoutInSecond=" + healthCheckTimeoutInSecond + "\n"
                + "healthCheckInterval=" + healthCheckInterval + "\n" + "unhealthyThreshold=" + unhealthyThreshold + "\n" + "healthyThreshold=" + healthyThreshold + "\n"
                + "healthCheckNormalStatus=" + healthCheckNormalStatus + "\n" + "healthCheckHost=" + healthCheckHost + "\n" + "serverTimeout=" + serverTimeout + "\n"
                + "redirectPort=" + redirectPort + "\n" + "}";
    }

}