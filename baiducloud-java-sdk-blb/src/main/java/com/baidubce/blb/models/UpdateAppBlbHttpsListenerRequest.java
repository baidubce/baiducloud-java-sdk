package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbHttpsListenerRequest extends BaseBceRequest {

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
    * 后端服务器最大超时（单位：秒），默认30s，需为1-3600间的整数
    */
    private Integer serverTimeout;

    /**
    * 监听器要加载的证书链,当前仅允许传入1个证书ID，如果传入多个，则只有最后一个生效
    */
    private List<String> certIds;

    /**
    * 加密选项。支持：tls_cipher_policy_default/tls_cipher_policy_1_1/tls_cipher_policy_1_2/tls_cipher_policy_1_2_secure/userDefind，对应的加密协议和加密套件参见：[encryption](BLB/API参考/附录.md#encryption)
    */
    private String encryptionType;

    /**
    * 当encryptionType值为userDefind时协议类型列表，是以"tlsv10"、"tlsv11"、"tlsv12"三种协议组合形成的字符串列表
    */
    private List<String> encryptionProtocols;

    /**
    * 加密套件参见：[encryption](BLB/API参考/附录.md#encryption)，不同加密套件用冒号":"隔开
    */
    private String appliedCiphers;

    /**
    * 是否开启双向认证，默认为关闭
    */
    private Boolean dualAuth;

    /**
    * 当dualAuth为true时，加载的客户端证书链,当前仅允许传入1个证书ID，如果传入多个，则只有最后一个生效
    */
    private List<String> clientCertIds;

    /**
    * 扩展域名
    */
    private List<AdditionalCertDomain> additionalCertDomains;

    /**
    * 描述信息，长度不超过200个字符。
    */
    private String description;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbHttpsListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbHttpsListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public UpdateAppBlbHttpsListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public String getScheduler() {
        return scheduler;
    }

    public UpdateAppBlbHttpsListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public Boolean getKeepSession() {
        return keepSession;
    }

    public UpdateAppBlbHttpsListenerRequest setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public String getKeepSessionType() {
        return keepSessionType;
    }

    public UpdateAppBlbHttpsListenerRequest setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public Integer getKeepSessionTimeout() {
        return keepSessionTimeout;
    }

    public UpdateAppBlbHttpsListenerRequest setKeepSessionTimeout(Integer keepSessionTimeout) {
        this.keepSessionTimeout = keepSessionTimeout;
        return this;
    }

    public String getKeepSessionCookieName() {
        return keepSessionCookieName;
    }

    public UpdateAppBlbHttpsListenerRequest setKeepSessionCookieName(String keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public Boolean getXForwardedFor() {
        return xForwardedFor;
    }

    public UpdateAppBlbHttpsListenerRequest setXForwardedFor(Boolean xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
        return this;
    }

    public Boolean getXForwardedProto() {
        return xForwardedProto;
    }

    public UpdateAppBlbHttpsListenerRequest setXForwardedProto(Boolean xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
        return this;
    }

    public Integer getServerTimeout() {
        return serverTimeout;
    }

    public UpdateAppBlbHttpsListenerRequest setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public List<String> getCertIds() {
        return certIds;
    }

    public UpdateAppBlbHttpsListenerRequest setCertIds(List<String> certIds) {
        this.certIds = certIds;
        return this;
    }

    public String getEncryptionType() {
        return encryptionType;
    }

    public UpdateAppBlbHttpsListenerRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public List<String> getEncryptionProtocols() {
        return encryptionProtocols;
    }

    public UpdateAppBlbHttpsListenerRequest setEncryptionProtocols(List<String> encryptionProtocols) {
        this.encryptionProtocols = encryptionProtocols;
        return this;
    }

    public String getAppliedCiphers() {
        return appliedCiphers;
    }

    public UpdateAppBlbHttpsListenerRequest setAppliedCiphers(String appliedCiphers) {
        this.appliedCiphers = appliedCiphers;
        return this;
    }

    public Boolean getDualAuth() {
        return dualAuth;
    }

    public UpdateAppBlbHttpsListenerRequest setDualAuth(Boolean dualAuth) {
        this.dualAuth = dualAuth;
        return this;
    }

    public List<String> getClientCertIds() {
        return clientCertIds;
    }

    public UpdateAppBlbHttpsListenerRequest setClientCertIds(List<String> clientCertIds) {
        this.clientCertIds = clientCertIds;
        return this;
    }

    public List<AdditionalCertDomain> getAdditionalCertDomains() {
        return additionalCertDomains;
    }

    public UpdateAppBlbHttpsListenerRequest setAdditionalCertDomains(List<AdditionalCertDomain> additionalCertDomains) {
        this.additionalCertDomains = additionalCertDomains;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAppBlbHttpsListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
