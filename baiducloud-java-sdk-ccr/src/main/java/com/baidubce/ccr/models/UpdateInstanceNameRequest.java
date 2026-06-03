package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceNameRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 实例名称
    */
    private String name;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateInstanceNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateInstanceNameRequest setName(String name) {
        this.name = name;
        return this;
    }

}
