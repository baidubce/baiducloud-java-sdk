package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseReservedEipGroupRequest extends BaseBceRequest {

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
    private Billing billing;

    public String getId() {
        return id;
    }

    public PurchaseReservedEipGroupRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public PurchaseReservedEipGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public PurchaseReservedEipGroupRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
