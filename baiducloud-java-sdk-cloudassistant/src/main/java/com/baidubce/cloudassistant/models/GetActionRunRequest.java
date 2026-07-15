package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetActionRunRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * withLog
    */
    @JsonIgnore
    private String withLog;

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * childRunState
    */
    @JsonIgnore
    private String childRunState;

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    public String getId() {
        return id;
    }

    public GetActionRunRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getWithLog() {
        return withLog;
    }

    public GetActionRunRequest setWithLog(String withLog) {
        this.withLog = withLog;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetActionRunRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetActionRunRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getChildRunState() {
        return childRunState;
    }

    public GetActionRunRequest setChildRunState(String childRunState) {
        this.childRunState = childRunState;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public GetActionRunRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }

}
