package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateOauth2ClientRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 客户端名称（1-64字符，池内唯一）
    */
    private String name;

    /**
    * 描述（最多128字符）
    */
    private String description;

    /**
    * 客户端类型：WEB_APP / SPA / M2M，默认 WEB_APP
    */
    private String clientType;

    /**
    * 允许的回调地址白名单（至少1个，最多20个）
    */
    private List<String> redirectUris;

    /**
    * 允许的授权类型，默认 ["authorization_code"]
    */
    private List<String> grantTypes;

    /**
    * 允许的 scope
    */
    private List<String> scopes;

    /**
    * access_token 有效期（秒），默认 3600
    */
    private Integer accessTokenTtl;

    /**
    * refresh_token 有效期（秒），默认 604800
    */
    private Integer refreshTokenTtl;

    public String getUserPoolId() {
        return userPoolId;
    }

    public CreateOauth2ClientRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateOauth2ClientRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateOauth2ClientRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getClientType() {
        return clientType;
    }

    public CreateOauth2ClientRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    public List<String> getRedirectUris() {
        return redirectUris;
    }

    public CreateOauth2ClientRequest setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    public List<String> getGrantTypes() {
        return grantTypes;
    }

    public CreateOauth2ClientRequest setGrantTypes(List<String> grantTypes) {
        this.grantTypes = grantTypes;
        return this;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public CreateOauth2ClientRequest setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public Integer getAccessTokenTtl() {
        return accessTokenTtl;
    }

    public CreateOauth2ClientRequest setAccessTokenTtl(Integer accessTokenTtl) {
        this.accessTokenTtl = accessTokenTtl;
        return this;
    }

    public Integer getRefreshTokenTtl() {
        return refreshTokenTtl;
    }

    public CreateOauth2ClientRequest setRefreshTokenTtl(Integer refreshTokenTtl) {
        this.refreshTokenTtl = refreshTokenTtl;
        return this;
    }

}
