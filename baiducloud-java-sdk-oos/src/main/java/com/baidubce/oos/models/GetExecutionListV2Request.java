package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetExecutionListV2Request extends BaseBceRequest {

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    /**
    * 名称空间，默认 default
    */
    private String namespace;

    /**
    * 模版过滤条件
    */
    private Object template;

    /**
    * 执行状态，如设置则只返回指定状态的执行列表，可选值：RUNNING（执行中）、SUCCESS（执行成功）、FAILED（执行失败）、CANCELED（已取消）、PENDING（等待中）
    */
    private String state;

    /**
    * 触发方式
    */
    private String trigger;

    /**
    * 定时运维名称，如设置则只返回指定定时运维触发的执行列表
    */
    private String cronExecutionName;

    /**
    * 报警事件运维名称，如设置则只返回指定报警事件运维触发的执行列表
    */
    private String eventExecutionName;

    /**
    * 执行开始时间，单位：毫秒，默认值为7天前毫秒时间戳
    */
    private Integer startTime;

    /**
    * 执行结束时间，单位：毫秒，默认值为当前毫秒时间戳
    */
    private Integer endTime;

    /**
    * 排序字段，默认为执行开始时间，可选值：startTime，endTime
    */
    private String sort;

    /**
    * 是否升序，默认false
    */
    private Boolean ascending;

    /**
    * 页数，从 1 开始计数
    */
    private Integer pageNo;

    /**
    * 每页展示数量，最大 100
    */
    private Integer pageSize;

    public String getLocale() {
        return locale;
    }

    public GetExecutionListV2Request setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public GetExecutionListV2Request setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Object getTemplate() {
        return template;
    }

    public GetExecutionListV2Request setTemplate(Object template) {
        this.template = template;
        return this;
    }

    public String getState() {
        return state;
    }

    public GetExecutionListV2Request setState(String state) {
        this.state = state;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public GetExecutionListV2Request setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getCronExecutionName() {
        return cronExecutionName;
    }

    public GetExecutionListV2Request setCronExecutionName(String cronExecutionName) {
        this.cronExecutionName = cronExecutionName;
        return this;
    }

    public String getEventExecutionName() {
        return eventExecutionName;
    }

    public GetExecutionListV2Request setEventExecutionName(String eventExecutionName) {
        this.eventExecutionName = eventExecutionName;
        return this;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public GetExecutionListV2Request setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public GetExecutionListV2Request setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public GetExecutionListV2Request setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Boolean getAscending() {
        return ascending;
    }

    public GetExecutionListV2Request setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetExecutionListV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetExecutionListV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
