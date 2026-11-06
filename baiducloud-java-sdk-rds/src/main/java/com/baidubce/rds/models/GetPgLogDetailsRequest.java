package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPgLogDetailsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * pglogId
    */
    @JsonIgnore
    private String pglogId;

    /**
    * downloadValidTimeInSec
    */
    @JsonIgnore
    private Integer downloadValidTimeInSec;

    public String getInstanceId() {
        return instanceId;
    }

    public GetPgLogDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPglogId() {
        return pglogId;
    }

    public GetPgLogDetailsRequest setPglogId(String pglogId) {
        this.pglogId = pglogId;
        return this;
    }

    public Integer getDownloadValidTimeInSec() {
        return downloadValidTimeInSec;
    }

    public GetPgLogDetailsRequest setDownloadValidTimeInSec(Integer downloadValidTimeInSec) {
        this.downloadValidTimeInSec = downloadValidTimeInSec;
        return this;
    }

}
