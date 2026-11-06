package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorLogListRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * datetime
    */
    @JsonIgnore
    private String datetime;

    public String getInstanceId() {
        return instanceId;
    }

    public ErrorLogListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDatetime() {
        return datetime;
    }

    public ErrorLogListRequest setDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }

}
