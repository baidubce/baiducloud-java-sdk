package com.baidubce.aihc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertConfig {
    /**
     * 是
     */
    private String instanceId;

    /**
     * 是
     */
    private List<String> alertItems;

    /**
     * 否
     */
    @JsonProperty("for")
    private String aihcFor;

    /**
     * 是
     */
    private String notifyRuleId;

    public AlertConfig setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public AlertConfig setAlertItems(List<String> alertItems) {
        this.alertItems = alertItems;
        return this;
    }

    public List<String> getAlertItems() {
        return this.alertItems;
    }

    public AlertConfig setFor(String aihcFor) {
        this.aihcFor = aihcFor;
        return this;
    }

    public String getFor() {
        return this.aihcFor;
    }

    public AlertConfig setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

    public String getNotifyRuleId() {
        return this.notifyRuleId;
    }

    @Override
    public String toString() {
        return "AlertConfig{" + "instanceId=" + instanceId + "\n" + "alertItems=" + alertItems + "\n" + "aihcFor=" + aihcFor + "\n" + "notifyRuleId=" + notifyRuleId + "\n" + "}";
    }

}