package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstanceEnisRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    public ListInstanceEnisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
