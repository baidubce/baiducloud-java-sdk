package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeerConn {
    /**
     * 对等连接的ID
     */
    private String peerConnId;

    /**
     * 对等连接角色 initiator发起端 acceptor接收端
     */
    private String role;

    /**
     * status
     */
    private PeerConnStatus status;

    /**
     * 对等连接的带宽
     */
    private String bandwidthInMbps;

    /**
     * 对等连接备注
     */
    private String description;

    /**
     * 对等连接本端接口ID
     */
    private String localIfId;

    /**
     * 对等连接本端接口名称
     */
    private String localIfName;

    /**
     * 对等连接本端VPC的ID
     */
    private String localVpcId;

    /**
     * 对等连接本端区域
     */
    private String localRegion;

    /**
     * 对等连接对端VPC的ID
     */
    private String peerVpcId;

    /**
     * 对等连接对端区域
     */
    private String peerRegion;

    /**
     * 对等连接对端的账户ID
     */
    private String peerAccountId;

    /**
     * 对等连接的付费类型
     */
    private String paymentTiming;

    /**
     * dnsStatus
     */
    private DnsStatus dnsStatus;

    /**
     * 对等连接的创建时间
     */
    private String createdTime;

    /**
     * 过期时间，只有预付费产品此参数才有值
     */
    private String expiredTime;

    public PeerConn setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getPeerConnId() {
        return this.peerConnId;
    }

    public PeerConn setRole(String role) {
        this.role = role;
        return this;
    }

    public String getRole() {
        return this.role;
    }

    public PeerConn setStatus(PeerConnStatus status) {
        this.status = status;
        return this;
    }

    public PeerConnStatus getStatus() {
        return this.status;
    }

    public PeerConn setBandwidthInMbps(String bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public String getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    public PeerConn setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public PeerConn setLocalIfId(String localIfId) {
        this.localIfId = localIfId;
        return this;
    }

    public String getLocalIfId() {
        return this.localIfId;
    }

    public PeerConn setLocalIfName(String localIfName) {
        this.localIfName = localIfName;
        return this;
    }

    public String getLocalIfName() {
        return this.localIfName;
    }

    public PeerConn setLocalVpcId(String localVpcId) {
        this.localVpcId = localVpcId;
        return this;
    }

    public String getLocalVpcId() {
        return this.localVpcId;
    }

    public PeerConn setLocalRegion(String localRegion) {
        this.localRegion = localRegion;
        return this;
    }

    public String getLocalRegion() {
        return this.localRegion;
    }

    public PeerConn setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }

    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    public PeerConn setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    public String getPeerRegion() {
        return this.peerRegion;
    }

    public PeerConn setPeerAccountId(String peerAccountId) {
        this.peerAccountId = peerAccountId;
        return this;
    }

    public String getPeerAccountId() {
        return this.peerAccountId;
    }

    public PeerConn setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public String getPaymentTiming() {
        return this.paymentTiming;
    }

    public PeerConn setDnsStatus(DnsStatus dnsStatus) {
        this.dnsStatus = dnsStatus;
        return this;
    }

    public DnsStatus getDnsStatus() {
        return this.dnsStatus;
    }

    public PeerConn setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public PeerConn setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    @Override
    public String toString() {
        return "PeerConn{" + "peerConnId=" + peerConnId + "\n" + "role=" + role + "\n" + "status=" + status + "\n" + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "description="
                + description + "\n" + "localIfId=" + localIfId + "\n" + "localIfName=" + localIfName + "\n" + "localVpcId=" + localVpcId + "\n" + "localRegion=" + localRegion
                + "\n" + "peerVpcId=" + peerVpcId + "\n" + "peerRegion=" + peerRegion + "\n" + "peerAccountId=" + peerAccountId + "\n" + "paymentTiming=" + paymentTiming + "\n"
                + "dnsStatus=" + dnsStatus + "\n" + "createdTime=" + createdTime + "\n" + "expiredTime=" + expiredTime + "\n" + "}";
    }

}