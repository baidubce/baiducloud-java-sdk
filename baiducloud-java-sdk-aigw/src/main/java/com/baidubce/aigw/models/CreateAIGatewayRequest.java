package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAIGatewayRequest extends BaseBceRequest {

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    /**
    * 网关实例名称
    */
    private String name;

    /**
    * VPC ID
    */
    private String vpcId;

    /**
    * VPC CIDR
    */
    private String vpcCidr;

    /**
    * 子网 ID
    */
    private String subnetId;

    /**
    * 网关规格：small、medium、large
    */
    private String gatewayType;

    /**
    * 是否使用内网模式
    */
    private String isInternal;

    /**
    * 网络类型：private、public，可多选
    */
    private List<String> networkTypes;

    /**
    * 副本数，默认共享模式 2、独占模式 3
    */
    private Integer replicas;

    /**
    * 部署模式：shared 或 exclusive，默认 shared
    */
    private String installMode;

    /**
    * 实例描述
    */
    private String description;

    /**
    * 删除保护，默认 true
    */
    private Boolean deleteProtection;

    /**
    * 来源产品；不同来源有额外必填字段
    */
    private String srcProduct;

    /**
    * AgentOS 来源时必填的账号 ID
    */
    private String accountId;

    /**
    * AgentOS 工作空间 ID
    */
    private String workspaceId;

    /**
    * AgentOS 工作空间名称
    */
    private String workspaceName;

    /**
    * CFC 来源时必填的 BLB 长 ID
    */
    private String blbId;

    /**
    * BLB IP
    */
    private String blbIp;

    /**
    * 关联 CCE 集群列表
    */
    private List<ClusterInfo> clusters;

    /**
    * CProm 实例 ID，用于开启业务指标监控
    */
    private String cpromInstanceId;

    /**
    * CProm 访问 Token
    */
    private String cpromBearerToken;

    /**
    * 是否开启 BLS 日志
    */
    private Boolean blsEnabled;

    /**
    * BLS 日志仓库名称
    */
    private String logStoreName;

    /**
    * Higress 版本，不传时使用默认版本
    */
    private String version;

    /**
    * 实例标签列表
    */
    private List<Tag> tags;

    /**
    * 资源分组 ID
    */
    private String resourceGroupId;

    /**
    * aihcArgs
    */
    private AihcArgs aihcArgs;

    public String getXRegion() {
        return xRegion;
    }

    public CreateAIGatewayRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAIGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateAIGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcCidr() {
        return vpcCidr;
    }

    public CreateAIGatewayRequest setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateAIGatewayRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getGatewayType() {
        return gatewayType;
    }

    public CreateAIGatewayRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    public String getIsInternal() {
        return isInternal;
    }

    public CreateAIGatewayRequest setIsInternal(String isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    public List<String> getNetworkTypes() {
        return networkTypes;
    }

    public CreateAIGatewayRequest setNetworkTypes(List<String> networkTypes) {
        this.networkTypes = networkTypes;
        return this;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public CreateAIGatewayRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public String getInstallMode() {
        return installMode;
    }

    public CreateAIGatewayRequest setInstallMode(String installMode) {
        this.installMode = installMode;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAIGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getDeleteProtection() {
        return deleteProtection;
    }

    public CreateAIGatewayRequest setDeleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }

    public String getSrcProduct() {
        return srcProduct;
    }

    public CreateAIGatewayRequest setSrcProduct(String srcProduct) {
        this.srcProduct = srcProduct;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public CreateAIGatewayRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public CreateAIGatewayRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public String getWorkspaceName() {
        return workspaceName;
    }

    public CreateAIGatewayRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    public String getBlbId() {
        return blbId;
    }

    public CreateAIGatewayRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getBlbIp() {
        return blbIp;
    }

    public CreateAIGatewayRequest setBlbIp(String blbIp) {
        this.blbIp = blbIp;
        return this;
    }

    public List<ClusterInfo> getClusters() {
        return clusters;
    }

    public CreateAIGatewayRequest setClusters(List<ClusterInfo> clusters) {
        this.clusters = clusters;
        return this;
    }

    public String getCpromInstanceId() {
        return cpromInstanceId;
    }

    public CreateAIGatewayRequest setCpromInstanceId(String cpromInstanceId) {
        this.cpromInstanceId = cpromInstanceId;
        return this;
    }

    public String getCpromBearerToken() {
        return cpromBearerToken;
    }

    public CreateAIGatewayRequest setCpromBearerToken(String cpromBearerToken) {
        this.cpromBearerToken = cpromBearerToken;
        return this;
    }

    public Boolean getBlsEnabled() {
        return blsEnabled;
    }

    public CreateAIGatewayRequest setBlsEnabled(Boolean blsEnabled) {
        this.blsEnabled = blsEnabled;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public CreateAIGatewayRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public CreateAIGatewayRequest setVersion(String version) {
        this.version = version;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateAIGatewayRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateAIGatewayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public AihcArgs getAihcArgs() {
        return aihcArgs;
    }

    public CreateAIGatewayRequest setAihcArgs(AihcArgs aihcArgs) {
        this.aihcArgs = aihcArgs;
        return this;
    }

}
