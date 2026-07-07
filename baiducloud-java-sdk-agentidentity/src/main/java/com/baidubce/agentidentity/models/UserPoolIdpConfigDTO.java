package com.baidubce.agentidentity.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserPoolIdpConfigDTO {
    /**
     * IdP 配置 ID
     */
    private String id;

    /**
     * 显示名称
     */
    private String name;

    /**
     * 协议类型：OAUTH2 / OIDC / CAS
     */
    private String idpType;

    /**
     * OAuth2 提供方：CUSTOM / DINGTALK / FEISHU；非 OAuth2 为 null
     */
    private String idpProvider;

    /**
     * OAuth2 client_id
     */
    private String clientId;

    /**
     * client_secret（get 返回明文，list 不返回）
     */
    private String clientSecret;

    /**
     * Discovery URL
     */
    private String discoveryUrl;

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
     * 请求的 scope
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

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 统一 IdP 回调地址（运行时派生）
     */
    private String callbackUrl;

    /**
     * 创建时间
     */
    private String createdAt;

    public UserPoolIdpConfigDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public UserPoolIdpConfigDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public UserPoolIdpConfigDTO setIdpType(String idpType) {
        this.idpType = idpType;
        return this;
    }

    public String getIdpType() {
        return this.idpType;
    }

    public UserPoolIdpConfigDTO setIdpProvider(String idpProvider) {
        this.idpProvider = idpProvider;
        return this;
    }

    public String getIdpProvider() {
        return this.idpProvider;
    }

    public UserPoolIdpConfigDTO setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientId() {
        return this.clientId;
    }

    public UserPoolIdpConfigDTO setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public UserPoolIdpConfigDTO setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
        return this;
    }

    public String getDiscoveryUrl() {
        return this.discoveryUrl;
    }

    public UserPoolIdpConfigDTO setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    public UserPoolIdpConfigDTO setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    public UserPoolIdpConfigDTO setUserinfoEndpoint(String userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
        return this;
    }

    public String getUserinfoEndpoint() {
        return this.userinfoEndpoint;
    }

    public UserPoolIdpConfigDTO setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public UserPoolIdpConfigDTO setUserIdClaim(String userIdClaim) {
        this.userIdClaim = userIdClaim;
        return this;
    }

    public String getUserIdClaim() {
        return this.userIdClaim;
    }

    public UserPoolIdpConfigDTO setDisplayNameClaim(String displayNameClaim) {
        this.displayNameClaim = displayNameClaim;
        return this;
    }

    public String getDisplayNameClaim() {
        return this.displayNameClaim;
    }

    public UserPoolIdpConfigDTO setAutoCreateUser(Boolean autoCreateUser) {
        this.autoCreateUser = autoCreateUser;
        return this;
    }

    public Boolean getAutoCreateUser() {
        return this.autoCreateUser;
    }

    public UserPoolIdpConfigDTO setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public UserPoolIdpConfigDTO setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UserPoolIdpConfigDTO setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public String toString() {
        return "UserPoolIdpConfigDTO{" + "id=" + id + "\n" + "name=" + name + "\n" + "idpType=" + idpType + "\n" + "idpProvider=" + idpProvider + "\n" + "clientId=" + clientId
                + "\n" + "clientSecret=" + clientSecret + "\n" + "discoveryUrl=" + discoveryUrl + "\n" + "authorizationEndpoint=" + authorizationEndpoint + "\n" + "tokenEndpoint="
                + tokenEndpoint + "\n" + "userinfoEndpoint=" + userinfoEndpoint + "\n" + "scopes=" + scopes + "\n" + "userIdClaim=" + userIdClaim + "\n" + "displayNameClaim="
                + displayNameClaim + "\n" + "autoCreateUser=" + autoCreateUser + "\n" + "enabled=" + enabled + "\n" + "callbackUrl=" + callbackUrl + "\n" + "createdAt="
                + createdAt + "\n" + "}";
    }

}