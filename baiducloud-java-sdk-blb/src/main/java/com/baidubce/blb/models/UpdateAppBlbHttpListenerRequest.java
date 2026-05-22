package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbHttpListenerRequest extends BaseBceRequest {

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
    * listenerPort
    */
    @JsonIgnore
    private Integer listenerPort;

    /**
    * 负载均衡算法，支持2种方式："RoundRobin"/"LeastConnection"，"RoundRobin"代表加权轮询、"LeastConnection"代表最小连接数
    */
    private String scheduler;

    /**
    * 是否开启会话保持功能，即同一个Client发出的请求都会到达同一个后端服务器。当已开启会话保持且当前设置为false时会话保持将会被关闭，此时keepSessionType,keepSessionTimeout,keepSessionCookieName将被置空
    */
    private Boolean keepSession;

    /**
    * 会话保持的cookie处理方式，当且仅当开启会话保持时有效，支持"insert"/"rewrite",当keepSesion由关闭到开启时,默认取"insert"
    */
    private String keepSessionType;

    /**
    * 会话保持的cookie有效时间（单位：秒），当且仅当开启会话保持时有效,需为1-15552000间的整数,当keepSesion由关闭到开启且keepSesisonType为insert时默认值为3600
    */
    private Integer keepSessionTimeout;

    /**
    * 会话保持需要覆盖的cookie名称，当且仅当开启会话保持且keepSessionType="rewrite"时有效
    */
    private String keepSessionCookieName;

    /**
    * 是否开启获取Client真实IP，开启后后端服务器上可以通过X-Forwarded-For这个HTTP Header来获得Client端的真实地址，默认关闭
    */
    private Boolean xForwardedFor;

    /**
    * 是否开启获取监听协议，开启后后端服务器上可以通过X-Forwarded-Proto这个HTTP Header来获得监听协议，默认关闭
    */
    private Boolean xForwardedProto;

    /**
    * additionalAttributes
    */
    private AdditionalAttributesModel additionalAttributes;

    /**
    * 后端服务器最大超时（单位：秒），默认30s，需为1-3600间的整数
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

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbHttpListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbHttpListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public UpdateAppBlbHttpListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public String getScheduler() {
        return scheduler;
    }

    public UpdateAppBlbHttpListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public Boolean getKeepSession() {
        return keepSession;
    }

    public UpdateAppBlbHttpListenerRequest setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public String getKeepSessionType() {
        return keepSessionType;
    }

    public UpdateAppBlbHttpListenerRequest setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public Integer getKeepSessionTimeout() {
        return keepSessionTimeout;
    }

    public UpdateAppBlbHttpListenerRequest setKeepSessionTimeout(Integer keepSessionTimeout) {
        this.keepSessionTimeout = keepSessionTimeout;
        return this;
    }

    public String getKeepSessionCookieName() {
        return keepSessionCookieName;
    }

    public UpdateAppBlbHttpListenerRequest setKeepSessionCookieName(String keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public Boolean getXForwardedFor() {
        return xForwardedFor;
    }

    public UpdateAppBlbHttpListenerRequest setXForwardedFor(Boolean xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
        return this;
    }

    public Boolean getXForwardedProto() {
        return xForwardedProto;
    }

    public UpdateAppBlbHttpListenerRequest setXForwardedProto(Boolean xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
        return this;
    }

    public AdditionalAttributesModel getAdditionalAttributes() {
        return additionalAttributes;
    }

    public UpdateAppBlbHttpListenerRequest setAdditionalAttributes(AdditionalAttributesModel additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }

    public Integer getServerTimeout() {
        return serverTimeout;
    }

    public UpdateAppBlbHttpListenerRequest setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public Integer getRedirectPort() {
        return redirectPort;
    }

    public UpdateAppBlbHttpListenerRequest setRedirectPort(Integer redirectPort) {
        this.redirectPort = redirectPort;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAppBlbHttpListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
