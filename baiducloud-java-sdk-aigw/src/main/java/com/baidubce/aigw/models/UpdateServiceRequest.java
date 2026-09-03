package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateServiceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * serviceNamePath
    */
    @JsonIgnore
    private String serviceNamePath;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    /**
    * 更新后的服务名称
    */
    private String serviceName;

    /**
    * 更新后的服务地址列表
    */
    private List<String> serviceAddresses;

    /**
    * HTTP、HTTPS 或 HTTP&HTTPS
    */
    private String serviceProtocol;

    /**
    * AI_PROXY 模型供应商
    */
    private String provider;

    /**
    * AI_PROXY 上游端点
    */
    private String endpoint;

    /**
    * AI_PROXY API Key 列表；IAM 模式禁止传入
    */
    private List<String> apiKeys;

    /**
    * 是否启用 Failover
    */
    private Boolean failoverEnabled;

    /**
    * Failover 健康检查模型
    */
    private String failoverModel;

    /**
    * AI_PROXY 凭证来源：DEFAULT 或 IAM
    */
    private String credentialSource;

    /**
    * IAM CredentialProvider 名称列表
    */
    private List<String> credentialNames;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getServiceNamePath() {
        return serviceNamePath;
    }

    public UpdateServiceRequest setServiceNamePath(String serviceNamePath) {
        this.serviceNamePath = serviceNamePath;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public UpdateServiceRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public UpdateServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public List<String> getServiceAddresses() {
        return serviceAddresses;
    }

    public UpdateServiceRequest setServiceAddresses(List<String> serviceAddresses) {
        this.serviceAddresses = serviceAddresses;
        return this;
    }

    public String getServiceProtocol() {
        return serviceProtocol;
    }

    public UpdateServiceRequest setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public UpdateServiceRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public UpdateServiceRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public List<String> getApiKeys() {
        return apiKeys;
    }

    public UpdateServiceRequest setApiKeys(List<String> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }

    public Boolean getFailoverEnabled() {
        return failoverEnabled;
    }

    public UpdateServiceRequest setFailoverEnabled(Boolean failoverEnabled) {
        this.failoverEnabled = failoverEnabled;
        return this;
    }

    public String getFailoverModel() {
        return failoverModel;
    }

    public UpdateServiceRequest setFailoverModel(String failoverModel) {
        this.failoverModel = failoverModel;
        return this;
    }

    public String getCredentialSource() {
        return credentialSource;
    }

    public UpdateServiceRequest setCredentialSource(String credentialSource) {
        this.credentialSource = credentialSource;
        return this;
    }

    public List<String> getCredentialNames() {
        return credentialNames;
    }

    public UpdateServiceRequest setCredentialNames(List<String> credentialNames) {
        this.credentialNames = credentialNames;
        return this;
    }

}
