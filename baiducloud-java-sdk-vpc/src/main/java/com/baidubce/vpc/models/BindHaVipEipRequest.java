package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindHaVipEipRequest extends BaseBceRequest {

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

    public BindHaVipEipRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BindHaVipEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public BindHaVipEipRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

}
