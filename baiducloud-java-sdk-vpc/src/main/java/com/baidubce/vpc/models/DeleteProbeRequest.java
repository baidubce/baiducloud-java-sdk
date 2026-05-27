package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteProbeRequest extends BaseBceRequest {

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

    public DeleteProbeRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteProbeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
