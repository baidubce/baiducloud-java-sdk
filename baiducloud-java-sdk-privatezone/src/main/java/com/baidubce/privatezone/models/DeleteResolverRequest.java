package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteResolverRequest extends BaseBceRequest {

    /**
    * resolverId
    */
    @JsonIgnore
    private String resolverId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getResolverId() {
        return resolverId;
    }

    public DeleteResolverRequest setResolverId(String resolverId) {
        this.resolverId = resolverId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteResolverRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
