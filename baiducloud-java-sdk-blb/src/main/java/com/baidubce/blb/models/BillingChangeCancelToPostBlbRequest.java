package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingChangeCancelToPostBlbRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getBlbId() {
        return blbId;
    }

    public BillingChangeCancelToPostBlbRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BillingChangeCancelToPostBlbRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
