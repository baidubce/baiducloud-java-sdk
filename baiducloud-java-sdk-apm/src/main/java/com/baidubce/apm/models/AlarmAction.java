package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmAction {
    /**
     * 通知模板ID
     */
    private String notifyId;

    /**
     * 通知模板名称，仅在查询响应中返回
     */
    private String alias;

    /**
     * 回调地址列表，仅在查询响应中返回
     */
    private List<String> callBacks;

    /**
     * 屏蔽时间列表，仅在查询响应中返回
     */
    private List<DisableTime> disableTimes;

    /**
     * 成员列表，仅在查询响应中返回
     */
    private List<String> members;

    /**
     * 通知类型列表，如EMAIL，仅在查询响应中返回
     */
    private List<String> types;

    public AlarmAction setNotifyId(String notifyId) {
        this.notifyId = notifyId;
        return this;
    }

    public String getNotifyId() {
        return this.notifyId;
    }

    public AlarmAction setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getAlias() {
        return this.alias;
    }

    public AlarmAction setCallBacks(List<String> callBacks) {
        this.callBacks = callBacks;
        return this;
    }

    public List<String> getCallBacks() {
        return this.callBacks;
    }

    public AlarmAction setDisableTimes(List<DisableTime> disableTimes) {
        this.disableTimes = disableTimes;
        return this;
    }

    public List<DisableTime> getDisableTimes() {
        return this.disableTimes;
    }

    public AlarmAction setMembers(List<String> members) {
        this.members = members;
        return this;
    }

    public List<String> getMembers() {
        return this.members;
    }

    public AlarmAction setTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public List<String> getTypes() {
        return this.types;
    }

    @Override
    public String toString() {
        return "AlarmAction{" + "notifyId=" + notifyId + "\n" + "alias=" + alias + "\n" + "callBacks=" + callBacks + "\n" + "disableTimes=" + disableTimes + "\n" + "members="
                + members + "\n" + "types=" + types + "\n" + "}";
    }

}