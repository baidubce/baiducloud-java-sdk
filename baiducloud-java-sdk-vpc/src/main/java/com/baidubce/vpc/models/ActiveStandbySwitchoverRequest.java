package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActiveStandbySwitchoverRequest extends BaseBceRequest {

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

    public ActiveStandbySwitchoverRequest setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ActiveStandbySwitchoverRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
