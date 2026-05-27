package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIpv6GatewayResponse extends BaseBceResponse {

    /**
    * IPv6网关的ID
    */
    private String gatewayId;

    public String getGatewayId() {
        return gatewayId;
    }

    public CreateIpv6GatewayResponse setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateIpv6GatewayResponse{" + "gatewayId=" + gatewayId + "\n" + "}";
    }

}
