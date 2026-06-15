package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotifyReceiver {
    /**
     * 通知接收方ID，用户/用户组ID
     */
    private String id;

    /**
     * 接收通知方名称
     */
    private String name;

    /**
     * 接收通知的用户类型，可选值：USER / USER_GROUP
     */
    private String receiverType;

    /**
     * 通知渠道列表，可选值：SMS / EMAIL / PHONE
     */
    private List<String> channels;

    public NotifyReceiver setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public NotifyReceiver setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public NotifyReceiver setReceiverType(String receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    public String getReceiverType() {
        return this.receiverType;
    }

    public NotifyReceiver setChannels(List<String> channels) {
        this.channels = channels;
        return this;
    }

    public List<String> getChannels() {
        return this.channels;
    }

    @Override
    public String toString() {
        return "NotifyReceiver{" + "id=" + id + "\n" + "name=" + name + "\n" + "receiverType=" + receiverType + "\n" + "channels=" + channels + "\n" + "}";
    }

}