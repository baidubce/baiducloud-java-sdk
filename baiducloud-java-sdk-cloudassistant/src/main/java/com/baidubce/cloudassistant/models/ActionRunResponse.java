package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionRunResponse extends BaseBceResponse {

    /**
    * 请求id
    */
    private String requestId;

    /**
    * 响应状态，成功为success
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 请求是否处理成功
    */
    private Boolean success;

    /**
    * 命令执行结果
    */
    private Object result;

    public String getRequestId() {
        return requestId;
    }

    public ActionRunResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ActionRunResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ActionRunResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public ActionRunResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Object getResult() {
        return result;
    }

    public ActionRunResponse setResult(Object result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ActionRunResponse{" + "requestId=" + requestId + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "success=" + success + "\n" + "result=" + result
                + "\n" + "}";
    }

}
