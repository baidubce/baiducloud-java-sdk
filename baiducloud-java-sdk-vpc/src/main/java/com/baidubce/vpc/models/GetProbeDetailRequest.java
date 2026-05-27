package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetProbeDetailRequest extends BaseBceRequest {

    /**
    * probeId
    */
    @JsonIgnore
    private String probeId;

    public String getProbeId() {
        return probeId;
    }

    public GetProbeDetailRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

}
