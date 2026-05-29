package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PullLogRecordRequest extends BaseBceRequest {

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
    * limit
    */
    @JsonIgnore
    private Integer limit;

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    public String getLogStoreName() {
        return logStoreName;
    }

    public PullLogRecordRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getProject() {
        return project;
    }

    public PullLogRecordRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStreamName() {
        return logStreamName;
    }

    public PullLogRecordRequest setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public PullLogRecordRequest setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public PullLogRecordRequest setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public PullLogRecordRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public PullLogRecordRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
