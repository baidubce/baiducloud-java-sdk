package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidateAlarmConditionResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 请求码，成功为OK，错误为具体的错误码
    */
    private String code;

    /**
    * 请求成功为空，失败为具体的错误信息
    */
    private String message;

    /**
    * result
    */
    private ConditionValidateResult result;

    public Boolean getSuccess() {
        return success;
    }

    public ValidateAlarmConditionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ValidateAlarmConditionResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ValidateAlarmConditionResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public ConditionValidateResult getResult() {
        return result;
    }

    public ValidateAlarmConditionResponse setResult(ConditionValidateResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ValidateAlarmConditionResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "result=" + result + "\n" + "}";
    }

}
