package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckTheWhitelistRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    public CheckTheWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
