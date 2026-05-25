package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheSpecifiedHighlyAvailableVirtualIpResponse extends BaseBceResponse {

    /**
    * 高可用虚拟IP的ID
    */
    private String haVipId;

    /**
    * 高可用虚拟IP的名称
    */
    private String name;

    /**
    * 高可用虚拟IP的描述
    */
    private String description;

    /**
    * 高可用虚拟IP所在VPC的ID
    */
    private String vpcId;

    /**
    * 高可用虚拟IP所在子网的ID
    */
    private String subnetId;

    /**
    * 高可用虚拟IP的状态，\"available\"表示可用，\"binded\"表示已绑定实例
    */
    private String status;

    /**
    * 高可用虚拟IP内网地址
    */
    private String privateIpAddress;

    /**
    * 高可用虚拟IP公网地址
    */
    private String publicIpAddress;

    /**
    * 高可用虚拟IP绑定的实例
    */
    private List<HaVipBindedInstance> bindedInstances;

    /**
    * 高可用虚拟IP实例创建时间
    */
    private String createdTime;

    public String getHaVipId() {
        return haVipId;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    public List<HaVipBindedInstance> getBindedInstances() {
        return bindedInstances;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setBindedInstances(List<HaVipBindedInstance> bindedInstances) {
        this.bindedInstances = bindedInstances;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public QueryTheSpecifiedHighlyAvailableVirtualIpResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheSpecifiedHighlyAvailableVirtualIpResponse{" + "haVipId=" + haVipId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "vpcId=" + vpcId
                + "\n" + "subnetId=" + subnetId + "\n" + "status=" + status + "\n" + "privateIpAddress=" + privateIpAddress + "\n" + "publicIpAddress=" + publicIpAddress + "\n"
                + "bindedInstances=" + bindedInstances + "\n" + "createdTime=" + createdTime + "\n" + "}";
    }

}
