package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppSSLListenerModel {
    /**
     * 监听器的监听端口
     */
    private Integer listenerPort;

    /**
     * 负载均衡算法，值为"RoundRobin"/"LeastConnection"/"Hash"，"RoundRobin"代表加权轮询、"LeastConnection"代表最小连接数、"Hash"代表根据源ip哈希
     */
    private String scheduler;

    /**
     * 加载的SSl证书链
     */
    private List<String> certIds;

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

    public AppSSLListenerModel setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public AppSSLListenerModel setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public AppSSLListenerModel setCertIds(List<String> certIds) {
        this.certIds = certIds;
        return this;
    }

    public List<String> getCertIds() {
        return this.certIds;
    }

    public AppSSLListenerModel setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public AppSSLListenerModel setEncryptionProtocols(List<String> encryptionProtocols) {
        this.encryptionProtocols = encryptionProtocols;
        return this;
    }

    public List<String> getEncryptionProtocols() {
        return this.encryptionProtocols;
    }

    public AppSSLListenerModel setAppliedCiphers(String appliedCiphers) {
        this.appliedCiphers = appliedCiphers;
        return this;
    }

    public String getAppliedCiphers() {
        return this.appliedCiphers;
    }

    public AppSSLListenerModel setDualAuth(Boolean dualAuth) {
        this.dualAuth = dualAuth;
        return this;
    }

    public Boolean getDualAuth() {
        return this.dualAuth;
    }

    public AppSSLListenerModel setClientCertIds(List<String> clientCertIds) {
        this.clientCertIds = clientCertIds;
        return this;
    }

    public List<String> getClientCertIds() {
        return this.clientCertIds;
    }

    public AppSSLListenerModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "AppSSLListenerModel{" + "listenerPort=" + listenerPort + "\n" + "scheduler=" + scheduler + "\n" + "certIds=" + certIds + "\n" + "encryptionType=" + encryptionType
                + "\n" + "encryptionProtocols=" + encryptionProtocols + "\n" + "appliedCiphers=" + appliedCiphers + "\n" + "dualAuth=" + dualAuth + "\n" + "clientCertIds="
                + clientCertIds + "\n" + "description=" + description + "\n" + "}";
    }

}