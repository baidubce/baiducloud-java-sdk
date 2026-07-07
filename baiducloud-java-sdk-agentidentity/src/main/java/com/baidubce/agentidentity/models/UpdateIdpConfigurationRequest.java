package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateIdpConfigurationRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * IdP 配置 ID
    */
    private String id;

    /**
    * 新的显示名称
    */
    private String name;

    /**
    * 新的 client_id
    */
    private String clientId;

    /**
    * 新的 client_secret（非空则更新）
    */
    private String clientSecret;

    /**
    * 授权端点
    */
    private String authorizationEndpoint;

    /**
    * Token 端点
    */
    private String tokenEndpoint;

    /**
    * UserInfo 端点
    */
    private String userinfoEndpoint;

    /**
    * scope 列表
    */
    private List<String> scopes;

    /**
    * 用户 ID 映射字段
    */
    private String userIdClaim;

    /**
    * 显示名称映射字段
    */
    private String displayNameClaim;

    /**
    * 是否自动创建用户
    */
    private Boolean autoCreateUser;

    public String getUserPoolId() {
        return userPoolId;
    }

    public UpdateIdpConfigurationRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getId() {
        return id;
    }

    public UpdateIdpConfigurationRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateIdpConfigurationRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public UpdateIdpConfigurationRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public UpdateIdpConfigurationRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    public UpdateIdpConfigurationRequest setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public UpdateIdpConfigurationRequest setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    public String getUserinfoEndpoint() {
        return userinfoEndpoint;
    }

    public UpdateIdpConfigurationRequest setUserinfoEndpoint(String userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
        return this;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public UpdateIdpConfigurationRequest setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public String getUserIdClaim() {
        return userIdClaim;
    }

    public UpdateIdpConfigurationRequest setUserIdClaim(String userIdClaim) {
        this.userIdClaim = userIdClaim;
        return this;
    }

    public String getDisplayNameClaim() {
        return displayNameClaim;
    }

    public UpdateIdpConfigurationRequest setDisplayNameClaim(String displayNameClaim) {
        this.displayNameClaim = displayNameClaim;
        return this;
    }

    public Boolean getAutoCreateUser() {
        return autoCreateUser;
    }

    public UpdateIdpConfigurationRequest setAutoCreateUser(Boolean autoCreateUser) {
        this.autoCreateUser = autoCreateUser;
        return this;
    }

}
