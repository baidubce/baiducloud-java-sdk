package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteServiceRequest extends BaseBceRequest {

    /**
    * service
    */
    @JsonIgnore
    private String service;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getService() {
        return service;
    }

    public DeleteServiceRequest setService(String service) {
        this.service = service;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
