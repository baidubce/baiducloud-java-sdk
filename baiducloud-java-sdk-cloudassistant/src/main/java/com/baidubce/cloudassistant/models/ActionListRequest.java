package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionListRequest extends BaseBceRequest {

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
    * 排序字段，可选值createTime（命令创建时间）
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

    public String getLocale() {
        return locale;
    }

    public ActionListRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ActionListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ActionListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public ActionListRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Boolean getAscending() {
        return ascending;
    }

    public ActionListRequest setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }

    public ActionFilter getAction() {
        return action;
    }

    public ActionListRequest setAction(ActionFilter action) {
        this.action = action;
        return this;
    }

}
