package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotifyTemplate {
    /**
     * 通知模板ID
     */
    private String id;

    /**
     * 通知模板名称
     */
    private String name;

    /**
     * 模板来源，可选值：SYSTEM（默认通知模板）/ CUSTOM（用户自定义创建）
     */
    private String source;

    /**
     * 静默时间段列表
     */
    private List<SilencePeriod> silencePeriods;

    /**
     * 通知接收者列表
     */
    private List<NotifyReceiver> receivers;

    /**
     * 回调配置列表
     */
    private List<Callback> callbacks;

    public NotifyTemplate setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public NotifyTemplate setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public NotifyTemplate setSource(String source) {
        this.source = source;
        return this;
    }

    public String getSource() {
        return this.source;
    }

    public NotifyTemplate setSilencePeriods(List<SilencePeriod> silencePeriods) {
        this.silencePeriods = silencePeriods;
        return this;
    }

    public List<SilencePeriod> getSilencePeriods() {
        return this.silencePeriods;
    }

    public NotifyTemplate setReceivers(List<NotifyReceiver> receivers) {
        this.receivers = receivers;
        return this;
    }

    public List<NotifyReceiver> getReceivers() {
        return this.receivers;
    }

    public NotifyTemplate setCallbacks(List<Callback> callbacks) {
        this.callbacks = callbacks;
        return this;
    }

    public List<Callback> getCallbacks() {
        return this.callbacks;
    }

    @Override
    public String toString() {
        return "NotifyTemplate{" + "id=" + id + "\n" + "name=" + name + "\n" + "source=" + source + "\n" + "silencePeriods=" + silencePeriods + "\n" + "receivers=" + receivers
                + "\n" + "callbacks=" + callbacks + "\n" + "}";
    }

}