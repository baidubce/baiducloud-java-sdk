package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAlertResponse extends BaseBceResponse {

    /**
    * 告警规则ID
    */
    private String alertId;

    public String getAlertId() {
        return alertId;
    }

    public CreateAlertResponse setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAlertResponse{" + "alertId=" + alertId + "\n" + "}";
    }

}
