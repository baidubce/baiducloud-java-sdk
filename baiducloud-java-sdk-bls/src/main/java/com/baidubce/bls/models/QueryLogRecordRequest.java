package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryLogRecordRequest extends BaseBceRequest {

    /**
    * logStoreName
    */
    @JsonIgnore
    private String logStoreName;

    /**
    * project
    */
    @JsonIgnore
    private String project;

    /**
    * logStreamName
    */
    @JsonIgnore
    private String logStreamName;

    /**
    * query
    */
    @JsonIgnore
    private String query;

    /**
    * startDateTime
    */
    @JsonIgnore
    private String startDateTime;

    /**
    * endDateTime
    */
    @JsonIgnore
    private String endDateTime;

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * limit
    */
    @JsonIgnore
    private Integer limit;

    /**
    * sort
    */
    @JsonIgnore
    private String sort;

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

    public String getLogStoreName() {
        return logStoreName;
    }

    public QueryLogRecordRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getProject() {
        return project;
    }

    public QueryLogRecordRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStreamName() {
        return logStreamName;
    }

    public QueryLogRecordRequest setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public QueryLogRecordRequest setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public QueryLogRecordRequest setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public QueryLogRecordRequest setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryLogRecordRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public QueryLogRecordRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public QueryLogRecordRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public QueryLogRecordRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public QueryLogRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
