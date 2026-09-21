package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Deleteinstanceusingdelete1Request extends BaseBceRequest {

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

    public String getInstanceId() {
        return instanceId;
    }

    public Deleteinstanceusingdelete1Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public Deleteinstanceusingdelete1Request setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

}
