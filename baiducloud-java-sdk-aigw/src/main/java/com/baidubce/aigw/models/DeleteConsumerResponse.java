package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteConsumerResponse extends BaseBceResponse {

    /**
    * 是否成功
    */
    private Boolean success;

    /**
    * HTTP 状态码
    */
    private Integer status;

    /**
    * 成功时为空
    */
    private String result;

    public Boolean getSuccess() {
        return success;
    }

    public DeleteConsumerResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public DeleteConsumerResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getResult() {
        return result;
    }

    public DeleteConsumerResponse setResult(String result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "DeleteConsumerResponse{" + "success=" + success + "\n" + "status=" + status + "\n" + "result=" + result + "\n" + "}";
    }

}
