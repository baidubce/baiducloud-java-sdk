package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateServiceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    /**
    * 服务来源：CCE、MSE、FIXED_IP、DNS_DOMAIN、CFC、AI_PROXY
    */
    private String serviceSource;

    /**
    * 服务命名空间；AI_PROXY 默认 default
    */
    private String namespace;

    /**
    * 固定 IP、DNS_DOMAIN 或 AI_PROXY 服务名称
    */
    private String serviceName;

    /**
    * CCE 或托管集群 ID
    */
    private String clusterId;

    /**
    * CCE 多集群绑定 ID 列表
    */
    private List<String> clusterIds;

    /**
    * CCE/MSE/CFC 服务列表
    */
    private List<ServiceItem> serviceList;

    /**
    * MSE 服务注册中心 ID
    */
    private String registryId;

    /**
    * 固定 IP 或 DNS 地址列表，格式为 host:port
    */
    private List<String> serviceAddresses;

    /**
    * HTTP、HTTPS 或 HTTP&HTTPS
    */
    private String serviceProtocol;

    /**
    * AI_PROXY 模型供应商，如 QIANFAN、DEEPSEEK、OPENAI
    */
    private String provider;

    /**
    * 模型供应商端点；Qianfan 使用 https://qianfan.baidubce.com/v2
    */
    private String endpoint;

    /**
    * 模型供应商 API Key 列表；IAM 模式禁止传入
    */
    private List<String> apiKeys;

    /**
    * AI_PROXY 凭证来源：DEFAULT 或 IAM
    */
    private String credentialSource;

    /**
    * IAM CredentialProvider 名称列表
    */
    private List<String> credentialNames;

    /**
    * 是否启用模型 Failover
    */
    private Boolean failoverEnabled;

    /**
    * Failover 健康检查模型
    */
    private String failoverModel;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public CreateServiceRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

    public String getServiceSource() {
        return serviceSource;
    }

    public CreateServiceRequest setServiceSource(String serviceSource) {
        this.serviceSource = serviceSource;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public CreateServiceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public CreateServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }

    public CreateServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public List<String> getClusterIds() {
        return clusterIds;
    }

    public CreateServiceRequest setClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }

    public List<ServiceItem> getServiceList() {
        return serviceList;
    }

    public CreateServiceRequest setServiceList(List<ServiceItem> serviceList) {
        this.serviceList = serviceList;
        return this;
    }

    public String getRegistryId() {
        return registryId;
    }

    public CreateServiceRequest setRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    public List<String> getServiceAddresses() {
        return serviceAddresses;
    }

    public CreateServiceRequest setServiceAddresses(List<String> serviceAddresses) {
        this.serviceAddresses = serviceAddresses;
        return this;
    }

    public String getServiceProtocol() {
        return serviceProtocol;
    }

    public CreateServiceRequest setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public CreateServiceRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public CreateServiceRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public List<String> getApiKeys() {
        return apiKeys;
    }

    public CreateServiceRequest setApiKeys(List<String> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }

    public String getCredentialSource() {
        return credentialSource;
    }

    public CreateServiceRequest setCredentialSource(String credentialSource) {
        this.credentialSource = credentialSource;
        return this;
    }

    public List<String> getCredentialNames() {
        return credentialNames;
    }

    public CreateServiceRequest setCredentialNames(List<String> credentialNames) {
        this.credentialNames = credentialNames;
        return this;
    }

    public Boolean getFailoverEnabled() {
        return failoverEnabled;
    }

    public CreateServiceRequest setFailoverEnabled(Boolean failoverEnabled) {
        this.failoverEnabled = failoverEnabled;
        return this;
    }

    public String getFailoverModel() {
        return failoverModel;
    }

    public CreateServiceRequest setFailoverModel(String failoverModel) {
        this.failoverModel = failoverModel;
        return this;
    }

}
