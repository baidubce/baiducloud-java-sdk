package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDedicatedChannelRouteRulesRequest extends BaseBceRequest {

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

    /**
    * 描述信息
    */
    private String description;

    public String getEtId() {
        return etId;
    }

    public UpdateDedicatedChannelRouteRulesRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public UpdateDedicatedChannelRouteRulesRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getRouteRuleId() {
        return routeRuleId;
    }

    public UpdateDedicatedChannelRouteRulesRequest setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateDedicatedChannelRouteRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateDedicatedChannelRouteRulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
