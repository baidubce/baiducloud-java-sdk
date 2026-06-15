package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDatasetVersionsRequest extends BaseBceRequest {

    /**
    * datasetId
    */
    @JsonIgnore
    private String datasetId;

    /**
    * pageNumber
    */
    @JsonIgnore
    private Integer pageNumber;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    public String getDatasetId() {
        return datasetId;
    }

    public DescribeDatasetVersionsRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public DescribeDatasetVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeDatasetVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
