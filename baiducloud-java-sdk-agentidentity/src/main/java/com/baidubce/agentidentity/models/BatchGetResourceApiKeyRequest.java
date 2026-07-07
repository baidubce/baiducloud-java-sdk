package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.baidubce.annotation.Host;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchGetResourceApiKeyRequest extends BaseBceRequest {

    /**
    * xBceWorkloadAccessToken
    */
    @Host
    @JsonIgnore
    private String xBceWorkloadAccessToken;

    /**
    * 凭证提供方名称列表，最多 10 个
    */
    private List<String> names;

    /**
    * WAT 令牌，也可通过 Header 传递
    */
    private String workloadAccessToken;

    public String getXBceWorkloadAccessToken() {
        return xBceWorkloadAccessToken;
    }

    public BatchGetResourceApiKeyRequest setXBceWorkloadAccessToken(String xBceWorkloadAccessToken) {
        this.xBceWorkloadAccessToken = xBceWorkloadAccessToken;
        return this;
    }

    public List<String> getNames() {
        return names;
    }

    public BatchGetResourceApiKeyRequest setNames(List<String> names) {
        this.names = names;
        return this;
    }

    public String getWorkloadAccessToken() {
        return workloadAccessToken;
    }

    public BatchGetResourceApiKeyRequest setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }

}
