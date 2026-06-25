package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNotificationPolicyRequest extends BaseBceRequest {

    /**
    * notifyRuleId
    */
    @JsonIgnore
    private String notifyRuleId;

    public String getNotifyRuleId() {
        return notifyRuleId;
    }

    public GetNotificationPolicyRequest setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

}
