package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewVpnRequest extends BaseBceRequest {

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
    * billing
    */
    private Billing billing;

    public String getVpnId() {
        return vpnId;
    }

    public RenewVpnRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public RenewVpnRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public RenewVpnRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
