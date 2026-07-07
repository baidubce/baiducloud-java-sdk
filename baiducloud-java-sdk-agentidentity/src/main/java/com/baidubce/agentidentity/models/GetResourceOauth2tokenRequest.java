package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.baidubce.annotation.Host;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetResourceOauth2tokenRequest extends BaseBceRequest {

    /**
    * xBceWorkloadAccessToken
    */
    @Host
    @JsonIgnore
    private String xBceWorkloadAccessToken;

    /**
    * （首次调用必填）凭证提供方名称
    */
    private String resourceCredentialProviderName;

    /**
    * OAuth2 scope 列表，不传则使用 provider 默认值
    */
    private List<String> scopes;

    /**
    * 默认 USER_FEDERATION（3LO）
    */
    private String oauth2Flow;

    /**
    * （首次调用必填）客户端回调 URL，需在 Agent 白名单中注册
    */
    private String resourceOauth2ReturnUrl;

    /**
    * （轮询时必填）首次请求返回的 sessionUri
    */
    private String sessionUri;

    /**
    * 默认 false，true 时跳过缓存强制重新授权
    */
    private Boolean forceAuthentication;

    /**
    * WAT（Body 传递，也可通过 Header 传递）
    */
    private String workloadAccessToken;

    public String getXBceWorkloadAccessToken() {
        return xBceWorkloadAccessToken;
    }

    public GetResourceOauth2tokenRequest setXBceWorkloadAccessToken(String xBceWorkloadAccessToken) {
        this.xBceWorkloadAccessToken = xBceWorkloadAccessToken;
        return this;
    }

    public String getResourceCredentialProviderName() {
        return resourceCredentialProviderName;
    }

    public GetResourceOauth2tokenRequest setResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
        return this;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public GetResourceOauth2tokenRequest setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public String getOauth2Flow() {
        return oauth2Flow;
    }

    public GetResourceOauth2tokenRequest setOauth2Flow(String oauth2Flow) {
        this.oauth2Flow = oauth2Flow;
        return this;
    }

    public String getResourceOauth2ReturnUrl() {
        return resourceOauth2ReturnUrl;
    }

    public GetResourceOauth2tokenRequest setResourceOauth2ReturnUrl(String resourceOauth2ReturnUrl) {
        this.resourceOauth2ReturnUrl = resourceOauth2ReturnUrl;
        return this;
    }

    public String getSessionUri() {
        return sessionUri;
    }

    public GetResourceOauth2tokenRequest setSessionUri(String sessionUri) {
        this.sessionUri = sessionUri;
        return this;
    }

    public Boolean getForceAuthentication() {
        return forceAuthentication;
    }

    public GetResourceOauth2tokenRequest setForceAuthentication(Boolean forceAuthentication) {
        this.forceAuthentication = forceAuthentication;
        return this;
    }

    public String getWorkloadAccessToken() {
        return workloadAccessToken;
    }

    public GetResourceOauth2tokenRequest setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }

}
