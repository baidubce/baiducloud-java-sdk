package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNotifyTemplateResponse extends BaseBceResponse {

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
    private String notifyId;

    public Boolean getSuccess() {
        return success;
    }

    public CreateNotifyTemplateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CreateNotifyTemplateResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CreateNotifyTemplateResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getNotifyId() {
        return notifyId;
    }

    public CreateNotifyTemplateResponse setNotifyId(String notifyId) {
        this.notifyId = notifyId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateNotifyTemplateResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "notifyId=" + notifyId + "\n" + "}";
    }

}
