package com.baidubce.snic.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeSnicResponse extends BaseBceResponse {

    /**
    * 服务网卡的id
    */
    private String endpointId;

    /**
    * 服务网卡的名称
    */
    private String name;

    /**
    * 服务网卡ip
    */
    private String ipAddress;

    /**
    * 服务网卡状态，取值：available/dead，分别表示：可挂载/不可挂载
    */
    private String status;

    /**
    * 服务唯一域名
    */
    private String service;

    /**
    * 子网id
    */
    private String subnetId;

    /**
    * 描述
    */
    private String description;

    /**
    * 创建时间
    */
    private String createTime;

    /**
    * 付费类型
    */
    private String productType;

    /**
    * vpc的id
    */
    private String vpcId;

    /**
    * 标签
    */
    private List<TagModel> tags;

    public String getEndpointId() {
        return endpointId;
    }

    public DescribeSnicResponse setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeSnicResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public DescribeSnicResponse setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DescribeSnicResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getService() {
        return service;
    }

    public DescribeSnicResponse setService(String service) {
        this.service = service;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public DescribeSnicResponse setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DescribeSnicResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DescribeSnicResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getProductType() {
        return productType;
    }

    public DescribeSnicResponse setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public DescribeSnicResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public DescribeSnicResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeSnicResponse{" + "endpointId=" + endpointId + "\n" + "name=" + name + "\n" + "ipAddress=" + ipAddress + "\n" + "status=" + status + "\n" + "service="
                + service + "\n" + "subnetId=" + subnetId + "\n" + "description=" + description + "\n" + "createTime=" + createTime + "\n" + "productType=" + productType + "\n"
                + "vpcId=" + vpcId + "\n" + "tags=" + tags + "\n" + "}";
    }

}
