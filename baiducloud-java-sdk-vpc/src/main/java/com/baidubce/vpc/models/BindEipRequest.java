package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindEipRequest extends BaseBceRequest {

    /**
    * vpnId
    */
    @JsonIgnore
    private String vpnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 需要绑定的EIP
    */
    private String eip;

    public String getVpnId() {
        return vpnId;
    }

    public BindEipRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BindEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getEip() {
        return eip;
    }

    public BindEipRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

}
