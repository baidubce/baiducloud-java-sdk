package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPSListenerModel {
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
     * 健康检查正常时的HTTP状态码，支持5类状态码的组合，格式为http_1xx 或 http_2xx
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
     * 加载的SSl证书，目前HTTPS监听器只能绑定一个SSL证书
     */
    private List<String> certIds;

    /**
     * 扩展域名
     */
    private List<AdditionalCertDomain> additionalCertDomains;

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

    public HTTPSListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public HTTPSListenerModel setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public Integer getBackendPort() {
        return this.backendPort;
    }

    public HTTPSListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public HTTPSListenerModel setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public Boolean getKeepSession() {
        return this.keepSession;
    }

    public HTTPSListenerModel setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public String getKeepSessionType() {
        return this.keepSessionType;
    }

    public HTTPSListenerModel setKeepSessionDuration(Integer keepSessionDuration) {
        this.keepSessionDuration = keepSessionDuration;
        return this;
    }

    public Integer getKeepSessionDuration() {
        return this.keepSessionDuration;
    }

    public HTTPSListenerModel setKeepSessionCookieName(String keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public String getKeepSessionCookieName() {
        return this.keepSessionCookieName;
    }

    public HTTPSListenerModel setxForwardFor(Boolean xForwardFor) {
        this.xForwardFor = xForwardFor;
        return this;
    }

    public Boolean getxForwardFor() {
        return this.xForwardFor;
    }

    public HTTPSListenerModel setAdditionalAttributes(AdditionalAttributesModel additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }

    public AdditionalAttributesModel getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public HTTPSListenerModel setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public HTTPSListenerModel setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public HTTPSListenerModel setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }

    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public HTTPSListenerModel setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return this.healthCheckTimeoutInSecond;
    }

    public HTTPSListenerModel setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public HTTPSListenerModel setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public HTTPSListenerModel setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public HTTPSListenerModel setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return this.healthCheckNormalStatus;
    }

    public HTTPSListenerModel setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }

    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public HTTPSListenerModel setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public Integer getServerTimeout() {
        return this.serverTimeout;
    }

    public HTTPSListenerModel setCertIds(List<String> certIds) {
        this.certIds = certIds;
        return this;
    }

    public List<String> getCertIds() {
        return this.certIds;
    }

    public HTTPSListenerModel setAdditionalCertDomains(List<AdditionalCertDomain> additionalCertDomains) {
        this.additionalCertDomains = additionalCertDomains;
        return this;
    }

    public List<AdditionalCertDomain> getAdditionalCertDomains() {
        return this.additionalCertDomains;
    }

    public HTTPSListenerModel setDualAuth(Boolean dualAuth) {
        this.dualAuth = dualAuth;
        return this;
    }

    public Boolean getDualAuth() {
        return this.dualAuth;
    }

    public HTTPSListenerModel setClientCertIds(List<String> clientCertIds) {
        this.clientCertIds = clientCertIds;
        return this;
    }

    public List<String> getClientCertIds() {
        return this.clientCertIds;
    }

    public HTTPSListenerModel setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public HTTPSListenerModel setEncryptionProtocols(List<String> encryptionProtocols) {
        this.encryptionProtocols = encryptionProtocols;
        return this;
    }

    public List<String> getEncryptionProtocols() {
        return this.encryptionProtocols;
    }

    public HTTPSListenerModel setAppliedCiphers(String appliedCiphers) {
        this.appliedCiphers = appliedCiphers;
        return this;
    }

    public String getAppliedCiphers() {
        return this.appliedCiphers;
    }

    @Override
    public String toString() {
        return "HTTPSListenerModel{" + "listenerPort=" + listenerPort + "\n" + "backendPort=" + backendPort + "\n" + "scheduler=" + scheduler + "\n" + "keepSession=" + keepSession
                + "\n" + "keepSessionType=" + keepSessionType + "\n" + "keepSessionDuration=" + keepSessionDuration + "\n" + "keepSessionCookieName=" + keepSessionCookieName
                + "\n" + "xForwardFor=" + xForwardFor + "\n" + "additionalAttributes=" + additionalAttributes + "\n" + "healthCheckType=" + healthCheckType + "\n"
                + "healthCheckPort=" + healthCheckPort + "\n" + "healthCheckURI=" + healthCheckURI + "\n" + "healthCheckTimeoutInSecond=" + healthCheckTimeoutInSecond + "\n"
                + "healthCheckInterval=" + healthCheckInterval + "\n" + "unhealthyThreshold=" + unhealthyThreshold + "\n" + "healthyThreshold=" + healthyThreshold + "\n"
                + "healthCheckNormalStatus=" + healthCheckNormalStatus + "\n" + "healthCheckHost=" + healthCheckHost + "\n" + "serverTimeout=" + serverTimeout + "\n" + "certIds="
                + certIds + "\n" + "additionalCertDomains=" + additionalCertDomains + "\n" + "dualAuth=" + dualAuth + "\n" + "clientCertIds=" + clientCertIds + "\n"
                + "encryptionType=" + encryptionType + "\n" + "encryptionProtocols=" + encryptionProtocols + "\n" + "appliedCiphers=" + appliedCiphers + "\n" + "}";
    }

}