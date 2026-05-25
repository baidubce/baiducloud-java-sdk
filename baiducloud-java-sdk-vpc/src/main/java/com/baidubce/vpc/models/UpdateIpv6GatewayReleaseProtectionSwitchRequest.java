package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateIpv6GatewayReleaseProtectionSwitchRequest extends BaseBceRequest {

    /**
    * gatewayId
    */
    @JsonIgnore
    private String gatewayId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 是否开启释放保护
    */
    private Integer deleteProtect;

    public String getGatewayId() {
        return gatewayId;
    }

    public UpdateIpv6GatewayReleaseProtectionSwitchRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateIpv6GatewayReleaseProtectionSwitchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getDeleteProtect() {
        return deleteProtect;
    }

    public UpdateIpv6GatewayReleaseProtectionSwitchRequest setDeleteProtect(Integer deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

}
