package com.baidubce.oos.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetExecutionDetailV2Response extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 失败时返回失败原因，成功时为空字符串
    */
    private String msg;

    /**
    * 状态码
    */
    private Integer code;

    /**
    * result
    */
    private Execution result;

    public Boolean getSuccess() {
        return success;
    }

    public GetExecutionDetailV2Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public GetExecutionDetailV2Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public GetExecutionDetailV2Response setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Execution getResult() {
        return result;
    }

    public GetExecutionDetailV2Response setResult(Execution result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetExecutionDetailV2Response{" + "success=" + success + "\n" + "msg=" + msg + "\n" + "code=" + code + "\n" + "result=" + result + "\n" + "}";
    }

}
