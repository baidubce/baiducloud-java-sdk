package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOperatorListV2Request extends BaseBceRequest {

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    /**
    * 系统模板操作符过滤条件
    */
    private Object operator;

    /**
    * 排序字段
    */
    private String sort;

    /**
    * 是否升序
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

    public GetOperatorListV2Request setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public Object getOperator() {
        return operator;
    }

    public GetOperatorListV2Request setOperator(Object operator) {
        this.operator = operator;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public GetOperatorListV2Request setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Boolean getAscending() {
        return ascending;
    }

    public GetOperatorListV2Request setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetOperatorListV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetOperatorListV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
