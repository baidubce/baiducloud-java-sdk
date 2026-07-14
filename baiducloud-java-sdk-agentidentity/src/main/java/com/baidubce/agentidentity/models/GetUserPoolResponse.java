package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetUserPoolResponse extends BaseBceResponse {

    /**
    * 用户池 ID
    */
    private String id;

    /**
    * BCE 账户 ID
    */
    private String domainId;

    /**
    * 用户池名称
    */
    private String name;

    /**
    * 用户池描述
    */
    private String description;

    /**
    * 用户池内用户数量
    */
    private Integer userCount;

    /**
    * 用户池内 OAuth2 客户端数量
    */
    private Integer clientCount;

    /**
    * 用户池内 IdP 配置数量
    */
    private Integer idpCount;

    /**
    * 统一 IdP 回调地址
    */
    private String callbackUrl;

    /**
    * OIDC Discovery URL
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
    * JWKS 端点
    */
    private String jwksUrl;

    /**
    * 是否启用
    */
    private Boolean enabled;

    /**
    * 创建时间
    */
    private String createdAt;

    public String getId() {
        return id;
    }

    public GetUserPoolResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getDomainId() {
        return domainId;
    }

    public GetUserPoolResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetUserPoolResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetUserPoolResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public GetUserPoolResponse setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }

    public Integer getClientCount() {
        return clientCount;
    }

    public GetUserPoolResponse setClientCount(Integer clientCount) {
        this.clientCount = clientCount;
        return this;
    }

    public Integer getIdpCount() {
        return idpCount;
    }

    public GetUserPoolResponse setIdpCount(Integer idpCount) {
        this.idpCount = idpCount;
        return this;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public GetUserPoolResponse setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    public GetUserPoolResponse setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
        return this;
    }

    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    public GetUserPoolResponse setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public GetUserPoolResponse setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    public String getUserinfoEndpoint() {
        return userinfoEndpoint;
    }

    public GetUserPoolResponse setUserinfoEndpoint(String userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
        return this;
    }

    public String getJwksUrl() {
        return jwksUrl;
    }

    public GetUserPoolResponse setJwksUrl(String jwksUrl) {
        this.jwksUrl = jwksUrl;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public GetUserPoolResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public GetUserPoolResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return "GetUserPoolResponse{" + "id=" + id + "\n" + "domainId=" + domainId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "userCount=" + userCount
                + "\n" + "clientCount=" + clientCount + "\n" + "idpCount=" + idpCount + "\n" + "callbackUrl=" + callbackUrl + "\n" + "discoveryUrl=" + discoveryUrl + "\n"
                + "authorizationEndpoint=" + authorizationEndpoint + "\n" + "tokenEndpoint=" + tokenEndpoint + "\n" + "userinfoEndpoint=" + userinfoEndpoint + "\n" + "jwksUrl="
                + jwksUrl + "\n" + "enabled=" + enabled + "\n" + "createdAt=" + createdAt + "\n" + "}";
    }

}
