package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDatasetVersionRequest extends BaseBceRequest {

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

    public DescribeDatasetVersionRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public String getVersionId() {
        return versionId;
    }

    public DescribeDatasetVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

}
