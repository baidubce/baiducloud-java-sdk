package com.baidubce.cprom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotifyAction {
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

    public NotifyAction setChannel(List<String> channel) {
        this.channel = channel;
        return this;
    }

    public List<String> getChannel() {
        return this.channel;
    }

    public NotifyAction setReceiverType(String receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    public String getReceiverType() {
        return this.receiverType;
    }

    public NotifyAction setUsers(List<User> users) {
        this.users = users;
        return this;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public NotifyAction setUserGroups(List<UserGroup> userGroups) {
        this.userGroups = userGroups;
        return this;
    }

    public List<UserGroup> getUserGroups() {
        return this.userGroups;
    }

    public NotifyAction setWebhookConfigList(List<CallbackConfig> webhookConfigList) {
        this.webhookConfigList = webhookConfigList;
        return this;
    }

    public List<CallbackConfig> getWebhookConfigList() {
        return this.webhookConfigList;
    }

    @Override
    public String toString() {
        return "NotifyAction{" + "channel=" + channel + "\n" + "receiverType=" + receiverType + "\n" + "users=" + users + "\n" + "userGroups=" + userGroups + "\n"
                + "webhookConfigList=" + webhookConfigList + "\n" + "}";
    }

}