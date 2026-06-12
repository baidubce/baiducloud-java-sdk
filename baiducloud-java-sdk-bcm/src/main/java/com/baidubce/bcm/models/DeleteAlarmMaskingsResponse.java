package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAlarmMaskingsResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 描述信息
    */
    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public DeleteAlarmMaskingsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DeleteAlarmMaskingsResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DeleteAlarmMaskingsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "DeleteAlarmMaskingsResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "}";
    }

}
