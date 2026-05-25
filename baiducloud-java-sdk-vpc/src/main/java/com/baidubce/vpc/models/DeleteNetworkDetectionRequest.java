package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteNetworkDetectionRequest extends BaseBceRequest {

    /**
    * probeId
    */
    @JsonIgnore
    private String probeId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getProbeId() {
        return probeId;
    }

    public DeleteNetworkDetectionRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteNetworkDetectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
