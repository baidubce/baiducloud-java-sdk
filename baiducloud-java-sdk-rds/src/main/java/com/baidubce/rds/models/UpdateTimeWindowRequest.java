package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateTimeWindowRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 实例维护时间窗口的开始时间，local时间，如17:00:00
    */
    private String maintainStartTime;

    /**
    * 实例维护时间窗口的持续时间，单位是小时，如：1；每1个小时为一个时间段，开始时间+持续时间不可跨天
    */
    private Integer maintainDuration;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateTimeWindowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getMaintainStartTime() {
        return maintainStartTime;
    }

    public UpdateTimeWindowRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }

    public Integer getMaintainDuration() {
        return maintainDuration;
    }

    public UpdateTimeWindowRequest setMaintainDuration(Integer maintainDuration) {
        this.maintainDuration = maintainDuration;
        return this;
    }

}
