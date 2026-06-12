package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmMaskingsRequest extends BaseBceRequest {

    /**
    * 屏蔽规则名称，模糊查询
    */
    private String maskingName;

    /**
    * 屏蔽规则ID，精确查询
    */
    private String maskingId;

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

    public String getMaskingName() {
        return maskingName;
    }

    public DescribeAlarmMaskingsRequest setMaskingName(String maskingName) {
        this.maskingName = maskingName;
        return this;
    }

    public String getMaskingId() {
        return maskingId;
    }

    public DescribeAlarmMaskingsRequest setMaskingId(String maskingId) {
        this.maskingId = maskingId;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeAlarmMaskingsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeAlarmMaskingsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeAlarmMaskingsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeAlarmMaskingsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
