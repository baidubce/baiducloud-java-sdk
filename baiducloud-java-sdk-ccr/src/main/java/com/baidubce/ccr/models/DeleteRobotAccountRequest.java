package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRobotAccountRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * robotID
    */
    @JsonIgnore
    private String robotID;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteRobotAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRobotID() {
        return robotID;
    }

    public DeleteRobotAccountRequest setRobotID(String robotID) {
        this.robotID = robotID;
        return this;
    }

}
