package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSubnetRequest extends BaseBceRequest {

    /**
    * subnetId
    */
    @JsonIgnore
    private String subnetId;

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
    * 描述，不超过200字符
    */
    private String description;

    /**
    * 是否开启IPv6网段，true表示开启，false表示不开启
    */
    private Boolean enableIpv6;

    public String getSubnetId() {
        return subnetId;
    }

    public UpdateSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateSubnetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateSubnetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateSubnetRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnableIpv6() {
        return enableIpv6;
    }

    public UpdateSubnetRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

}
