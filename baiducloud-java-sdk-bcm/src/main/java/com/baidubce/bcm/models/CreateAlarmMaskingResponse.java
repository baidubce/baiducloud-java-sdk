package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAlarmMaskingResponse extends BaseBceResponse {

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

    /**
    * 创建的屏蔽规则ID
    */
    private String id;

    public Boolean getSuccess() {
        return success;
    }

    public CreateAlarmMaskingResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CreateAlarmMaskingResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CreateAlarmMaskingResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getId() {
        return id;
    }

    public CreateAlarmMaskingResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAlarmMaskingResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "id=" + id + "\n" + "}";
    }

}
