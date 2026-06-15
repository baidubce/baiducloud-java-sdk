package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePhysicalDedicatedLineRequest extends BaseBceRequest {

    /**
    * dcphyId
    */
    @JsonIgnore
    private String dcphyId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getDcphyId() {
        return dcphyId;
    }

    public DeletePhysicalDedicatedLineRequest setDcphyId(String dcphyId) {
        this.dcphyId = dcphyId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeletePhysicalDedicatedLineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
