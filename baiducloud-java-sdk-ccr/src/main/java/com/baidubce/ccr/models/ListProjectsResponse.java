package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListProjectsResponse extends BaseBceResponse {

    /**
    * 当前页
    */
    private Integer pageNo;

    /**
    * 每页记录数
    */
    private Integer pageSize;

    /**
    * 命名空间列表
    */
    private List<Project> projects;

    /**
    * 用户命名空间总数
    */
    private Integer total;

    public Integer getPageNo() {
        return pageNo;
    }

    public ListProjectsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListProjectsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public ListProjectsResponse setProjects(List<Project> projects) {
        this.projects = projects;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public ListProjectsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return "ListProjectsResponse{" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "projects=" + projects + "\n" + "total=" + total + "\n" + "}";
    }

}
