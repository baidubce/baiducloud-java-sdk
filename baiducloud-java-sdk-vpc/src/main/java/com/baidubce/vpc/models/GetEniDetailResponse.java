package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetEniDetailResponse extends BaseBceResponse {

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

    public GetEniDetailResponse setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetEniDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetEniDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public GetEniDetailResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public GetEniDetailResponse setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public GetEniDetailResponse setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetEniDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public GetEniDetailResponse setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public GetEniDetailResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<PrivateIP> getPrivateIpSet() {
        return privateIpSet;
    }

    public GetEniDetailResponse setPrivateIpSet(List<PrivateIP> privateIpSet) {
        this.privateIpSet = privateIpSet;
        return this;
    }

    public List<PrivateIP> getIpv6PrivateIpSet() {
        return ipv6PrivateIpSet;
    }

    public GetEniDetailResponse setIpv6PrivateIpSet(List<PrivateIP> ipv6PrivateIpSet) {
        this.ipv6PrivateIpSet = ipv6PrivateIpSet;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public GetEniDetailResponse setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public List<String> getEnterpriseSecurityGroupIds() {
        return enterpriseSecurityGroupIds;
    }

    public GetEniDetailResponse setEnterpriseSecurityGroupIds(List<String> enterpriseSecurityGroupIds) {
        this.enterpriseSecurityGroupIds = enterpriseSecurityGroupIds;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public GetEniDetailResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public GetEniDetailResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "GetEniDetailResponse{" + "eniId=" + eniId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "vpcId=" + vpcId + "\n" + "subnetId=" + subnetId
                + "\n" + "macAddress=" + macAddress + "\n" + "status=" + status + "\n" + "zoneName=" + zoneName + "\n" + "instanceId=" + instanceId + "\n" + "privateIpSet="
                + privateIpSet + "\n" + "ipv6PrivateIpSet=" + ipv6PrivateIpSet + "\n" + "securityGroupIds=" + securityGroupIds + "\n" + "enterpriseSecurityGroupIds="
                + enterpriseSecurityGroupIds + "\n" + "createdTime=" + createdTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}
