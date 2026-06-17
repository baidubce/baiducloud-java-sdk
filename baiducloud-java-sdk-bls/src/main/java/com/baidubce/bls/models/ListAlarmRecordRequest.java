package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAlarmRecordRequest extends BaseBceRequest {

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
    * 按报警等级过滤, 取值：INFO, WARN, CRITICAL
    */
    private String level;

    /**
    * 按报警状态过滤，取值：OK: 已恢复, ALERT: 报警中, CLOSED: 已关闭
    */
    private String state;

    /**
    * 查询开始时间，UTC时间，默认值：30天前
    */
    private String startDateTime;

    /**
    * 查询结束时间，UTC时间，默认值：当前时间
    */
    private String endDateTime;

    /**
    * 排序字段，startTime: 报警开始时间， endTime: 报警结束时间，默认值：startTime
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

    public ListAlarmRecordRequest setPolicyNamePattern(String policyNamePattern) {
        this.policyNamePattern = policyNamePattern;
        return this;
    }

    public String getPolicyIdPattern() {
        return policyIdPattern;
    }

    public ListAlarmRecordRequest setPolicyIdPattern(String policyIdPattern) {
        this.policyIdPattern = policyIdPattern;
        return this;
    }

    public String getLogStoreNamePattern() {
        return logStoreNamePattern;
    }

    public ListAlarmRecordRequest setLogStoreNamePattern(String logStoreNamePattern) {
        this.logStoreNamePattern = logStoreNamePattern;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public ListAlarmRecordRequest setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getState() {
        return state;
    }

    public ListAlarmRecordRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public ListAlarmRecordRequest setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public ListAlarmRecordRequest setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAlarmRecordRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAlarmRecordRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAlarmRecordRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAlarmRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
