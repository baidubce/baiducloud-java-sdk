package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAlarmExecutionStatsRequest extends BaseBceRequest {

    /**
    * 按策略ID过滤
    */
    private String policyId;

    /**
    * 按策略名称过滤
    */
    private String policyName;

    /**
    * 按日志集过滤
    */
    private String logStoreName;

    /**
    * 按报警状态过滤，取值：OK: 已恢复, ALERT: 报警中, CLOSED: 已关闭
    */
    private List<String> states;

    /**
    * 查询开始时间，UTC时间，默认值：30天前
    */
    private String startDateTime;

    /**
    * 查询结束时间，UTC时间，默认值：当前时间
    */
    private String endDateTime;

    /**
    * 排序字段，totalCount: 执行次数, failCount：执行失败次数, noticeTotalCount: 通知次数, noticeFailCount：通知失败次数
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

    public String getPolicyId() {
        return policyId;
    }

    public ListAlarmExecutionStatsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyName() {
        return policyName;
    }

    public ListAlarmExecutionStatsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public ListAlarmExecutionStatsRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public List<String> getStates() {
        return states;
    }

    public ListAlarmExecutionStatsRequest setStates(List<String> states) {
        this.states = states;
        return this;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public ListAlarmExecutionStatsRequest setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public ListAlarmExecutionStatsRequest setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAlarmExecutionStatsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAlarmExecutionStatsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAlarmExecutionStatsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAlarmExecutionStatsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
