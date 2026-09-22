package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTLSUsingPUTRequest extends BaseBceRequest {

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    /**
    * 操作类型
    */
    private String action;

    /**
    * 实例ID
    */
    private String instanceId;

    public String getEngineType() {
        return engineType;
    }

    public ModifyTLSUsingPUTRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getAction() {
        return action;
    }

    public ModifyTLSUsingPUTRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyTLSUsingPUTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
