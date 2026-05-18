package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeEipGroupBandwidthRequest extends BaseBceRequest {

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
    * 公网带宽，单位为Mbps。对于prepay类型的EIP Group，限制为为10~200之间的整数
    */
    private Integer bandwidthInMbps;

    public String getId() {
        return id;
    }

    public ResizeEipGroupBandwidthRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ResizeEipGroupBandwidthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public ResizeEipGroupBandwidthRequest setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

}
