package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmsRequest extends BaseBceRequest {

    /**
    * 查询起始时间
    */
    private String startTime;

    /**
    * 查询结束时间
    */
    private String endTime;

    /**
    * 报警策略名称，模糊查询
    */
    private String policyName;

    /**
    * 云产品命名空间
    */
    private String scope;

    /**
    * 资源类型
    */
    private String resourceType;

    /**
    * 报警状态，可选OK/ALERT/NO_DATA/CLOSED
    */
    private String state;

    /**
    * 报警类型
    */
    private String type;

    /**
    * 排序方式，asc/desc
    */
    private String order;

    /**
    * 排序字段
    */
    private String orderBy;

    /**
    * 页码
    */
    private Integer pageNo;

    /**
    * 每页条数
    */
    private Integer pageSize;

    public String getStartTime() {
        return startTime;
    }

    public DescribeAlarmsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public DescribeAlarmsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getPolicyName() {
        return policyName;
    }

    public DescribeAlarmsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeAlarmsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeAlarmsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getState() {
        return state;
    }

    public DescribeAlarmsRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getType() {
        return type;
    }

    public DescribeAlarmsRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeAlarmsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeAlarmsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeAlarmsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeAlarmsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
