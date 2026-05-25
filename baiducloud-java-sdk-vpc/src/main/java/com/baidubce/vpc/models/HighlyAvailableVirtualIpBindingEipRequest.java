package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HighlyAvailableVirtualIpBindingEipRequest extends BaseBceRequest {

    /**
    * haVipId
    */
    @JsonIgnore
    private String haVipId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 弹性公网IP的地址
    */
    private String publicIpAddress;

    public String getHaVipId() {
        return haVipId;
    }

    public HighlyAvailableVirtualIpBindingEipRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public HighlyAvailableVirtualIpBindingEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public HighlyAvailableVirtualIpBindingEipRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

}
