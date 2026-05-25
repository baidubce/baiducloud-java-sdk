package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheSpecifiedElasticNetworkCardResponse extends BaseBceResponse {

    /**
    * 弹性网卡的ID
    */
    private String eniId;

    /**
    * 弹性网卡的名称
    */
    private String name;

    /**
    * 弹性网卡的描述
    */
    private String description;

    /**
    * 弹性网卡所属的VPC的ID
    */
    private String vpcId;

    /**
    * 弹性网卡所属子网的ID
    */
    private String subnetId;

    /**
    * 网卡的MAC地址
    */
    private String macAddress;

    /**
    * 弹性网卡的状态： <br>available：未挂载 <br>inuse：已挂载 <br>attaching：挂载中 <br>detaching：卸载中
    */
    private String status;

    /**
    * 弹性网卡所属的可用区
    */
    private String zoneName;

    /**
    * 弹性网卡挂载的虚机ID
    */
    private String instanceId;

    /**
    * 弹性网卡的IPv4 IP
    */
    private List<PrivateIP> privateIpSet;

    /**
    * 弹性网卡的IPv6 IP
    */
    private List<PrivateIP> ipv6PrivateIpSet;

    /**
    * 弹性网卡绑定的普通安全组ID列表
    */
    private List<String> securityGroupIds;

    /**
    * 弹性网卡绑定的企业安全组ID列表
    */
    private List<String> enterpriseSecurityGroupIds;

    /**
    * 创建时间
    */
    private String createdTime;

    /**
    * 标签
    */
    private List<TagModel> tags;

    public String getEniId() {
        return eniId;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<PrivateIP> getPrivateIpSet() {
        return privateIpSet;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setPrivateIpSet(List<PrivateIP> privateIpSet) {
        this.privateIpSet = privateIpSet;
        return this;
    }

    public List<PrivateIP> getIpv6PrivateIpSet() {
        return ipv6PrivateIpSet;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setIpv6PrivateIpSet(List<PrivateIP> ipv6PrivateIpSet) {
        this.ipv6PrivateIpSet = ipv6PrivateIpSet;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public List<String> getEnterpriseSecurityGroupIds() {
        return enterpriseSecurityGroupIds;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setEnterpriseSecurityGroupIds(List<String> enterpriseSecurityGroupIds) {
        this.enterpriseSecurityGroupIds = enterpriseSecurityGroupIds;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public QueryTheSpecifiedElasticNetworkCardResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheSpecifiedElasticNetworkCardResponse{" + "eniId=" + eniId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "vpcId=" + vpcId + "\n"
                + "subnetId=" + subnetId + "\n" + "macAddress=" + macAddress + "\n" + "status=" + status + "\n" + "zoneName=" + zoneName + "\n" + "instanceId=" + instanceId + "\n"
                + "privateIpSet=" + privateIpSet + "\n" + "ipv6PrivateIpSet=" + ipv6PrivateIpSet + "\n" + "securityGroupIds=" + securityGroupIds + "\n"
                + "enterpriseSecurityGroupIds=" + enterpriseSecurityGroupIds + "\n" + "createdTime=" + createdTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}
