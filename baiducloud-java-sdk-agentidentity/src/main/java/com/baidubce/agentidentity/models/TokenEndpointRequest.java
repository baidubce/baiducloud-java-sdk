package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenEndpointRequest extends BaseBceRequest {

    /**
    * userPoolId
    */
    @JsonIgnore
    private String userPoolId;

    /**
    * authorization_code 或 refresh_token
    */
    private String grantType;

    /**
    * （条件必填）授权码（grant_type=authorization_code 时必填）
    */
    private String code;

    /**
    * （条件必填）之前签发的 refresh_token JWT（grant_type=refresh_token 时必填）
    */
    private String refreshToken;

    /**
    * OAuth2 client_id
    */
    private String clientId;

    /**
    * OAuth2 client_secret
    */
    private String clientSecret;

    /**
    * （条件必填）需与 authorize 时一致（grant_type=authorization_code 时必填）
    */
    private String redirectUri;

    public String getUserPoolId() {
        return userPoolId;
    }

    public TokenEndpointRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getGrantType() {
        return grantType;
    }

    public TokenEndpointRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }

    public String getCode() {
        return code;
    }

    public TokenEndpointRequest setCode(String code) {
        this.code = code;
        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public TokenEndpointRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public TokenEndpointRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public TokenEndpointRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public TokenEndpointRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

}
