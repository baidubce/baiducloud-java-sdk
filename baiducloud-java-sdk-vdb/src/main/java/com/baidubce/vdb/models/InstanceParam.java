package com.baidubce.vdb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceParam {
    /**
     * 可用区
     */
    private String availabilityZone;

    /**
     * 可用区及子网信息
     */
    private List<AzInfo> azInfos;

    /**
     * 克隆源备份ID
     */
    private String cloneDataAppBackupId;

    /**
     * 克隆源实例ID
     */
    private String cloneDataAppId;

    /**
     * 组件配置
     */
    private List<MilvusComponent> components;

    /**
     * 数据节点数量
     */
    private Integer dataNodeNum;

    /**
     * 磁盘容量（GB）
     */
    private Integer diskFlavor;

    /**
     * 磁盘类型
     */
    private String diskType;

    /**
     * 是否开启 Embedding
     */
    private Boolean enableEmbedding;

    /**
     * 是否开启数据加密
     */
    private Boolean enableEncryption;

    /**
     * 引擎版本
     */
    private String engineVersion;

    /**
     * 请求来源（console/api）
     */
    private String from;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 实例数量
     */
    private Integer instanceNum;

    /**
     * 实例类型（cluster：集群，standalone：单机）
     */
    private String instanceType;

    /**
     * 主节点规格
     */
    private String masterNodeSpec;

    /**
     * 主节点数量
     */
    private Integer masterNum;

    /**
     * 节点规格
     */
    private String nodeSpec;

    /**
     * 节点类型
     */
    private String nodeType;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 实例密码
     */
    private String password;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 代理节点规格
     */
    private String proxyNodeSpec;

    /**
     * 代理节点数量
     */
    private Integer proxyNum;

    /**
     * 请求来源
     */
    private String reqSource;

    /**
     * 子网 ID
     */
    private String subnetId;

    /**
     * 是否交换原实例和克隆实例入口
     */
    private String switchEntrance;

    /**
     * VPC ID
     */
    private String vpcId;

    public InstanceParam setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public InstanceParam setAzInfos(List<AzInfo> azInfos) {
        this.azInfos = azInfos;
        return this;
    }

    public List<AzInfo> getAzInfos() {
        return this.azInfos;
    }

    public InstanceParam setCloneDataAppBackupId(String cloneDataAppBackupId) {
        this.cloneDataAppBackupId = cloneDataAppBackupId;
        return this;
    }

    public String getCloneDataAppBackupId() {
        return this.cloneDataAppBackupId;
    }

    public InstanceParam setCloneDataAppId(String cloneDataAppId) {
        this.cloneDataAppId = cloneDataAppId;
        return this;
    }

    public String getCloneDataAppId() {
        return this.cloneDataAppId;
    }

    public InstanceParam setComponents(List<MilvusComponent> components) {
        this.components = components;
        return this;
    }

    public List<MilvusComponent> getComponents() {
        return this.components;
    }

    public InstanceParam setDataNodeNum(Integer dataNodeNum) {
        this.dataNodeNum = dataNodeNum;
        return this;
    }

    public Integer getDataNodeNum() {
        return this.dataNodeNum;
    }

    public InstanceParam setDiskFlavor(Integer diskFlavor) {
        this.diskFlavor = diskFlavor;
        return this;
    }

    public Integer getDiskFlavor() {
        return this.diskFlavor;
    }

    public InstanceParam setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    public String getDiskType() {
        return this.diskType;
    }

    public InstanceParam setEnableEmbedding(Boolean enableEmbedding) {
        this.enableEmbedding = enableEmbedding;
        return this;
    }

    public Boolean getEnableEmbedding() {
        return this.enableEmbedding;
    }

    public InstanceParam setEnableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
        return this;
    }

    public Boolean getEnableEncryption() {
        return this.enableEncryption;
    }

    public InstanceParam setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public InstanceParam setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public InstanceParam setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public InstanceParam setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    public Integer getInstanceNum() {
        return this.instanceNum;
    }

    public InstanceParam setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public InstanceParam setMasterNodeSpec(String masterNodeSpec) {
        this.masterNodeSpec = masterNodeSpec;
        return this;
    }

    public String getMasterNodeSpec() {
        return this.masterNodeSpec;
    }

    public InstanceParam setMasterNum(Integer masterNum) {
        this.masterNum = masterNum;
        return this;
    }

    public Integer getMasterNum() {
        return this.masterNum;
    }

    public InstanceParam setNodeSpec(String nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }

    public String getNodeSpec() {
        return this.nodeSpec;
    }

    public InstanceParam setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public InstanceParam setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public InstanceParam setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public InstanceParam setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public InstanceParam setProxyNodeSpec(String proxyNodeSpec) {
        this.proxyNodeSpec = proxyNodeSpec;
        return this;
    }

    public String getProxyNodeSpec() {
        return this.proxyNodeSpec;
    }

    public InstanceParam setProxyNum(Integer proxyNum) {
        this.proxyNum = proxyNum;
        return this;
    }

    public Integer getProxyNum() {
        return this.proxyNum;
    }

    public InstanceParam setReqSource(String reqSource) {
        this.reqSource = reqSource;
        return this;
    }

    public String getReqSource() {
        return this.reqSource;
    }

    public InstanceParam setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public InstanceParam setSwitchEntrance(String switchEntrance) {
        this.switchEntrance = switchEntrance;
        return this;
    }

    public String getSwitchEntrance() {
        return this.switchEntrance;
    }

    public InstanceParam setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    @Override
    public String toString() {
        return "InstanceParam{" + "availabilityZone=" + availabilityZone + "\n" + "azInfos=" + azInfos + "\n" + "cloneDataAppBackupId=" + cloneDataAppBackupId + "\n"
                + "cloneDataAppId=" + cloneDataAppId + "\n" + "components=" + components + "\n" + "dataNodeNum=" + dataNodeNum + "\n" + "diskFlavor=" + diskFlavor + "\n"
                + "diskType=" + diskType + "\n" + "enableEmbedding=" + enableEmbedding + "\n" + "enableEncryption=" + enableEncryption + "\n" + "engineVersion=" + engineVersion
                + "\n" + "from=" + from + "\n" + "instanceName=" + instanceName + "\n" + "instanceNum=" + instanceNum + "\n" + "instanceType=" + instanceType + "\n"
                + "masterNodeSpec=" + masterNodeSpec + "\n" + "masterNum=" + masterNum + "\n" + "nodeSpec=" + nodeSpec + "\n" + "nodeType=" + nodeType + "\n" + "orderId="
                + orderId + "\n" + "password=" + password + "\n" + "port=" + port + "\n" + "proxyNodeSpec=" + proxyNodeSpec + "\n" + "proxyNum=" + proxyNum + "\n" + "reqSource="
                + reqSource + "\n" + "subnetId=" + subnetId + "\n" + "switchEntrance=" + switchEntrance + "\n" + "vpcId=" + vpcId + "\n" + "}";
    }

}