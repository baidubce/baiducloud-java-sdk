package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogListRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * startTime
    */
    @JsonIgnore
    private String startTime;

    /**
    * endTime
    */
    @JsonIgnore
    private String endTime;

    public String getInstanceId() {
        return instanceId;
    }

    public LogListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public LogListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public LogListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

}
