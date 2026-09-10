package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTheListOfClusterNodesV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

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
    * orderBy
    */
    @JsonIgnore
    private String orderBy;

    /**
    * order
    */
    @JsonIgnore
    private String order;

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

    public String getClusterID() {
        return clusterID;
    }

    public GetTheListOfClusterNodesV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public GetTheListOfClusterNodesV2Request setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public GetTheListOfClusterNodesV2Request setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public GetTheListOfClusterNodesV2Request setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public GetTheListOfClusterNodesV2Request setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetTheListOfClusterNodesV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetTheListOfClusterNodesV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
