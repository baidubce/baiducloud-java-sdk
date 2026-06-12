package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddAlarmPolicyActionsRequest extends BaseBceRequest {

    /**
    * 策略ID
    */
    private String id;

    /**
    * 待添加的报警通知项列表
    */
    private List<PolicyAction> actions;

    public String getId() {
        return id;
    }

    public AddAlarmPolicyActionsRequest setId(String id) {
        this.id = id;
        return this;
    }

    public List<PolicyAction> getActions() {
        return actions;
    }

    public AddAlarmPolicyActionsRequest setActions(List<PolicyAction> actions) {
        this.actions = actions;
        return this;
    }

}
