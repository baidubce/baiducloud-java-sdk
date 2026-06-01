package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmUpdateAlarmPolicyActionRequest extends BaseBceRequest {

    /**
    * 策略ID
    */
    private String id;

    /**
    * 通知模板列表，统一用于异常通知、恢复通知、重复报警通知
    */
    private List<AlarmAction> actions;

    public String getId() {
        return id;
    }

    public ApmUpdateAlarmPolicyActionRequest setId(String id) {
        this.id = id;
        return this;
    }

    public List<AlarmAction> getActions() {
        return actions;
    }

    public ApmUpdateAlarmPolicyActionRequest setActions(List<AlarmAction> actions) {
        this.actions = actions;
        return this;
    }

}
