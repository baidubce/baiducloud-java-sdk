package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceModel {
    /**
     * PFS实例最大容量（单位GB）
     */
    private Integer capacity;

    /**
     * PFS实例创建时间
     */
    private String createTime;

    /**
     * PFS实例描述信息
     */
    private String description;

    /**
     * PFS连接地址，仅basic、plus、base、baseX类型实例有该参数
     */
    private String endpoint;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例状态<br>• CREATING<br>• RUNNING<br>• EXPIRED<br>• STARTING<br>• STOPPING<br>• DELETED
     */
    private String instanceStatus;

    /**
     * 实例类型
     */
    private String instanceType;

    /**
     * 实例名称
     */
    private String name;

    /**
     * 付款方式
     */
    private String paymentTiming;

    /**
     * subnetModel
     */
    private SubnetDetail subnetModel;

    /**
     * PFS实例使用量（单位GB）
     */
    private Integer usage;

    /**
     * PFS所在VPCID
     */
    private String vpcId;

    public InstanceModel setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public InstanceModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public InstanceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public InstanceModel setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public InstanceModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceModel setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public InstanceModel setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public InstanceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public InstanceModel setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public InstanceModel setSubnetModel(SubnetDetail subnetModel) {
        this.subnetModel = subnetModel;
        return this;
    }

    public SubnetDetail getSubnetModel() {
        return this.subnetModel;
    }

    public InstanceModel setUsage(Integer usage) {
        this.usage = usage;
        return this;
    }

    public Integer getUsage() {
        return this.usage;
    }

    public InstanceModel setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    @Override
    public String toString() {
        return "InstanceModel{" + "capacity=" + capacity + "\n" + "createTime=" + createTime + "\n" + "description=" + description + "\n" + "endpoint=" + endpoint + "\n"
                + "instanceId=" + instanceId + "\n" + "instanceStatus=" + instanceStatus + "\n" + "instanceType=" + instanceType + "\n" + "name=" + name + "\n" + "paymentTiming="
                + paymentTiming + "\n" + "subnetModel=" + subnetModel + "\n" + "usage=" + usage + "\n" + "vpcId=" + vpcId + "\n" + "}";
    }

}