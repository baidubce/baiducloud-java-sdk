package com.baidubce.agentidentity.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserPoolOAuth2ClientDTO {
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

    public UserPoolOAuth2ClientDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public UserPoolOAuth2ClientDTO setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientId() {
        return this.clientId;
    }

    public UserPoolOAuth2ClientDTO setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public UserPoolOAuth2ClientDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public UserPoolOAuth2ClientDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public UserPoolOAuth2ClientDTO setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    public String getClientType() {
        return this.clientType;
    }

    public UserPoolOAuth2ClientDTO setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    public List<String> getRedirectUris() {
        return this.redirectUris;
    }

    public UserPoolOAuth2ClientDTO setGrantTypes(List<String> grantTypes) {
        this.grantTypes = grantTypes;
        return this;
    }

    public List<String> getGrantTypes() {
        return this.grantTypes;
    }

    public UserPoolOAuth2ClientDTO setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public UserPoolOAuth2ClientDTO setAccessTokenTtl(Integer accessTokenTtl) {
        this.accessTokenTtl = accessTokenTtl;
        return this;
    }

    public Integer getAccessTokenTtl() {
        return this.accessTokenTtl;
    }

    public UserPoolOAuth2ClientDTO setRefreshTokenTtl(Integer refreshTokenTtl) {
        this.refreshTokenTtl = refreshTokenTtl;
        return this;
    }

    public Integer getRefreshTokenTtl() {
        return this.refreshTokenTtl;
    }

    public UserPoolOAuth2ClientDTO setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public UserPoolOAuth2ClientDTO setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    public String getLoginUrl() {
        return this.loginUrl;
    }

    public UserPoolOAuth2ClientDTO setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public String toString() {
        return "UserPoolOAuth2ClientDTO{" + "id=" + id + "\n" + "clientId=" + clientId + "\n" + "clientSecret=" + clientSecret + "\n" + "name=" + name + "\n" + "description="
                + description + "\n" + "clientType=" + clientType + "\n" + "redirectUris=" + redirectUris + "\n" + "grantTypes=" + grantTypes + "\n" + "scopes=" + scopes + "\n"
                + "accessTokenTtl=" + accessTokenTtl + "\n" + "refreshTokenTtl=" + refreshTokenTtl + "\n" + "enabled=" + enabled + "\n" + "loginUrl=" + loginUrl + "\n"
                + "createdAt=" + createdAt + "\n" + "}";
    }

}