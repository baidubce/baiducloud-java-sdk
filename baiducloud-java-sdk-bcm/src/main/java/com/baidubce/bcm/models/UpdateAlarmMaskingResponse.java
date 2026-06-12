package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAlarmMaskingResponse extends BaseBceResponse {

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

    public UpdateAlarmMaskingResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public UpdateAlarmMaskingResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public UpdateAlarmMaskingResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateAlarmMaskingResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "}";
    }

}
