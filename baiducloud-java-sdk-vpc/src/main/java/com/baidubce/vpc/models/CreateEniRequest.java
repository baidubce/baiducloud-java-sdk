package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEniRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 弹性网卡的名称
    */
    private String name;

    /**
    * 弹性网卡所属的子网ID
    */
    private String subnetId;

    /**
    * 指定绑定的普通安全组集合
    */
    private List<String> securityGroupIds;

    /**
    * 指定绑定的企业安全组集合
    */
    private List<String> enterpriseSecurityGroupIds;

    /**
    * 指定的内网IPv4 IP信息
    */
    private List<PrivateIP> privateIpSet;

    /**
    * 指定的内网IPv6 IP信息
    */
    private List<PrivateIP> ipv6PrivateIpSet;

    /**
    * 弹性网卡描述
    */
    private String description;

    /**
    * 区分创建弹性RDMA网卡（ERI）和普通弹性网卡（ENI）
    */
    private String networkInterfaceTrafficMode;

    public String getClientToken() {
        return clientToken;
    }

    public CreateEniRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateEniRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateEniRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public CreateEniRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public List<String> getEnterpriseSecurityGroupIds() {
        return enterpriseSecurityGroupIds;
    }

    public CreateEniRequest setEnterpriseSecurityGroupIds(List<String> enterpriseSecurityGroupIds) {
        this.enterpriseSecurityGroupIds = enterpriseSecurityGroupIds;
        return this;
    }

    public List<PrivateIP> getPrivateIpSet() {
        return privateIpSet;
    }

    public CreateEniRequest setPrivateIpSet(List<PrivateIP> privateIpSet) {
        this.privateIpSet = privateIpSet;
        return this;
    }

    public List<PrivateIP> getIpv6PrivateIpSet() {
        return ipv6PrivateIpSet;
    }

    public CreateEniRequest setIpv6PrivateIpSet(List<PrivateIP> ipv6PrivateIpSet) {
        this.ipv6PrivateIpSet = ipv6PrivateIpSet;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateEniRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getNetworkInterfaceTrafficMode() {
        return networkInterfaceTrafficMode;
    }

    public CreateEniRequest setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
        this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
        return this;
    }

}
