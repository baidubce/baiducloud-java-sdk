package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceDetailUsingGETResponse extends BaseBceResponse {

    /**
    * autoRenewRule
    */
    private VdbAutoRenewRule autoRenewRule;

    /**
    * availabilityZone
    */
    private String availabilityZone;

    /**
    * azInfos
    */
    private List<AzInfo> azInfos;

    /**
    * bcmCycle
    */
    private Integer bcmCycle;

    /**
    * components
    */
    private List<MilvusComponent> components;

    /**
    * createTime
    */
    private String createTime;

    /**
    * dataNodeNum
    */
    private Integer dataNodeNum;

    /**
    * dataNodes
    */
    private List<DataNode> dataNodes;

    /**
    * dataStatus
    */
    private String dataStatus;

    /**
    * diskType
    */
    private String diskType;

    /**
    * domain
    */
    private String domain;

    /**
    * eip
    */
    private String eip;

    /**
    * enableEmbedding
    */
    private Boolean enableEmbedding;

    /**
    * enableEncryption
    */
    private Boolean enableEncryption;

    /**
    * enableTDE
    */
    private String enableTDE;

    /**
    * engineMinorVersion
    */
    private String engineMinorVersion;

    /**
    * engineType
    */
    private String engineType;

    /**
    * engineVersion
    */
    private String engineVersion;

    /**
    * expireDate
    */
    private Integer expireDate;

    /**
    * instanceExpireTime
    */
    private String instanceExpireTime;

    /**
    * instanceId
    */
    private String instanceId;

    /**
    * instanceName
    */
    private String instanceName;

    /**
    * instanceType
    */
    private String instanceType;

    /**
    * ip
    */
    private String ip;

    /**
    * logService
    */
    private LogService logService;

    /**
    * loggingServices
    */
    private List<LoggingService> loggingServices;

    /**
    * nodeSpec
    */
    private String nodeSpec;

    /**
    * nodes
    */
    private List<MilvusNode> nodes;

    /**
    * orderStatus
    */
    private String orderStatus;

    /**
    * packageVersion
    */
    private String packageVersion;

    /**
    * port
    */
    private Integer port;

    /**
    * productType
    */
    private String productType;

    /**
    * proxies
    */
    private List<Proxy> proxies;

    /**
    * proxyNodeSpec
    */
    private String proxyNodeSpec;

    /**
    * proxyNum
    */
    private Integer proxyNum;

    /**
    * status
    */
    private String status;

    /**
    * subnets
    */
    private List<Subnet> subnets;

    /**
    * supportEmbedding
    */
    private Boolean supportEmbedding;

    /**
    * targetPackage
    */
    private TargetPackage targetPackage;

    /**
    * totalDiskCapacityInGB
    */
    private Integer totalDiskCapacityInGB;

    /**
    * totalMemCapacityInGB
    */
    private Integer totalMemCapacityInGB;

    /**
    * upgradable
    */
    private Boolean upgradable;

    /**
    * usedDiskCapacityInGB
    */
    private Double usedDiskCapacityInGB;

    /**
    * usedMemCapacityInGB
    */
    private Double usedMemCapacityInGB;

    /**
    * vip
    */
    private String vip;

    /**
    * vpcCidr
    */
    private String vpcCidr;

    /**
    * vpcId
    */
    private String vpcId;

    /**
    * vpcName
    */
    private String vpcName;

    public VdbAutoRenewRule getAutoRenewRule() {
        return autoRenewRule;
    }

    public InstanceDetailUsingGETResponse setAutoRenewRule(VdbAutoRenewRule autoRenewRule) {
        this.autoRenewRule = autoRenewRule;
        return this;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public InstanceDetailUsingGETResponse setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public List<AzInfo> getAzInfos() {
        return azInfos;
    }

    public InstanceDetailUsingGETResponse setAzInfos(List<AzInfo> azInfos) {
        this.azInfos = azInfos;
        return this;
    }

    public Integer getBcmCycle() {
        return bcmCycle;
    }

    public InstanceDetailUsingGETResponse setBcmCycle(Integer bcmCycle) {
        this.bcmCycle = bcmCycle;
        return this;
    }

    public List<MilvusComponent> getComponents() {
        return components;
    }

    public InstanceDetailUsingGETResponse setComponents(List<MilvusComponent> components) {
        this.components = components;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public InstanceDetailUsingGETResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getDataNodeNum() {
        return dataNodeNum;
    }

    public InstanceDetailUsingGETResponse setDataNodeNum(Integer dataNodeNum) {
        this.dataNodeNum = dataNodeNum;
        return this;
    }

    public List<DataNode> getDataNodes() {
        return dataNodes;
    }

    public InstanceDetailUsingGETResponse setDataNodes(List<DataNode> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public InstanceDetailUsingGETResponse setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
        return this;
    }

    public String getDiskType() {
        return diskType;
    }

    public InstanceDetailUsingGETResponse setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public InstanceDetailUsingGETResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getEip() {
        return eip;
    }

    public InstanceDetailUsingGETResponse setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public Boolean getEnableEmbedding() {
        return enableEmbedding;
    }

    public InstanceDetailUsingGETResponse setEnableEmbedding(Boolean enableEmbedding) {
        this.enableEmbedding = enableEmbedding;
        return this;
    }

    public Boolean getEnableEncryption() {
        return enableEncryption;
    }

    public InstanceDetailUsingGETResponse setEnableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
        return this;
    }

    public String getEnableTDE() {
        return enableTDE;
    }

    public InstanceDetailUsingGETResponse setEnableTDE(String enableTDE) {
        this.enableTDE = enableTDE;
        return this;
    }

    public String getEngineMinorVersion() {
        return engineMinorVersion;
    }

    public InstanceDetailUsingGETResponse setEngineMinorVersion(String engineMinorVersion) {
        this.engineMinorVersion = engineMinorVersion;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public InstanceDetailUsingGETResponse setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public InstanceDetailUsingGETResponse setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public Integer getExpireDate() {
        return expireDate;
    }

    public InstanceDetailUsingGETResponse setExpireDate(Integer expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    public String getInstanceExpireTime() {
        return instanceExpireTime;
    }

    public InstanceDetailUsingGETResponse setInstanceExpireTime(String instanceExpireTime) {
        this.instanceExpireTime = instanceExpireTime;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public InstanceDetailUsingGETResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public InstanceDetailUsingGETResponse setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public InstanceDetailUsingGETResponse setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public InstanceDetailUsingGETResponse setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public LogService getLogService() {
        return logService;
    }

    public InstanceDetailUsingGETResponse setLogService(LogService logService) {
        this.logService = logService;
        return this;
    }

    public List<LoggingService> getLoggingServices() {
        return loggingServices;
    }

    public InstanceDetailUsingGETResponse setLoggingServices(List<LoggingService> loggingServices) {
        this.loggingServices = loggingServices;
        return this;
    }

    public String getNodeSpec() {
        return nodeSpec;
    }

    public InstanceDetailUsingGETResponse setNodeSpec(String nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }

    public List<MilvusNode> getNodes() {
        return nodes;
    }

    public InstanceDetailUsingGETResponse setNodes(List<MilvusNode> nodes) {
        this.nodes = nodes;
        return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public InstanceDetailUsingGETResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public String getPackageVersion() {
        return packageVersion;
    }

    public InstanceDetailUsingGETResponse setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public InstanceDetailUsingGETResponse setPort(Integer port) {
        this.port = port;
        return this;
    }

    public String getProductType() {
        return productType;
    }

    public InstanceDetailUsingGETResponse setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public List<Proxy> getProxies() {
        return proxies;
    }

    public InstanceDetailUsingGETResponse setProxies(List<Proxy> proxies) {
        this.proxies = proxies;
        return this;
    }

    public String getProxyNodeSpec() {
        return proxyNodeSpec;
    }

    public InstanceDetailUsingGETResponse setProxyNodeSpec(String proxyNodeSpec) {
        this.proxyNodeSpec = proxyNodeSpec;
        return this;
    }

    public Integer getProxyNum() {
        return proxyNum;
    }

    public InstanceDetailUsingGETResponse setProxyNum(Integer proxyNum) {
        this.proxyNum = proxyNum;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public InstanceDetailUsingGETResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public List<Subnet> getSubnets() {
        return subnets;
    }

    public InstanceDetailUsingGETResponse setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    public Boolean getSupportEmbedding() {
        return supportEmbedding;
    }

    public InstanceDetailUsingGETResponse setSupportEmbedding(Boolean supportEmbedding) {
        this.supportEmbedding = supportEmbedding;
        return this;
    }

    public TargetPackage getTargetPackage() {
        return targetPackage;
    }

    public InstanceDetailUsingGETResponse setTargetPackage(TargetPackage targetPackage) {
        this.targetPackage = targetPackage;
        return this;
    }

    public Integer getTotalDiskCapacityInGB() {
        return totalDiskCapacityInGB;
    }

    public InstanceDetailUsingGETResponse setTotalDiskCapacityInGB(Integer totalDiskCapacityInGB) {
        this.totalDiskCapacityInGB = totalDiskCapacityInGB;
        return this;
    }

    public Integer getTotalMemCapacityInGB() {
        return totalMemCapacityInGB;
    }

    public InstanceDetailUsingGETResponse setTotalMemCapacityInGB(Integer totalMemCapacityInGB) {
        this.totalMemCapacityInGB = totalMemCapacityInGB;
        return this;
    }

    public Boolean getUpgradable() {
        return upgradable;
    }

    public InstanceDetailUsingGETResponse setUpgradable(Boolean upgradable) {
        this.upgradable = upgradable;
        return this;
    }

    public Double getUsedDiskCapacityInGB() {
        return usedDiskCapacityInGB;
    }

    public InstanceDetailUsingGETResponse setUsedDiskCapacityInGB(Double usedDiskCapacityInGB) {
        this.usedDiskCapacityInGB = usedDiskCapacityInGB;
        return this;
    }

    public Double getUsedMemCapacityInGB() {
        return usedMemCapacityInGB;
    }

    public InstanceDetailUsingGETResponse setUsedMemCapacityInGB(Double usedMemCapacityInGB) {
        this.usedMemCapacityInGB = usedMemCapacityInGB;
        return this;
    }

    public String getVip() {
        return vip;
    }

    public InstanceDetailUsingGETResponse setVip(String vip) {
        this.vip = vip;
        return this;
    }

    public String getVpcCidr() {
        return vpcCidr;
    }

    public InstanceDetailUsingGETResponse setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public InstanceDetailUsingGETResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcName() {
        return vpcName;
    }

    public InstanceDetailUsingGETResponse setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    @Override
    public String toString() {
        return "InstanceDetailUsingGETResponse{" + "autoRenewRule=" + autoRenewRule + "\n" + "availabilityZone=" + availabilityZone + "\n" + "azInfos=" + azInfos + "\n"
                + "bcmCycle=" + bcmCycle + "\n" + "components=" + components + "\n" + "createTime=" + createTime + "\n" + "dataNodeNum=" + dataNodeNum + "\n" + "dataNodes="
                + dataNodes + "\n" + "dataStatus=" + dataStatus + "\n" + "diskType=" + diskType + "\n" + "domain=" + domain + "\n" + "eip=" + eip + "\n" + "enableEmbedding="
                + enableEmbedding + "\n" + "enableEncryption=" + enableEncryption + "\n" + "enableTDE=" + enableTDE + "\n" + "engineMinorVersion=" + engineMinorVersion + "\n"
                + "engineType=" + engineType + "\n" + "engineVersion=" + engineVersion + "\n" + "expireDate=" + expireDate + "\n" + "instanceExpireTime=" + instanceExpireTime
                + "\n" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "instanceType=" + instanceType + "\n" + "ip=" + ip + "\n" + "logService="
                + logService + "\n" + "loggingServices=" + loggingServices + "\n" + "nodeSpec=" + nodeSpec + "\n" + "nodes=" + nodes + "\n" + "orderStatus=" + orderStatus + "\n"
                + "packageVersion=" + packageVersion + "\n" + "port=" + port + "\n" + "productType=" + productType + "\n" + "proxies=" + proxies + "\n" + "proxyNodeSpec="
                + proxyNodeSpec + "\n" + "proxyNum=" + proxyNum + "\n" + "status=" + status + "\n" + "subnets=" + subnets + "\n" + "supportEmbedding=" + supportEmbedding + "\n"
                + "targetPackage=" + targetPackage + "\n" + "totalDiskCapacityInGB=" + totalDiskCapacityInGB + "\n" + "totalMemCapacityInGB=" + totalMemCapacityInGB + "\n"
                + "upgradable=" + upgradable + "\n" + "usedDiskCapacityInGB=" + usedDiskCapacityInGB + "\n" + "usedMemCapacityInGB=" + usedMemCapacityInGB + "\n" + "vip=" + vip
                + "\n" + "vpcCidr=" + vpcCidr + "\n" + "vpcId=" + vpcId + "\n" + "vpcName=" + vpcName + "\n" + "}";
    }

}
