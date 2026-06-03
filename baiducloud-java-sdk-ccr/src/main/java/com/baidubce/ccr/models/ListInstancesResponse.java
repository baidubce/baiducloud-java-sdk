package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstancesResponse extends BaseBceResponse {

    /**
    * 记录总数
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
    * 结果列表
    */
    private List<Instance> instances;

    public Integer getTotal() {
        return total;
    }

    public ListInstancesResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListInstancesResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public ListInstancesResponse setInstances(List<Instance> instances) {
        this.instances = instances;
        return this;
    }

    @Override
    public String toString() {
        return "ListInstancesResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "instances=" + instances + "\n" + "}";
    }

}
