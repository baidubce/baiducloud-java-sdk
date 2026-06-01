package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveDedicatedChannelRouteParametersRequest extends BaseBceRequest {

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

    public RemoveDedicatedChannelRouteParametersRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public RemoveDedicatedChannelRouteParametersRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public RemoveDedicatedChannelRouteParametersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getNetworks() {
        return networks;
    }

    public RemoveDedicatedChannelRouteParametersRequest setNetworks(List<String> networks) {
        this.networks = networks;
        return this;
    }

    public List<String> getIpv6Networks() {
        return ipv6Networks;
    }

    public RemoveDedicatedChannelRouteParametersRequest setIpv6Networks(List<String> ipv6Networks) {
        this.ipv6Networks = ipv6Networks;
        return this;
    }

    public String getRouteType() {
        return routeType;
    }

    public RemoveDedicatedChannelRouteParametersRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

}
