package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPgLogListRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * date
    */
    @JsonIgnore
    private String date;

    public String getInstanceId() {
        return instanceId;
    }

    public GetPgLogListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDate() {
        return date;
    }

    public GetPgLogListRequest setDate(String date) {
        this.date = date;
        return this;
    }

}
