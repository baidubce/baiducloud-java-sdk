package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePeerConnRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 对等连接的带宽
    */
    private Integer bandwidthInMbps;

    /**
    * 对等连接的备注
    */
    private String description;

    /**
    * 本端接口名称
    */
    private String localIfName;

    /**
    * 本端VPC的ID
    */
    private String localVpcId;

    /**
    * 对端账户ID，只有在建立跨账号的对等连接时需要该字段
    */
    private String peerAccountId;

    /**
    * 对等连接对端VPC的ID
    */
    private String peerVpcId;

    /**
    * 对等连接的对端区域
    */
    private String peerRegion;

    /**
    * 对等连接对端接口名称，只有本账号的对等连接才允许设置该字段
    */
    private String peerIfName;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 待创建的标签键值对列表
    */
    private List<TagModel> tags;

    /**
    * 资源组ID
    */
    private String resourceGroupId;

    /**
    * 是否开启释放保护。缺省值为false，代表允许删除
    */
    private Boolean deleteProtect;

    public String getClientToken() {
        return clientToken;
    }

    public CreatePeerConnRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public CreatePeerConnRequest setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreatePeerConnRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLocalIfName() {
        return localIfName;
    }

    public CreatePeerConnRequest setLocalIfName(String localIfName) {
        this.localIfName = localIfName;
        return this;
    }

    public String getLocalVpcId() {
        return localVpcId;
    }

    public CreatePeerConnRequest setLocalVpcId(String localVpcId) {
        this.localVpcId = localVpcId;
        return this;
    }

    public String getPeerAccountId() {
        return peerAccountId;
    }

    public CreatePeerConnRequest setPeerAccountId(String peerAccountId) {
        this.peerAccountId = peerAccountId;
        return this;
    }

    public String getPeerVpcId() {
        return peerVpcId;
    }

    public CreatePeerConnRequest setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }

    public String getPeerRegion() {
        return peerRegion;
    }

    public CreatePeerConnRequest setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    public String getPeerIfName() {
        return peerIfName;
    }

    public CreatePeerConnRequest setPeerIfName(String peerIfName) {
        this.peerIfName = peerIfName;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreatePeerConnRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreatePeerConnRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreatePeerConnRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public CreatePeerConnRequest setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

}
