package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppListenerModel {
    /**
     * 监听器的监听端口
     */
    private Integer listenerPort;

    /**
     * 监听器的监听类型
     */
    private String listenerType;

    /**
     * 
     */
    private String scheduler;

    /**
     * tcp设置连接超时时间（单位：秒）
     */
    private Integer tcpSessionTimeout;

    /**
     * udp设置连接超时时间（单位：秒）
     */
    private Integer udpSessionTimeout;

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
    private Integer keepSessionTimeout;

    /**
     * 会话保持需要覆盖的cookie名称，当且仅当开启会话保持且keepSessionType="rewrite"时有效
     */
    private String keepSessionCookieName;

    /**
     * 是否开启获取Client真实IP，开启后后端服务器上可以通过X-Forwarded-For这个HTTP Header来获得Client端的真实地址
     */
    private Boolean xForwardFor;

    /**
     * 是否开启获取监听协议，开启后后端服务器上可以通过X-Forwarded-Proto这个HTTP Header来获得监听协议
     */
    private Boolean xForwardedProto;

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

    public AppListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public AppListenerModel setListenerType(String listenerType) {
        this.listenerType = listenerType;
        return this;
    }

    public String getListenerType() {
        return this.listenerType;
    }

    public AppListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public AppListenerModel setTcpSessionTimeout(Integer tcpSessionTimeout) {
        this.tcpSessionTimeout = tcpSessionTimeout;
        return this;
    }

    public Integer getTcpSessionTimeout() {
        return this.tcpSessionTimeout;
    }

    public AppListenerModel setUdpSessionTimeout(Integer udpSessionTimeout) {
        this.udpSessionTimeout = udpSessionTimeout;
        return this;
    }

    public Integer getUdpSessionTimeout() {
        return this.udpSessionTimeout;
    }

    public AppListenerModel setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public Boolean getKeepSession() {
        return this.keepSession;
    }

    public AppListenerModel setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public String getKeepSessionType() {
        return this.keepSessionType;
    }

    public AppListenerModel setKeepSessionTimeout(Integer keepSessionTimeout) {
        this.keepSessionTimeout = keepSessionTimeout;
        return this;
    }

    public Integer getKeepSessionTimeout() {
        return this.keepSessionTimeout;
    }

    public AppListenerModel setKeepSessionCookieName(String keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public String getKeepSessionCookieName() {
        return this.keepSessionCookieName;
    }

    public AppListenerModel setxForwardFor(Boolean xForwardFor) {
        this.xForwardFor = xForwardFor;
        return this;
    }

    public Boolean getxForwardFor() {
        return this.xForwardFor;
    }

    public AppListenerModel setxForwardedProto(Boolean xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
        return this;
    }

    public Boolean getxForwardedProto() {
        return this.xForwardedProto;
    }

    public AppListenerModel setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public Integer getServerTimeout() {
        return this.serverTimeout;
    }

    public AppListenerModel setRedirectPort(Integer redirectPort) {
        this.redirectPort = redirectPort;
        return this;
    }

    public Integer getRedirectPort() {
        return this.redirectPort;
    }

    public AppListenerModel setCertIds(List<String> certIds) {
        this.certIds = certIds;
        return this;
    }

    public List<String> getCertIds() {
        return this.certIds;
    }

    public AppListenerModel setDualAuth(Boolean dualAuth) {
        this.dualAuth = dualAuth;
        return this;
    }

    public Boolean getDualAuth() {
        return this.dualAuth;
    }

    public AppListenerModel setClientCertIds(List<String> clientCertIds) {
        this.clientCertIds = clientCertIds;
        return this;
    }

    public List<String> getClientCertIds() {
        return this.clientCertIds;
    }

    public AppListenerModel setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public AppListenerModel setEncryptionProtocols(List<String> encryptionProtocols) {
        this.encryptionProtocols = encryptionProtocols;
        return this;
    }

    public List<String> getEncryptionProtocols() {
        return this.encryptionProtocols;
    }

    public AppListenerModel setAppliedCiphers(String appliedCiphers) {
        this.appliedCiphers = appliedCiphers;
        return this;
    }

    public String getAppliedCiphers() {
        return this.appliedCiphers;
    }

    @Override
    public String toString() {
        return "AppListenerModel{" + "listenerPort=" + listenerPort + "\n" + "listenerType=" + listenerType + "\n" + "scheduler=" + scheduler + "\n" + "tcpSessionTimeout="
                + tcpSessionTimeout + "\n" + "udpSessionTimeout=" + udpSessionTimeout + "\n" + "keepSession=" + keepSession + "\n" + "keepSessionType=" + keepSessionType + "\n"
                + "keepSessionTimeout=" + keepSessionTimeout + "\n" + "keepSessionCookieName=" + keepSessionCookieName + "\n" + "xForwardFor=" + xForwardFor + "\n"
                + "xForwardedProto=" + xForwardedProto + "\n" + "serverTimeout=" + serverTimeout + "\n" + "redirectPort=" + redirectPort + "\n" + "certIds=" + certIds + "\n"
                + "dualAuth=" + dualAuth + "\n" + "clientCertIds=" + clientCertIds + "\n" + "encryptionType=" + encryptionType + "\n" + "encryptionProtocols="
                + encryptionProtocols + "\n" + "appliedCiphers=" + appliedCiphers + "\n" + "}";
    }

}