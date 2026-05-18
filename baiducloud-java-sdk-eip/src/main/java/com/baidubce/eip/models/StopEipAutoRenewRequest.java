package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopEipAutoRenewRequest extends BaseBceRequest {

    /**
    * eip
    */
    @JsonIgnore
    private String eip;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getEip() {
        return eip;
    }

    public StopEipAutoRenewRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public StopEipAutoRenewRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
