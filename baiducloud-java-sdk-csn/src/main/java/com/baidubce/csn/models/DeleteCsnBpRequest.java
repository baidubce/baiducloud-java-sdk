package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteCsnBpRequest extends BaseBceRequest {

    /**
    * csnBpId
    */
    @JsonIgnore
    private String csnBpId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getCsnBpId() {
        return csnBpId;
    }

    public DeleteCsnBpRequest setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteCsnBpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
