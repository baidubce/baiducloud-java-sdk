package com.baidubce.agentidentity.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CredentialConfig {
    /**
     * 【API_KEY】API Key 的 KMS Secret ID（非明文）
     */
    private String apiKey;

    /**
     * 【OAUTH2】配置模式：AUTO_DISCOVERY / MANUAL
     */
    private String configType;

    /**
     * 【OAUTH2】提供方：CUSTOM / DINGTALK / FEISHU，默认 CUSTOM
     */
    private String provider;

    /**
     * 【OAUTH2】OIDC Discovery URL（AUTO_DISCOVERY 模式）
     */
    private String discoveryUrl;

    /**
     * 【OAUTH2】签发者
     */
    private String issuer;

    /**
     * 【OAUTH2】授权端点
     */
    private String authorizationEndpoint;

    /**
     * 【OAUTH2】Token 端点
     */
    private String tokenEndpoint;

    /**
     * 【OAUTH2】UserInfo 端点
     */
    private String userinfoEndpoint;

    /**
     * 【OAUTH2】JWKS 端点
     */
    private String jwksUri;

    /**
     * 【OAUTH2】client_id
     */
    private String clientId;

    /**
     * 【OAUTH2】client_secret 的 KMS Secret ID（非明文）
     */
    private String clientSecret;

    /**
     * 【OAUTH2】scope 列表，逗号分隔
     */
    private String scopes;

    /**
     * 【OAUTH2】回调地址（系统生成）
     */
    private String redirectUri;

    /**
     * 【OAUTH2】Token Vault 加密密钥的 KMS Secret ID（系统生成）
     */
    private String tokenEncryptionKeyId;

    /**
     * 【STS】角色 ARN
     */
    private String roleArn;

    /**
     * 【STS】外部 ID（可选）
     */
    private String externalId;

    /**
     * 【STS】临时凭证有效期（秒）
     */
    private Integer durationSeconds;

    public CredentialConfig setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public CredentialConfig setConfigType(String configType) {
        this.configType = configType;
        return this;
    }

    public String getConfigType() {
        return this.configType;
    }

    public CredentialConfig setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public String getProvider() {
        return this.provider;
    }

    public CredentialConfig setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
        return this;
    }

    public String getDiscoveryUrl() {
        return this.discoveryUrl;
    }

    public CredentialConfig setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    public String getIssuer() {
        return this.issuer;
    }

    public CredentialConfig setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    public CredentialConfig setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    public CredentialConfig setUserinfoEndpoint(String userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
        return this;
    }

    public String getUserinfoEndpoint() {
        return this.userinfoEndpoint;
    }

    public CredentialConfig setJwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
        return this;
    }

    public String getJwksUri() {
        return this.jwksUri;
    }

    public CredentialConfig setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientId() {
        return this.clientId;
    }

    public CredentialConfig setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public CredentialConfig setScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }

    public String getScopes() {
        return this.scopes;
    }

    public CredentialConfig setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    public String getRedirectUri() {
        return this.redirectUri;
    }

    public CredentialConfig setTokenEncryptionKeyId(String tokenEncryptionKeyId) {
        this.tokenEncryptionKeyId = tokenEncryptionKeyId;
        return this;
    }

    public String getTokenEncryptionKeyId() {
        return this.tokenEncryptionKeyId;
    }

    public CredentialConfig setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public CredentialConfig setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public CredentialConfig setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    @Override
    public String toString() {
        return "CredentialConfig{" + "apiKey=" + apiKey + "\n" + "configType=" + configType + "\n" + "provider=" + provider + "\n" + "discoveryUrl=" + discoveryUrl + "\n"
                + "issuer=" + issuer + "\n" + "authorizationEndpoint=" + authorizationEndpoint + "\n" + "tokenEndpoint=" + tokenEndpoint + "\n" + "userinfoEndpoint="
                + userinfoEndpoint + "\n" + "jwksUri=" + jwksUri + "\n" + "clientId=" + clientId + "\n" + "clientSecret=" + clientSecret + "\n" + "scopes=" + scopes + "\n"
                + "redirectUri=" + redirectUri + "\n" + "tokenEncryptionKeyId=" + tokenEncryptionKeyId + "\n" + "roleArn=" + roleArn + "\n" + "externalId=" + externalId + "\n"
                + "durationSeconds=" + durationSeconds + "\n" + "}";
    }

}