package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppHTTPSListenerModel {
    /**
     * 监听器的监听端口
     */
    private Integer listenerPort;

    /**
     * 负载均衡算法，值为"RoundRobin"/"LeastConnection"，"RoundRobin"代表加权轮询、"LeastConnection"代表最小连接数
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
    private Integer keepSessionTimeout;

    /**
     * 会话保持需要覆盖的cookie名称，当且仅当开启会话保持且keepSessionType="rewrite"时有效
     */
    private String keepSessionCookieName;

    /**
     * 是否开启获取Client真实IP，开启后后端服务器上可以通过X-Forwarded-For这个HTTP Header来获得Client端的真实地址
     */
    private Boolean xForwardedFor;

    /**
     * 是否开启获取监听协议，开启后后端服务器上可以通过X-Forwarded-Proto这个HTTP Header来获得监听协议
     */
    private Boolean xForwardedProto;

    /**
     * 后端服务器最大超时（单位：秒）
     */
    private Integer serverTimeout;

    /**
     * 加载的SSl证书链
     */
    private List<String> certIds;

    /**
     * 扩展域名
     */
    private List<AdditionalCertDomain> additionalCertDomains;

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

    /**
     * 是否开启双向认证，默认为关闭
     */
    private Boolean dualAuth;

    /**
     * 当dualAuth为true时，加载的客户端证书链
     */
    private List<String> clientCertIds;

    /**
     * 描述信息，长度不超过200个字符。
     */
    private String description;

    public AppHTTPSListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public AppHTTPSListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public AppHTTPSListenerModel setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public Boolean getKeepSession() {
        return this.keepSession;
    }

    public AppHTTPSListenerModel setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public String getKeepSessionType() {
        return this.keepSessionType;
    }

    public AppHTTPSListenerModel setKeepSessionTimeout(Integer keepSessionTimeout) {
        this.keepSessionTimeout = keepSessionTimeout;
        return this;
    }

    public Integer getKeepSessionTimeout() {
        return this.keepSessionTimeout;
    }

    public AppHTTPSListenerModel setKeepSessionCookieName(String keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public String getKeepSessionCookieName() {
        return this.keepSessionCookieName;
    }

    public AppHTTPSListenerModel setxForwardedFor(Boolean xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
        return this;
    }

    public Boolean getxForwardedFor() {
        return this.xForwardedFor;
    }

    public AppHTTPSListenerModel setxForwardedProto(Boolean xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
        return this;
    }

    public Boolean getxForwardedProto() {
        return this.xForwardedProto;
    }

    public AppHTTPSListenerModel setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public Integer getServerTimeout() {
        return this.serverTimeout;
    }

    public AppHTTPSListenerModel setCertIds(List<String> certIds) {
        this.certIds = certIds;
        return this;
    }

    public List<String> getCertIds() {
        return this.certIds;
    }

    public AppHTTPSListenerModel setAdditionalCertDomains(List<AdditionalCertDomain> additionalCertDomains) {
        this.additionalCertDomains = additionalCertDomains;
        return this;
    }

    public List<AdditionalCertDomain> getAdditionalCertDomains() {
        return this.additionalCertDomains;
    }

    public AppHTTPSListenerModel setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public AppHTTPSListenerModel setEncryptionProtocols(List<String> encryptionProtocols) {
        this.encryptionProtocols = encryptionProtocols;
        return this;
    }

    public List<String> getEncryptionProtocols() {
        return this.encryptionProtocols;
    }

    public AppHTTPSListenerModel setAppliedCiphers(String appliedCiphers) {
        this.appliedCiphers = appliedCiphers;
        return this;
    }

    public String getAppliedCiphers() {
        return this.appliedCiphers;
    }

    public AppHTTPSListenerModel setDualAuth(Boolean dualAuth) {
        this.dualAuth = dualAuth;
        return this;
    }

    public Boolean getDualAuth() {
        return this.dualAuth;
    }

    public AppHTTPSListenerModel setClientCertIds(List<String> clientCertIds) {
        this.clientCertIds = clientCertIds;
        return this;
    }

    public List<String> getClientCertIds() {
        return this.clientCertIds;
    }

    public AppHTTPSListenerModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "AppHTTPSListenerModel{" + "listenerPort=" + listenerPort + "\n" + "scheduler=" + scheduler + "\n" + "keepSession=" + keepSession + "\n" + "keepSessionType="
                + keepSessionType + "\n" + "keepSessionTimeout=" + keepSessionTimeout + "\n" + "keepSessionCookieName=" + keepSessionCookieName + "\n" + "xForwardedFor="
                + xForwardedFor + "\n" + "xForwardedProto=" + xForwardedProto + "\n" + "serverTimeout=" + serverTimeout + "\n" + "certIds=" + certIds + "\n"
                + "additionalCertDomains=" + additionalCertDomains + "\n" + "encryptionType=" + encryptionType + "\n" + "encryptionProtocols=" + encryptionProtocols + "\n"
                + "appliedCiphers=" + appliedCiphers + "\n" + "dualAuth=" + dualAuth + "\n" + "clientCertIds=" + clientCertIds + "\n" + "description=" + description + "\n" + "}";
    }

}