package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllListenerModel {
    /**
     * 监听器的监听端口
     */
    private Integer listenerPort;

    /**
     * 监听器的监听类型
     */
    private String listenerType;

    /**
     * 后端服务器的监听端口
     */
    private Integer backendPort;

    /**
     * 
     */
    private String scheduler;

    /**
     * 健康检查超时时间
     */
    private Integer healthCheckTimeoutInSecond;

    /**
     * 健康检查间隔时间
     */
    private Integer healthCheckInterval;

    /**
     * 健康阈值，即连续多少次健康检查成功后，重新将该后端服务器置为可用
     */
    private Integer healthyThreshold;

    /**
     * 不健康阈值，即连续多少次健康检查失败后，屏蔽该后端服务器
     */
    private Integer unhealthyThreshold;

    /**
     * open-api作为隐形参数对特定有需求用户开放，目前只针对TCP类型可设置，其它类型默认为false，打开后4层数据流到达VM后，VM可通过tcp_option获取到原始blb的ip（vip/ovip）信息
     */
    private Boolean getBlbIp;

    /**
     * tcp设置连接超时时间（单位：秒）
     */
    private Integer tcpSessionTimeout;

    /**
     * udp会话超时时间（单位：秒）
     */
    private Integer udpSessionTimeout;

    /**
     * UDP健康检查发送的请求字符串
     */
    private String healthCheckString;

    /**
     * 是否开启会话保持功能，即同一个Client发出的请求都会到达同一个后端服务器
     */
    private Boolean keepSession;

    /**
     * 会话保持的cookie处理方式，当且仅当开启会话保持时有效
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
     * 健康检查协议类型
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
     * 健康检查正常时的HTTP状态码，支持5类状态码的组合，格式为http_1xx或http_2xx
     */
    private String healthCheckNormalStatus;

    /**
     * 7层健康检查请求的头部域会带指定的host字段，例如"localhost"，默认""。当健康检查协议为"HTTP"时生效
     */
    private String healthCheckHost;

    /**
     * 后端服务器最大超时时间（单位：秒）
     */
    private Integer serverTimeout;

    /**
     * 将此监听器收到的请求转发到HTTPS监听器，HTTPS监听器通过这个端口指定
     */
    private Integer redirectPort;

    /**
     * 加载的SSl证书，目前HTTPS监听器只能绑定一个SSL证书
     */
    private List<String> certIds;

    /**
     * 是否开启双向认证，默认为关闭
     */
    private Boolean dualAuth;

    /**
     * 当dualAuth为true时，加载的客户端证书链
     */
    private List<String> clientCertIds;

    /**
     * 加密类型
     */
    private String encryptionType;

    /**
     * 加密协议
     */
    private List<String> encryptionProtocols;

    /**
     * 加密套件
     */
    private String appliedCiphers;

    public AllListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public AllListenerModel setListenerType(String listenerType) {
        this.listenerType = listenerType;
        return this;
    }

    public String getListenerType() {
        return this.listenerType;
    }

    public AllListenerModel setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public Integer getBackendPort() {
        return this.backendPort;
    }

    public AllListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public AllListenerModel setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return this.healthCheckTimeoutInSecond;
    }

    public AllListenerModel setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public AllListenerModel setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public AllListenerModel setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public AllListenerModel setGetBlbIp(Boolean getBlbIp) {
        this.getBlbIp = getBlbIp;
        return this;
    }

    public Boolean getGetBlbIp() {
        return this.getBlbIp;
    }

    public AllListenerModel setTcpSessionTimeout(Integer tcpSessionTimeout) {
        this.tcpSessionTimeout = tcpSessionTimeout;
        return this;
    }

    public Integer getTcpSessionTimeout() {
        return this.tcpSessionTimeout;
    }

    public AllListenerModel setUdpSessionTimeout(Integer udpSessionTimeout) {
        this.udpSessionTimeout = udpSessionTimeout;
        return this;
    }

    public Integer getUdpSessionTimeout() {
        return this.udpSessionTimeout;
    }

    public AllListenerModel setHealthCheckString(String healthCheckString) {
        this.healthCheckString = healthCheckString;
        return this;
    }

    public String getHealthCheckString() {
        return this.healthCheckString;
    }

    public AllListenerModel setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public Boolean getKeepSession() {
        return this.keepSession;
    }

    public AllListenerModel setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public String getKeepSessionType() {
        return this.keepSessionType;
    }

    public AllListenerModel setKeepSessionDuration(Integer keepSessionDuration) {
        this.keepSessionDuration = keepSessionDuration;
        return this;
    }

    public Integer getKeepSessionDuration() {
        return this.keepSessionDuration;
    }

    public AllListenerModel setKeepSessionCookieName(String keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public String getKeepSessionCookieName() {
        return this.keepSessionCookieName;
    }

    public AllListenerModel setxForwardFor(Boolean xForwardFor) {
        this.xForwardFor = xForwardFor;
        return this;
    }

    public Boolean getxForwardFor() {
        return this.xForwardFor;
    }

    public AllListenerModel setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public AllListenerModel setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public AllListenerModel setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }

    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public AllListenerModel setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return this.healthCheckNormalStatus;
    }

    public AllListenerModel setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }

    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public AllListenerModel setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public Integer getServerTimeout() {
        return this.serverTimeout;
    }

    public AllListenerModel setRedirectPort(Integer redirectPort) {
        this.redirectPort = redirectPort;
        return this;
    }

    public Integer getRedirectPort() {
        return this.redirectPort;
    }

    public AllListenerModel setCertIds(List<String> certIds) {
        this.certIds = certIds;
        return this;
    }

    public List<String> getCertIds() {
        return this.certIds;
    }

    public AllListenerModel setDualAuth(Boolean dualAuth) {
        this.dualAuth = dualAuth;
        return this;
    }

    public Boolean getDualAuth() {
        return this.dualAuth;
    }

    public AllListenerModel setClientCertIds(List<String> clientCertIds) {
        this.clientCertIds = clientCertIds;
        return this;
    }

    public List<String> getClientCertIds() {
        return this.clientCertIds;
    }

    public AllListenerModel setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public AllListenerModel setEncryptionProtocols(List<String> encryptionProtocols) {
        this.encryptionProtocols = encryptionProtocols;
        return this;
    }

    public List<String> getEncryptionProtocols() {
        return this.encryptionProtocols;
    }

    public AllListenerModel setAppliedCiphers(String appliedCiphers) {
        this.appliedCiphers = appliedCiphers;
        return this;
    }

    public String getAppliedCiphers() {
        return this.appliedCiphers;
    }

    @Override
    public String toString() {
        return "AllListenerModel{" + "listenerPort=" + listenerPort + "\n" + "listenerType=" + listenerType + "\n" + "backendPort=" + backendPort + "\n" + "scheduler=" + scheduler
                + "\n" + "healthCheckTimeoutInSecond=" + healthCheckTimeoutInSecond + "\n" + "healthCheckInterval=" + healthCheckInterval + "\n" + "healthyThreshold="
                + healthyThreshold + "\n" + "unhealthyThreshold=" + unhealthyThreshold + "\n" + "getBlbIp=" + getBlbIp + "\n" + "tcpSessionTimeout=" + tcpSessionTimeout + "\n"
                + "udpSessionTimeout=" + udpSessionTimeout + "\n" + "healthCheckString=" + healthCheckString + "\n" + "keepSession=" + keepSession + "\n" + "keepSessionType="
                + keepSessionType + "\n" + "keepSessionDuration=" + keepSessionDuration + "\n" + "keepSessionCookieName=" + keepSessionCookieName + "\n" + "xForwardFor="
                + xForwardFor + "\n" + "healthCheckType=" + healthCheckType + "\n" + "healthCheckPort=" + healthCheckPort + "\n" + "healthCheckURI=" + healthCheckURI + "\n"
                + "healthCheckNormalStatus=" + healthCheckNormalStatus + "\n" + "healthCheckHost=" + healthCheckHost + "\n" + "serverTimeout=" + serverTimeout + "\n"
                + "redirectPort=" + redirectPort + "\n" + "certIds=" + certIds + "\n" + "dualAuth=" + dualAuth + "\n" + "clientCertIds=" + clientCertIds + "\n" + "encryptionType="
                + encryptionType + "\n" + "encryptionProtocols=" + encryptionProtocols + "\n" + "appliedCiphers=" + appliedCiphers + "\n" + "}";
    }

}