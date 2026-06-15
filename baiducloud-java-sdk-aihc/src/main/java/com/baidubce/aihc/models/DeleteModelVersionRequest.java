package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteModelVersionRequest extends BaseBceRequest {

    /**
    * modelId
    */
    @JsonIgnore
    private String modelId;

    /**
    * versionId
    */
    @JsonIgnore
    private String versionId;

    public String getModelId() {
        return modelId;
    }

    public DeleteModelVersionRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    public String getVersionId() {
        return versionId;
    }

    public DeleteModelVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

}
