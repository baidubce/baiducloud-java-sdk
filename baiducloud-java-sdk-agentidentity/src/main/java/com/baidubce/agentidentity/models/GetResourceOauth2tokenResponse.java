package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetResourceOauth2tokenResponse extends BaseBceResponse {

    /**
    * OAuth2 access token（token 就绪时返回，与 sessionStatus 互斥）
    */
    private String accessToken;

    /**
    * 授权 URL（仅首次发起时返回）
    */
    private String authorizationUrl;

    /**
    * 会话标识（轮询用）
    */
    private String sessionUri;

    /**
    * 会话状态：IN_PROGRESS / FAILED
    */
    private String sessionStatus;

    public String getAccessToken() {
        return accessToken;
    }

    public GetResourceOauth2tokenResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    public GetResourceOauth2tokenResponse setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
        return this;
    }

    public String getSessionUri() {
        return sessionUri;
    }

    public GetResourceOauth2tokenResponse setSessionUri(String sessionUri) {
        this.sessionUri = sessionUri;
        return this;
    }

    public String getSessionStatus() {
        return sessionStatus;
    }

    public GetResourceOauth2tokenResponse setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }

    @Override
    public String toString() {
        return "GetResourceOauth2tokenResponse{" + "accessToken=" + accessToken + "\n" + "authorizationUrl=" + authorizationUrl + "\n" + "sessionUri=" + sessionUri + "\n"
                + "sessionStatus=" + sessionStatus + "\n" + "}";
    }

}
