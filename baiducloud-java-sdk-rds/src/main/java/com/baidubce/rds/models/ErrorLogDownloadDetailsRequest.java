package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorLogDownloadDetailsRequest extends BaseBceRequest {

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
    * downloadValidTimeInSec
    */
    @JsonIgnore
    private Integer downloadValidTimeInSec;

    public String getInstanceId() {
        return instanceId;
    }

    public ErrorLogDownloadDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getLogId() {
        return logId;
    }

    public ErrorLogDownloadDetailsRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }

    public Integer getDownloadValidTimeInSec() {
        return downloadValidTimeInSec;
    }

    public ErrorLogDownloadDetailsRequest setDownloadValidTimeInSec(Integer downloadValidTimeInSec) {
        this.downloadValidTimeInSec = downloadValidTimeInSec;
        return this;
    }

}
