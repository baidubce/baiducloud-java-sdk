package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetMemoryScalingConfigRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * memSpec
    */
    private MemSpec memSpec;

    public String getInstanceId() {
        return instanceId;
    }

    public SetMemoryScalingConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public MemSpec getMemSpec() {
        return memSpec;
    }

    public SetMemoryScalingConfigRequest setMemSpec(MemSpec memSpec) {
        this.memSpec = memSpec;
        return this;
    }

}
