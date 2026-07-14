package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAsNodeV2Request extends BaseBceRequest {

    /**
    * groupid
    */
    @JsonIgnore
    private String groupid;

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

    public String getGroupid() {
        return groupid;
    }

    public ListAsNodeV2Request setGroupid(String groupid) {
        this.groupid = groupid;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListAsNodeV2Request setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public ListAsNodeV2Request setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAsNodeV2Request setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAsNodeV2Request setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAsNodeV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAsNodeV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
