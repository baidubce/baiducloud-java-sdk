package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmAction {
    /**
     * 通知模板名称
     */
    private String name;

    /**
     * 触发类型，可选值：ALERT（报警时触发）/ OK（恢复时触发）
     */
    private String type;

    /**
     * 触发时间，UNIX时间戳，单位：ms
     */
    private Long executedTime;

    /**
     * 通知方式列表，可选值：SMS / EMAIL / PHONE
     */
    private List<String> notifications;

    /**
     * 回调webhook URL列表
     */
    private List<String> callBacks;

    /**
     * 通知对象列表
     */
    private List<String> members;

    public AlarmAction setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AlarmAction setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public AlarmAction setExecutedTime(Long executedTime) {
        this.executedTime = executedTime;
        return this;
    }

    public Long getExecutedTime() {
        return this.executedTime;
    }

    public AlarmAction setNotifications(List<String> notifications) {
        this.notifications = notifications;
        return this;
    }

    public List<String> getNotifications() {
        return this.notifications;
    }

    public AlarmAction setCallBacks(List<String> callBacks) {
        this.callBacks = callBacks;
        return this;
    }

    public List<String> getCallBacks() {
        return this.callBacks;
    }

    public AlarmAction setMembers(List<String> members) {
        this.members = members;
        return this;
    }

    public List<String> getMembers() {
        return this.members;
    }

    @Override
    public String toString() {
        return "AlarmAction{" + "name=" + name + "\n" + "type=" + type + "\n" + "executedTime=" + executedTime + "\n" + "notifications=" + notifications + "\n" + "callBacks="
                + callBacks + "\n" + "members=" + members + "\n" + "}";
    }

}