package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmDescribeAlarmPoliciesRequest extends BaseBceRequest {

    /**
    * 按策略名称筛选
    */
    private String policyName;

    /**
    * 按策略ID筛选
    */
    private String policyId;

    /**
    * 策略状态筛选，可选值：ENABLED-启动，DISABLED-禁用
    */
    private String state;

    /**
    * 策略级别筛选，可选值：NOTICE-通知，WARNING-警告，MAJOR-重要，CRITICAL-严重
    */
    private String level;

    /**
    * 指标类别筛选，可选值：SERVER-服务端性能指标，CLIENT-客户端性能指标，DB-数据库指标，PRODUCER-生产者，CONSUMER-消费者，INTERNAL_FUNCTION-内部函数，JVM-JVM监控，EXCEPTION-异常监控
    */
    private String metricKind;

    /**
    * 排序字段，默认值：updatedTime，可选值：updatedTime-更新时间，createdTime-创建时间
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

    public String getPolicyName() {
        return policyName;
    }

    public ApmDescribeAlarmPoliciesRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public ApmDescribeAlarmPoliciesRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getState() {
        return state;
    }

    public ApmDescribeAlarmPoliciesRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public ApmDescribeAlarmPoliciesRequest setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getMetricKind() {
        return metricKind;
    }

    public ApmDescribeAlarmPoliciesRequest setMetricKind(String metricKind) {
        this.metricKind = metricKind;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ApmDescribeAlarmPoliciesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ApmDescribeAlarmPoliciesRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ApmDescribeAlarmPoliciesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ApmDescribeAlarmPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
