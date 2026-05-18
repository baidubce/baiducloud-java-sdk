package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeEipBpBandwidthRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 调整后带宽包的公网带宽
    */
    private Integer bandwidthInMbps;

    public String getId() {
        return id;
    }

    public ResizeEipBpBandwidthRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ResizeEipBpBandwidthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public ResizeEipBpBandwidthRequest setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

}
