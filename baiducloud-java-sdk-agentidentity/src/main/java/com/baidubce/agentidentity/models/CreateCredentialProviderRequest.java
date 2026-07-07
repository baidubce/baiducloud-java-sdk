package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCredentialProviderRequest extends BaseBceRequest {

    /**
    * 凭证提供方名称，1-64 字符，仅允许字母、数字、下划线和连字符（^[a-zA-Z0-9_-]+$）
    */
    private String name;

    /**
    * 凭证类型：API_KEY / OAUTH2 / STS
    */
    private String type;

    /**
    * 描述，最多 128 字符
    */
    private String desc;

    /**
    * 凭证内容（随 type 不同：API_KEY 含 apiKey；OAUTH2 含 provider/configType/clientId/clientSecret 等；STS 含 roleArn/externalId/durationSeconds）
    */
    private Object credential;

    public String getName() {
        return name;
    }

    public CreateCredentialProviderRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateCredentialProviderRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateCredentialProviderRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Object getCredential() {
        return credential;
    }

    public CreateCredentialProviderRequest setCredential(Object credential) {
        this.credential = credential;
        return this;
    }

}
