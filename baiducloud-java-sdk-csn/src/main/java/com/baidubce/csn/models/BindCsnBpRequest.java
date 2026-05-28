package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindCsnBpRequest extends BaseBceRequest {

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

    /**
    * 云智能网的ID
    */
    private String csnId;

    public String getCsnBpId() {
        return csnBpId;
    }

    public BindCsnBpRequest setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BindCsnBpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getCsnId() {
        return csnId;
    }

    public BindCsnBpRequest setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

}
