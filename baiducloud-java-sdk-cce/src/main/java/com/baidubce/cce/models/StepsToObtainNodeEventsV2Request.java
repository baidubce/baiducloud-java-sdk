package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StepsToObtainNodeEventsV2Request extends BaseBceRequest {

    /**
    * instanceID
    */
    @JsonIgnore
    private String instanceID;

    public String getInstanceID() {
        return instanceID;
    }

    public StepsToObtainNodeEventsV2Request setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

}
