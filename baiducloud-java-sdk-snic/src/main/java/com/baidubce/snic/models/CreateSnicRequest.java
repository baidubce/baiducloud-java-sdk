package com.baidubce.snic.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSnicRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 所属vpc的id
    */
    private String vpcId;

    /**
    * 服务网卡的名称，大小写字母、数字以及-_/.特殊字符、中文，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 所在子网的id
    */
    private String subnetId;

    /**
    * 挂载的服务域名
    */
    private String service;

    /**
    * 服务网卡描述
    */
    private String description;

    /**
    * 指定服务网卡ip地址,不传自动分配ip地址
    */
    private String ipAddress;

    /**
    * 指定服务网卡带宽
    */
    private Integer bandwidth;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 标签
    */
    private List<TagModel> tags;

    /**
    * 资源组
    */
    private String resourceGroupId;

    public String getClientToken() {
        return clientToken;
    }

    public CreateSnicRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateSnicRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateSnicRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateSnicRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getService() {
        return service;
    }

    public CreateSnicRequest setService(String service) {
        this.service = service;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateSnicRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public CreateSnicRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public CreateSnicRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateSnicRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateSnicRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateSnicRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

}
