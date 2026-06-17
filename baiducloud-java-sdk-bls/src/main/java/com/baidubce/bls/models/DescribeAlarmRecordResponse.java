package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmRecordResponse extends BaseBceResponse {

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
    * alarm
    */
    private Alarm alarm;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeAlarmRecordResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeAlarmRecordResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeAlarmRecordResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public DescribeAlarmRecordResponse setAlarm(Alarm alarm) {
        this.alarm = alarm;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAlarmRecordResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "alarm=" + alarm + "\n" + "}";
    }

}
