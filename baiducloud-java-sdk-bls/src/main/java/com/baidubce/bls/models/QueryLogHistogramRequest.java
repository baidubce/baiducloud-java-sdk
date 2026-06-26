package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryLogHistogramRequest extends BaseBceRequest {

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
    * logStoreType
    */
    @JsonIgnore
    private String logStoreType;

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

    public String getLogStoreName() {
        return logStoreName;
    }

    public QueryLogHistogramRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getProject() {
        return project;
    }

    public QueryLogHistogramRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStreamName() {
        return logStreamName;
    }

    public QueryLogHistogramRequest setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    public String getLogStoreType() {
        return logStoreType;
    }

    public QueryLogHistogramRequest setLogStoreType(String logStoreType) {
        this.logStoreType = logStoreType;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public QueryLogHistogramRequest setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public QueryLogHistogramRequest setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public QueryLogHistogramRequest setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

}
