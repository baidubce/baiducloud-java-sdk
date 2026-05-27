package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateHaVipRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 高可用虚拟IP的名称，限制：大小写字母、数字、中文以及-_/.特殊字符，必须以字母或者中文开头，长度1-65
    */
    private String name;

    /**
    * 高可用虚拟IP所属的子网ID
    */
    private String subnetId;

    /**
    * 指定的IP地址，为""表示自动分配IP地址
    */
    private String privateIpAddress;

    /**
    * 高可用虚拟IP描述
    */
    private String description;

    public String getClientToken() {
        return clientToken;
    }

    public CreateHaVipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateHaVipRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateHaVipRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public CreateHaVipRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateHaVipRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
