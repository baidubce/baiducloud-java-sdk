package com.baidubce.cce.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTaskPage {
    /**
     * 查询页码序号
     */
    private Integer pageNo;

    /**
     * 查询结果每页条目数
     */
    private Integer pageSize;

    /**
     * 查询结果总条目数
     */
    private Integer totalCount;

    /**
     * 任务列表
     */
    private List<Object> items;

    public ListTaskPage setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListTaskPage setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskPage setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTaskPage setItems(List<Object> items) {
        this.items = items;
        return this;
    }

    public List<Object> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        return "ListTaskPage{" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "items=" + items + "\n" + "}";
    }

}