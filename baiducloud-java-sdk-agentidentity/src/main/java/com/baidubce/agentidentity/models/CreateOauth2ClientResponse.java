package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateOauth2ClientResponse extends BaseBceResponse {

    /**
    * 客户端记录 ID
    */
    private String id;

    /**
    * 系统生成的 OAuth2 client_id
    */
    private String clientId;

    /**
    * client_secret 明文（仅此一次）
    */
    private String clientSecret;

    /**
    * 客户端名称
    */
    private String name;

    /**
    * 客户端类型：WEB_APP / SPA / M2M
    */
    private String clientType;

    /**
    * 创建时间
    */
    private String createdAt;

    public String getId() {
        return id;
    }

    public CreateOauth2ClientResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public CreateOauth2ClientResponse setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public CreateOauth2ClientResponse setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateOauth2ClientResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getClientType() {
        return clientType;
    }

    public CreateOauth2ClientResponse setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public CreateOauth2ClientResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return "CreateOauth2ClientResponse{" + "id=" + id + "\n" + "clientId=" + clientId + "\n" + "clientSecret=" + clientSecret + "\n" + "name=" + name + "\n" + "clientType="
                + clientType + "\n" + "createdAt=" + createdAt + "\n" + "}";
    }

}
