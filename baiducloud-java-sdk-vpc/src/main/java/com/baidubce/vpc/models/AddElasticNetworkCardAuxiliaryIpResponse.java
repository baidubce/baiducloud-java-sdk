package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddElasticNetworkCardAuxiliaryIpResponse extends BaseBceResponse {

    /**
    * 添加的弹性网卡的内网IP地址
    */
    private String privateIpAddress;

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public AddElasticNetworkCardAuxiliaryIpResponse setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    @Override
    public String toString() {
        return "AddElasticNetworkCardAuxiliaryIpResponse{" + "privateIpAddress=" + privateIpAddress + "\n" + "}";
    }

}
