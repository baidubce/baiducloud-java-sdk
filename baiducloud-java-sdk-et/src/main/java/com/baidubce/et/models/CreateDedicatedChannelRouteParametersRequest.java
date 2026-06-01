package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDedicatedChannelRouteParametersRequest extends BaseBceRequest {

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
    * IPv4路由cidr
    */
    private List<String> networks;

    /**
    * IPv6路由cidr
    */
    private List<String> ipv6Networks;

    /**
    * 路由类型，当前支持static-route
    */
    private String routeType;

    public String getEtId() {
        return etId;
    }

    public CreateDedicatedChannelRouteParametersRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public CreateDedicatedChannelRouteParametersRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateDedicatedChannelRouteParametersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getNetworks() {
        return networks;
    }

    public CreateDedicatedChannelRouteParametersRequest setNetworks(List<String> networks) {
        this.networks = networks;
        return this;
    }

    public List<String> getIpv6Networks() {
        return ipv6Networks;
    }

    public CreateDedicatedChannelRouteParametersRequest setIpv6Networks(List<String> ipv6Networks) {
        this.ipv6Networks = ipv6Networks;
        return this;
    }

    public String getRouteType() {
        return routeType;
    }

    public CreateDedicatedChannelRouteParametersRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

}
