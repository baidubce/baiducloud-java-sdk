package com.baidubce.cce.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstancePage {
    /**
     * 
     */
    private String clusterID;

    /**
     * 
     */
    private String keywordType;

    /**
     * 
     */
    private String keyword;

    /**
     * 
     */
    private String orderBy;

    /**
     * 
     */
    private String order;

    /**
     * 
     */
    private Integer pageNo;

    /**
     * 
     */
    private Integer pageSize;

    /**
     * 
     */
    private Integer totalCount;

    /**
     * 
     */
    private List<Object> instanceList;

    public InstancePage setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getClusterID() {
        return this.clusterID;
    }

    public InstancePage setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeywordType() {
        return this.keywordType;
    }

    public InstancePage setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public InstancePage setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public InstancePage setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return this.order;
    }

    public InstancePage setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public InstancePage setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public InstancePage setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public InstancePage setInstanceList(List<Object> instanceList) {
        this.instanceList = instanceList;
        return this;
    }

    public List<Object> getInstanceList() {
        return this.instanceList;
    }

    @Override
    public String toString() {
        return "InstancePage{" + "clusterID=" + clusterID + "\n" + "keywordType=" + keywordType + "\n" + "keyword=" + keyword + "\n" + "orderBy=" + orderBy + "\n" + "order="
                + order + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "instanceList=" + instanceList + "\n" + "}";
    }

}