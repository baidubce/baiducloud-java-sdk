package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VpnConn {
    /**
     * VPN的ID
     */
    private String vpnId;

    /**
     * 隧道的ID
     */
    private String vpnConnId;

    /**
     * 隧道的名称
     */
    private String vpnConnName;

    /**
     * 本地IP
     */
    private String localIp;

    /**
     * 共享秘钥
     */
    private String secretKey;

    /**
     * 本端网络CIDR列表
     */
    private List<String> localSubnets;

    /**
     * 对端VPN网关公网IP
     */
    private String remoteIp;

    /**
     * 对端网络CIDR列表
     */
    private List<String> remoteSubnets;

    /**
     * 用户网关ID
     */
    private String cgwId;

    /**
     * 描述
     */
    private String description;

    /**
     * VPN隧道的状态
     */
    private String status;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 联通状态
     */
    private String healthStatus;

    /**
     * ikeConfig
     */
    private IkeConfig ikeConfig;

    /**
     * ipsecConfig
     */
    private IpsecConfig ipsecConfig;

    public VpnConn setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getVpnId() {
        return this.vpnId;
    }

    public VpnConn setVpnConnId(String vpnConnId) {
        this.vpnConnId = vpnConnId;
        return this;
    }

    public String getVpnConnId() {
        return this.vpnConnId;
    }

    public VpnConn setVpnConnName(String vpnConnName) {
        this.vpnConnName = vpnConnName;
        return this;
    }

    public String getVpnConnName() {
        return this.vpnConnName;
    }

    public VpnConn setLocalIp(String localIp) {
        this.localIp = localIp;
        return this;
    }

    public String getLocalIp() {
        return this.localIp;
    }

    public VpnConn setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public VpnConn setLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
        return this;
    }

    public List<String> getLocalSubnets() {
        return this.localSubnets;
    }

    public VpnConn setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }

    public String getRemoteIp() {
        return this.remoteIp;
    }

    public VpnConn setRemoteSubnets(List<String> remoteSubnets) {
        this.remoteSubnets = remoteSubnets;
        return this;
    }

    public List<String> getRemoteSubnets() {
        return this.remoteSubnets;
    }

    public VpnConn setCgwId(String cgwId) {
        this.cgwId = cgwId;
        return this;
    }

    public String getCgwId() {
        return this.cgwId;
    }

    public VpnConn setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public VpnConn setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public VpnConn setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public VpnConn setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    public String getHealthStatus() {
        return this.healthStatus;
    }

    public VpnConn setIkeConfig(IkeConfig ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }

    public IkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    public VpnConn setIpsecConfig(IpsecConfig ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }

    public IpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    @Override
    public String toString() {
        return "VpnConn{" + "vpnId=" + vpnId + "\n" + "vpnConnId=" + vpnConnId + "\n" + "vpnConnName=" + vpnConnName + "\n" + "localIp=" + localIp + "\n" + "secretKey="
                + secretKey + "\n" + "localSubnets=" + localSubnets + "\n" + "remoteIp=" + remoteIp + "\n" + "remoteSubnets=" + remoteSubnets + "\n" + "cgwId=" + cgwId + "\n"
                + "description=" + description + "\n" + "status=" + status + "\n" + "createdTime=" + createdTime + "\n" + "healthStatus=" + healthStatus + "\n" + "ikeConfig="
                + ikeConfig + "\n" + "ipsecConfig=" + ipsecConfig + "\n" + "}";
    }

}