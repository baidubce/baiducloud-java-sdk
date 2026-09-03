package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetServiceDetailResponse extends BaseBceResponse {

    /**
    * 关联集群 ID
    */
    private String clusterId;

    /**
    * 关联集群 ID 列表
    */
    private List<String> clusterIds;

    /**
    * 服务命名空间
    */
    private String namespace;

    /**
    * 关联路由数量
    */
    private Integer routeCount;

    /**
    * 服务来源
    */
    private String serviceSource;

    /**
    * 服务状态
    */
    private String serviceStatus;

    /**
    * 服务端口列表
    */
    private List<String> servicePort;

    /**
    * 服务地址列表
    */
    private List<String> serviceAddresses;

    /**
    * 服务协议
    */
    private String serviceProtocol;

    /**
    * 上游 MCP Server 主机列表
    */
    private List<String> mcpServerHosts;

    /**
    * AI_PROXY 模型供应商
    */
    private String provider;

    /**
    * AI_PROXY 上游端点
    */
    private String endpoint;

    /**
    * AI_PROXY API Key 列表，返回值按后端规则脱敏
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
    * Failover 连续失败阈值
    */
    private Long failureThreshold;

    /**
    * 健康检查间隔
    */
    private Long healthCheckInterval;

    /**
    * 健康检查超时时间
    */
    private Long healthCheckTimeout;

    /**
    * AI_PROXY 凭证来源：DEFAULT 或 IAM
    */
    private String credentialSource;

    /**
    * IAM CredentialProvider 名称列表
    */
    private List<String> credentialNames;

    public String getClusterId() {
        return clusterId;
    }

    public GetServiceDetailResponse setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public List<String> getClusterIds() {
        return clusterIds;
    }

    public GetServiceDetailResponse setClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public GetServiceDetailResponse setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Integer getRouteCount() {
        return routeCount;
    }

    public GetServiceDetailResponse setRouteCount(Integer routeCount) {
        this.routeCount = routeCount;
        return this;
    }

    public String getServiceSource() {
        return serviceSource;
    }

    public GetServiceDetailResponse setServiceSource(String serviceSource) {
        this.serviceSource = serviceSource;
        return this;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public GetServiceDetailResponse setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    public List<String> getServicePort() {
        return servicePort;
    }

    public GetServiceDetailResponse setServicePort(List<String> servicePort) {
        this.servicePort = servicePort;
        return this;
    }

    public List<String> getServiceAddresses() {
        return serviceAddresses;
    }

    public GetServiceDetailResponse setServiceAddresses(List<String> serviceAddresses) {
        this.serviceAddresses = serviceAddresses;
        return this;
    }

    public String getServiceProtocol() {
        return serviceProtocol;
    }

    public GetServiceDetailResponse setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
        return this;
    }

    public List<String> getMcpServerHosts() {
        return mcpServerHosts;
    }

    public GetServiceDetailResponse setMcpServerHosts(List<String> mcpServerHosts) {
        this.mcpServerHosts = mcpServerHosts;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public GetServiceDetailResponse setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public GetServiceDetailResponse setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public List<String> getApiKeys() {
        return apiKeys;
    }

    public GetServiceDetailResponse setApiKeys(List<String> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }

    public Boolean getFailoverEnabled() {
        return failoverEnabled;
    }

    public GetServiceDetailResponse setFailoverEnabled(Boolean failoverEnabled) {
        this.failoverEnabled = failoverEnabled;
        return this;
    }

    public String getFailoverModel() {
        return failoverModel;
    }

    public GetServiceDetailResponse setFailoverModel(String failoverModel) {
        this.failoverModel = failoverModel;
        return this;
    }

    public Long getFailureThreshold() {
        return failureThreshold;
    }

    public GetServiceDetailResponse setFailureThreshold(Long failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    public Long getHealthCheckInterval() {
        return healthCheckInterval;
    }

    public GetServiceDetailResponse setHealthCheckInterval(Long healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    public Long getHealthCheckTimeout() {
        return healthCheckTimeout;
    }

    public GetServiceDetailResponse setHealthCheckTimeout(Long healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }

    public String getCredentialSource() {
        return credentialSource;
    }

    public GetServiceDetailResponse setCredentialSource(String credentialSource) {
        this.credentialSource = credentialSource;
        return this;
    }

    public List<String> getCredentialNames() {
        return credentialNames;
    }

    public GetServiceDetailResponse setCredentialNames(List<String> credentialNames) {
        this.credentialNames = credentialNames;
        return this;
    }

    @Override
    public String toString() {
        return "GetServiceDetailResponse{" + "clusterId=" + clusterId + "\n" + "clusterIds=" + clusterIds + "\n" + "namespace=" + namespace + "\n" + "routeCount=" + routeCount
                + "\n" + "serviceSource=" + serviceSource + "\n" + "serviceStatus=" + serviceStatus + "\n" + "servicePort=" + servicePort + "\n" + "serviceAddresses="
                + serviceAddresses + "\n" + "serviceProtocol=" + serviceProtocol + "\n" + "mcpServerHosts=" + mcpServerHosts + "\n" + "provider=" + provider + "\n" + "endpoint="
                + endpoint + "\n" + "apiKeys=" + apiKeys + "\n" + "failoverEnabled=" + failoverEnabled + "\n" + "failoverModel=" + failoverModel + "\n" + "failureThreshold="
                + failureThreshold + "\n" + "healthCheckInterval=" + healthCheckInterval + "\n" + "healthCheckTimeout=" + healthCheckTimeout + "\n" + "credentialSource="
                + credentialSource + "\n" + "credentialNames=" + credentialNames + "\n" + "}";
    }

}
