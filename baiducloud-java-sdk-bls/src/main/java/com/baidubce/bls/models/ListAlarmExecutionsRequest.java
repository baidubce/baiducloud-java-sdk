package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAlarmExecutionsRequest extends BaseBceRequest {

    /**
    * 按策略ID过滤
    */
    private String policyId;

    /**
    * 按日志集过滤
    */
    private String logStoreName;

    /**
    * 按报警状态过滤，取值：OK: 已恢复, ALERT: 报警中, CLOSED: 已关闭
    */
    private String state;

    /**
    * 按报警通知状态过滤，取值：SENT: 已发送, NOT_SENT: 不发送, FAIL: 发送失败, BLOCK_BY_PENDING_COUNT: 不发送由于频次不足, BLOCK_BY_REPEAT_INTERVAL: 不发送由于重复报警间隔没到, BLOCK_BY_FREQUENCY: 不发送由于发送次数过多,
    * BLOCK_BY_NOTICE_DISABLED: 不发送由于通知关闭
    */
    private List<String> noticeStates;

    /**
    * 查询开始时间，UTC时间，默认值：30天前
    */
    private String startDateTime;

    /**
    * 查询结束时间，UTC时间，默认值：当前时间
    */
    private String endDateTime;

    /**
    * 排序字段，@timestamp: 执行时间， 默认值：@timestamp
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

    public ListAlarmExecutionsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public ListAlarmExecutionsRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getState() {
        return state;
    }

    public ListAlarmExecutionsRequest setState(String state) {
        this.state = state;
        return this;
    }

    public List<String> getNoticeStates() {
        return noticeStates;
    }

    public ListAlarmExecutionsRequest setNoticeStates(List<String> noticeStates) {
        this.noticeStates = noticeStates;
        return this;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public ListAlarmExecutionsRequest setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public ListAlarmExecutionsRequest setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAlarmExecutionsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAlarmExecutionsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAlarmExecutionsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAlarmExecutionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
