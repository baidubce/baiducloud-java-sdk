package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceModel {
    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名
     */
    private String instanceName;

    /**
     * [实例状态](#实例状态)
     */
    private String instanceStatus;

    /**
     * 已隔离:Isolated(实例在回收站内)
     */
    private String isolatedStatus;

    /**
     * 引擎类型为Redis，取值：集群: “cluster” 主从:“master_slave”，default: 主从
     */
    private String clusterType;

    /**
     * 引擎类型，redis,memcache
     */
    private String engine;

    /**
     * 引擎版本
     */
    private String engineVersion;

    /**
     * 私网IP
     */
    private String vnetIp;

    /**
     * 域名
     */
    private String domain;

    /**
     * 链接端口
     */
    private String port;

    /**
     * 实例创建时间
     */
    private String instanceCreateTime;

    /**
     * 实例到期时间
     */
    private String instanceExpireTime;

    /**
     * 总容量，单位GB
     */
    private Float capacity;

    /**
     * 已用容量，单位GB
     */
    private Double usedCapacity;

    /**
     * 付费方式。预付费：Prepaid，后付费：Postpaid
     */
    private String paymentTiming;

    /**
     * 可用区list
     */
    private List<String> zoneNames;

    /**
     * 预转后、后转预的标记。 <li>to_postpay: 预付费转后付费<li> to_prepay: 后付费转预付费
     */
    private String orderStatus;

    /**
     * 集群绑定的部署集ID列表。
     */
    private List<String> deployIdList;

    public InstanceModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceModel setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public InstanceModel setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public InstanceModel setIsolatedStatus(String isolatedStatus) {
        this.isolatedStatus = isolatedStatus;
        return this;
    }

    public String getIsolatedStatus() {
        return this.isolatedStatus;
    }

    public InstanceModel setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public String getClusterType() {
        return this.clusterType;
    }

    public InstanceModel setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngine() {
        return this.engine;
    }

    public InstanceModel setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public InstanceModel setVnetIp(String vnetIp) {
        this.vnetIp = vnetIp;
        return this;
    }

    public String getVnetIp() {
        return this.vnetIp;
    }

    public InstanceModel setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getDomain() {
        return this.domain;
    }

    public InstanceModel setPort(String port) {
        this.port = port;
        return this;
    }

    public String getPort() {
        return this.port;
    }

    public InstanceModel setInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    public String getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    public InstanceModel setInstanceExpireTime(String instanceExpireTime) {
        this.instanceExpireTime = instanceExpireTime;
        return this;
    }

    public String getInstanceExpireTime() {
        return this.instanceExpireTime;
    }

    public InstanceModel setCapacity(Float capacity) {
        this.capacity = capacity;
        return this;
    }

    public Float getCapacity() {
        return this.capacity;
    }

    public InstanceModel setUsedCapacity(Double usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    public Double getUsedCapacity() {
        return this.usedCapacity;
    }

    public InstanceModel setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public InstanceModel setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public List<String> getZoneNames() {
        return this.zoneNames;
    }

    public InstanceModel setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public InstanceModel setDeployIdList(List<String> deployIdList) {
        this.deployIdList = deployIdList;
        return this;
    }

    public List<String> getDeployIdList() {
        return this.deployIdList;
    }

    @Override
    public String toString() {
        return "InstanceModel{" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "instanceStatus=" + instanceStatus + "\n" + "isolatedStatus="
                + isolatedStatus + "\n" + "clusterType=" + clusterType + "\n" + "engine=" + engine + "\n" + "engineVersion=" + engineVersion + "\n" + "vnetIp=" + vnetIp + "\n"
                + "domain=" + domain + "\n" + "port=" + port + "\n" + "instanceCreateTime=" + instanceCreateTime + "\n" + "instanceExpireTime=" + instanceExpireTime + "\n"
                + "capacity=" + capacity + "\n" + "usedCapacity=" + usedCapacity + "\n" + "paymentTiming=" + paymentTiming + "\n" + "zoneNames=" + zoneNames + "\n"
                + "orderStatus=" + orderStatus + "\n" + "deployIdList=" + deployIdList + "\n" + "}";
    }

}