package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstancesResponse extends BaseBceResponse {

    /**
    * 监控实例列表排序依据字段
    */
    private String orderBy;

    /**
    * 监控实例列表排序方式：desc倒序，asc升序
    */
    private String order;

    /**
    * 实例列表分页当前页码数
    */
    private Integer pageNo;

    /**
    * 当前页页监控实例个数
    */
    private Integer pageSize;

    /**
    * 监控实例总个数
    */
    private Integer totalCount;

    /**
    * 监控实例列表
    */
    private List<MonitorInstance> instances;

    public String getOrderBy() {
        return orderBy;
    }

    public ListInstancesResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListInstancesResponse setOrder(String order) {
        this.order = order;
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

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<MonitorInstance> getInstances() {
        return instances;
    }

    public ListInstancesResponse setInstances(List<MonitorInstance> instances) {
        this.instances = instances;
        return this;
    }

    @Override
    public String toString() {
        return "ListInstancesResponse{" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount="
                + totalCount + "\n" + "instances=" + instances + "\n" + "}";
    }

}
