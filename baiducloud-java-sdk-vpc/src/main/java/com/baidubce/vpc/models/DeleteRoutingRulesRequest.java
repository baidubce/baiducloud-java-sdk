package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRoutingRulesRequest extends BaseBceRequest {

    /**
    * routeRuleId
    */
    @JsonIgnore
    private String routeRuleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getRouteRuleId() {
        return routeRuleId;
    }

    public DeleteRoutingRulesRequest setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteRoutingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
