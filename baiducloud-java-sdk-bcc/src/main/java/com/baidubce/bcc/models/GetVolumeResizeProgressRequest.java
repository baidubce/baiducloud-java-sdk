package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetVolumeResizeProgressRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    public String getVolumeId() {
        return volumeId;
    }

    public GetVolumeResizeProgressRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

}
