package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vpn {
    /**
     * VPN的ID
     */
    private String vpnId;

    /**
     * 名称
     */
    private String vpnName;

    /**
     * 网关类型，取值[IPSec, SSL]
     */
    private String type;

    /**
     * 描述
     */
    private String description;

    /**
     * vpn状态，active：可用，building：创建中，unconfigured：未配置
     */
    private String status;

    /**
     * 到期时间
     */
    private String expiredTime;

    /**
     * 计费类型
     */
    private String paymentTiming;

    /**
     * 公网IP
     */
    private String eip;

    /**
     * SSL-VPN最大客户端连接数
     */
    private Integer maxConnection;

    /**
     * EIP带宽
     */
    private Integer bandwidthInMbps;

    /**
     * VPC的ID
     */
    private String vpcId;

    /**
     * 隧道数量
     */
    private Integer vpnConnNum;

    /**
     * VPN隧道列表
     */
    private List<VpnConn> vpnConns;

    /**
     * sslVpnServer
     */
    private SslVpnServer sslVpnServer;

    /**
     * 是否开启释放保护
     */
    private Boolean deleteProtect;

    /**
     * VPN绑定的标签集合
     */
    private List<TagModel> tags;

    /**
     * 创建时间
     */
    private String createTime;

    public Vpn setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getVpnId() {
        return this.vpnId;
    }

    public Vpn setVpnName(String vpnName) {
        this.vpnName = vpnName;
        return this;
    }

    public String getVpnName() {
        return this.vpnName;
    }

    public Vpn setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Vpn setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Vpn setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Vpn setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public Vpn setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public Vpn setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    public Vpn setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }

    public Integer getMaxConnection() {
        return this.maxConnection;
    }

    public Vpn setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public Vpn setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Vpn setVpnConnNum(Integer vpnConnNum) {
        this.vpnConnNum = vpnConnNum;
        return this;
    }

    public Integer getVpnConnNum() {
        return this.vpnConnNum;
    }

    public Vpn setVpnConns(List<VpnConn> vpnConns) {
        this.vpnConns = vpnConns;
        return this;
    }

    public List<VpnConn> getVpnConns() {
        return this.vpnConns;
    }

    public Vpn setSslVpnServer(SslVpnServer sslVpnServer) {
        this.sslVpnServer = sslVpnServer;
        return this;
    }

    public SslVpnServer getSslVpnServer() {
        return this.sslVpnServer;
    }

    public Vpn setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

    public Boolean getDeleteProtect() {
        return this.deleteProtect;
    }

    public Vpn setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    public Vpn setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    @Override
    public String toString() {
        return "Vpn{" + "vpnId=" + vpnId + "\n" + "vpnName=" + vpnName + "\n" + "type=" + type + "\n" + "description=" + description + "\n" + "status=" + status + "\n"
                + "expiredTime=" + expiredTime + "\n" + "paymentTiming=" + paymentTiming + "\n" + "eip=" + eip + "\n" + "maxConnection=" + maxConnection + "\n"
                + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "vpcId=" + vpcId + "\n" + "vpnConnNum=" + vpnConnNum + "\n" + "vpnConns=" + vpnConns + "\n" + "sslVpnServer="
                + sslVpnServer + "\n" + "deleteProtect=" + deleteProtect + "\n" + "tags=" + tags + "\n" + "createTime=" + createTime + "\n" + "}";
    }

}