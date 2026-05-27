package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteCsnRequest extends BaseBceRequest {

    /**
    * csnId
    */
    @JsonIgnore
    private String csnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getCsnId() {
        return csnId;
    }

    public DeleteCsnRequest setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteCsnRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
