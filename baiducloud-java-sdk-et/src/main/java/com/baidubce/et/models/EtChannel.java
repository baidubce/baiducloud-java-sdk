package com.baidubce.et.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtChannel {
    /**
     * 专线通道ID
     */
    private String id;

    /**
     * 通道名称
     */
    private String name;

    /**
     * 通道状态，取值范围：ack-wait/accept/closed/pay-wait/reject/building/established，分别对应：申请中/申请已受理/已到期/待缴费/申请被拒绝/建设中/可用
     */
    private String status;

    /**
     * IPv4 BGP状态，取值范围：up/down
     */
    private String bgpStatus;

    /**
     * BGP路由条目上限
     */
    private Integer bgpRouteLimit;

    /**
     * IPv6 BGP状态，取值范围：up/down
     */
    private String ipv6BgpStatus;

    /**
     * 云端网络互联IP
     */
    private String baiduAddress;

    /**
     * 分配对象
     */
    private List<String> authorizedUsers;

    /**
     * 描述
     */
    private String description;

    /**
     * 路由参数
     */
    private List<String> networks;

    /**
     * IDC互联IP
     */
    private String customerAddress;

    /**
     * 路由协议
     */
    private String routeType;

    /**
     * VLAN ID，取值范围：0, 2-4009
     */
    private Integer vlanId;

    /**
     * IPv6功能是否开启，1是0否
     */
    private Integer enableIpv6;

    /**
     * 云端网络侧IPv6互联地址
     */
    private String baiduIpv6Address;

    /**
     * IDC侧IPv6互联地址
     */
    private String customerIpv6Address;

    /**
     * IPv6路由参数
     */
    private List<String> ipv6Networks;

    /**
     * 报文发送间隔
     */
    private Integer sendInterval;

    /**
     * 报文接收间隔
     */
    private Integer receivInterval;

    /**
     * 检测时间倍数
     */
    private Integer detectMultiplier;

    /**
     * 专线通道绑定的标签列表
     */
    private List<TagModel> tags;

    public EtChannel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public EtChannel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EtChannel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public EtChannel setBgpStatus(String bgpStatus) {
        this.bgpStatus = bgpStatus;
        return this;
    }

    public String getBgpStatus() {
        return this.bgpStatus;
    }

    public EtChannel setBgpRouteLimit(Integer bgpRouteLimit) {
        this.bgpRouteLimit = bgpRouteLimit;
        return this;
    }

    public Integer getBgpRouteLimit() {
        return this.bgpRouteLimit;
    }

    public EtChannel setIpv6BgpStatus(String ipv6BgpStatus) {
        this.ipv6BgpStatus = ipv6BgpStatus;
        return this;
    }

    public String getIpv6BgpStatus() {
        return this.ipv6BgpStatus;
    }

    public EtChannel setBaiduAddress(String baiduAddress) {
        this.baiduAddress = baiduAddress;
        return this;
    }

    public String getBaiduAddress() {
        return this.baiduAddress;
    }

    public EtChannel setAuthorizedUsers(List<String> authorizedUsers) {
        this.authorizedUsers = authorizedUsers;
        return this;
    }

    public List<String> getAuthorizedUsers() {
        return this.authorizedUsers;
    }

    public EtChannel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public EtChannel setNetworks(List<String> networks) {
        this.networks = networks;
        return this;
    }

    public List<String> getNetworks() {
        return this.networks;
    }

    public EtChannel setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    public EtChannel setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public String getRouteType() {
        return this.routeType;
    }

    public EtChannel setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    public Integer getVlanId() {
        return this.vlanId;
    }

    public EtChannel setEnableIpv6(Integer enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    public Integer getEnableIpv6() {
        return this.enableIpv6;
    }

    public EtChannel setBaiduIpv6Address(String baiduIpv6Address) {
        this.baiduIpv6Address = baiduIpv6Address;
        return this;
    }

    public String getBaiduIpv6Address() {
        return this.baiduIpv6Address;
    }

    public EtChannel setCustomerIpv6Address(String customerIpv6Address) {
        this.customerIpv6Address = customerIpv6Address;
        return this;
    }

    public String getCustomerIpv6Address() {
        return this.customerIpv6Address;
    }

    public EtChannel setIpv6Networks(List<String> ipv6Networks) {
        this.ipv6Networks = ipv6Networks;
        return this;
    }

    public List<String> getIpv6Networks() {
        return this.ipv6Networks;
    }

    public EtChannel setSendInterval(Integer sendInterval) {
        this.sendInterval = sendInterval;
        return this;
    }

    public Integer getSendInterval() {
        return this.sendInterval;
    }

    public EtChannel setReceivInterval(Integer receivInterval) {
        this.receivInterval = receivInterval;
        return this;
    }

    public Integer getReceivInterval() {
        return this.receivInterval;
    }

    public EtChannel setDetectMultiplier(Integer detectMultiplier) {
        this.detectMultiplier = detectMultiplier;
        return this;
    }

    public Integer getDetectMultiplier() {
        return this.detectMultiplier;
    }

    public EtChannel setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "EtChannel{" + "id=" + id + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "bgpStatus=" + bgpStatus + "\n" + "bgpRouteLimit=" + bgpRouteLimit + "\n"
                + "ipv6BgpStatus=" + ipv6BgpStatus + "\n" + "baiduAddress=" + baiduAddress + "\n" + "authorizedUsers=" + authorizedUsers + "\n" + "description=" + description
                + "\n" + "networks=" + networks + "\n" + "customerAddress=" + customerAddress + "\n" + "routeType=" + routeType + "\n" + "vlanId=" + vlanId + "\n" + "enableIpv6="
                + enableIpv6 + "\n" + "baiduIpv6Address=" + baiduIpv6Address + "\n" + "customerIpv6Address=" + customerIpv6Address + "\n" + "ipv6Networks=" + ipv6Networks + "\n"
                + "sendInterval=" + sendInterval + "\n" + "receivInterval=" + receivInterval + "\n" + "detectMultiplier=" + detectMultiplier + "\n" + "tags=" + tags + "\n" + "}";
    }

}