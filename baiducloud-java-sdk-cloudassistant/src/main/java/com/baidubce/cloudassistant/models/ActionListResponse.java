package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionListResponse extends BaseBceResponse {

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
    * result
    */
    private ActionPage result;

    public String getRequestId() {
        return requestId;
    }

    public ActionListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ActionListResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ActionListResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public ActionListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public ActionPage getResult() {
        return result;
    }

    public ActionListResponse setResult(ActionPage result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ActionListResponse{" + "requestId=" + requestId + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "success=" + success + "\n" + "result=" + result
                + "\n" + "}";
    }

}
