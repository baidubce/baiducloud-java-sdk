package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyListResult {
    /**
     * 第几页
     */
    private Integer pageNo;

    /**
     * 每页展示数量
     */
    private Integer pageSize;

    /**
     * 总数
     */
    private Integer totalCount;

    /**
     * 报警策略详情
     */
    private List<Policy> policies;

    public PolicyListResult setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public PolicyListResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public PolicyListResult setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public PolicyListResult setPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    public List<Policy> getPolicies() {
        return this.policies;
    }

    @Override
    public String toString() {
        return "PolicyListResult{" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "policies=" + policies + "\n" + "}";
    }

}