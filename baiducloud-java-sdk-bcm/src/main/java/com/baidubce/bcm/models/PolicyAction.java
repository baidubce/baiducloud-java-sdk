package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyAction {
    /**
     * 通知模板ID
     */
    private String notifyId;

    public PolicyAction setNotifyId(String notifyId) {
        this.notifyId = notifyId;
        return this;
    }

    public String getNotifyId() {
        return this.notifyId;
    }

    @Override
    public String toString() {
        return "PolicyAction{" + "notifyId=" + notifyId + "\n" + "}";
    }

}