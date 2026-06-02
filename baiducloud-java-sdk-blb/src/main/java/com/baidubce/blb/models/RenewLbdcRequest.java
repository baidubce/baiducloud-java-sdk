package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewLbdcRequest extends BaseBceRequest {

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
    * billing
    */
    private BillingForRenew billing;

    public String getId() {
        return id;
    }

    public RenewLbdcRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public RenewLbdcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public BillingForRenew getBilling() {
        return billing;
    }

    public RenewLbdcRequest setBilling(BillingForRenew billing) {
        this.billing = billing;
        return this;
    }

}
