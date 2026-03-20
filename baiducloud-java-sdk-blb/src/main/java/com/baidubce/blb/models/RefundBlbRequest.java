package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefundBlbRequest {

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

    public RefundBlbRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public RefundBlbRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
