package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlowLogListRequest extends BaseBceRequest {

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

    public SlowLogListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDatetime() {
        return datetime;
    }

    public SlowLogListRequest setDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }

}
