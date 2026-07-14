package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOauth2ClientResponse extends BaseBceResponse {

    /**
    * 客户端记录 ID
    */
    private String id;

    /**
    * OAuth2 client_id
    */
    private String clientId;

    /**
    * client_secret（get 返回明文，list 不返回）
    */
    private String clientSecret;

    /**
    * 客户端名称
    */
    private String name;

    /**
    * 描述
    */
    private String description;

    /**
    * 客户端类型：WEB_APP / SPA / M2M
    */
    private String clientType;

    /**
    * 回调地址白名单
    */
    private List<String> redirectUris;

    /**
    * 授权类型
    */
    private List<String> grantTypes;

    /**
    * 允许的 scope
    */
    private List<String> scopes;

    /**
    * access_token 有效期（秒）
    */
    private Integer accessTokenTtl;

    /**
    * refresh_token 有效期（秒）
    */
    private Integer refreshTokenTtl;

    /**
    * 是否启用
    */
    private Boolean enabled;

    /**
    * 拼装好的 OAuth2 authorize 链接
    */
    private String loginUrl;

    /**
    * 创建时间
    */
    private String createdAt;

    public String getId() {
        return id;
    }

    public UpdateOauth2ClientResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public UpdateOauth2ClientResponse setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public UpdateOauth2ClientResponse setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateOauth2ClientResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateOauth2ClientResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getClientType() {
        return clientType;
    }

    public UpdateOauth2ClientResponse setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    public List<String> getRedirectUris() {
        return redirectUris;
    }

    public UpdateOauth2ClientResponse setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    public List<String> getGrantTypes() {
        return grantTypes;
    }

    public UpdateOauth2ClientResponse setGrantTypes(List<String> grantTypes) {
        this.grantTypes = grantTypes;
        return this;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public UpdateOauth2ClientResponse setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public Integer getAccessTokenTtl() {
        return accessTokenTtl;
    }

    public UpdateOauth2ClientResponse setAccessTokenTtl(Integer accessTokenTtl) {
        this.accessTokenTtl = accessTokenTtl;
        return this;
    }

    public Integer getRefreshTokenTtl() {
        return refreshTokenTtl;
    }

    public UpdateOauth2ClientResponse setRefreshTokenTtl(Integer refreshTokenTtl) {
        this.refreshTokenTtl = refreshTokenTtl;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateOauth2ClientResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public UpdateOauth2ClientResponse setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public UpdateOauth2ClientResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateOauth2ClientResponse{" + "id=" + id + "\n" + "clientId=" + clientId + "\n" + "clientSecret=" + clientSecret + "\n" + "name=" + name + "\n" + "description="
                + description + "\n" + "clientType=" + clientType + "\n" + "redirectUris=" + redirectUris + "\n" + "grantTypes=" + grantTypes + "\n" + "scopes=" + scopes + "\n"
                + "accessTokenTtl=" + accessTokenTtl + "\n" + "refreshTokenTtl=" + refreshTokenTtl + "\n" + "enabled=" + enabled + "\n" + "loginUrl=" + loginUrl + "\n"
                + "createdAt=" + createdAt + "\n" + "}";
    }

}
