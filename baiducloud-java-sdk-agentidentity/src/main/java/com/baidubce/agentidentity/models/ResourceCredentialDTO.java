package com.baidubce.agentidentity.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceCredentialDTO {
    /**
     * 凭证类型（API_KEY）
     */
    private String type;

    /**
     * 凭证提供方名称
     */
    private String name;

    /**
     * 凭证内容
     */
    private Object credential;

    /**
     * API Key 明文值
     */
    private String credentialApiKey;

    /**
     * 凭证缓存过期时间（ISO 8601）
     */
    private String expireAt;

    public ResourceCredentialDTO setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ResourceCredentialDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ResourceCredentialDTO setCredential(Object credential) {
        this.credential = credential;
        return this;
    }

    public Object getCredential() {
        return this.credential;
    }

    public ResourceCredentialDTO setCredentialApiKey(String credentialApiKey) {
        this.credentialApiKey = credentialApiKey;
        return this;
    }

    public String getCredentialApiKey() {
        return this.credentialApiKey;
    }

    public ResourceCredentialDTO setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }

    public String getExpireAt() {
        return this.expireAt;
    }

    @Override
    public String toString() {
        return "ResourceCredentialDTO{" + "type=" + type + "\n" + "name=" + name + "\n" + "credential=" + credential + "\n" + "credentialApiKey=" + credentialApiKey + "\n"
                + "expireAt=" + expireAt + "\n" + "}";
    }

}