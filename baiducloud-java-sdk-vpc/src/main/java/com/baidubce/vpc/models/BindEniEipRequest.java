package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindEniEipRequest extends BaseBceRequest {

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

    public BindEniEipRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BindEniEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public BindEniEipRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public BindEniEipRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

}
