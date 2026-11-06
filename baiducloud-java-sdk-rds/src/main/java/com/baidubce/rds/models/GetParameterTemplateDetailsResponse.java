package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetParameterTemplateDetailsResponse extends BaseBceResponse {

    /**
    * 见示例
    */
    private Boolean success;

    /**
    * 见示例
    */
    private Object message;

    /**
    * 见示例
    */
    private Integer status;

    /**
    * result
    */
    private Result result;

    public Boolean getSuccess() {
        return success;
    }

    public GetParameterTemplateDetailsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Object getMessage() {
        return message;
    }

    public GetParameterTemplateDetailsResponse setMessage(Object message) {
        this.message = message;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public GetParameterTemplateDetailsResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Result getResult() {
        return result;
    }

    public GetParameterTemplateDetailsResponse setResult(Result result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetParameterTemplateDetailsResponse{" + "success=" + success + "\n" + "message=" + message + "\n" + "status=" + status + "\n" + "result=" + result + "\n" + "}";
    }

}
