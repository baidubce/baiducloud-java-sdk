package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAcceleratorFiltersResponse extends BaseBceResponse {

    /**
    * 镜像按需加载规则总数
    */
    private Integer total;

    /**
    * 当前页
    */
    private Integer pageNo;

    /**
    * 每页记录数
    */
    private Integer pageSize;

    /**
    * 镜像按需加载规则对象列表
    */
    private List<AcceleratorPolicy> policies;

    public Integer getTotal() {
        return total;
    }

    public ListAcceleratorFiltersResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAcceleratorFiltersResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAcceleratorFiltersResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<AcceleratorPolicy> getPolicies() {
        return policies;
    }

    public ListAcceleratorFiltersResponse setPolicies(List<AcceleratorPolicy> policies) {
        this.policies = policies;
        return this;
    }

    @Override
    public String toString() {
        return "ListAcceleratorFiltersResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "policies=" + policies + "\n" + "}";
    }

}
