package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeUnplannedEventsRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 事件状态，支持状态：Inquiring，Processing，Executing，Executed，Abnormal，DisConfirm
    */
    private String serverEventStatus;

    /**
    * 维修事件的id列表
    */
    private List<String> serverEventIds;

    /**
    * 虚机的短id列表
    */
    private List<String> instanceIds;

    /**
    * 故障实例产品类型 （BBC / BCC / HPAS）
    */
    private String productCategory;

    /**
    * 事件类型，支持类型：InstanceRepairBySystemFailureEvent，InstanceRepairOrFastRepairBySystemFailureEvent，LocalDiskInstanceRepairBySystemFailureEvent，
    * LocalDiskInstanceRepairOrFastRepairBySystemFailureEvent
    */
    private String serverEventType;

    /**
    * 根据事件操作日志的类型查询periodStartTime和periodEndTime范围内的事件，支持类型：EventCreate、EventAuthorize、EventExecuting、RejectCheckResult
    */
    private String serverEventLogTimeFilter;

    /**
    * timeFilter类型开始时间, 若为空则只按照periodEndTime限制，符合BCE规范的日期格式
    */
    private String periodStartTime;

    /**
    * timeFilter类型结束时间, 若为空则只按照periodStartTime限制，符合BCE规范的日期格式
    */
    private String periodEndTime;

    /**
    * 每页包含的最大数量，最大数量通常不超过100，缺省值为10
    */
    private Integer maxKeys;

    /**
    * 批量获取列表的查询的起始事件id
    */
    private String marker;

    public String getAction() {
        return action;
    }

    public DescribeUnplannedEventsRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getServerEventStatus() {
        return serverEventStatus;
    }

    public DescribeUnplannedEventsRequest setServerEventStatus(String serverEventStatus) {
        this.serverEventStatus = serverEventStatus;
        return this;
    }

    public List<String> getServerEventIds() {
        return serverEventIds;
    }

    public DescribeUnplannedEventsRequest setServerEventIds(List<String> serverEventIds) {
        this.serverEventIds = serverEventIds;
        return this;
    }

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public DescribeUnplannedEventsRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public DescribeUnplannedEventsRequest setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public String getServerEventType() {
        return serverEventType;
    }

    public DescribeUnplannedEventsRequest setServerEventType(String serverEventType) {
        this.serverEventType = serverEventType;
        return this;
    }

    public String getServerEventLogTimeFilter() {
        return serverEventLogTimeFilter;
    }

    public DescribeUnplannedEventsRequest setServerEventLogTimeFilter(String serverEventLogTimeFilter) {
        this.serverEventLogTimeFilter = serverEventLogTimeFilter;
        return this;
    }

    public String getPeriodStartTime() {
        return periodStartTime;
    }

    public DescribeUnplannedEventsRequest setPeriodStartTime(String periodStartTime) {
        this.periodStartTime = periodStartTime;
        return this;
    }

    public String getPeriodEndTime() {
        return periodEndTime;
    }

    public DescribeUnplannedEventsRequest setPeriodEndTime(String periodEndTime) {
        this.periodEndTime = periodEndTime;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeUnplannedEventsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeUnplannedEventsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
