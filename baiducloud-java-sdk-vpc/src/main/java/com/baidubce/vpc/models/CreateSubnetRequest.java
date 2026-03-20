package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSubnetRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 子网名称，不能取值"default"，长度不超过65个字符，可由数字、字符、下划线组成
    */
    private String name;

    /**
    * 是否开启IPv6网段，true表示开启，默认false不开启
    */
    private Boolean enableIpv6;

    /**
    * 可用区名称，其查询方式参考[查询可用区列表](BCC/API参考/地域及可用区相关接口/查询可用区列表.md)
    */
    private String zoneName;

    /**
    * 子网cidr，需在所属VPC网段范围内
    */
    private String cidr;

    /**
    * 子网所属VPC的ID
    */
    private String vpcId;

    /**
    * 子网所属VPC的辅助网段的cidr
    */
    private String vpcSecondaryCidr;

    /**
    * 子网类型，BCC、BBC
    */
    private String subnetType;

    /**
    * 描述，不超过200字符
    */
    private String description;

    /**
    * 待创建的标签键值对列表
    */
    private List<TagModel> tags;

    public String getClientToken() {
        return clientToken;
    }

    public CreateSubnetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateSubnetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnableIpv6() {
        return enableIpv6;
    }

    public CreateSubnetRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateSubnetRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getCidr() {
        return cidr;
    }

    public CreateSubnetRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateSubnetRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcSecondaryCidr() {
        return vpcSecondaryCidr;
    }

    public CreateSubnetRequest setVpcSecondaryCidr(String vpcSecondaryCidr) {
        this.vpcSecondaryCidr = vpcSecondaryCidr;
        return this;
    }

    public String getSubnetType() {
        return subnetType;
    }

    public CreateSubnetRequest setSubnetType(String subnetType) {
        this.subnetType = subnetType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateSubnetRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateSubnetRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
