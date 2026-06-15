package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeNotifyTemplateResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 通知模板ID
    */
    private String id;

    /**
    * 通知模板名称
    */
    private String name;

    /**
    * 模板来源，可选值：SYSTEM / CUSTOM
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

    public Boolean getSuccess() {
        return success;
    }

    public DescribeNotifyTemplateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeNotifyTemplateResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeNotifyTemplateResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getId() {
        return id;
    }

    public DescribeNotifyTemplateResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeNotifyTemplateResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getSource() {
        return source;
    }

    public DescribeNotifyTemplateResponse setSource(String source) {
        this.source = source;
        return this;
    }

    public List<SilencePeriod> getSilencePeriods() {
        return silencePeriods;
    }

    public DescribeNotifyTemplateResponse setSilencePeriods(List<SilencePeriod> silencePeriods) {
        this.silencePeriods = silencePeriods;
        return this;
    }

    public List<NotifyReceiver> getReceivers() {
        return receivers;
    }

    public DescribeNotifyTemplateResponse setReceivers(List<NotifyReceiver> receivers) {
        this.receivers = receivers;
        return this;
    }

    public List<Callback> getCallbacks() {
        return callbacks;
    }

    public DescribeNotifyTemplateResponse setCallbacks(List<Callback> callbacks) {
        this.callbacks = callbacks;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeNotifyTemplateResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "id=" + id + "\n" + "name=" + name + "\n"
                + "source=" + source + "\n" + "silencePeriods=" + silencePeriods + "\n" + "receivers=" + receivers + "\n" + "callbacks=" + callbacks + "\n" + "}";
    }

}
