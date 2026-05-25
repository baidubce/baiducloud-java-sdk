package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteHighlyAvailableVirtualIpRequest extends BaseBceRequest {

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

    public String getHaVipId() {
        return haVipId;
    }

    public DeleteHighlyAvailableVirtualIpRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteHighlyAvailableVirtualIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
