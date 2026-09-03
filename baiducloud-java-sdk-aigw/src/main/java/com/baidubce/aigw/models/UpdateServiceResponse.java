package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateServiceResponse extends BaseBceResponse {

    /**
    * 是否更新成功
    */
    private Boolean success;

    /**
    * HTTP 状态码
    */
    private Integer status;

    /**
    * 操作结果描述
    */
    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public UpdateServiceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public UpdateServiceResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public UpdateServiceResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateServiceResponse{" + "success=" + success + "\n" + "status=" + status + "\n" + "message=" + message + "\n" + "}";
    }

}
