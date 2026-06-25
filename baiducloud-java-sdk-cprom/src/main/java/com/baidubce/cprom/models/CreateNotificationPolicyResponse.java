package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNotificationPolicyResponse extends BaseBceResponse {

    /**
    * 通知策略ID
    */
    private String notifyRuleId;

    public String getNotifyRuleId() {
        return notifyRuleId;
    }

    public CreateNotificationPolicyResponse setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateNotificationPolicyResponse{" + "notifyRuleId=" + notifyRuleId + "\n" + "}";
    }

}
