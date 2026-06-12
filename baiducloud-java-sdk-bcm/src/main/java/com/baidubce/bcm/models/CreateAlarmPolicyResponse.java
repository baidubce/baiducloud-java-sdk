package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAlarmPolicyResponse extends BaseBceResponse {

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
    * 策略ID
    */
    private String id;

    public Boolean getSuccess() {
        return success;
    }

    public CreateAlarmPolicyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CreateAlarmPolicyResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CreateAlarmPolicyResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getId() {
        return id;
    }

    public CreateAlarmPolicyResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAlarmPolicyResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "id=" + id + "\n" + "}";
    }

}
