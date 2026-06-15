package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteDatasetVersionRequest extends BaseBceRequest {

    /**
    * datasetId
    */
    @JsonIgnore
    private String datasetId;

    /**
    * versionId
    */
    @JsonIgnore
    private String versionId;

    public String getDatasetId() {
        return datasetId;
    }

    public DeleteDatasetVersionRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public String getVersionId() {
        return versionId;
    }

    public DeleteDatasetVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

}
