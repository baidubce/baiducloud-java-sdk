package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbHttpListenerRequest extends BaseBceRequest {

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
    * 监听器的监听端口，需为1-65535间的整数
    */
    private Integer listenerPort;

    /**
    * 负载均衡算法，支持2种方式："RoundRobin"/"LeastConnection"，"RoundRobin"代表加权轮询、"LeastConnection"代表最小连接数
    */
    private String scheduler;

    /**
    * 是否开启会话保持功能，即同一个Client发出的请求都会到达同一个后端服务器，默认关闭
    */
    private Boolean keepSession;

    /**
    * 会话保持的cookie处理方式，当且仅当开启会话保持时有效，支持"insert"/"rewrite"，默认"insert"
    */
    private String keepSessionType;

    /**
    * 会话保持的cookie有效时间（单位：秒），当且仅当开启会话保持时有效，默认3600s，需为1-15552000间的整数
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

    public CreateAppBlbHttpListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateAppBlbHttpListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public CreateAppBlbHttpListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public String getScheduler() {
        return scheduler;
    }

    public CreateAppBlbHttpListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public Boolean getKeepSession() {
        return keepSession;
    }

    public CreateAppBlbHttpListenerRequest setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public String getKeepSessionType() {
        return keepSessionType;
    }

    public CreateAppBlbHttpListenerRequest setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public Integer getKeepSessionTimeout() {
        return keepSessionTimeout;
    }

    public CreateAppBlbHttpListenerRequest setKeepSessionTimeout(Integer keepSessionTimeout) {
        this.keepSessionTimeout = keepSessionTimeout;
        return this;
    }

    public String getKeepSessionCookieName() {
        return keepSessionCookieName;
    }

    public CreateAppBlbHttpListenerRequest setKeepSessionCookieName(String keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public Boolean getXForwardedFor() {
        return xForwardedFor;
    }

    public CreateAppBlbHttpListenerRequest setXForwardedFor(Boolean xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
        return this;
    }

    public Boolean getXForwardedProto() {
        return xForwardedProto;
    }

    public CreateAppBlbHttpListenerRequest setXForwardedProto(Boolean xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
        return this;
    }

    public AdditionalAttributesModel getAdditionalAttributes() {
        return additionalAttributes;
    }

    public CreateAppBlbHttpListenerRequest setAdditionalAttributes(AdditionalAttributesModel additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }

    public Integer getServerTimeout() {
        return serverTimeout;
    }

    public CreateAppBlbHttpListenerRequest setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public Integer getRedirectPort() {
        return redirectPort;
    }

    public CreateAppBlbHttpListenerRequest setRedirectPort(Integer redirectPort) {
        this.redirectPort = redirectPort;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAppBlbHttpListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
