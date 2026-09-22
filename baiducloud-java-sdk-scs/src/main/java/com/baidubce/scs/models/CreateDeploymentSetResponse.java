package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDeploymentSetResponse extends BaseBceResponse {

    /**
    * 部署集ID。
    */
    private String deploySetId;

    public String getDeploySetId() {
        return deploySetId;
    }

    public CreateDeploymentSetResponse setDeploySetId(String deploySetId) {
        this.deploySetId = deploySetId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDeploymentSetResponse{" + "deploySetId=" + deploySetId + "\n" + "}";
    }

}
