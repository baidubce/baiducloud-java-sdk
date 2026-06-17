package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAlarmPolicyRequest extends BaseBceRequest {

    /**
    * 报警策略名称，不能重复
    */
    private String name;

    /**
    * 监控对象列表，当所有日志集共享目标日志集时，填写该字段
    */
    private List<LogStore> objects;

    /**
    * 执行语句列表
    */
    private List<Target> targets;

    /**
    * 触发条件列表
    */
    private List<TriggerCondition> triggerConditions;

    /**
    * 分组触发
    */
    private List<String> groups;

    /**
    * schedule
    */
    private Schedule schedule;

    /**
    * 连续触发阈值，连续多少次触发阈值则报警
    */
    private Integer pendingCount;

    /**
    * 重复报警间隔，单位：分钟，默认值：0，表示关闭重复报警
    */
    private Integer repeatIntervalMinute;

    /**
    * 恢复后是否通知 true：不通知， false：通知, 默认值为false
    */
    private Boolean recoverWithoutNotice;

    /**
    * 策略启用状态，ENABLED: 已启用， DISABLED: 已禁用
    */
    private String state;

    /**
    * 下通知启用状态，ENABLED: 已启用， DISABLED: 已禁用
    */
    private String noticeState;

    /**
    * 报警通知模板，参考：[BCM通知模板接口](https://cloud.baidu.com/doc/BCM/s/elmiysvfo)
    */
    private List<Notice> notices;

    /**
    * 是否在报警通知中添加原始日志
    */
    private List<NoticeRawLog> noticeRawLogs;

    public String getName() {
        return name;
    }

    public CreateAlarmPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<LogStore> getObjects() {
        return objects;
    }

    public CreateAlarmPolicyRequest setObjects(List<LogStore> objects) {
        this.objects = objects;
        return this;
    }

    public List<Target> getTargets() {
        return targets;
    }

    public CreateAlarmPolicyRequest setTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    public List<TriggerCondition> getTriggerConditions() {
        return triggerConditions;
    }

    public CreateAlarmPolicyRequest setTriggerConditions(List<TriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }

    public List<String> getGroups() {
        return groups;
    }

    public CreateAlarmPolicyRequest setGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public CreateAlarmPolicyRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public Integer getPendingCount() {
        return pendingCount;
    }

    public CreateAlarmPolicyRequest setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    public Integer getRepeatIntervalMinute() {
        return repeatIntervalMinute;
    }

    public CreateAlarmPolicyRequest setRepeatIntervalMinute(Integer repeatIntervalMinute) {
        this.repeatIntervalMinute = repeatIntervalMinute;
        return this;
    }

    public Boolean getRecoverWithoutNotice() {
        return recoverWithoutNotice;
    }

    public CreateAlarmPolicyRequest setRecoverWithoutNotice(Boolean recoverWithoutNotice) {
        this.recoverWithoutNotice = recoverWithoutNotice;
        return this;
    }

    public String getState() {
        return state;
    }

    public CreateAlarmPolicyRequest setState(String state) {
        this.state = state;
        return this;
    }

    public String getNoticeState() {
        return noticeState;
    }

    public CreateAlarmPolicyRequest setNoticeState(String noticeState) {
        this.noticeState = noticeState;
        return this;
    }

    public List<Notice> getNotices() {
        return notices;
    }

    public CreateAlarmPolicyRequest setNotices(List<Notice> notices) {
        this.notices = notices;
        return this;
    }

    public List<NoticeRawLog> getNoticeRawLogs() {
        return noticeRawLogs;
    }

    public CreateAlarmPolicyRequest setNoticeRawLogs(List<NoticeRawLog> noticeRawLogs) {
        this.noticeRawLogs = noticeRawLogs;
        return this;
    }

}
