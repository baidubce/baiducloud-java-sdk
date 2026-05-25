package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElasticNetworkCardBindingEipRequest extends BaseBceRequest {

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
    * 弹性网卡的内网IP地址
    */
    private String privateIpAddress;

    /**
    * EIP的地址
    */
    private String publicIpAddress;

    public String getEniId() {
        return eniId;
    }

    public ElasticNetworkCardBindingEipRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ElasticNetworkCardBindingEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public ElasticNetworkCardBindingEipRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public ElasticNetworkCardBindingEipRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

}
