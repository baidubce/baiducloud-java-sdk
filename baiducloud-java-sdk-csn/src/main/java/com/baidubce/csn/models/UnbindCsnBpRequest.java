package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindCsnBpRequest extends BaseBceRequest {

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
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 云智能网的ID
    */
    private String csnId;

    public String getCsnBpId() {
        return csnBpId;
    }

    public UnbindCsnBpRequest setCsnBpId(String csnBpId) {
        this.csnBpId = csnBpId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UnbindCsnBpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getAction() {
        return action;
    }

    public UnbindCsnBpRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getCsnId() {
        return csnId;
    }

    public UnbindCsnBpRequest setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

}
