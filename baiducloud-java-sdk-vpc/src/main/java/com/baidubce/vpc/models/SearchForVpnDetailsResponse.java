package com.baidubce.vpc.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchForVpnDetailsResponse extends BaseBceResponse {
    /**
     * VPN的ID
     */
    private String vpnId;

    /**
     * 名称
     */
    private String vpnName;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 描述
     */
    private String description;

    /**
     * VPN网关类型，值“IPSec”表示IPSec-VPN网关，值“SSL”表示SSL-VPN网关
     */
    private String type;

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
     * eip带宽
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
     * SSL-VPN最大客户端连接数
     */
    private Integer maxConnection;

    /**
     * VPN隧道列表
     */
    private List<VpnConn> vpnConns;

    /**
     * sslVpnServer
     */
    private SslVpnServer sslVpnServer;

    /**
     * VPN实例绑定的标签
     */
    private List<TagModel> tags;

    /**
     * 是否开启释放保护
     */
    private Boolean deleteProtect;

    public SearchForVpnDetailsResponse setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getVpnId() {
        return this.vpnId;
    }

    public SearchForVpnDetailsResponse setVpnName(String vpnName) {
        this.vpnName = vpnName;
        return this;
    }

    public String getVpnName() {
        return this.vpnName;
    }

    public SearchForVpnDetailsResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public SearchForVpnDetailsResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public SearchForVpnDetailsResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public SearchForVpnDetailsResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public SearchForVpnDetailsResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public SearchForVpnDetailsResponse setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public SearchForVpnDetailsResponse setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    public SearchForVpnDetailsResponse setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public SearchForVpnDetailsResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public SearchForVpnDetailsResponse setVpnConnNum(Integer vpnConnNum) {
        this.vpnConnNum = vpnConnNum;
        return this;
    }

    public Integer getVpnConnNum() {
        return this.vpnConnNum;
    }

    public SearchForVpnDetailsResponse setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }

    public Integer getMaxConnection() {
        return this.maxConnection;
    }

    public SearchForVpnDetailsResponse setVpnConns(List<VpnConn> vpnConns) {
        this.vpnConns = vpnConns;
        return this;
    }

    public List<VpnConn> getVpnConns() {
        return this.vpnConns;
    }

    public SearchForVpnDetailsResponse setSslVpnServer(SslVpnServer sslVpnServer) {
        this.sslVpnServer = sslVpnServer;
        return this;
    }

    public SslVpnServer getSslVpnServer() {
        return this.sslVpnServer;
    }

    public SearchForVpnDetailsResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    public SearchForVpnDetailsResponse setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

    public Boolean getDeleteProtect() {
        return this.deleteProtect;
    }

    @Override
    public String toString() {
        return "SearchForVpnDetailsResponse{" + "vpnId=" + vpnId + "\n" + "vpnName=" + vpnName + "\n" + "createTime=" + createTime + "\n" + "description=" + description + "\n"
                + "type=" + type + "\n" + "status=" + status + "\n" + "expiredTime=" + expiredTime + "\n" + "paymentTiming=" + paymentTiming + "\n" + "eip=" + eip + "\n"
                + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "vpcId=" + vpcId + "\n" + "vpnConnNum=" + vpnConnNum + "\n" + "maxConnection=" + maxConnection + "\n" + "vpnConns="
                + vpnConns + "\n" + "sslVpnServer=" + sslVpnServer + "\n" + "tags=" + tags + "\n" + "deleteProtect=" + deleteProtect + "\n" + "}";
    }

}