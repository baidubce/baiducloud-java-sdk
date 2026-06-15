package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeNotifyTemplatesResponse extends BaseBceResponse {

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
    * 通知模板列表
    */
    private List<NotifyTemplate> notifyTemplates;

    /**
    * 通知模板ID
    */
    private String notifyTemplatesId;

    /**
    * 通知模板名称
    */
    private String notifyTemplatesName;

    /**
    * 模板来源，可选值：SYSTEM（默认通知模板）/ CUSTOM（用户自定义创建）
    */
    private String notifyTemplatesSource;

    /**
    * 静默时间段列表
    */
    private List<SilencePeriod> notifyTemplatesSilencePeriods;

    /**
    * 通知接收者列表
    */
    private List<NotifyReceiver> notifyTemplatesReceivers;

    /**
    * 回调配置列表
    */
    private List<Callback> notifyTemplatesCallbacks;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeNotifyTemplatesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeNotifyTemplatesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeNotifyTemplatesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<NotifyTemplate> getNotifyTemplates() {
        return notifyTemplates;
    }

    public DescribeNotifyTemplatesResponse setNotifyTemplates(List<NotifyTemplate> notifyTemplates) {
        this.notifyTemplates = notifyTemplates;
        return this;
    }

    public String getNotifyTemplatesId() {
        return notifyTemplatesId;
    }

    public DescribeNotifyTemplatesResponse setNotifyTemplatesId(String notifyTemplatesId) {
        this.notifyTemplatesId = notifyTemplatesId;
        return this;
    }

    public String getNotifyTemplatesName() {
        return notifyTemplatesName;
    }

    public DescribeNotifyTemplatesResponse setNotifyTemplatesName(String notifyTemplatesName) {
        this.notifyTemplatesName = notifyTemplatesName;
        return this;
    }

    public String getNotifyTemplatesSource() {
        return notifyTemplatesSource;
    }

    public DescribeNotifyTemplatesResponse setNotifyTemplatesSource(String notifyTemplatesSource) {
        this.notifyTemplatesSource = notifyTemplatesSource;
        return this;
    }

    public List<SilencePeriod> getNotifyTemplatesSilencePeriods() {
        return notifyTemplatesSilencePeriods;
    }

    public DescribeNotifyTemplatesResponse setNotifyTemplatesSilencePeriods(List<SilencePeriod> notifyTemplatesSilencePeriods) {
        this.notifyTemplatesSilencePeriods = notifyTemplatesSilencePeriods;
        return this;
    }

    public List<NotifyReceiver> getNotifyTemplatesReceivers() {
        return notifyTemplatesReceivers;
    }

    public DescribeNotifyTemplatesResponse setNotifyTemplatesReceivers(List<NotifyReceiver> notifyTemplatesReceivers) {
        this.notifyTemplatesReceivers = notifyTemplatesReceivers;
        return this;
    }

    public List<Callback> getNotifyTemplatesCallbacks() {
        return notifyTemplatesCallbacks;
    }

    public DescribeNotifyTemplatesResponse setNotifyTemplatesCallbacks(List<Callback> notifyTemplatesCallbacks) {
        this.notifyTemplatesCallbacks = notifyTemplatesCallbacks;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeNotifyTemplatesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "notifyTemplates=" + notifyTemplates + "\n"
                + "notifyTemplatesId=" + notifyTemplatesId + "\n" + "notifyTemplatesName=" + notifyTemplatesName + "\n" + "notifyTemplatesSource=" + notifyTemplatesSource + "\n"
                + "notifyTemplatesSilencePeriods=" + notifyTemplatesSilencePeriods + "\n" + "notifyTemplatesReceivers=" + notifyTemplatesReceivers + "\n"
                + "notifyTemplatesCallbacks=" + notifyTemplatesCallbacks + "\n" + "}";
    }

}
