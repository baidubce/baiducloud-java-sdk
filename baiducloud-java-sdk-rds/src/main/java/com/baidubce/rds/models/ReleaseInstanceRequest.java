package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReleaseInstanceRequest extends BaseBceRequest {

    /**
    * instanceIds
    */
    @JsonIgnore
    private String instanceIds;

    public String getInstanceIds() {
        return instanceIds;
    }

    public ReleaseInstanceRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
