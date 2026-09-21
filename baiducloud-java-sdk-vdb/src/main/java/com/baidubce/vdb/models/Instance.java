package com.baidubce.vdb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Instance {
    /**
     * autoRenewRule
     */
    private VdbAutoRenewRule autoRenewRule;

    /**
     * 
     */
    private String availabilityZone;

    /**
     * 
     */
    private List<AzInfo> azInfos;

    /**
     * 
     */
    private Integer bcmCycle;

    /**
     * 
     */
    private List<MilvusComponent> components;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private Integer dataNodeNum;

    /**
     * 
     */
    private List<DataNode> dataNodes;

    /**
     * 
     */
    private String dataStatus;

    /**
     * 
     */
    private String diskType;

    /**
     * 
     */
    private String domain;

    /**
     * 
     */
    private String eip;

    /**
     * 
     */
    private Boolean enableEmbedding;

    /**
     * 
     */
    private Boolean enableEncryption;

    /**
     * 
     */
    private String enableTDE;

    /**
     * 
     */
    private String engineMinorVersion;

    /**
     * 
     */
    private String engineType;

    /**
     * 
     */
    private String engineVersion;

    /**
     * 
     */
    private Integer expireDate;

    /**
     * 
     */
    private String instanceExpireTime;

    /**
     * 
     */
    private String instanceId;

    /**
     * 
     */
    private String instanceName;

    /**
     * 
     */
    private String instanceType;

    /**
     * 
     */
    private String ip;

    /**
     * logService
     */
    private LogService logService;

    /**
     * 
     */
    private List<LoggingService> loggingServices;

    /**
     * 
     */
    private String nodeSpec;

    /**
     * 
     */
    private List<MilvusNode> nodes;

    /**
     * 
     */
    private String orderStatus;

    /**
     * 
     */
    private String packageVersion;

    /**
     * 
     */
    private Integer port;

    /**
     * 
     */
    private String productType;

    /**
     * 
     */
    private List<Proxy> proxies;

    /**
     * 
     */
    private String proxyNodeSpec;

    /**
     * 
     */
    private Integer proxyNum;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private List<Subnet> subnets;

    /**
     * 
     */
    private Boolean supportEmbedding;

    /**
     * targetPackage
     */
    private TargetPackage targetPackage;

    /**
     * 
     */
    private Integer totalDiskCapacityInGB;

    /**
     * 
     */
    private Integer totalMemCapacityInGB;

    /**
     * 
     */
    private Boolean upgradable;

    /**
     * 
     */
    private Double usedDiskCapacityInGB;

    /**
     * 
     */
    private Double usedMemCapacityInGB;

    /**
     * 
     */
    private String vip;

    /**
     * 
     */
    private String vpcCidr;

    /**
     * 
     */
    private String vpcId;

    /**
     * 
     */
    private String vpcName;

    public Instance setAutoRenewRule(VdbAutoRenewRule autoRenewRule) {
        this.autoRenewRule = autoRenewRule;
        return this;
    }

    public VdbAutoRenewRule getAutoRenewRule() {
        return this.autoRenewRule;
    }

    public Instance setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public Instance setAzInfos(List<AzInfo> azInfos) {
        this.azInfos = azInfos;
        return this;
    }

    public List<AzInfo> getAzInfos() {
        return this.azInfos;
    }

    public Instance setBcmCycle(Integer bcmCycle) {
        this.bcmCycle = bcmCycle;
        return this;
    }

    public Integer getBcmCycle() {
        return this.bcmCycle;
    }

    public Instance setComponents(List<MilvusComponent> components) {
        this.components = components;
        return this;
    }

    public List<MilvusComponent> getComponents() {
        return this.components;
    }

    public Instance setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Instance setDataNodeNum(Integer dataNodeNum) {
        this.dataNodeNum = dataNodeNum;
        return this;
    }

    public Integer getDataNodeNum() {
        return this.dataNodeNum;
    }

    public Instance setDataNodes(List<DataNode> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }

    public List<DataNode> getDataNodes() {
        return this.dataNodes;
    }

    public Instance setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
        return this;
    }

    public String getDataStatus() {
        return this.dataStatus;
    }

    public Instance setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    public String getDiskType() {
        return this.diskType;
    }

    public Instance setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getDomain() {
        return this.domain;
    }

    public Instance setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    public Instance setEnableEmbedding(Boolean enableEmbedding) {
        this.enableEmbedding = enableEmbedding;
        return this;
    }

    public Boolean getEnableEmbedding() {
        return this.enableEmbedding;
    }

    public Instance setEnableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
        return this;
    }

    public Boolean getEnableEncryption() {
        return this.enableEncryption;
    }

    public Instance setEnableTDE(String enableTDE) {
        this.enableTDE = enableTDE;
        return this;
    }

    public String getEnableTDE() {
        return this.enableTDE;
    }

    public Instance setEngineMinorVersion(String engineMinorVersion) {
        this.engineMinorVersion = engineMinorVersion;
        return this;
    }

    public String getEngineMinorVersion() {
        return this.engineMinorVersion;
    }

    public Instance setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public Instance setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public Instance setExpireDate(Integer expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    public Integer getExpireDate() {
        return this.expireDate;
    }

    public Instance setInstanceExpireTime(String instanceExpireTime) {
        this.instanceExpireTime = instanceExpireTime;
        return this;
    }

    public String getInstanceExpireTime() {
        return this.instanceExpireTime;
    }

    public Instance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Instance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public Instance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public Instance setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public Instance setLogService(LogService logService) {
        this.logService = logService;
        return this;
    }

    public LogService getLogService() {
        return this.logService;
    }

    public Instance setLoggingServices(List<LoggingService> loggingServices) {
        this.loggingServices = loggingServices;
        return this;
    }

    public List<LoggingService> getLoggingServices() {
        return this.loggingServices;
    }

    public Instance setNodeSpec(String nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }

    public String getNodeSpec() {
        return this.nodeSpec;
    }

    public Instance setNodes(List<MilvusNode> nodes) {
        this.nodes = nodes;
        return this;
    }

    public List<MilvusNode> getNodes() {
        return this.nodes;
    }

    public Instance setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public Instance setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }

    public String getPackageVersion() {
        return this.packageVersion;
    }

    public Instance setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public Instance setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getProductType() {
        return this.productType;
    }

    public Instance setProxies(List<Proxy> proxies) {
        this.proxies = proxies;
        return this;
    }

    public List<Proxy> getProxies() {
        return this.proxies;
    }

    public Instance setProxyNodeSpec(String proxyNodeSpec) {
        this.proxyNodeSpec = proxyNodeSpec;
        return this;
    }

    public String getProxyNodeSpec() {
        return this.proxyNodeSpec;
    }

    public Instance setProxyNum(Integer proxyNum) {
        this.proxyNum = proxyNum;
        return this;
    }

    public Integer getProxyNum() {
        return this.proxyNum;
    }

    public Instance setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Instance setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    public List<Subnet> getSubnets() {
        return this.subnets;
    }

    public Instance setSupportEmbedding(Boolean supportEmbedding) {
        this.supportEmbedding = supportEmbedding;
        return this;
    }

    public Boolean getSupportEmbedding() {
        return this.supportEmbedding;
    }

    public Instance setTargetPackage(TargetPackage targetPackage) {
        this.targetPackage = targetPackage;
        return this;
    }

    public TargetPackage getTargetPackage() {
        return this.targetPackage;
    }

    public Instance setTotalDiskCapacityInGB(Integer totalDiskCapacityInGB) {
        this.totalDiskCapacityInGB = totalDiskCapacityInGB;
        return this;
    }

    public Integer getTotalDiskCapacityInGB() {
        return this.totalDiskCapacityInGB;
    }

    public Instance setTotalMemCapacityInGB(Integer totalMemCapacityInGB) {
        this.totalMemCapacityInGB = totalMemCapacityInGB;
        return this;
    }

    public Integer getTotalMemCapacityInGB() {
        return this.totalMemCapacityInGB;
    }

    public Instance setUpgradable(Boolean upgradable) {
        this.upgradable = upgradable;
        return this;
    }

    public Boolean getUpgradable() {
        return this.upgradable;
    }

    public Instance setUsedDiskCapacityInGB(Double usedDiskCapacityInGB) {
        this.usedDiskCapacityInGB = usedDiskCapacityInGB;
        return this;
    }

    public Double getUsedDiskCapacityInGB() {
        return this.usedDiskCapacityInGB;
    }

    public Instance setUsedMemCapacityInGB(Double usedMemCapacityInGB) {
        this.usedMemCapacityInGB = usedMemCapacityInGB;
        return this;
    }

    public Double getUsedMemCapacityInGB() {
        return this.usedMemCapacityInGB;
    }

    public Instance setVip(String vip) {
        this.vip = vip;
        return this;
    }

    public String getVip() {
        return this.vip;
    }

    public Instance setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    public String getVpcCidr() {
        return this.vpcCidr;
    }

    public Instance setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Instance setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    @Override
    public String toString() {
        return "Instance{" + "autoRenewRule=" + autoRenewRule + "\n" + "availabilityZone=" + availabilityZone + "\n" + "azInfos=" + azInfos + "\n" + "bcmCycle=" + bcmCycle + "\n"
                + "components=" + components + "\n" + "createTime=" + createTime + "\n" + "dataNodeNum=" + dataNodeNum + "\n" + "dataNodes=" + dataNodes + "\n" + "dataStatus="
                + dataStatus + "\n" + "diskType=" + diskType + "\n" + "domain=" + domain + "\n" + "eip=" + eip + "\n" + "enableEmbedding=" + enableEmbedding + "\n"
                + "enableEncryption=" + enableEncryption + "\n" + "enableTDE=" + enableTDE + "\n" + "engineMinorVersion=" + engineMinorVersion + "\n" + "engineType=" + engineType
                + "\n" + "engineVersion=" + engineVersion + "\n" + "expireDate=" + expireDate + "\n" + "instanceExpireTime=" + instanceExpireTime + "\n" + "instanceId="
                + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "instanceType=" + instanceType + "\n" + "ip=" + ip + "\n" + "logService=" + logService + "\n"
                + "loggingServices=" + loggingServices + "\n" + "nodeSpec=" + nodeSpec + "\n" + "nodes=" + nodes + "\n" + "orderStatus=" + orderStatus + "\n" + "packageVersion="
                + packageVersion + "\n" + "port=" + port + "\n" + "productType=" + productType + "\n" + "proxies=" + proxies + "\n" + "proxyNodeSpec=" + proxyNodeSpec + "\n"
                + "proxyNum=" + proxyNum + "\n" + "status=" + status + "\n" + "subnets=" + subnets + "\n" + "supportEmbedding=" + supportEmbedding + "\n" + "targetPackage="
                + targetPackage + "\n" + "totalDiskCapacityInGB=" + totalDiskCapacityInGB + "\n" + "totalMemCapacityInGB=" + totalMemCapacityInGB + "\n" + "upgradable="
                + upgradable + "\n" + "usedDiskCapacityInGB=" + usedDiskCapacityInGB + "\n" + "usedMemCapacityInGB=" + usedMemCapacityInGB + "\n" + "vip=" + vip + "\n"
                + "vpcCidr=" + vpcCidr + "\n" + "vpcId=" + vpcId + "\n" + "vpcName=" + vpcName + "\n" + "}";
    }

}