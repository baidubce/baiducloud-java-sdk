package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTimeWindowRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 开始时间。示例：04:00（即凌晨4点）
    */
    private String startTime;

    /**
    * 持续时间。取值范围：1-8（单位：小时）
    */
    private Integer duration;

    /**
    * 维护周期。1-6分别代表周一到周六。0代表周日。
    */
    private List<Integer> period;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyTimeWindowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public ModifyTimeWindowRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public ModifyTimeWindowRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public List<Integer> getPeriod() {
        return period;
    }

    public ModifyTimeWindowRequest setPeriod(List<Integer> period) {
        this.period = period;
        return this;
    }

}
