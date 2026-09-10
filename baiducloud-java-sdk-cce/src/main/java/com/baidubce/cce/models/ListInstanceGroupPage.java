package com.baidubce.cce.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstanceGroupPage {
    /**
     * 查询页码序号
     */
    private Integer pageNo;

    /**
     * 查询结果每页条目数
     */
    private Integer pageSize;

    /**
     * 总条目数
     */
    private Integer totalCount;

    /**
     * 节点组列表
     */
    @JsonProperty("list")
    private List<Object> cceList;

    public ListInstanceGroupPage setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListInstanceGroupPage setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceGroupPage setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListInstanceGroupPage setList(List<Object> cceList) {
        this.cceList = cceList;
        return this;
    }

    public List<Object> getList() {
        return this.cceList;
    }

    @Override
    public String toString() {
        return "ListInstanceGroupPage{" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "cceList=" + cceList + "\n" + "}";
    }

}