package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchAddEniIpResponse extends BaseBceResponse {

    /**
    * 添加的弹性网卡的内网IP地址
    */
    private List<String> privateIpAddresses;

    public List<String> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    public BatchAddEniIpResponse setPrivateIpAddresses(List<String> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }

    @Override
    public String toString() {
        return "BatchAddEniIpResponse{" + "privateIpAddresses=" + privateIpAddresses + "\n" + "}";
    }

}
