package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteIpv6GatewayEgressOnlyRuleRequest extends BaseBceRequest {

    /**
    * gatewayId
    */
    @JsonIgnore
    private String gatewayId;

    /**
    * egressOnlyRuleId
    */
    @JsonIgnore
    private String egressOnlyRuleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getGatewayId() {
        return gatewayId;
    }

    public DeleteIpv6GatewayEgressOnlyRuleRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public String getEgressOnlyRuleId() {
        return egressOnlyRuleId;
    }

    public DeleteIpv6GatewayEgressOnlyRuleRequest setEgressOnlyRuleId(String egressOnlyRuleId) {
        this.egressOnlyRuleId = egressOnlyRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteIpv6GatewayEgressOnlyRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
