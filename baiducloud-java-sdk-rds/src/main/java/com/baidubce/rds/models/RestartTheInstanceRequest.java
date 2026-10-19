package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestartTheInstanceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 操作执行方式，有两种取值：timewindow、immediate。其中timewindow表示在时间窗口内执行，immediate表示立即执行。默认为immediate。实例默认的时间窗口为05:00~06:00，具体可参考实例详情内容
    */
    private String effectiveTime;

    public String getInstanceId() {
        return instanceId;
    }

    public RestartTheInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public RestartTheInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

}
