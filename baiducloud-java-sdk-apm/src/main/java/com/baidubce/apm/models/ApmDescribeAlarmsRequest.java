package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmDescribeAlarmsRequest extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 按策略名称过滤
    */
    private String policyName;

    /**
    * 报警等级过滤，可选值：NOTICE-通知，WARNING-警告，MAJOR-重要，CRITICAL-严重
    */
    private String level;

    /**
    * 指标类型过滤，可选值：SERVER-服务端性能指标，CLIENT-客户端性能指标，DB-数据库指标，PRODUCER_CONSUMER-生产者消费者，INTERNAL_FUNCTION-内部函数，JVM-JVM监控，EXCEPTION-异常监控
    */
    private String metricKind;

    /**
    * 报警状态过滤，可选值：OK-已恢复，ALERT-报警中，NODATA-无数据报警，CLOSED-已关闭
    */
    private String state;

    /**
    * 排序字段，默认值：startTime，可选值：startTime-报警开始时间
    */
    private String orderBy;

    /**
    * 排序方式，默认值：desc，可选值：desc-降序，asc-升序
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

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public ApmDescribeAlarmsRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public ApmDescribeAlarmsRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getPolicyName() {
        return policyName;
    }

    public ApmDescribeAlarmsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public ApmDescribeAlarmsRequest setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getMetricKind() {
        return metricKind;
    }

    public ApmDescribeAlarmsRequest setMetricKind(String metricKind) {
        this.metricKind = metricKind;
        return this;
    }

    public String getState() {
        return state;
    }

    public ApmDescribeAlarmsRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ApmDescribeAlarmsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ApmDescribeAlarmsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ApmDescribeAlarmsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ApmDescribeAlarmsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
