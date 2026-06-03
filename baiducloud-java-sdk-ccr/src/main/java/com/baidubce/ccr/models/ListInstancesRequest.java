package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstancesRequest extends BaseBceRequest {

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * keywordType
    */
    @JsonIgnore
    private String keywordType;

    /**
    * keyword
    */
    @JsonIgnore
    private String keyword;

    /**
    * acrossregion
    */
    @JsonIgnore
    private String acrossregion;

    public Integer getPageNo() {
        return pageNo;
    }

    public ListInstancesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public ListInstancesRequest setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListInstancesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getAcrossregion() {
        return acrossregion;
    }

    public ListInstancesRequest setAcrossregion(String acrossregion) {
        this.acrossregion = acrossregion;
        return this;
    }

}
