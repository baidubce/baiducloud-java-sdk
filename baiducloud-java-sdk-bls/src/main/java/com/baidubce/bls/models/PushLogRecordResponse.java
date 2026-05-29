package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PushLogRecordResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 请求码，成功为OK，错误为具体的错误码
    */
    private String code;

    public Boolean getSuccess() {
        return success;
    }

    public PushLogRecordResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public PushLogRecordResponse setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String toString() {
        return "PushLogRecordResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "}";
    }

}
