package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegistryCredential {
    /**
     * Access key，当凭据类型为 `basic` 时，`accessKey` 为用户名
     */
    private String accessKey;

    /**
     * Access secret，当凭据类型为 `oauth` 时，`accessSecret` 为用户密码
     */
    private String accessSecret;

    /**
     * Registry 访问凭据，可选值：`basic`、`oauth`
     */
    private String type;

    public RegistryCredential setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public RegistryCredential setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    public String getAccessSecret() {
        return this.accessSecret;
    }

    public RegistryCredential setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "RegistryCredential{" + "accessKey=" + accessKey + "\n" + "accessSecret=" + accessSecret + "\n" + "type=" + type + "\n" + "}";
    }

}