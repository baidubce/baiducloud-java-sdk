package com.baidubce.bci.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    public GetInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
