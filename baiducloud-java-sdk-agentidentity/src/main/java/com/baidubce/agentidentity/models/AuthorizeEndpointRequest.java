package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorizeEndpointRequest extends BaseBceRequest {

    /**
    * userPoolId
    */
    @JsonIgnore
    private String userPoolId;

    /**
    * clientId
    */
    @JsonIgnore
    private String clientId;

    /**
    * redirectUri
    */
    @JsonIgnore
    private String redirectUri;

    /**
    * responseType
    */
    @JsonIgnore
    private String responseType;

    /**
    * scope
    */
    @JsonIgnore
    private String scope;

    /**
    * state
    */
    @JsonIgnore
    private String state;

    /**
    * nonce
    */
    @JsonIgnore
    private String nonce;

    public String getUserPoolId() {
        return userPoolId;
    }

    public AuthorizeEndpointRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public AuthorizeEndpointRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public AuthorizeEndpointRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    public String getResponseType() {
        return responseType;
    }

    public AuthorizeEndpointRequest setResponseType(String responseType) {
        this.responseType = responseType;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public AuthorizeEndpointRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getState() {
        return state;
    }

    public AuthorizeEndpointRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getNonce() {
        return nonce;
    }

    public AuthorizeEndpointRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

}
