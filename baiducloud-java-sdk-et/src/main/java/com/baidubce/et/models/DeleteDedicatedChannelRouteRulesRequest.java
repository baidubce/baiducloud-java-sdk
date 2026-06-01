package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteDedicatedChannelRouteRulesRequest extends BaseBceRequest {

    /**
    * etId
    */
    @JsonIgnore
    private String etId;

    /**
    * etChannelId
    */
    @JsonIgnore
    private String etChannelId;

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

    public String getEtId() {
        return etId;
    }

    public DeleteDedicatedChannelRouteRulesRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public DeleteDedicatedChannelRouteRulesRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getRouteRuleId() {
        return routeRuleId;
    }

    public DeleteDedicatedChannelRouteRulesRequest setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteDedicatedChannelRouteRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
