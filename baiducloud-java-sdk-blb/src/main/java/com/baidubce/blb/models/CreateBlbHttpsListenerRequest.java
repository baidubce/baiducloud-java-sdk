package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateBlbHttpsListenerRequest extends BaseBceRequest {

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
    * 后端服务器的监听端口，需为1-65535间的整数
    */
    private Integer backendPort;

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
    private Integer keepSessionDuration;

    /**
    * 会话保持需要覆盖的cookie名称，当且仅当开启会话保持且keepSessionType="rewrite"时有效
    */
    private Integer keepSessionCookieName;

    /**
    * 是否开启获取Client真实IP，开启后后端服务器上可以通过X-Forwarded-For这个HTTP Header来获得Client端的真实地址，默认关闭
    */
    private Boolean xForwardFor;

    /**
    * 将监听使用的协议通过x-forwarded-proto HTTP Header 转发给后端服务器
    */
    private Boolean xForwardedProto;

    /**
    * additionalAttributes
    */
    private AdditionalAttributesModel additionalAttributes;

    /**
    * 健康检查协议，支持"HTTP"/"TCP"，默认"HTTP"
    */
    private String healthCheckType;

    /**
    * 健康检查端口，默认为backendPort
    */
    private Integer healthCheckPort;

    /**
    * 健康检查URI，默认/。当健康检查协议为"HTTP"时生效
    */
    private String healthCheckURI;

    /**
    * 健康检查超时（单位：秒），默认为3，需为1-60间的整数
    */
    private Integer healthCheckTimeoutInSecond;

    /**
    * 健康检查间隔（单位：秒），默认为3，需为1-10间的整数
    */
    private Integer healthCheckInterval;

    /**
    * 不健康阈值，即连续多少次健康检查失败后，屏蔽该后端服务器。默认为3，需为2-5间的整数
    */
    private Integer unhealthyThreshold;

    /**
    * 健康阈值，即连续多少次健康检查成功后，重新将该后端服务器置为可用。默认为3，需为2-5间的整数
    */
    private Integer healthyThreshold;

    /**
    * 健康检查正常时的HTTP状态码，支持5类状态码的组合，例如"http_1xx\|http_2xx"，默认"http_2xx\|http_3xx"。当健康检查协议为"HTTP"时生效
    */
    private String healthCheckNormalStatus;

    /**
    * 7层健康检查请求的头部域会带指定的host字段，例如"localhost"，默认""。当健康检查协议为"HTTP"时生效
    */
    private String healthCheckHost;

    /**
    * 后端服务器最大超时（单位：秒），默认30s，需为1-3600间的整数
    */
    private Integer serverTimeout;

    /**
    * 监听器要加载的证书,当前仅允许传入1个证书ID，如果传入多个，则只有最后一个生效
    */
    private List<String> certIds;

    /**
    * 加密选项，默认tls_cipher_policy_default。支持：tls_cipher_policy_default/tls_cipher_policy_1_1/tls_cipher_policy_1_2/tls_cipher_policy_1_2_secure/userDefind，对应的加密协议和加密套件参见：
    * [encryption](https://cloud.baidu.com/doc/BLB/s/Pjwvxnxdm#encryption)
    */
    private String encryptionType;

    /**
    * 当encryptionType值为userDefind时协议类型列表，是以"tlsv10"、"tlsv11"、"tlsv12"三种协议组合形成的字符串列表
    */
    private List<String> encryptionProtocols;

    /**
    * 加密套件参见：[encryption](https://cloud.baidu.com/doc/BLB/s/Pjwvxnxdm#encryption)，不同加密套件用冒号":"隔开
    */
    private String appliedCiphers;

    /**
    * 是否开启双向认证，默认为关闭
    */
    private Boolean dualAuth;

    /**
    * 当dualAuth为true时，加载的客户端证书链，当前仅允许传入1个证书ID，如果传入多个，则只有最后一个生效
    */
    private List<String> clientCertIds;

    /**
    * 扩展域名
    */
    private List<AdditionalCertDomain> additionalCertDomains;

    public String getBlbId() {
        return blbId;
    }

    public CreateBlbHttpsListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateBlbHttpsListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public CreateBlbHttpsListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getBackendPort() {
        return backendPort;
    }

    public CreateBlbHttpsListenerRequest setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public String getScheduler() {
        return scheduler;
    }

    public CreateBlbHttpsListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public Boolean getKeepSession() {
        return keepSession;
    }

    public CreateBlbHttpsListenerRequest setKeepSession(Boolean keepSession) {
        this.keepSession = keepSession;
        return this;
    }

    public String getKeepSessionType() {
        return keepSessionType;
    }

    public CreateBlbHttpsListenerRequest setKeepSessionType(String keepSessionType) {
        this.keepSessionType = keepSessionType;
        return this;
    }

    public Integer getKeepSessionDuration() {
        return keepSessionDuration;
    }

    public CreateBlbHttpsListenerRequest setKeepSessionDuration(Integer keepSessionDuration) {
        this.keepSessionDuration = keepSessionDuration;
        return this;
    }

    public Integer getKeepSessionCookieName() {
        return keepSessionCookieName;
    }

    public CreateBlbHttpsListenerRequest setKeepSessionCookieName(Integer keepSessionCookieName) {
        this.keepSessionCookieName = keepSessionCookieName;
        return this;
    }

    public Boolean getXForwardFor() {
        return xForwardFor;
    }

    public CreateBlbHttpsListenerRequest setXForwardFor(Boolean xForwardFor) {
        this.xForwardFor = xForwardFor;
        return this;
    }

    public Boolean getXForwardedProto() {
        return xForwardedProto;
    }

    public CreateBlbHttpsListenerRequest setXForwardedProto(Boolean xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
        return this;
    }

    public AdditionalAttributesModel getAdditionalAttributes() {
        return additionalAttributes;
    }

    public CreateBlbHttpsListenerRequest setAdditionalAttributes(AdditionalAttributesModel additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }

    public String getHealthCheckType() {
        return healthCheckType;
    }

    public CreateBlbHttpsListenerRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    public CreateBlbHttpsListenerRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public String getHealthCheckURI() {
        return healthCheckURI;
    }

    public CreateBlbHttpsListenerRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return healthCheckTimeoutInSecond;
    }

    public CreateBlbHttpsListenerRequest setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckInterval() {
        return healthCheckInterval;
    }

    public CreateBlbHttpsListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    public CreateBlbHttpsListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    public CreateBlbHttpsListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return healthCheckNormalStatus;
    }

    public CreateBlbHttpsListenerRequest setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckHost() {
        return healthCheckHost;
    }

    public CreateBlbHttpsListenerRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }

    public Integer getServerTimeout() {
        return serverTimeout;
    }

    public CreateBlbHttpsListenerRequest setServerTimeout(Integer serverTimeout) {
        this.serverTimeout = serverTimeout;
        return this;
    }

    public List<String> getCertIds() {
        return certIds;
    }

    public CreateBlbHttpsListenerRequest setCertIds(List<String> certIds) {
        this.certIds = certIds;
        return this;
    }

    public String getEncryptionType() {
        return encryptionType;
    }

    public CreateBlbHttpsListenerRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public List<String> getEncryptionProtocols() {
        return encryptionProtocols;
    }

    public CreateBlbHttpsListenerRequest setEncryptionProtocols(List<String> encryptionProtocols) {
        this.encryptionProtocols = encryptionProtocols;
        return this;
    }

    public String getAppliedCiphers() {
        return appliedCiphers;
    }

    public CreateBlbHttpsListenerRequest setAppliedCiphers(String appliedCiphers) {
        this.appliedCiphers = appliedCiphers;
        return this;
    }

    public Boolean getDualAuth() {
        return dualAuth;
    }

    public CreateBlbHttpsListenerRequest setDualAuth(Boolean dualAuth) {
        this.dualAuth = dualAuth;
        return this;
    }

    public List<String> getClientCertIds() {
        return clientCertIds;
    }

    public CreateBlbHttpsListenerRequest setClientCertIds(List<String> clientCertIds) {
        this.clientCertIds = clientCertIds;
        return this;
    }

    public List<AdditionalCertDomain> getAdditionalCertDomains() {
        return additionalCertDomains;
    }

    public CreateBlbHttpsListenerRequest setAdditionalCertDomains(List<AdditionalCertDomain> additionalCertDomains) {
        this.additionalCertDomains = additionalCertDomains;
        return this;
    }

}
