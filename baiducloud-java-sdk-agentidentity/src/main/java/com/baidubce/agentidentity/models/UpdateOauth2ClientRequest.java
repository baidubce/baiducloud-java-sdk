package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOauth2ClientRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 客户端记录 ID
    */
    private String id;

    /**
    * 新的名称
    */
    private String name;

    /**
    * 新的描述
    */
    private String description;

    /**
    * 新的回调地址白名单（最多20个）
    */
    private List<String> redirectUris;

    /**
    * 新的授权类型
    */
    private List<String> grantTypes;

    /**
    * 新的 scope
    */
    private List<String> scopes;

    /**
    * 新的 access_token 有效期
    */
    private Integer accessTokenTtl;

    /**
    * 新的 refresh_token 有效期
    */
    private Integer refreshTokenTtl;

    public String getUserPoolId() {
        return userPoolId;
    }

    public UpdateOauth2ClientRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getId() {
        return id;
    }

    public UpdateOauth2ClientRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateOauth2ClientRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateOauth2ClientRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getRedirectUris() {
        return redirectUris;
    }

    public UpdateOauth2ClientRequest setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    public List<String> getGrantTypes() {
        return grantTypes;
    }

    public UpdateOauth2ClientRequest setGrantTypes(List<String> grantTypes) {
        this.grantTypes = grantTypes;
        return this;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public UpdateOauth2ClientRequest setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public Integer getAccessTokenTtl() {
        return accessTokenTtl;
    }

    public UpdateOauth2ClientRequest setAccessTokenTtl(Integer accessTokenTtl) {
        this.accessTokenTtl = accessTokenTtl;
        return this;
    }

    public Integer getRefreshTokenTtl() {
        return refreshTokenTtl;
    }

    public UpdateOauth2ClientRequest setRefreshTokenTtl(Integer refreshTokenTtl) {
        this.refreshTokenTtl = refreshTokenTtl;
        return this;
    }

}
