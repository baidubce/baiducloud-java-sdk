package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDedicatedChannelRequest extends BaseBceRequest {

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
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 专线通道名称
    */
    private String name;

    /**
    * 描述
    */
    private String description;

    /**
    * BGP路由条目上限
    */
    private Integer bgpRouteLimit;

    public String getEtId() {
        return etId;
    }

    public UpdateDedicatedChannelRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public UpdateDedicatedChannelRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateDedicatedChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateDedicatedChannelRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateDedicatedChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getBgpRouteLimit() {
        return bgpRouteLimit;
    }

    public UpdateDedicatedChannelRequest setBgpRouteLimit(Integer bgpRouteLimit) {
        this.bgpRouteLimit = bgpRouteLimit;
        return this;
    }

}
