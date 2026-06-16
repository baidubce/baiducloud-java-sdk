package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteDeploySetRequest extends BaseBceRequest {

    /**
    * deployId
    */
    @JsonIgnore
    private String deployId;

    public String getDeployId() {
        return deployId;
    }

    public DeleteDeploySetRequest setDeployId(String deployId) {
        this.deployId = deployId;
        return this;
    }

}
