package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenEndpointResponse extends BaseBceResponse {

    /**
    * JWT 格式的 access token（始终返回）
    */
    private String accessToken;

    /**
    * JWT 格式的 ID token（scope 含 openid 时返回）
    */
    private String idToken;

    /**
    * JWT 格式的 refresh token（scope 含 offline_access 且客户端 grantTypes 含 refresh_token 时返回，滚动签发）
    */
    private String refreshToken;

    /**
    * 固定 Bearer（始终返回）
    */
    private String tokenType;

    /**
    * access_token 有效期（秒），始终返回
    */
    private Integer expiresIn;

    /**
    * refresh_token 有效期（秒），有 refresh_token 时返回
    */
    private Integer refreshExpiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public TokenEndpointResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getIdToken() {
        return idToken;
    }

    public TokenEndpointResponse setIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public TokenEndpointResponse setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public String getTokenType() {
        return tokenType;
    }

    public TokenEndpointResponse setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public TokenEndpointResponse setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public Integer getRefreshExpiresIn() {
        return refreshExpiresIn;
    }

    public TokenEndpointResponse setRefreshExpiresIn(Integer refreshExpiresIn) {
        this.refreshExpiresIn = refreshExpiresIn;
        return this;
    }

    @Override
    public String toString() {
        return "TokenEndpointResponse{" + "accessToken=" + accessToken + "\n" + "idToken=" + idToken + "\n" + "refreshToken=" + refreshToken + "\n" + "tokenType=" + tokenType
                + "\n" + "expiresIn=" + expiresIn + "\n" + "refreshExpiresIn=" + refreshExpiresIn + "\n" + "}";
    }

}
