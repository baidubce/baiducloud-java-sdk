package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteCredentialProviderRequest extends BaseBceRequest {

    /**
    * 凭证提供方 ID
    */
    private String credentialProviderId;

    public String getCredentialProviderId() {
        return credentialProviderId;
    }

    public DeleteCredentialProviderRequest setCredentialProviderId(String credentialProviderId) {
        this.credentialProviderId = credentialProviderId;
        return this;
    }

}
