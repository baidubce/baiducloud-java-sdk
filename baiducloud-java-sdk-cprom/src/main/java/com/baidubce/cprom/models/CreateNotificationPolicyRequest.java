package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNotificationPolicyRequest extends BaseBceRequest {

    /**
    * 通知策略名称
    */
    private String notifyRuleName;

    /**
    * 通知开始时间，时间格式 00：00：00
    */
    private String startTime;

    /**
    * 通知结束时间，时间格式 23：59：59
    */
    private String endTime;

    /**
    * 通知渠道，phone:电话 , sms: 短信, email: 邮件。若选择phone:电话 , sms: 短信, email: 邮件这三种方式通知则必选，webhook为非必选。
    */
    private List<String> channel;

    /**
    * 接受者类型，user：用户，userGroup：用户组，若选择phone:电话 , sms: 短信, email: 邮件这三种方式receiverType为必选参数，webhook为非必选。
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

    public String getNotifyRuleName() {
        return notifyRuleName;
    }

    public CreateNotificationPolicyRequest setNotifyRuleName(String notifyRuleName) {
        this.notifyRuleName = notifyRuleName;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public CreateNotificationPolicyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public CreateNotificationPolicyRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public List<String> getChannel() {
        return channel;
    }

    public CreateNotificationPolicyRequest setChannel(List<String> channel) {
        this.channel = channel;
        return this;
    }

    public String getReceiverType() {
        return receiverType;
    }

    public CreateNotificationPolicyRequest setReceiverType(String receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    public List<User> getUsers() {
        return users;
    }

    public CreateNotificationPolicyRequest setUsers(List<User> users) {
        this.users = users;
        return this;
    }

    public List<UserGroup> getUserGroups() {
        return userGroups;
    }

    public CreateNotificationPolicyRequest setUserGroups(List<UserGroup> userGroups) {
        this.userGroups = userGroups;
        return this;
    }

    public List<CallbackConfig> getWebhookConfigList() {
        return webhookConfigList;
    }

    public CreateNotificationPolicyRequest setWebhookConfigList(List<CallbackConfig> webhookConfigList) {
        this.webhookConfigList = webhookConfigList;
        return this;
    }

    public List<EscalateParam> getEscalateConfigList() {
        return escalateConfigList;
    }

    public CreateNotificationPolicyRequest setEscalateConfigList(List<EscalateParam> escalateConfigList) {
        this.escalateConfigList = escalateConfigList;
        return this;
    }

    public RepeatNotifyConfig getRepeatNotifyConfig() {
        return repeatNotifyConfig;
    }

    public CreateNotificationPolicyRequest setRepeatNotifyConfig(RepeatNotifyConfig repeatNotifyConfig) {
        this.repeatNotifyConfig = repeatNotifyConfig;
        return this;
    }

}
