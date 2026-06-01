package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDedicatedChannelRouteRulesRequest extends BaseBceRequest {

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
    * IP协议类型，取值[4 \| 6]，默认为4
    */
    private Integer ipVersion;

    /**
    * 目标网段
    */
    private String destAddress;

    /**
    * 下一跳类型，取值["etGateway" \| "etChannel"]，分别表示专线网关、专线通道
    */
    private String nexthopType;

    /**
    * 下一跳实例ID
    */
    private String nexthopId;

    /**
    * 描述
    */
    private String description;

    public String getEtId() {
        return etId;
    }

    public CreateDedicatedChannelRouteRulesRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public CreateDedicatedChannelRouteRulesRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateDedicatedChannelRouteRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getIpVersion() {
        return ipVersion;
    }

    public CreateDedicatedChannelRouteRulesRequest setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getDestAddress() {
        return destAddress;
    }

    public CreateDedicatedChannelRouteRulesRequest setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    public String getNexthopType() {
        return nexthopType;
    }

    public CreateDedicatedChannelRouteRulesRequest setNexthopType(String nexthopType) {
        this.nexthopType = nexthopType;
        return this;
    }

    public String getNexthopId() {
        return nexthopId;
    }

    public CreateDedicatedChannelRouteRulesRequest setNexthopId(String nexthopId) {
        this.nexthopId = nexthopId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateDedicatedChannelRouteRulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
