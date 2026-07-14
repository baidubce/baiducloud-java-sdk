package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateCredentialProviderResponse extends BaseBceResponse {

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

    public String getId() {
        return id;
    }

    public UpdateCredentialProviderResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getBceDomainId() {
        return bceDomainId;
    }

    public UpdateCredentialProviderResponse setBceDomainId(String bceDomainId) {
        this.bceDomainId = bceDomainId;
        return this;
    }

    public String getBceUserId() {
        return bceUserId;
    }

    public UpdateCredentialProviderResponse setBceUserId(String bceUserId) {
        this.bceUserId = bceUserId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateCredentialProviderResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public UpdateCredentialProviderResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public UpdateCredentialProviderResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public CredentialConfig getCredential() {
        return credential;
    }

    public UpdateCredentialProviderResponse setCredential(CredentialConfig credential) {
        this.credential = credential;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public UpdateCredentialProviderResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UpdateCredentialProviderResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateCredentialProviderResponse{" + "id=" + id + "\n" + "bceDomainId=" + bceDomainId + "\n" + "bceUserId=" + bceUserId + "\n" + "name=" + name + "\n" + "type="
                + type + "\n" + "desc=" + desc + "\n" + "credential=" + credential + "\n" + "createdAt=" + createdAt + "\n" + "updatedAt=" + updatedAt + "\n" + "}";
    }

}
