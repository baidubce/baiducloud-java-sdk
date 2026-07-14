package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAsGroupV2Request extends BaseBceRequest {

    /**
    * keyword
    */
    @JsonIgnore
    private String keyword;

    /**
    * keywordType
    */
    @JsonIgnore
    private String keywordType;

    /**
    * subKeywordType
    */
    @JsonIgnore
    private String subKeywordType;

    /**
    * order
    */
    @JsonIgnore
    private String order;

    /**
    * orderBy
    */
    @JsonIgnore
    private String orderBy;

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

    public String getKeyword() {
        return keyword;
    }

    public ListAsGroupV2Request setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public ListAsGroupV2Request setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getSubKeywordType() {
        return subKeywordType;
    }

    public ListAsGroupV2Request setSubKeywordType(String subKeywordType) {
        this.subKeywordType = subKeywordType;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAsGroupV2Request setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAsGroupV2Request setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAsGroupV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAsGroupV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
