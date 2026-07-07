package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIdpConfigurationRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * IdP 显示名称（1-64字符，池内唯一）
    */
    private String name;

    /**
    * 协议类型：OAUTH2 / OIDC / CAS
    */
    private String idpType;

    /**
    * （条件必填）OAuth2 提供方：CUSTOM / DINGTALK / FEISHU；仅 idpType=OAUTH2 时必填，OIDC/CAS 时必须为 null
    */
    private String idpProvider;

    /**
    * （条件必填）OAuth2 client_id（OAuth2 协议必填）
    */
    private String clientId;

    /**
    * （条件必填）OAuth2 client_secret 明文（OAuth2 协议必填，加密存储）
    */
    private String clientSecret;

    /**
    * OAuth2/OIDC Discovery URL（提供后自动解析端点）
    */
    private String discoveryUrl;

    /**
    * （条件必填）授权端点（idpProvider=CUSTOM 且无 discoveryUrl 时必填）
    */
    private String authorizationEndpoint;

    /**
    * （条件必填）Token 端点（idpProvider=CUSTOM 且无 discoveryUrl 时必填）
    */
    private String tokenEndpoint;

    /**
    * （条件必填）UserInfo 端点（idpProvider=CUSTOM 且无 discoveryUrl 时必填）
    */
    private String userinfoEndpoint;

    /**
    * 请求的 scope 列表
    */
    private List<String> scopes;

    /**
    * IdP 用户信息中映射到本地 username 的字段名
    */
    private String userIdClaim;

    /**
    * IdP 用户信息中映射到本地 displayName 的字段名
    */
    private String displayNameClaim;

    /**
    * 登录时用户不存在是否自动创建，默认 false
    */
    private Boolean autoCreateUser;

    public String getUserPoolId() {
        return userPoolId;
    }

    public CreateIdpConfigurationRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateIdpConfigurationRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getIdpType() {
        return idpType;
    }

    public CreateIdpConfigurationRequest setIdpType(String idpType) {
        this.idpType = idpType;
        return this;
    }

    public String getIdpProvider() {
        return idpProvider;
    }

    public CreateIdpConfigurationRequest setIdpProvider(String idpProvider) {
        this.idpProvider = idpProvider;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public CreateIdpConfigurationRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public CreateIdpConfigurationRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    public CreateIdpConfigurationRequest setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
        return this;
    }

    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    public CreateIdpConfigurationRequest setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public CreateIdpConfigurationRequest setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    public String getUserinfoEndpoint() {
        return userinfoEndpoint;
    }

    public CreateIdpConfigurationRequest setUserinfoEndpoint(String userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
        return this;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public CreateIdpConfigurationRequest setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public String getUserIdClaim() {
        return userIdClaim;
    }

    public CreateIdpConfigurationRequest setUserIdClaim(String userIdClaim) {
        this.userIdClaim = userIdClaim;
        return this;
    }

    public String getDisplayNameClaim() {
        return displayNameClaim;
    }

    public CreateIdpConfigurationRequest setDisplayNameClaim(String displayNameClaim) {
        this.displayNameClaim = displayNameClaim;
        return this;
    }

    public Boolean getAutoCreateUser() {
        return autoCreateUser;
    }

    public CreateIdpConfigurationRequest setAutoCreateUser(Boolean autoCreateUser) {
        this.autoCreateUser = autoCreateUser;
        return this;
    }

}
