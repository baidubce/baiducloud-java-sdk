package com.baidubce.agentidentity.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CredentialProviderDTO {
    /**
     * 凭证提供方 ID
     */
    private String id;

    /**
     * BCE 账户 ID
     */
    private String bceDomainId;

    /**
     * BCE 用户 ID
     */
    private String bceUserId;

    /**
     * 名称
     */
    private String name;

    /**
     * 凭证类型：API_KEY / OAUTH2 / STS
     */
    private String type;

    /**
     * 描述
     */
    private String desc;

    /**
     * credential
     */
    private CredentialConfig credential;

    /**
     * 创建时间
     */
    private String createdAt;

    /**
     * 更新时间
     */
    private String updatedAt;

    public CredentialProviderDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public CredentialProviderDTO setBceDomainId(String bceDomainId) {
        this.bceDomainId = bceDomainId;
        return this;
    }

    public String getBceDomainId() {
        return this.bceDomainId;
    }

    public CredentialProviderDTO setBceUserId(String bceUserId) {
        this.bceUserId = bceUserId;
        return this;
    }

    public String getBceUserId() {
        return this.bceUserId;
    }

    public CredentialProviderDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CredentialProviderDTO setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public CredentialProviderDTO setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public CredentialProviderDTO setCredential(CredentialConfig credential) {
        this.credential = credential;
        return this;
    }

    public CredentialConfig getCredential() {
        return this.credential;
    }

    public CredentialProviderDTO setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public CredentialProviderDTO setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public String toString() {
        return "CredentialProviderDTO{" + "id=" + id + "\n" + "bceDomainId=" + bceDomainId + "\n" + "bceUserId=" + bceUserId + "\n" + "name=" + name + "\n" + "type=" + type + "\n"
                + "desc=" + desc + "\n" + "credential=" + credential + "\n" + "createdAt=" + createdAt + "\n" + "updatedAt=" + updatedAt + "\n" + "}";
    }

}