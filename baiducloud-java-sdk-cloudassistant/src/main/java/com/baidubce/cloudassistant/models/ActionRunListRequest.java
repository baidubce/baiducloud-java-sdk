package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionRunListRequest extends BaseBceRequest {

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    /**
    * 页码
    */
    private Integer pageNo;

    /**
    * 页大小
    */
    private Integer pageSize;

    /**
    * 排序字段
    */
    private String sort;

    /**
    * 是否升序，默认false
    */
    private Boolean ascending;

    /**
    * action
    */
    private ActionFilter action;

    /**
    * 根据执行状态过滤。枚举值：FAILED（执行失败），RUNNING（执行中），SUCCESS（执行完成）
    */
    private String state;

    /**
    * 根据执行ID过滤
    */
    private String runId;

    /**
    * 时间筛选，Unix时间戳（毫秒）。执行开始时间 >= endTime,Unix时间戳（毫秒）
    */
    private Integer startTime;

    /**
    * 时间筛选，Unix时间戳（毫秒）。执行开始时间 <= endTime，Unix时间戳（毫秒）
    */
    private Integer endTime;

    public String getLocale() {
        return locale;
    }

    public ActionRunListRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ActionRunListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ActionRunListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public ActionRunListRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Boolean getAscending() {
        return ascending;
    }

    public ActionRunListRequest setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }

    public ActionFilter getAction() {
        return action;
    }

    public ActionRunListRequest setAction(ActionFilter action) {
        this.action = action;
        return this;
    }

    public String getState() {
        return state;
    }

    public ActionRunListRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getRunId() {
        return runId;
    }

    public ActionRunListRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public ActionRunListRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public ActionRunListRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

}
