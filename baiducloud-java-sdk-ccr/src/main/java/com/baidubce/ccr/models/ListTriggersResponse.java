package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTriggersResponse extends BaseBceResponse {

    /**
    * 触发器策略总数
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
    * 触发器策略对象列表
    */
    private List<TriggerPolicy> policies;

    public Integer getTotal() {
        return total;
    }

    public ListTriggersResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListTriggersResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListTriggersResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<TriggerPolicy> getPolicies() {
        return policies;
    }

    public ListTriggersResponse setPolicies(List<TriggerPolicy> policies) {
        this.policies = policies;
        return this;
    }

    @Override
    public String toString() {
        return "ListTriggersResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "policies=" + policies + "\n" + "}";
    }

}
