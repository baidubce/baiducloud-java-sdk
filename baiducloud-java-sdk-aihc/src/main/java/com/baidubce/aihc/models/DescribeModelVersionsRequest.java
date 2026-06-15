package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeModelVersionsRequest extends BaseBceRequest {

    /**
    * modelId
    */
    @JsonIgnore
    private String modelId;

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

    public String getModelId() {
        return modelId;
    }

    public DescribeModelVersionsRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public DescribeModelVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeModelVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
