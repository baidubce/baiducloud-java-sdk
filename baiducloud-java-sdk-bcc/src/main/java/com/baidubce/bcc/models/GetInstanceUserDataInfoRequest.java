package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceUserDataInfoRequest extends BaseBceRequest {

    /**
    * 待启动的实例ID
    */
    private String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    public GetInstanceUserDataInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
