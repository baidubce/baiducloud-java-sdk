package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchGetResourceApiKeyResponse extends BaseBceResponse {

    /**
    * name 到 ResourceCredentialDTO 的映射，查不到的 name 对应 null
    */
    private Map<String, ResourceCredentialDTO> credentials;

    public Map<String, ResourceCredentialDTO> getCredentials() {
        return credentials;
    }

    public BatchGetResourceApiKeyResponse setCredentials(Map<String, ResourceCredentialDTO> credentials) {
        this.credentials = credentials;
        return this;
    }

    @Override
    public String toString() {
        return "BatchGetResourceApiKeyResponse{" + "credentials=" + credentials + "\n" + "}";
    }

}
