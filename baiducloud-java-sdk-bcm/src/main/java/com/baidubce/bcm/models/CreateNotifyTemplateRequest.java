package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNotifyTemplateRequest extends BaseBceRequest {

    /**
    * 通知模板名称，可重复
    */
    private String name;

    /**
    * 静默时间段列表，在这些时间段内不会触发通知
    */
    private List<SilencePeriod> silencePeriods;

    /**
    * 通知接收者列表，为空表示模板未绑定具体成员
    */
    private List<NotifyReceiver> receivers;

    /**
    * 回调配置列表
    */
    private List<Callback> callbacks;

    public String getName() {
        return name;
    }

    public CreateNotifyTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<SilencePeriod> getSilencePeriods() {
        return silencePeriods;
    }

    public CreateNotifyTemplateRequest setSilencePeriods(List<SilencePeriod> silencePeriods) {
        this.silencePeriods = silencePeriods;
        return this;
    }

    public List<NotifyReceiver> getReceivers() {
        return receivers;
    }

    public CreateNotifyTemplateRequest setReceivers(List<NotifyReceiver> receivers) {
        this.receivers = receivers;
        return this;
    }

    public List<Callback> getCallbacks() {
        return callbacks;
    }

    public CreateNotifyTemplateRequest setCallbacks(List<Callback> callbacks) {
        this.callbacks = callbacks;
        return this;
    }

}
