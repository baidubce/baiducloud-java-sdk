package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeModelRequest extends BaseBceRequest {

    /**
    * modelId
    */
    @JsonIgnore
    private String modelId;

    public String getModelId() {
        return modelId;
    }

    public DescribeModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

}
