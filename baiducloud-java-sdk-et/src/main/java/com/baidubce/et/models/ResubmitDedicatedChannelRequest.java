package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResubmitDedicatedChannelRequest extends BaseBceRequest {

    /**
    * etId
    */
    @JsonIgnore
    private String etId;

    /**
    * etChannelId
    */
    @JsonIgnore
    private String etChannelId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 分配对象
    */
    private List<String> authorizedUsers;

    /**
    * 描述
    */
    private String description;

    /**
    * 云端网络互联IP
    */
    private String baiduAddress;

    /**
    * 通道名称
    */
    private String name;

    /**
    * 路由参数
    */
    private List<String> networks;

    /**
    * IDC互联IP
    */
    private String customerAddress;

    /**
    * 路由协议，当前只支持static-route（静态）
    */
    private String routeType;

    /**
    * VLAN ID，取值范围：0, 2-4009
    */
    private Integer vlanId;

    /**
    * IPv6功能是否开启，1是0否，IPv6为白名单功能
    */
    private Integer enableIpv6;

    /**
    * 云端网络侧IPv6互联地址，enableIpv6=1时需要
    */
    private String baiduIpv6Address;

    /**
    * IDC侧IPv6互联地址，enableIpv6=1时需要
    */
    private String customerIpv6Address;

    /**
    * IPv6路由参数，当enableIpv6=1且“routeType”为“static-route”时需要
    */
    private List<String> ipv6Networks;

    public String getEtId() {
        return etId;
    }

    public ResubmitDedicatedChannelRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public ResubmitDedicatedChannelRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ResubmitDedicatedChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getAuthorizedUsers() {
        return authorizedUsers;
    }

    public ResubmitDedicatedChannelRequest setAuthorizedUsers(List<String> authorizedUsers) {
        this.authorizedUsers = authorizedUsers;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ResubmitDedicatedChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getBaiduAddress() {
        return baiduAddress;
    }

    public ResubmitDedicatedChannelRequest setBaiduAddress(String baiduAddress) {
        this.baiduAddress = baiduAddress;
        return this;
    }

    public String getName() {
        return name;
    }

    public ResubmitDedicatedChannelRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getNetworks() {
        return networks;
    }

    public ResubmitDedicatedChannelRequest setNetworks(List<String> networks) {
        this.networks = networks;
        return this;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public ResubmitDedicatedChannelRequest setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public String getRouteType() {
        return routeType;
    }

    public ResubmitDedicatedChannelRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public Integer getVlanId() {
        return vlanId;
    }

    public ResubmitDedicatedChannelRequest setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    public Integer getEnableIpv6() {
        return enableIpv6;
    }

    public ResubmitDedicatedChannelRequest setEnableIpv6(Integer enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    public String getBaiduIpv6Address() {
        return baiduIpv6Address;
    }

    public ResubmitDedicatedChannelRequest setBaiduIpv6Address(String baiduIpv6Address) {
        this.baiduIpv6Address = baiduIpv6Address;
        return this;
    }

    public String getCustomerIpv6Address() {
        return customerIpv6Address;
    }

    public ResubmitDedicatedChannelRequest setCustomerIpv6Address(String customerIpv6Address) {
        this.customerIpv6Address = customerIpv6Address;
        return this;
    }

    public List<String> getIpv6Networks() {
        return ipv6Networks;
    }

    public ResubmitDedicatedChannelRequest setIpv6Networks(List<String> ipv6Networks) {
        this.ipv6Networks = ipv6Networks;
        return this;
    }

}
