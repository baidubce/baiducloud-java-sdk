package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseReservedNatRequest extends BaseBceRequest {

    /**
    * natId
    */
    @JsonIgnore
    private String natId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * billing
    */
    private Billing billing;

    public String getNatId() {
        return natId;
    }

    public PurchaseReservedNatRequest setNatId(String natId) {
        this.natId = natId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public PurchaseReservedNatRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public PurchaseReservedNatRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
