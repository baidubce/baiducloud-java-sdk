package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddIpv6Response extends BaseBceResponse {

    /**
    * 主网卡全量的ipv6
    */
    private String ipv6Address;

    public String getIpv6Address() {
        return ipv6Address;
    }

    public AddIpv6Response setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    @Override
    public String toString() {
        return "AddIpv6Response{" + "ipv6Address=" + ipv6Address + "\n" + "}";
    }

}
