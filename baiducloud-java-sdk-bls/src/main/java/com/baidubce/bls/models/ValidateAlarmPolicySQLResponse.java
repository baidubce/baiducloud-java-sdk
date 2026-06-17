package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidateAlarmPolicySQLResponse extends BaseBceResponse {

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
    private ValidateResult result;

    public Boolean getSuccess() {
        return success;
    }

    public ValidateAlarmPolicySQLResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ValidateAlarmPolicySQLResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ValidateAlarmPolicySQLResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public ValidateResult getResult() {
        return result;
    }

    public ValidateAlarmPolicySQLResponse setResult(ValidateResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ValidateAlarmPolicySQLResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "result=" + result + "\n" + "}";
    }

}
