package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperatorPage {
    /**
     * operator 列表
     */
    private List<OperatorSpec> operators;

    /**
     * operator 分类列表
     */
    private List<Category> categories;

    /**
     * 排序字段
     */
    private String orderBy;

    /**
     * 排序方向 asc/desc
     */
    private String order;

    /**
     * 页数
     */
    private Integer pageNo;

    /**
     * 每页展示数量
     */
    private Integer pageSize;

    /**
     * 总数量
     */
    private Integer totalCount;

    public OperatorPage setOperators(List<OperatorSpec> operators) {
        this.operators = operators;
        return this;
    }

    public List<OperatorSpec> getOperators() {
        return this.operators;
    }

    public OperatorPage setCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public List<Category> getCategories() {
        return this.categories;
    }

    public OperatorPage setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public OperatorPage setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return this.order;
    }

    public OperatorPage setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public OperatorPage setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public OperatorPage setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    @Override
    public String toString() {
        return "OperatorPage{" + "operators=" + operators + "\n" + "categories=" + categories + "\n" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo
                + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}