package com.baidubce.oos.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateExecutionV2Response extends BaseBceResponse {

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
    * 创建成功的执行详情
    */
    private Object result;

    public Boolean getSuccess() {
        return success;
    }

    public CreateExecutionV2Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public CreateExecutionV2Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public CreateExecutionV2Response setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Object getResult() {
        return result;
    }

    public CreateExecutionV2Response setResult(Object result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "CreateExecutionV2Response{" + "success=" + success + "\n" + "msg=" + msg + "\n" + "code=" + code + "\n" + "result=" + result + "\n" + "}";
    }

}
