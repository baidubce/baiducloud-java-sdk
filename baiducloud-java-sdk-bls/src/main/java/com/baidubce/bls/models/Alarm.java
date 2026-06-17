package com.baidubce.bls.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Alarm {
    /**
     * 报警ID
     */
    private String id;

    /**
     * 分组ID
     */
    private String groupId;

    /**
     * 报警开始时间，UTC时间
     */
    private String startTime;

    /**
     * 报警关闭时间，UTC时间，若报警未关闭，该值为空字符串
     */
    private String endTime;

    /**
     * 报警状态，取值：OK: 已恢复, ALERT: 报警中, CLOSED: 已关闭
     */
    private String state;

    /**
     * 报警关闭原因， POLICY_MODIFIED: 报警策略更新
     */
    private String closeReason;

    /**
     * policy
     */
    private Policy policy;

    /**
     * blsObject
     */
    @JsonProperty("object")
    private LogStore blsObject;

    /**
     * triggerCondition
     */
    private TriggerCondition triggerCondition;

    /**
     * 分组结果
     */
    private Map<String, String> groups;

    /**
     * 执行列表
     */
    private List<Execution> executions;

    public Alarm setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Alarm setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public Alarm setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Alarm setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public Alarm setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Alarm setCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }

    public String getCloseReason() {
        return this.closeReason;
    }

    public Alarm setPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }

    public Policy getPolicy() {
        return this.policy;
    }

    public Alarm setObject(LogStore blsObject) {
        this.blsObject = blsObject;
        return this;
    }

    public LogStore getObject() {
        return this.blsObject;
    }

    public Alarm setTriggerCondition(TriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    public TriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    public Alarm setGroups(Map<String, String> groups) {
        this.groups = groups;
        return this;
    }

    public Map<String, String> getGroups() {
        return this.groups;
    }

    public Alarm setExecutions(List<Execution> executions) {
        this.executions = executions;
        return this;
    }

    public List<Execution> getExecutions() {
        return this.executions;
    }

    @Override
    public String toString() {
        return "Alarm{" + "id=" + id + "\n" + "groupId=" + groupId + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "state=" + state + "\n"
                + "closeReason=" + closeReason + "\n" + "policy=" + policy + "\n" + "blsObject=" + blsObject + "\n" + "triggerCondition=" + triggerCondition + "\n" + "groups="
                + groups + "\n" + "executions=" + executions + "\n" + "}";
    }

}