package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogSwitchRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 开关动作。open（开启）、close（关闭）
    */
    private String action;

    public String getInstanceId() {
        return instanceId;
    }

    public AuditLogSwitchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public AuditLogSwitchRequest setAction(String action) {
        this.action = action;
        return this;
    }

}
