package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDeploySetResponse extends BaseBceResponse {

    /**
    * 部署集Ids
    */
    private List<String> deploySetIds;

    public List<String> getDeploySetIds() {
        return deploySetIds;
    }

    public CreateDeploySetResponse setDeploySetIds(List<String> deploySetIds) {
        this.deploySetIds = deploySetIds;
        return this;
    }

    @Override
    public String toString() {
        return "CreateDeploySetResponse{" + "deploySetIds=" + deploySetIds + "\n" + "}";
    }

}
