package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNotificationPolicyResponse extends BaseBceResponse {

    /**
    * 通知策略ID
    */
    private String notifyRuleId;

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
    * 通知渠道，phone:电话 , sms: 短信, email: 邮件
    */
    private List<String> channel;

    /**
    * 接受者类型，user：用户，userGroup：用户组
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
    * 重复通知配置
    */
    private Object repeatNotifyConfig;

    /**
    * 更新时间
    */
    private String updateTime;

    public String getNotifyRuleId() {
        return notifyRuleId;
    }

    public GetNotificationPolicyResponse setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

    public String getNotifyRuleName() {
        return notifyRuleName;
    }

    public GetNotificationPolicyResponse setNotifyRuleName(String notifyRuleName) {
        this.notifyRuleName = notifyRuleName;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public GetNotificationPolicyResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public GetNotificationPolicyResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public List<String> getChannel() {
        return channel;
    }

    public GetNotificationPolicyResponse setChannel(List<String> channel) {
        this.channel = channel;
        return this;
    }

    public String getReceiverType() {
        return receiverType;
    }

    public GetNotificationPolicyResponse setReceiverType(String receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    public List<User> getUsers() {
        return users;
    }

    public GetNotificationPolicyResponse setUsers(List<User> users) {
        this.users = users;
        return this;
    }

    public List<UserGroup> getUserGroups() {
        return userGroups;
    }

    public GetNotificationPolicyResponse setUserGroups(List<UserGroup> userGroups) {
        this.userGroups = userGroups;
        return this;
    }

    public List<CallbackConfig> getWebhookConfigList() {
        return webhookConfigList;
    }

    public GetNotificationPolicyResponse setWebhookConfigList(List<CallbackConfig> webhookConfigList) {
        this.webhookConfigList = webhookConfigList;
        return this;
    }

    public List<EscalateParam> getEscalateConfigList() {
        return escalateConfigList;
    }

    public GetNotificationPolicyResponse setEscalateConfigList(List<EscalateParam> escalateConfigList) {
        this.escalateConfigList = escalateConfigList;
        return this;
    }

    public Object getRepeatNotifyConfig() {
        return repeatNotifyConfig;
    }

    public GetNotificationPolicyResponse setRepeatNotifyConfig(Object repeatNotifyConfig) {
        this.repeatNotifyConfig = repeatNotifyConfig;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public GetNotificationPolicyResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetNotificationPolicyResponse{" + "notifyRuleId=" + notifyRuleId + "\n" + "notifyRuleName=" + notifyRuleName + "\n" + "startTime=" + startTime + "\n" + "endTime="
                + endTime + "\n" + "channel=" + channel + "\n" + "receiverType=" + receiverType + "\n" + "users=" + users + "\n" + "userGroups=" + userGroups + "\n"
                + "webhookConfigList=" + webhookConfigList + "\n" + "escalateConfigList=" + escalateConfigList + "\n" + "repeatNotifyConfig=" + repeatNotifyConfig + "\n"
                + "updateTime=" + updateTime + "\n" + "}";
    }

}
