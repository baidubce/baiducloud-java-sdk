package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDedicatedGatewayRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 专线网关的名称，由大小写字母、数字以及-_ /.特殊字符组成，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 专线网关所属VPC的ID
    */
    private String vpcId;

    /**
    * 专线网关带宽的限速值，单位为Mbps。限制为为2~10000之间的整数
    */
    private Integer speed;

    /**
    * 专线网关的描述，不超过200字符
    */
    private String description;

    /**
    * 绑定的物理专线的ID，etid和channelId必须同时存在
    */
    private String etId;

    /**
    * 绑定的专线通道的ID，etid和channelId必须同时存在
    */
    private String channelId;

    /**
    * 专线网关的云端网络，用户可以选本vpc网段或自定义一个或多个网段，仅当参数etId和channelId存在时可以设置
    */
    private List<String> localCidrs;

    /**
    * 待创建的标签键值对列表
    */
    private List<TagModel> tags;

    /**
    * 资源组
    */
    private String resourceGroupId;

    public String getClientToken() {
        return clientToken;
    }

    public CreateDedicatedGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateDedicatedGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateDedicatedGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public Integer getSpeed() {
        return speed;
    }

    public CreateDedicatedGatewayRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateDedicatedGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getEtId() {
        return etId;
    }

    public CreateDedicatedGatewayRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getChannelId() {
        return channelId;
    }

    public CreateDedicatedGatewayRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public List<String> getLocalCidrs() {
        return localCidrs;
    }

    public CreateDedicatedGatewayRequest setLocalCidrs(List<String> localCidrs) {
        this.localCidrs = localCidrs;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateDedicatedGatewayRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateDedicatedGatewayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

}
