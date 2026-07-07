package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateCredentialProviderRequest extends BaseBceRequest {

    /**
    * 凭证提供方 ID
    */
    private String credentialProviderId;

    /**
    * 新的描述，最多 128 字符
    */
    private String desc;

    /**
    * 新的凭证内容（与 desc 至少提供一个）
    */
    private Object credential;

    public String getCredentialProviderId() {
        return credentialProviderId;
    }

    public UpdateCredentialProviderRequest setCredentialProviderId(String credentialProviderId) {
        this.credentialProviderId = credentialProviderId;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public UpdateCredentialProviderRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Object getCredential() {
        return credential;
    }

    public UpdateCredentialProviderRequest setCredential(Object credential) {
        this.credential = credential;
        return this;
    }

}
