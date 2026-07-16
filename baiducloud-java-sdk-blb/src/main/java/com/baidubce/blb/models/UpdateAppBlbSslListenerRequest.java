package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbSslListenerRequest extends BaseBceRequest {

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
    * 负载均衡算法，支持3种方式："RoundRobin"/"LeastConnection"/"Hash"，"RoundRobin"代表加权轮询、"LeastConnection"代表最小连接数、"Hash"代表根据源ip哈希
    */
    private String scheduler;

    /**
    * 监听器要加载的证书链,当前仅允许传入1个证书ID，如果传入多个，则只有最后一个生效
    */
    private List<String> certIds;

    /**
    * 加密选项。支持：tls_cipher_policy_default/tls_cipher_policy_1_1/tls_cipher_policy_1_2/tls_cipher_policy_1_2_secure/userDefind，对应的加密协议和加密套件参见：
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
    * 当dualAuth为true时，加载的客户端证书链,当前仅允许传入1个证书ID，如果传入多个，则只有最后一个生效
    */
    private List<String> clientCertIds;

    /**
    * 描述信息，长度不超过200个字符。
    */
    private String description;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbSslListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbSslListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public UpdateAppBlbSslListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public String getScheduler() {
        return scheduler;
    }

    public UpdateAppBlbSslListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public List<String> getCertIds() {
        return certIds;
    }

    public UpdateAppBlbSslListenerRequest setCertIds(List<String> certIds) {
        this.certIds = certIds;
        return this;
    }

    public String getEncryptionType() {
        return encryptionType;
    }

    public UpdateAppBlbSslListenerRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public List<String> getEncryptionProtocols() {
        return encryptionProtocols;
    }

    public UpdateAppBlbSslListenerRequest setEncryptionProtocols(List<String> encryptionProtocols) {
        this.encryptionProtocols = encryptionProtocols;
        return this;
    }

    public String getAppliedCiphers() {
        return appliedCiphers;
    }

    public UpdateAppBlbSslListenerRequest setAppliedCiphers(String appliedCiphers) {
        this.appliedCiphers = appliedCiphers;
        return this;
    }

    public Boolean getDualAuth() {
        return dualAuth;
    }

    public UpdateAppBlbSslListenerRequest setDualAuth(Boolean dualAuth) {
        this.dualAuth = dualAuth;
        return this;
    }

    public List<String> getClientCertIds() {
        return clientCertIds;
    }

    public UpdateAppBlbSslListenerRequest setClientCertIds(List<String> clientCertIds) {
        this.clientCertIds = clientCertIds;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAppBlbSslListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
