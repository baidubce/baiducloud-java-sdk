package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPeerConnResponse extends BaseBceResponse {

    /**
    * 对等连接的ID
    */
    private String peerConnId;

    /**
    * \"initiator\"表示发起端\"acceptor\"表示接受端
    */
    private String role;

    /**
    * 对等连接的状态
    */
    private String status;

    /**
    * 对等连接的带宽
    */
    private Integer bandwidthInMbps;

    /**
    * 对等对等连接的备注
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
    * 对等连接对端账户ID
    */
    private String peerAccountId;

    /**
    * 对等连接的创建时间
    */
    private String createdTime;

    /**
    * 对等连接过期时间，后付费该值为空
    */
    private String expiredTime;

    /**
    * 对等连接同步dns的状态
    */
    private String dnsStatus;

    /**
    * 对等连接的计费类型 \"Prepaid\"为预付费 \"Postpaid\"为后付费
    */
    private String paymentTiming;

    /**
    * 对等连接绑定的标签列表
    */
    private List<TagModel> tags;

    /**
    * 是否开启释放保护
    */
    private Boolean deleteProtect;

    public String getPeerConnId() {
        return peerConnId;
    }

    public GetPeerConnResponse setPeerConnId(String peerConnId) {
        this.peerConnId = peerConnId;
        return this;
    }

    public String getRole() {
        return role;
    }

    public GetPeerConnResponse setRole(String role) {
        this.role = role;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetPeerConnResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public GetPeerConnResponse setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetPeerConnResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLocalIfId() {
        return localIfId;
    }

    public GetPeerConnResponse setLocalIfId(String localIfId) {
        this.localIfId = localIfId;
        return this;
    }

    public String getLocalIfName() {
        return localIfName;
    }

    public GetPeerConnResponse setLocalIfName(String localIfName) {
        this.localIfName = localIfName;
        return this;
    }

    public String getLocalVpcId() {
        return localVpcId;
    }

    public GetPeerConnResponse setLocalVpcId(String localVpcId) {
        this.localVpcId = localVpcId;
        return this;
    }

    public String getLocalRegion() {
        return localRegion;
    }

    public GetPeerConnResponse setLocalRegion(String localRegion) {
        this.localRegion = localRegion;
        return this;
    }

    public String getPeerVpcId() {
        return peerVpcId;
    }

    public GetPeerConnResponse setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }

    public String getPeerRegion() {
        return peerRegion;
    }

    public GetPeerConnResponse setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    public String getPeerAccountId() {
        return peerAccountId;
    }

    public GetPeerConnResponse setPeerAccountId(String peerAccountId) {
        this.peerAccountId = peerAccountId;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public GetPeerConnResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public GetPeerConnResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getDnsStatus() {
        return dnsStatus;
    }

    public GetPeerConnResponse setDnsStatus(String dnsStatus) {
        this.dnsStatus = dnsStatus;
        return this;
    }

    public String getPaymentTiming() {
        return paymentTiming;
    }

    public GetPeerConnResponse setPaymentTiming(String paymentTiming) {
        this.paymentTiming = paymentTiming;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public GetPeerConnResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public GetPeerConnResponse setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

    @Override
    public String toString() {
        return "GetPeerConnResponse{" + "peerConnId=" + peerConnId + "\n" + "role=" + role + "\n" + "status=" + status + "\n" + "bandwidthInMbps=" + bandwidthInMbps + "\n"
                + "description=" + description + "\n" + "localIfId=" + localIfId + "\n" + "localIfName=" + localIfName + "\n" + "localVpcId=" + localVpcId + "\n" + "localRegion="
                + localRegion + "\n" + "peerVpcId=" + peerVpcId + "\n" + "peerRegion=" + peerRegion + "\n" + "peerAccountId=" + peerAccountId + "\n" + "createdTime=" + createdTime
                + "\n" + "expiredTime=" + expiredTime + "\n" + "dnsStatus=" + dnsStatus + "\n" + "paymentTiming=" + paymentTiming + "\n" + "tags=" + tags + "\n" + "deleteProtect="
                + deleteProtect + "\n" + "}";
    }

}
