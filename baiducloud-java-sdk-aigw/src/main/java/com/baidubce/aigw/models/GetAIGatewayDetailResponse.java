package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAIGatewayDetailResponse extends BaseBceResponse {

    /**
    * 网关实例 ID
    */
    private String instanceId;

    /**
    * 实例名称
    */
    private String name;

    /**
    * 网关状态
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

    public String getInstanceId() {
        return instanceId;
    }

    public GetAIGatewayDetailResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetAIGatewayDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getIngressStatus() {
        return ingressStatus;
    }

    public GetAIGatewayDetailResponse setIngressStatus(String ingressStatus) {
        this.ingressStatus = ingressStatus;
        return this;
    }

    public String getInternalIP() {
        return internalIP;
    }

    public GetAIGatewayDetailResponse setInternalIP(String internalIP) {
        this.internalIP = internalIP;
        return this;
    }

    public String getExternalIP() {
        return externalIP;
    }

    public GetAIGatewayDetailResponse setExternalIP(String externalIP) {
        this.externalIP = externalIP;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetAIGatewayDetailResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public GetAIGatewayDetailResponse setRegion(String region) {
        this.region = region;
        return this;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public GetAIGatewayDetailResponse setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public String getInstallMode() {
        return installMode;
    }

    public GetAIGatewayDetailResponse setInstallMode(String installMode) {
        this.installMode = installMode;
        return this;
    }

    public String getVpcCidr() {
        return vpcCidr;
    }

    public GetAIGatewayDetailResponse setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public GetAIGatewayDetailResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public GetAIGatewayDetailResponse setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getGatewayType() {
        return gatewayType;
    }

    public GetAIGatewayDetailResponse setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    public Boolean getPublicAccessible() {
        return publicAccessible;
    }

    public GetAIGatewayDetailResponse setPublicAccessible(Boolean publicAccessible) {
        this.publicAccessible = publicAccessible;
        return this;
    }

    public Boolean getDeleteProtection() {
        return deleteProtection;
    }

    public GetAIGatewayDetailResponse setDeleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetAIGatewayDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public GetAIGatewayDetailResponse setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getEnableIngress() {
        return enableIngress;
    }

    public GetAIGatewayDetailResponse setEnableIngress(Boolean enableIngress) {
        this.enableIngress = enableIngress;
        return this;
    }

    public Boolean getEnableAllIngressClasses() {
        return enableAllIngressClasses;
    }

    public GetAIGatewayDetailResponse setEnableAllIngressClasses(Boolean enableAllIngressClasses) {
        this.enableAllIngressClasses = enableAllIngressClasses;
        return this;
    }

    public Boolean getEnableAllNamespaces() {
        return enableAllNamespaces;
    }

    public GetAIGatewayDetailResponse setEnableAllNamespaces(Boolean enableAllNamespaces) {
        this.enableAllNamespaces = enableAllNamespaces;
        return this;
    }

    public List<String> getIngressClasses() {
        return ingressClasses;
    }

    public GetAIGatewayDetailResponse setIngressClasses(List<String> ingressClasses) {
        this.ingressClasses = ingressClasses;
        return this;
    }

    public List<String> getWatchNamespaces() {
        return watchNamespaces;
    }

    public GetAIGatewayDetailResponse setWatchNamespaces(List<String> watchNamespaces) {
        this.watchNamespaces = watchNamespaces;
        return this;
    }

    public VpcEndpoint getBaEndpoint() {
        return baEndpoint;
    }

    public GetAIGatewayDetailResponse setBaEndpoint(VpcEndpoint baEndpoint) {
        this.baEndpoint = baEndpoint;
        return this;
    }

    public String getAssociatedCluster() {
        return associatedCluster;
    }

    public GetAIGatewayDetailResponse setAssociatedCluster(String associatedCluster) {
        this.associatedCluster = associatedCluster;
        return this;
    }

    public String getSrcProduct() {
        return srcProduct;
    }

    public GetAIGatewayDetailResponse setSrcProduct(String srcProduct) {
        this.srcProduct = srcProduct;
        return this;
    }

    public String getBlbLongId() {
        return blbLongId;
    }

    public GetAIGatewayDetailResponse setBlbLongId(String blbLongId) {
        this.blbLongId = blbLongId;
        return this;
    }

    public String getWafId() {
        return wafId;
    }

    public GetAIGatewayDetailResponse setWafId(String wafId) {
        this.wafId = wafId;
        return this;
    }

    public Boolean getWafEnable() {
        return wafEnable;
    }

    public GetAIGatewayDetailResponse setWafEnable(Boolean wafEnable) {
        this.wafEnable = wafEnable;
        return this;
    }

    public String getPrivateDomainName() {
        return privateDomainName;
    }

    public GetAIGatewayDetailResponse setPrivateDomainName(String privateDomainName) {
        this.privateDomainName = privateDomainName;
        return this;
    }

    public String getPublicDomainName() {
        return publicDomainName;
    }

    public GetAIGatewayDetailResponse setPublicDomainName(String publicDomainName) {
        this.publicDomainName = publicDomainName;
        return this;
    }

    public String getNetworkType() {
        return networkType;
    }

    public GetAIGatewayDetailResponse setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    public String getDomainStatus() {
        return domainStatus;
    }

    public GetAIGatewayDetailResponse setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public GetAIGatewayDetailResponse setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public GetAIGatewayDetailResponse setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public GetAIGatewayDetailResponse setVersion(String version) {
        this.version = version;
        return this;
    }

    public AihcArgs getAihcArgs() {
        return aihcArgs;
    }

    public GetAIGatewayDetailResponse setAihcArgs(AihcArgs aihcArgs) {
        this.aihcArgs = aihcArgs;
        return this;
    }

    @Override
    public String toString() {
        return "GetAIGatewayDetailResponse{" + "instanceId=" + instanceId + "\n" + "name=" + name + "\n" + "ingressStatus=" + ingressStatus + "\n" + "internalIP=" + internalIP
                + "\n" + "externalIP=" + externalIP + "\n" + "createTime=" + createTime + "\n" + "region=" + region + "\n" + "replicas=" + replicas + "\n" + "installMode="
                + installMode + "\n" + "vpcCidr=" + vpcCidr + "\n" + "vpcId=" + vpcId + "\n" + "subnetId=" + subnetId + "\n" + "gatewayType=" + gatewayType + "\n"
                + "publicAccessible=" + publicAccessible + "\n" + "deleteProtection=" + deleteProtection + "\n" + "description=" + description + "\n" + "namespace=" + namespace
                + "\n" + "enableIngress=" + enableIngress + "\n" + "enableAllIngressClasses=" + enableAllIngressClasses + "\n" + "enableAllNamespaces=" + enableAllNamespaces
                + "\n" + "ingressClasses=" + ingressClasses + "\n" + "watchNamespaces=" + watchNamespaces + "\n" + "baEndpoint=" + baEndpoint + "\n" + "associatedCluster="
                + associatedCluster + "\n" + "srcProduct=" + srcProduct + "\n" + "blbLongId=" + blbLongId + "\n" + "wafId=" + wafId + "\n" + "wafEnable=" + wafEnable + "\n"
                + "privateDomainName=" + privateDomainName + "\n" + "publicDomainName=" + publicDomainName + "\n" + "networkType=" + networkType + "\n" + "domainStatus="
                + domainStatus + "\n" + "securityGroupId=" + securityGroupId + "\n" + "tags=" + tags + "\n" + "version=" + version + "\n" + "aihcArgs=" + aihcArgs + "\n" + "}";
    }

}
