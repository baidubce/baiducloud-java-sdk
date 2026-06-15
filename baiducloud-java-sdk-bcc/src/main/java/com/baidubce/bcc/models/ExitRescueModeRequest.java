package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExitRescueModeRequest extends BaseBceRequest {

    /**
    * 虚拟机实例ID
    */
    private String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    public ExitRescueModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
