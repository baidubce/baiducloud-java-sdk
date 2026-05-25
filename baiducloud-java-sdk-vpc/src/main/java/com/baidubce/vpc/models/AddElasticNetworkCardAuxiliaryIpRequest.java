package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddElasticNetworkCardAuxiliaryIpRequest extends BaseBceRequest {

    /**
    * eniId
    */
    @JsonIgnore
    private String eniId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 是否IPv6地址，true表示分配IPv6地址，默认false分配IPv4地址
    */
    private Boolean isIpv6;

    /**
    * 新增的内网IP地址
    */
    private String privateIpAddress;

    public String getEniId() {
        return eniId;
    }

    public AddElasticNetworkCardAuxiliaryIpRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddElasticNetworkCardAuxiliaryIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Boolean getIsIpv6() {
        return isIpv6;
    }

    public AddElasticNetworkCardAuxiliaryIpRequest setIsIpv6(Boolean isIpv6) {
        this.isIpv6 = isIpv6;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public AddElasticNetworkCardAuxiliaryIpRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

}
