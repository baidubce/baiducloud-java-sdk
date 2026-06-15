package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDatasetRequest extends BaseBceRequest {

    /**
    * datasetId
    */
    @JsonIgnore
    private String datasetId;

    public String getDatasetId() {
        return datasetId;
    }

    public DescribeDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

}
