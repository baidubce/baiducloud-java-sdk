package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.baidubce.annotation.Host;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompleteOauth2sessionRequest extends BaseBceRequest {

    /**
    * xBceWorkloadAccessToken
    */
    @Host
    @JsonIgnore
    private String xBceWorkloadAccessToken;

    /**
    * OAuth2 会话标识
    */
    private String sessionUri;

    /**
    * 用户标识
    */
    private Object userIdentifier;

    /**
    * 用户 ID（当前仅支持 userId）
    */
    private String userIdentifierUserId;

    /**
    * WAT（Body 传递，也可通过 Header 传递）
    */
    private String workloadAccessToken;

    public String getXBceWorkloadAccessToken() {
        return xBceWorkloadAccessToken;
    }

    public CompleteOauth2sessionRequest setXBceWorkloadAccessToken(String xBceWorkloadAccessToken) {
        this.xBceWorkloadAccessToken = xBceWorkloadAccessToken;
        return this;
    }

    public String getSessionUri() {
        return sessionUri;
    }

    public CompleteOauth2sessionRequest setSessionUri(String sessionUri) {
        this.sessionUri = sessionUri;
        return this;
    }

    public Object getUserIdentifier() {
        return userIdentifier;
    }

    public CompleteOauth2sessionRequest setUserIdentifier(Object userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }

    public String getUserIdentifierUserId() {
        return userIdentifierUserId;
    }

    public CompleteOauth2sessionRequest setUserIdentifierUserId(String userIdentifierUserId) {
        this.userIdentifierUserId = userIdentifierUserId;
        return this;
    }

    public String getWorkloadAccessToken() {
        return workloadAccessToken;
    }

    public CompleteOauth2sessionRequest setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }

}
