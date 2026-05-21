package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRoutingRulesResponse extends BaseBceResponse {

    /**
    * 单线路由规则ID，创建单线路由时返回该参数
    */
    private String routeRuleId;

    /**
    * 多线路由规则ID，创建多线路由（主备、负载均衡）时返回该参数
    */
    private List<String> routeRuleIds;

    public String getRouteRuleId() {
        return routeRuleId;
    }

    public CreateRoutingRulesResponse setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }

    public List<String> getRouteRuleIds() {
        return routeRuleIds;
    }

    public CreateRoutingRulesResponse setRouteRuleIds(List<String> routeRuleIds) {
        this.routeRuleIds = routeRuleIds;
        return this;
    }

    @Override
    public String toString() {
        return "CreateRoutingRulesResponse{" + "routeRuleId=" + routeRuleId + "\n" + "routeRuleIds=" + routeRuleIds + "\n" + "}";
    }

}
