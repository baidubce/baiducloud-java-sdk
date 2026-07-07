package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Oauth2idpCallbackRequest extends BaseBceRequest {

    /**
    * providerId
    */
    @JsonIgnore
    private String providerId;

    /**
    * code
    */
    @JsonIgnore
    private String code;

    /**
    * state
    */
    @JsonIgnore
    private String state;

    public String getProviderId() {
        return providerId;
    }

    public Oauth2idpCallbackRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Oauth2idpCallbackRequest setCode(String code) {
        this.code = code;
        return this;
    }

    public String getState() {
        return state;
    }

    public Oauth2idpCallbackRequest setState(String state) {
        this.state = state;
        return this;
    }

}
