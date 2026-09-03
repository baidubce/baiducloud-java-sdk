package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AIGatewayListItem {
    /**
     * 网关实例 ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String name;

    /**
     * 网关运行状态
     */
    private String ingressStatus;

    /**
     * 内网 IP
     */
    private String internalIP;

    /**
     * 公网 IP
     */
    private String externalIP;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 地域
     */
    private String region;

    /**
     * 副本数
     */
    private Integer replicas;

    /**
     * 部署模式
     */
    private String installMode;

    /**
     * VPC CIDR
     */
    private String vpcCidr;

    /**
     * VPC ID
     */
    private String vpcId;

    /**
     * 子网 ID
     */
    private String subnetId;

    /**
     * 网关规格
     */
    private String gatewayType;

    /**
     * 是否公网可访问
     */
    private Boolean publicAccessible;

    /**
     * 是否开启删除保护
     */
    private Boolean deleteProtection;

    /**
     * 实例描述
     */
    private String description;

    /**
     * 网关命名空间
     */
    private String namespace;

    /**
     * 是否开启 Ingress
     */
    private Boolean enableIngress;

    /**
     * 是否监听全部 IngressClass
     */
    private Boolean enableAllIngressClasses;

    /**
     * 是否监听全部命名空间
     */
    private Boolean enableAllNamespaces;

    /**
     * IngressClass 列表
     */
    private List<String> ingressClasses;

    /**
     * 监听命名空间列表
     */
    private List<String> watchNamespaces;

    /**
     * baEndpoint
     */
    private VpcEndpoint baEndpoint;

    /**
     * 关联集群
     */
    private String associatedCluster;

    /**
     * 来源产品
     */
    private String srcProduct;

    /**
     * BLB 长 ID
     */
    private String blbLongId;

    /**
     * WAF ID
     */
    private String wafId;

    /**
     * WAF 是否开启
     */
    private Boolean wafEnable;

    /**
     * 默认私网域名
     */
    private String privateDomainName;

    /**
     * 默认公网域名
     */
    private String publicDomainName;

    /**
     * 网络类型
     */
    private String networkType;

    /**
     * 域名状态
     */
    private String domainStatus;

    /**
     * 安全组 ID
     */
    private String securityGroupId;

    /**
     * 实例标签
     */
    private List<Tag> tags;

    /**
     * Higress 版本
     */
    private String version;

    /**
     * aihcArgs
     */
    private AihcArgs aihcArgs;

    public AIGatewayListItem setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public AIGatewayListItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AIGatewayListItem setIngressStatus(String ingressStatus) {
        this.ingressStatus = ingressStatus;
        return this;
    }

    public String getIngressStatus() {
        return this.ingressStatus;
    }

    public AIGatewayListItem setInternalIP(String internalIP) {
        this.internalIP = internalIP;
        return this;
    }

    public String getInternalIP() {
        return this.internalIP;
    }

    public AIGatewayListItem setExternalIP(String externalIP) {
        this.externalIP = externalIP;
        return this;
    }

    public String getExternalIP() {
        return this.externalIP;
    }

    public AIGatewayListItem setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public AIGatewayListItem setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public AIGatewayListItem setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public Integer getReplicas() {
        return this.replicas;
    }

    public AIGatewayListItem setInstallMode(String installMode) {
        this.installMode = installMode;
        return this;
    }

    public String getInstallMode() {
        return this.installMode;
    }

    public AIGatewayListItem setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public String getVpcCidr() {
        return this.vpcCidr;
    }

    public AIGatewayListItem setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public AIGatewayListItem setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public AIGatewayListItem setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    public String getGatewayType() {
        return this.gatewayType;
    }

    public AIGatewayListItem setPublicAccessible(Boolean publicAccessible) {
        this.publicAccessible = publicAccessible;
        return this;
    }

    public Boolean getPublicAccessible() {
        return this.publicAccessible;
    }

    public AIGatewayListItem setDeleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }

    public Boolean getDeleteProtection() {
        return this.deleteProtection;
    }

    public AIGatewayListItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public AIGatewayListItem setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public AIGatewayListItem setEnableIngress(Boolean enableIngress) {
        this.enableIngress = enableIngress;
        return this;
    }

    public Boolean getEnableIngress() {
        return this.enableIngress;
    }

    public AIGatewayListItem setEnableAllIngressClasses(Boolean enableAllIngressClasses) {
        this.enableAllIngressClasses = enableAllIngressClasses;
        return this;
    }

    public Boolean getEnableAllIngressClasses() {
        return this.enableAllIngressClasses;
    }

    public AIGatewayListItem setEnableAllNamespaces(Boolean enableAllNamespaces) {
        this.enableAllNamespaces = enableAllNamespaces;
        return this;
    }

    public Boolean getEnableAllNamespaces() {
        return this.enableAllNamespaces;
    }

    public AIGatewayListItem setIngressClasses(List<String> ingressClasses) {
        this.ingressClasses = ingressClasses;
        return this;
    }

    public List<String> getIngressClasses() {
        return this.ingressClasses;
    }

    public AIGatewayListItem setWatchNamespaces(List<String> watchNamespaces) {
        this.watchNamespaces = watchNamespaces;
        return this;
    }

    public List<String> getWatchNamespaces() {
        return this.watchNamespaces;
    }

    public AIGatewayListItem setBaEndpoint(VpcEndpoint baEndpoint) {
        this.baEndpoint = baEndpoint;
        return this;
    }

    public VpcEndpoint getBaEndpoint() {
        return this.baEndpoint;
    }

    public AIGatewayListItem setAssociatedCluster(String associatedCluster) {
        this.associatedCluster = associatedCluster;
        return this;
    }

    public String getAssociatedCluster() {
        return this.associatedCluster;
    }

    public AIGatewayListItem setSrcProduct(String srcProduct) {
        this.srcProduct = srcProduct;
        return this;
    }

    public String getSrcProduct() {
        return this.srcProduct;
    }

    public AIGatewayListItem setBlbLongId(String blbLongId) {
        this.blbLongId = blbLongId;
        return this;
    }

    public String getBlbLongId() {
        return this.blbLongId;
    }

    public AIGatewayListItem setWafId(String wafId) {
        this.wafId = wafId;
        return this;
    }

    public String getWafId() {
        return this.wafId;
    }

    public AIGatewayListItem setWafEnable(Boolean wafEnable) {
        this.wafEnable = wafEnable;
        return this;
    }

    public Boolean getWafEnable() {
        return this.wafEnable;
    }

    public AIGatewayListItem setPrivateDomainName(String privateDomainName) {
        this.privateDomainName = privateDomainName;
        return this;
    }

    public String getPrivateDomainName() {
        return this.privateDomainName;
    }

    public AIGatewayListItem setPublicDomainName(String publicDomainName) {
        this.publicDomainName = publicDomainName;
        return this;
    }

    public String getPublicDomainName() {
        return this.publicDomainName;
    }

    public AIGatewayListItem setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public AIGatewayListItem setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    public String getDomainStatus() {
        return this.domainStatus;
    }

    public AIGatewayListItem setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AIGatewayListItem setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public AIGatewayListItem setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return this.version;
    }

    public AIGatewayListItem setAihcArgs(AihcArgs aihcArgs) {
        this.aihcArgs = aihcArgs;
        return this;
    }

    public AihcArgs getAihcArgs() {
        return this.aihcArgs;
    }

    @Override
    public String toString() {
        return "AIGatewayListItem{" + "instanceId=" + instanceId + "\n" + "name=" + name + "\n" + "ingressStatus=" + ingressStatus + "\n" + "internalIP=" + internalIP + "\n"
                + "externalIP=" + externalIP + "\n" + "createTime=" + createTime + "\n" + "region=" + region + "\n" + "replicas=" + replicas + "\n" + "installMode=" + installMode
                + "\n" + "vpcCidr=" + vpcCidr + "\n" + "vpcId=" + vpcId + "\n" + "subnetId=" + subnetId + "\n" + "gatewayType=" + gatewayType + "\n" + "publicAccessible="
                + publicAccessible + "\n" + "deleteProtection=" + deleteProtection + "\n" + "description=" + description + "\n" + "namespace=" + namespace + "\n"
                + "enableIngress=" + enableIngress + "\n" + "enableAllIngressClasses=" + enableAllIngressClasses + "\n" + "enableAllNamespaces=" + enableAllNamespaces + "\n"
                + "ingressClasses=" + ingressClasses + "\n" + "watchNamespaces=" + watchNamespaces + "\n" + "baEndpoint=" + baEndpoint + "\n" + "associatedCluster="
                + associatedCluster + "\n" + "srcProduct=" + srcProduct + "\n" + "blbLongId=" + blbLongId + "\n" + "wafId=" + wafId + "\n" + "wafEnable=" + wafEnable + "\n"
                + "privateDomainName=" + privateDomainName + "\n" + "publicDomainName=" + publicDomainName + "\n" + "networkType=" + networkType + "\n" + "domainStatus="
                + domainStatus + "\n" + "securityGroupId=" + securityGroupId + "\n" + "tags=" + tags + "\n" + "version=" + version + "\n" + "aihcArgs=" + aihcArgs + "\n" + "}";
    }

}