package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetachVolumeRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    /**
    * 所挂载的实例ID
    */
    private String instanceId;

    public String getVolumeId() {
        return volumeId;
    }

    public DetachVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DetachVolumeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
