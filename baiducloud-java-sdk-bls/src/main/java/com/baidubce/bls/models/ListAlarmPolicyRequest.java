package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAlarmPolicyRequest extends BaseBceRequest {

    /**
    * 按策略名称过滤
    */
    private String policyNamePattern;

    /**
    * 按策略ID过滤
    */
    private String policyIdPattern;

    /**
    * 按日志集过滤
    */
    private String logStoreNamePattern;

    /**
    * 按策略状态过滤, 取值：ENABLE, DISABLED
    */
    private String state;

    /**
    * 按通知状态过滤，取值：ENABLE, DISABLED
    */
    private String noticeState;

    /**
    * 排序字段，createdTime: 创建时间， updatedTime: 更新时间，默认值：updatedTime
    */
    private String orderBy;

    /**
    * 排序方式，asc: 升序， desc: 降序，默认值：desc
    */
    private String order;

    /**
    * 第几页，从1开始计数
    */
    private Integer pageNo;

    /**
    * 每页展示数量，最大值：100
    */
    private Integer pageSize;

    public String getPolicyNamePattern() {
        return policyNamePattern;
    }

    public ListAlarmPolicyRequest setPolicyNamePattern(String policyNamePattern) {
        this.policyNamePattern = policyNamePattern;
        return this;
    }

    public String getPolicyIdPattern() {
        return policyIdPattern;
    }

    public ListAlarmPolicyRequest setPolicyIdPattern(String policyIdPattern) {
        this.policyIdPattern = policyIdPattern;
        return this;
    }

    public String getLogStoreNamePattern() {
        return logStoreNamePattern;
    }

    public ListAlarmPolicyRequest setLogStoreNamePattern(String logStoreNamePattern) {
        this.logStoreNamePattern = logStoreNamePattern;
        return this;
    }

    public String getState() {
        return state;
    }

    public ListAlarmPolicyRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getNoticeState() {
        return noticeState;
    }

    public ListAlarmPolicyRequest setNoticeState(String noticeState) {
        this.noticeState = noticeState;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAlarmPolicyRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAlarmPolicyRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAlarmPolicyRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAlarmPolicyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
