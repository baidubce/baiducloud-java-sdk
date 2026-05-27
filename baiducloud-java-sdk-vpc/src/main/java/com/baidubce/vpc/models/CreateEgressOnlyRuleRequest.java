package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEgressOnlyRuleRequest extends BaseBceRequest {

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
    * 只出不进策略的CIDR
    */
    private String cidr;

    public String getGatewayId() {
        return gatewayId;
    }

    public CreateEgressOnlyRuleRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateEgressOnlyRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getCidr() {
        return cidr;
    }

    public CreateEgressOnlyRuleRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

}
