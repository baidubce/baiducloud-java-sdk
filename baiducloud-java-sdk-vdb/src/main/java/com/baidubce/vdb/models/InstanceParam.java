package com.baidubce.vdb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceParam {
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
    private String cloneDataAppBackupId;

    /**
     * 
     */
    private String cloneDataAppId;

    /**
     * 
     */
    private List<MilvusComponent> components;

    /**
     * 
     */
    private Integer dataNodeNum;

    /**
     * 
     */
    private Integer diskFlavor;

    /**
     * 
     */
    private String diskType;

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
    private String engineVersion;

    /**
     * 
     */
    private String from;

    /**
     * 
     */
    private String instanceName;

    /**
     * 
     */
    private Integer instanceNum;

    /**
     * 
     */
    private String instanceType;

    /**
     * 
     */
    private String masterNodeSpec;

    /**
     * 
     */
    private Integer masterNum;

    /**
     * 
     */
    private String nodeSpec;

    /**
     * 
     */
    private String nodeType;

    /**
     * 
     */
    private String orderId;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Integer port;

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
    private String reqSource;

    /**
     * 
     */
    private String subnetId;

    /**
     * 
     */
    private String switchEntrance;

    /**
     * 
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