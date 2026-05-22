package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppHTTPListenerModel {
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
     * 将此监听器收到的请求转发到HTTPS监听器，HTTPS监听器通过这个端口指定
     */
    private Integer redirectPort;

    /**
     * 描述信息，长度不超过200个字符。
     */
    private String description;

    public AppHTTPListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public AppHTTPListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public AppHTTPListenerModel setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public Boolean getKeepSession() {
        return this.keepSession;
    }

    public AppHTTPListenerModel setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public String getKeepSessionType() {
        return this.keepSessionType;
    }

    public AppHTTPListenerModel setKeepSessionTimeout(Integer keepSessionTimeout) {
        this.keepSessionTimeout = keepSessionTimeout;
        return this;
    }

    public Integer getKeepSessionTimeout() {
        return this.keepSessionTimeout;
    }

    public AppHTTPListenerModel setKeepSessionCookieName(String keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public String getKeepSessionCookieName() {
        return this.keepSessionCookieName;
    }

    public AppHTTPListenerModel setxForwardedFor(Boolean xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
        return this;
    }

    public Boolean getxForwardedFor() {
        return this.xForwardedFor;
    }

    public AppHTTPListenerModel setxForwardedProto(Boolean xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
        return this;
    }

    public Boolean getxForwardedProto() {
        return this.xForwardedProto;
    }

    public AppHTTPListenerModel setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public Integer getServerTimeout() {
        return this.serverTimeout;
    }

    public AppHTTPListenerModel setRedirectPort(Integer redirectPort) {
        this.redirectPort = redirectPort;
        return this;
    }

    public Integer getRedirectPort() {
        return this.redirectPort;
    }

    public AppHTTPListenerModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "AppHTTPListenerModel{" + "listenerPort=" + listenerPort + "\n" + "scheduler=" + scheduler + "\n" + "keepSession=" + keepSession + "\n" + "keepSessionType="
                + keepSessionType + "\n" + "keepSessionTimeout=" + keepSessionTimeout + "\n" + "keepSessionCookieName=" + keepSessionCookieName + "\n" + "xForwardedFor="
                + xForwardedFor + "\n" + "xForwardedProto=" + xForwardedProto + "\n" + "serverTimeout=" + serverTimeout + "\n" + "redirectPort=" + redirectPort + "\n"
                + "description=" + description + "\n" + "}";
    }

}