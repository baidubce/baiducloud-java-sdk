package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDedicatedChannelRequest extends BaseBceRequest {

    /**
    * etId
    */
    @JsonIgnore
    private String etId;

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
    * 路由参数，仅当“routeType”为“static-route”时需要
    */
    private List<String> networks;

    /**
    * IDC互联IP
    */
    private String customerAddress;

    /**
    * 路由协议，当前支持”static-route“（静态）和”bgp“（动态）
    */
    private String routeType;

    /**
    * VLAN ID，取值范围：0, 2-4009
    */
    private Integer vlanId;

    /**
    * BGP ASN，有效范围：1-4294967295，百度智能云ASN:45085；仅当“routeType”为“bgp”时需要
    */
    private String bgpAsn;

    /**
    * BGP 密钥，仅当“routeType”为“bgp”时需要
    */
    private String bgpKey;

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

    /**
    * 待创建的标签键值对列表
    */
    private List<TagModel> tags;

    public String getEtId() {
        return etId;
    }

    public CreateDedicatedChannelRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateDedicatedChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getAuthorizedUsers() {
        return authorizedUsers;
    }

    public CreateDedicatedChannelRequest setAuthorizedUsers(List<String> authorizedUsers) {
        this.authorizedUsers = authorizedUsers;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateDedicatedChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getBaiduAddress() {
        return baiduAddress;
    }

    public CreateDedicatedChannelRequest setBaiduAddress(String baiduAddress) {
        this.baiduAddress = baiduAddress;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateDedicatedChannelRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getNetworks() {
        return networks;
    }

    public CreateDedicatedChannelRequest setNetworks(List<String> networks) {
        this.networks = networks;
        return this;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public CreateDedicatedChannelRequest setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public String getRouteType() {
        return routeType;
    }

    public CreateDedicatedChannelRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public Integer getVlanId() {
        return vlanId;
    }

    public CreateDedicatedChannelRequest setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    public String getBgpAsn() {
        return bgpAsn;
    }

    public CreateDedicatedChannelRequest setBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    public String getBgpKey() {
        return bgpKey;
    }

    public CreateDedicatedChannelRequest setBgpKey(String bgpKey) {
        this.bgpKey = bgpKey;
        return this;
    }

    public Integer getEnableIpv6() {
        return enableIpv6;
    }

    public CreateDedicatedChannelRequest setEnableIpv6(Integer enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    public String getBaiduIpv6Address() {
        return baiduIpv6Address;
    }

    public CreateDedicatedChannelRequest setBaiduIpv6Address(String baiduIpv6Address) {
        this.baiduIpv6Address = baiduIpv6Address;
        return this;
    }

    public String getCustomerIpv6Address() {
        return customerIpv6Address;
    }

    public CreateDedicatedChannelRequest setCustomerIpv6Address(String customerIpv6Address) {
        this.customerIpv6Address = customerIpv6Address;
        return this;
    }

    public List<String> getIpv6Networks() {
        return ipv6Networks;
    }

    public CreateDedicatedChannelRequest setIpv6Networks(List<String> ipv6Networks) {
        this.ipv6Networks = ipv6Networks;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateDedicatedChannelRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
