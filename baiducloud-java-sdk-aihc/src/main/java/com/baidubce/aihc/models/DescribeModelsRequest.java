package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeModelsRequest extends BaseBceRequest {

    /**
    * keyword
    */
    @JsonIgnore
    private String keyword;

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

    public String getKeyword() {
        return keyword;
    }

    public DescribeModelsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public DescribeModelsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeModelsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
