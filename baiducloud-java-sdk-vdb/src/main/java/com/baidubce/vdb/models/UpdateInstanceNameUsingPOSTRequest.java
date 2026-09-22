package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceNameUsingPOSTRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    /**
    * 实例名称
    */
    private String instanceName;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateInstanceNameUsingPOSTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public UpdateInstanceNameUsingPOSTRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public UpdateInstanceNameUsingPOSTRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

}
