package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEipBpRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 带宽包名称，不填将自动生成
    */
    private String name;

    /**
    * 带宽包绑定的弹性公网EIP的Ip地址
    */
    private String eip;

    /**
    * 带宽包绑定的共享带宽id
    */
    private String eipGroupId;

    /**
    * 带宽包的公网带宽
    */
    private Integer bandwidthInMbps;

    /**
    * 带宽包的类型，包括BandwidthPackage（带宽包）和AccelerationPackage（跨境加速包），其中跨境加速包仅支持中国香港区域，默认为BandwidthPackage
    */
    private String type;

    /**
    * 带宽包自动释放时间，时间格式要求符合UTC格式（格式形如：”2019-08-03T20:38:43Z”）
    */
    private String autoReleaseTime;

    /**
    * 待创建的标签键值对列表。
    */
    private List<TagModel> tags;

    /**
    * 创建带宽包的同时绑定的资源分组的ID
    */
    private String resourceGroupId;

    public String getClientToken() {
        return clientToken;
    }

    public CreateEipBpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateEipBpRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getEip() {
        return eip;
    }

    public CreateEipBpRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEipGroupId() {
        return eipGroupId;
    }

    public CreateEipBpRequest setEipGroupId(String eipGroupId) {
        this.eipGroupId = eipGroupId;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public CreateEipBpRequest setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateEipBpRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getAutoReleaseTime() {
        return autoReleaseTime;
    }

    public CreateEipBpRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateEipBpRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateEipBpRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

}
