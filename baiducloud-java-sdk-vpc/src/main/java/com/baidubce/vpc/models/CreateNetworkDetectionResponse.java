package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNetworkDetectionResponse extends BaseBceResponse {

    /**
    * 网络探测的ID
    */
    private String probeId;

    public String getProbeId() {
        return probeId;
    }

    public CreateNetworkDetectionResponse setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateNetworkDetectionResponse{" + "probeId=" + probeId + "\n" + "}";
    }

}
