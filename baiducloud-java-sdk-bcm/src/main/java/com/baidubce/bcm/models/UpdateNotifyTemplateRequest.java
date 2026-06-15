package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateNotifyTemplateRequest extends BaseBceRequest {

    /**
    * 通知模板ID
    */
    private String id;

    /**
    * 通知模板名称
    */
    private String name;

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

    public String getId() {
        return id;
    }

    public UpdateNotifyTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateNotifyTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<SilencePeriod> getSilencePeriods() {
        return silencePeriods;
    }

    public UpdateNotifyTemplateRequest setSilencePeriods(List<SilencePeriod> silencePeriods) {
        this.silencePeriods = silencePeriods;
        return this;
    }

    public List<NotifyReceiver> getReceivers() {
        return receivers;
    }

    public UpdateNotifyTemplateRequest setReceivers(List<NotifyReceiver> receivers) {
        this.receivers = receivers;
        return this;
    }

    public List<Callback> getCallbacks() {
        return callbacks;
    }

    public UpdateNotifyTemplateRequest setCallbacks(List<Callback> callbacks) {
        this.callbacks = callbacks;
        return this;
    }

}
