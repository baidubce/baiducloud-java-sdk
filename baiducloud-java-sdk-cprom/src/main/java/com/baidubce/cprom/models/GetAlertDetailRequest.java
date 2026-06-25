package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAlertDetailRequest extends BaseBceRequest {

    /**
    * alertingRuleId
    */
    @JsonIgnore
    private String alertingRuleId;

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    public String getAlertingRuleId() {
        return alertingRuleId;
    }

    public GetAlertDetailRequest setAlertingRuleId(String alertingRuleId) {
        this.alertingRuleId = alertingRuleId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public GetAlertDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
