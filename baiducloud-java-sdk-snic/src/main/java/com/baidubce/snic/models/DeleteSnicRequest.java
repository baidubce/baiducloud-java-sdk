package com.baidubce.snic.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSnicRequest extends BaseBceRequest {

    /**
    * endpointId
    */
    @JsonIgnore
    private String endpointId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getEndpointId() {
        return endpointId;
    }

    public DeleteSnicRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteSnicRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
