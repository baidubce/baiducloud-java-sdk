package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddAlarmPolicyActionsResponse extends BaseBceResponse {

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

    public Boolean getSuccess() {
        return success;
    }

    public AddAlarmPolicyActionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public AddAlarmPolicyActionsResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AddAlarmPolicyActionsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "AddAlarmPolicyActionsResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "}";
    }

}
