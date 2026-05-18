package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEipGroupRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 线路类型，包含标准BGP（BGP）和增强BGP（BGP_S），默认标准BGP。
    */
    private String routeType;

    /**
    * 共享带宽中IPv4 EIP的个数。公网IPv4数量最少为0个，最多可以包括n个（标准型BGP n\*1Mbps小于共享带宽包总量，增强型BGP n\*20Mbps小于共享带宽包总量）
    */
    private Integer eipCount;

    /**
    * 共享带宽中IPv6 EIP的个数。公网IPv6数量最少为0个，最多受配额控制，默认是256个。
    */
    private Integer eipv6Count;

    /**
    * 公网带宽，单位为Mbps。对于prepay类型的EIP Group，标准型BGP限制为20~500之间的整数，增强型BGP限制为100~5000之间的整数
    */
    private Integer bandwidthInMbps;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 长度1~65个字节，字母开头，可包含字母数字-\_/.字符。若不传该参数，服务会自动生成name
    */
    private String name;

    /**
    * 待创建的标签键值对列表。
    */
    private List<TagModel> tags;

    /**
    * 创建共享带宽的同时绑定的资源分组的ID
    */
    private String resourceGroupId;

    public String getClientToken() {
        return clientToken;
    }

    public CreateEipGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRouteType() {
        return routeType;
    }

    public CreateEipGroupRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public Integer getEipCount() {
        return eipCount;
    }

    public CreateEipGroupRequest setEipCount(Integer eipCount) {
        this.eipCount = eipCount;
        return this;
    }

    public Integer getEipv6Count() {
        return eipv6Count;
    }

    public CreateEipGroupRequest setEipv6Count(Integer eipv6Count) {
        this.eipv6Count = eipv6Count;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public CreateEipGroupRequest setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateEipGroupRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateEipGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateEipGroupRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateEipGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

}
