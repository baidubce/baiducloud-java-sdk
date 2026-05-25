package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAnIpv6GatewayRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * vpc的ID
    */
    private String vpcId;

    /**
    * IPv6网关的名称
    */
    private String name;

    /**
    * IPv6网关的带宽上限
    */
    private Integer bandwidthInMbps;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 待创建的标签键值对列表。
    */
    private List<TagModel> tags;

    /**
    * 资源组
    */
    private String resourceGroupId;

    /**
    * 是否开启释放保护。缺省值为false，代表允许删除
    */
    private Boolean deleteProtect;

    public String getClientToken() {
        return clientToken;
    }

    public CreateAnIpv6GatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateAnIpv6GatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAnIpv6GatewayRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public CreateAnIpv6GatewayRequest setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateAnIpv6GatewayRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateAnIpv6GatewayRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateAnIpv6GatewayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public CreateAnIpv6GatewayRequest setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

}
