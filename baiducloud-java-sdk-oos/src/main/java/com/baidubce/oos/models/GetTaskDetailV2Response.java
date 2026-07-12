package com.baidubce.oos.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTaskDetailV2Response extends BaseBceResponse {

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
    private Task result;

    public Boolean getSuccess() {
        return success;
    }

    public GetTaskDetailV2Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public GetTaskDetailV2Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public GetTaskDetailV2Response setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Task getResult() {
        return result;
    }

    public GetTaskDetailV2Response setResult(Task result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetTaskDetailV2Response{" + "success=" + success + "\n" + "msg=" + msg + "\n" + "code=" + code + "\n" + "result=" + result + "\n" + "}";
    }

}
