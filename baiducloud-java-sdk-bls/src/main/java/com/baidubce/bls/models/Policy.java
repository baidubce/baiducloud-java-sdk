package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Policy {
    /**
     * 报警策略名称，同user下唯一
     */
    private String name;

    /**
     * 策略ID，同user下唯一
     */
    private String id;

    /**
     * 策略启用状态
     */
    private String state;

    /**
     * 通知启用状态
     */
    private String noticeState;

    /**
     * 创建时间，UTC时间
     */
    private String createdTime;

    /**
     * 更新时间，UTC时间
     */
    private String updatedTime;

    /**
     * 监控对象列表
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
     * 连续触发阈值
     */
    private Integer pendingCount;

    /**
     * 重复报警间隔，单位：分钟
     */
    private Integer repeatIntervalMinute;

    /**
     * 恢复后是否通知
     */
    private Boolean recoverAlarmNotice;

    /**
     * 报警通知模板列表
     */
    private List<Notice> notices;

    /**
     * 报警内容是否增加日志原文
     */
    private Boolean noticeWithRawLog;

    /**
     * 报警通知内容配置
     */
    private List<NoticeRawLog> noticeRawConfigs;

    public Policy setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Policy setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Policy setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Policy setNoticeState(String noticeState) {
        this.noticeState = noticeState;
        return this;
    }

    public String getNoticeState() {
        return this.noticeState;
    }

    public Policy setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public Policy setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public Policy setObjects(List<LogStore> objects) {
        this.objects = objects;
        return this;
    }

    public List<LogStore> getObjects() {
        return this.objects;
    }

    public Policy setTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    public List<Target> getTargets() {
        return this.targets;
    }

    public Policy setTriggerConditions(List<TriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }

    public List<TriggerCondition> getTriggerConditions() {
        return this.triggerConditions;
    }

    public Policy setGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public List<String> getGroups() {
        return this.groups;
    }

    public Policy setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public Policy setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    public Integer getPendingCount() {
        return this.pendingCount;
    }

    public Policy setRepeatIntervalMinute(Integer repeatIntervalMinute) {
        this.repeatIntervalMinute = repeatIntervalMinute;
        return this;
    }

    public Integer getRepeatIntervalMinute() {
        return this.repeatIntervalMinute;
    }

    public Policy setRecoverAlarmNotice(Boolean recoverAlarmNotice) {
        this.recoverAlarmNotice = recoverAlarmNotice;
        return this;
    }

    public Boolean getRecoverAlarmNotice() {
        return this.recoverAlarmNotice;
    }

    public Policy setNotices(List<Notice> notices) {
        this.notices = notices;
        return this;
    }

    public List<Notice> getNotices() {
        return this.notices;
    }

    public Policy setNoticeWithRawLog(Boolean noticeWithRawLog) {
        this.noticeWithRawLog = noticeWithRawLog;
        return this;
    }

    public Boolean getNoticeWithRawLog() {
        return this.noticeWithRawLog;
    }

    public Policy setNoticeRawConfigs(List<NoticeRawLog> noticeRawConfigs) {
        this.noticeRawConfigs = noticeRawConfigs;
        return this;
    }

    public List<NoticeRawLog> getNoticeRawConfigs() {
        return this.noticeRawConfigs;
    }

    @Override
    public String toString() {
        return "Policy{" + "name=" + name + "\n" + "id=" + id + "\n" + "state=" + state + "\n" + "noticeState=" + noticeState + "\n" + "createdTime=" + createdTime + "\n"
                + "updatedTime=" + updatedTime + "\n" + "objects=" + objects + "\n" + "targets=" + targets + "\n" + "triggerConditions=" + triggerConditions + "\n" + "groups="
                + groups + "\n" + "schedule=" + schedule + "\n" + "pendingCount=" + pendingCount + "\n" + "repeatIntervalMinute=" + repeatIntervalMinute + "\n"
                + "recoverAlarmNotice=" + recoverAlarmNotice + "\n" + "notices=" + notices + "\n" + "noticeWithRawLog=" + noticeWithRawLog + "\n" + "noticeRawConfigs="
                + noticeRawConfigs + "\n" + "}";
    }

}