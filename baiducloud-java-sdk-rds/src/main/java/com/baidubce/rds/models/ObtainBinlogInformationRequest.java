package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObtainBinlogInformationRequest extends BaseBceRequest {

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
    private String downloadValidTimeInSec;

    public String getInstanceId() {
        return instanceId;
    }

    public ObtainBinlogInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getLogId() {
        return logId;
    }

    public ObtainBinlogInformationRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }

    public String getDownloadValidTimeInSec() {
        return downloadValidTimeInSec;
    }

    public ObtainBinlogInformationRequest setDownloadValidTimeInSec(String downloadValidTimeInSec) {
        this.downloadValidTimeInSec = downloadValidTimeInSec;
        return this;
    }

}
