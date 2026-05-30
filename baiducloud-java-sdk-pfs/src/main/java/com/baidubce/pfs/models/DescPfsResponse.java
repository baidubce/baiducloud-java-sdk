package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescPfsResponse extends BaseBceResponse {

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
    * 实例状态<br><li>CREATING<br><li>RUNNING<br><li>EXPIRED<br><li>STARTING<br><li>STOPPING<br><li>DELETED
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

    /**
    * PFS绑定的标签
    */
    private List<Tag> tags;

    public Integer getCapacity() {
        return capacity;
    }

    public DescPfsResponse setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DescPfsResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DescPfsResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public DescPfsResponse setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DescPfsResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceStatus() {
        return instanceStatus;
    }

    public DescPfsResponse setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public DescPfsResponse setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescPfsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public DescPfsResponse setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public SubnetDetail getSubnetModel() {
        return subnetModel;
    }

    public DescPfsResponse setSubnetModel(SubnetDetail subnetModel) {
        this.subnetModel = subnetModel;
        return this;
    }

    public Integer getUsage() {
        return usage;
    }

    public DescPfsResponse setUsage(Integer usage) {
        this.usage = usage;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public DescPfsResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public DescPfsResponse setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "DescPfsResponse{" + "capacity=" + capacity + "\n" + "createTime=" + createTime + "\n" + "description=" + description + "\n" + "endpoint=" + endpoint + "\n"
                + "instanceId=" + instanceId + "\n" + "instanceStatus=" + instanceStatus + "\n" + "instanceType=" + instanceType + "\n" + "name=" + name + "\n" + "paymentTiming="
                + paymentTiming + "\n" + "subnetModel=" + subnetModel + "\n" + "usage=" + usage + "\n" + "vpcId=" + vpcId + "\n" + "tags=" + tags + "\n" + "}";
    }

}
