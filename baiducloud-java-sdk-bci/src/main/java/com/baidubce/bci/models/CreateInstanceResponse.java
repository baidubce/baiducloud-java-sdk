package com.baidubce.bci.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInstanceResponse extends BaseBceResponse {

    /**
    * BCI容器实例ID
    */
    private String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateInstanceResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateInstanceResponse{" + "instanceId=" + instanceId + "\n" + "}";
    }

}
