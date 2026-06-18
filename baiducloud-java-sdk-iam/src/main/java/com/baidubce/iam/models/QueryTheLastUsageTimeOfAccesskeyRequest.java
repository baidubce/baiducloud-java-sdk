package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheLastUsageTimeOfAccesskeyRequest extends BaseBceRequest {

    /**
    * accessKeyId
    */
    @JsonIgnore
    private String accessKeyId;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public QueryTheLastUsageTimeOfAccesskeyRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

}
