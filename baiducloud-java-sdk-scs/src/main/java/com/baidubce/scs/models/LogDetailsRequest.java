package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogDetailsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * logId
    */
    @JsonIgnore
    private String logId;

    /**
    * validSeconds
    */
    @JsonIgnore
    private String validSeconds;

    public String getInstanceId() {
        return instanceId;
    }

    public LogDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getLogId() {
        return logId;
    }

    public LogDetailsRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }

    public String getValidSeconds() {
        return validSeconds;
    }

    public LogDetailsRequest setValidSeconds(String validSeconds) {
        this.validSeconds = validSeconds;
        return this;
    }

}
