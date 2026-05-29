package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectListResult {
    /**
     * 排序规则，desc为降序，asc为升序
     */
    private String order;

    /**
     * 排序字段
     */
    private String orderBy;

    /**
     * 起始页码
     */
    private Integer pageNo;

    /**
     * 每页显示数据大小
     */
    private Integer pageSize;

    /**
     * 总数目
     */
    private Integer total;

    /**
     * blsDefault
     */
    @JsonProperty("default")
    private Project blsDefault;

    /**
     * 日志组列表
     */
    private List<Project> projects;

    public ProjectListResult setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return this.order;
    }

    public ProjectListResult setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public ProjectListResult setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public ProjectListResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public ProjectListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public ProjectListResult setDefault(Project blsDefault) {
        this.blsDefault = blsDefault;
        return this;
    }

    public Project getDefault() {
        return this.blsDefault;
    }

    public ProjectListResult setProjects(List<Project> projects) {
        this.projects = projects;
        return this;
    }

    public List<Project> getProjects() {
        return this.projects;
    }

    @Override
    public String toString() {
        return "ProjectListResult{" + "order=" + order + "\n" + "orderBy=" + orderBy + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "total=" + total + "\n"
                + "blsDefault=" + blsDefault + "\n" + "projects=" + projects + "\n" + "}";
    }

}