package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableIdpConfigurationResponse extends BaseBceResponse {

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

    public String getId() {
        return id;
    }

    public EnableIdpConfigurationResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EnableIdpConfigurationResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getIdpType() {
        return idpType;
    }

    public EnableIdpConfigurationResponse setIdpType(String idpType) {
        this.idpType = idpType;
        return this;
    }

    public String getIdpProvider() {
        return idpProvider;
    }

    public EnableIdpConfigurationResponse setIdpProvider(String idpProvider) {
        this.idpProvider = idpProvider;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public EnableIdpConfigurationResponse setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public EnableIdpConfigurationResponse setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    public EnableIdpConfigurationResponse setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
        return this;
    }

    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    public EnableIdpConfigurationResponse setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public EnableIdpConfigurationResponse setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    public String getUserinfoEndpoint() {
        return userinfoEndpoint;
    }

    public EnableIdpConfigurationResponse setUserinfoEndpoint(String userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
        return this;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public EnableIdpConfigurationResponse setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public String getUserIdClaim() {
        return userIdClaim;
    }

    public EnableIdpConfigurationResponse setUserIdClaim(String userIdClaim) {
        this.userIdClaim = userIdClaim;
        return this;
    }

    public String getDisplayNameClaim() {
        return displayNameClaim;
    }

    public EnableIdpConfigurationResponse setDisplayNameClaim(String displayNameClaim) {
        this.displayNameClaim = displayNameClaim;
        return this;
    }

    public Boolean getAutoCreateUser() {
        return autoCreateUser;
    }

    public EnableIdpConfigurationResponse setAutoCreateUser(Boolean autoCreateUser) {
        this.autoCreateUser = autoCreateUser;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public EnableIdpConfigurationResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public EnableIdpConfigurationResponse setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public EnableIdpConfigurationResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return "EnableIdpConfigurationResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "idpType=" + idpType + "\n" + "idpProvider=" + idpProvider + "\n" + "clientId="
                + clientId + "\n" + "clientSecret=" + clientSecret + "\n" + "discoveryUrl=" + discoveryUrl + "\n" + "authorizationEndpoint=" + authorizationEndpoint + "\n"
                + "tokenEndpoint=" + tokenEndpoint + "\n" + "userinfoEndpoint=" + userinfoEndpoint + "\n" + "scopes=" + scopes + "\n" + "userIdClaim=" + userIdClaim + "\n"
                + "displayNameClaim=" + displayNameClaim + "\n" + "autoCreateUser=" + autoCreateUser + "\n" + "enabled=" + enabled + "\n" + "callbackUrl=" + callbackUrl + "\n"
                + "createdAt=" + createdAt + "\n" + "}";
    }

}
