package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteDeploymentSetRequest extends BaseBceRequest {

    /**
    * deploySetId
    */
    @JsonIgnore
    private String deploySetId;

    public String getDeploySetId() {
        return deploySetId;
    }

    public DeleteDeploymentSetRequest setDeploySetId(String deploySetId) {
        this.deploySetId = deploySetId;
        return this;
    }

}
