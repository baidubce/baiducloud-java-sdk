package com.baidubce.cce.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstancesByInstanceGroupIDPage {
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
    @JsonProperty("list")
    private List<Object> cceList;

    public ListInstancesByInstanceGroupIDPage setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListInstancesByInstanceGroupIDPage setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesByInstanceGroupIDPage setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListInstancesByInstanceGroupIDPage setList(List<Object> cceList) {
        this.cceList = cceList;
        return this;
    }

    public List<Object> getList() {
        return this.cceList;
    }

    @Override
    public String toString() {
        return "ListInstancesByInstanceGroupIDPage{" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "cceList=" + cceList + "\n"
                + "}";
    }

}