package com.baidubce.et.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDedicatedChannelRouteRulesResponse extends BaseBceResponse {

    /**
    * 路由规则ID
    */
    private String routeRuleId;

    public String getRouteRuleId() {
        return routeRuleId;
    }

    public CreateDedicatedChannelRouteRulesResponse setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDedicatedChannelRouteRulesResponse{" + "routeRuleId=" + routeRuleId + "\n" + "}";
    }

}
