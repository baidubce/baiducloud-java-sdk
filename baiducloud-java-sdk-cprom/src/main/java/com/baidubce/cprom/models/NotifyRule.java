package com.baidubce.cprom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotifyRule {
    /**
     * 通知策略ID
     */
    private String notifyRuleId;

    /**
     * 通知名称
     */
    private String notifyRuleName;

    /**
     * 通知时段开始时间
     */
    private String startTime;

    /**
     * 通知时段终止时间
     */
    private String endTime;

    /**
     * 通知渠道，phone:电话 , sms: 短信, email: 邮件
     */
    private List<String> channel;

    /**
     * 接收者类型，user：用户，userGroup：用户组
     */
    private String receiverType;

    /**
     * 用户列表
     */
    private List<User> users;

    /**
     * 用户组列表
     */
    private List<UserGroup> userGroups;

    /**
     * webhook 回调配置信息列表
     */
    private List<CallbackConfig> webhookConfigList;

    /**
     * 通知策略升级参数列表
     */
    private List<EscalateParam> escalateConfigList;

    /**
     * repeatNotifyConfig
     */
    private RepeatNotifyConfig repeatNotifyConfig;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    public NotifyRule setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

    public String getNotifyRuleId() {
        return this.notifyRuleId;
    }

    public NotifyRule setNotifyRuleName(String notifyRuleName) {
        this.notifyRuleName = notifyRuleName;
        return this;
    }

    public String getNotifyRuleName() {
        return this.notifyRuleName;
    }

    public NotifyRule setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public NotifyRule setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public NotifyRule setChannel(List<String> channel) {
        this.channel = channel;
        return this;
    }

    public List<String> getChannel() {
        return this.channel;
    }

    public NotifyRule setReceiverType(String receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    public String getReceiverType() {
        return this.receiverType;
    }

    public NotifyRule setUsers(List<User> users) {
        this.users = users;
        return this;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public NotifyRule setUserGroups(List<UserGroup> userGroups) {
        this.userGroups = userGroups;
        return this;
    }

    public List<UserGroup> getUserGroups() {
        return this.userGroups;
    }

    public NotifyRule setWebhookConfigList(List<CallbackConfig> webhookConfigList) {
        this.webhookConfigList = webhookConfigList;
        return this;
    }

    public List<CallbackConfig> getWebhookConfigList() {
        return this.webhookConfigList;
    }

    public NotifyRule setEscalateConfigList(List<EscalateParam> escalateConfigList) {
        this.escalateConfigList = escalateConfigList;
        return this;
    }

    public List<EscalateParam> getEscalateConfigList() {
        return this.escalateConfigList;
    }

    public NotifyRule setRepeatNotifyConfig(RepeatNotifyConfig repeatNotifyConfig) {
        this.repeatNotifyConfig = repeatNotifyConfig;
        return this;
    }

    public RepeatNotifyConfig getRepeatNotifyConfig() {
        return this.repeatNotifyConfig;
    }

    public NotifyRule setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public NotifyRule setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "NotifyRule{" + "notifyRuleId=" + notifyRuleId + "\n" + "notifyRuleName=" + notifyRuleName + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n"
                + "channel=" + channel + "\n" + "receiverType=" + receiverType + "\n" + "users=" + users + "\n" + "userGroups=" + userGroups + "\n" + "webhookConfigList="
                + webhookConfigList + "\n" + "escalateConfigList=" + escalateConfigList + "\n" + "repeatNotifyConfig=" + repeatNotifyConfig + "\n" + "createTime=" + createTime
                + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}