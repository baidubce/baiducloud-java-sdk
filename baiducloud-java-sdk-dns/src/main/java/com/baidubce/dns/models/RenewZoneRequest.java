package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewZoneRequest extends BaseBceRequest {

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * billing
    */
    private BillingForRenew billing;

    public String getName() {
        return name;
    }

    public RenewZoneRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getAction() {
        return action;
    }

    public RenewZoneRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public RenewZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public BillingForRenew getBilling() {
        return billing;
    }

    public RenewZoneRequest setBilling(BillingForRenew billing) {
        this.billing = billing;
        return this;
    }

}
